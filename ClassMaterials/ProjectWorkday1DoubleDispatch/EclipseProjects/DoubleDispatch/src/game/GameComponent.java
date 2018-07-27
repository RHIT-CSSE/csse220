package game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class GameComponent extends JComponent {
	// Here is the game state. In a bigger game, this would live
	// in another class like Level.
	private int STARTING_DX = 10;
	private int dx;
	private int numTicks;
	private static final int BOX_SIZE = 20;
	private static final int BOX_X = 10;
	private static final int BOX_Y = 200;

	// There are three types of objects in the game.
	// FIXME: are there cases where we can treat them as the same type?
	private Rectangle2D.Double box;
	private List<Raindrop> raindrops = new ArrayList<>();
	private List<Platform> platforms = new ArrayList<>();

	public GameComponent() {
		this.box = new Rectangle2D.Double(BOX_X, BOX_Y, BOX_SIZE, BOX_SIZE);
		this.dx = STARTING_DX;

		this.platforms.add(new Platform(200, 100, 20, 0));
		this.platforms.add(new Platform(30, 10, 0, 20));
	}

	public void drawScreen() {
		this.repaint();
		System.out.println("Tick " + this.numTicks);
		System.out.println("There are " + this.raindrops.size() + " raindrops.");
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		// Draw the user's box
		// FIXME: this draw code looks different than the draw code below.
		// Isn't this troubling?
		g2.fill(this.box);

		// FIXME: duplicate drawing code.
		// How do we remove duplicate code?
		for (Raindrop drop : this.raindrops) {
			drop.drawOn(g2);
		}
		for (Platform platform : this.platforms) {
			platform.drawOn(g2);
		}
	}

	public void updateState() {
		// Each is big enough to be in a helper method.
		updateBox();
		updateRaindrops();
		updatePlatforms();
		this.numTicks++;
	}

	private void updateBox() {
		this.box.x += this.dx;

		// Keep the box from going off the screen
		if (this.box.x > this.getWidth() - box.getWidth()) {
			this.box.x = this.getWidth() - box.getWidth();
		} else if (this.box.x < 0) {
			this.box.x = 0;
		}
	}

	private void updateRaindrops() {
		if (Math.random() < 0.5) {
			this.raindrops.add(new Raindrop(this.getWidth()));
		}

		List<Raindrop> raindropsToRemove = new ArrayList<>();

		for (Raindrop drop : this.raindrops) {
			handleDropFalling(raindropsToRemove, drop);

			// FIXME: why is BOX collision handled in update RAINDROPS?
			handleBoxCollision(raindropsToRemove, drop);

			// Same thing for PLATFORMs
			handlePlatformCollision(raindropsToRemove, drop);
		}
		for (Raindrop drop : raindropsToRemove) {
			this.raindrops.remove(drop);
		}
	}

	private void updatePlatforms() {
		List<Platform> toRemove = new ArrayList<>();

		for (Platform platform : this.platforms) {
			platform.updatePosition(this.getSize());

			// FIXME: isn't this code almost identical to updateRaindrops()?

			// absorb raindrops
			handleDropCollision(platform);

			// bounce off user's box
			handleBoxCollision(platform);

			// handle Platform/Platform collisions
			handlePlatformCollision(platform);

			// When a platform collects too much water, it explodes in
			// raindrops!
			handleExplosion(toRemove, platform);
		}
		for (Platform platform : toRemove) {
			this.platforms.remove(platform);
		}
	}

	// FIXME: code is poorly designed when it must be organized with headers.
		
	// ================== RAINDROP COLLISIONS =============================
	private void handleDropCollision(Platform platform) {
		List<Raindrop> raindropsToRemove = new ArrayList<>();
		for (Raindrop drop : this.raindrops) {
			boolean hitBox = drop.insidePlatform(platform);
			if (hitBox) {
				raindropsToRemove.add(drop);
				platform.addDrop();
			}
		}

		for (Raindrop drop : raindropsToRemove) {
			this.raindrops.remove(drop);
		}
	}

	private void handleDropFalling(List<Raindrop> raindropsToRemove, Raindrop drop) {
		boolean shouldRemove = drop.fall(this.getHeight());
		if (shouldRemove) {
			raindropsToRemove.add(drop);
		}
	}

	// ================== BOX COLLISIONS =============================
	private void handleBoxCollision(List<Raindrop> raindropsToRemove, Raindrop drop) {
		boolean hitBox = drop.insideBox(this.box);
		if (hitBox) {
			// Remove raindrops
			raindropsToRemove.add(drop);
		}
	}

	private void handleBoxCollision(Platform platform) {
		if (platform.getBoundingBox().intersects(this.box)) {
			platform.reverseDirection();
			platform.updatePosition(this.getSize());
		}
	}

	// ================== PLATFORM COLLISIONS =============================
	private void handlePlatformCollision(Platform platform) {
		for (Platform otherPlatform : this.platforms) {
			if (platform != otherPlatform && platform.intersects(otherPlatform)) {
				platform.bounceOff(otherPlatform, this.getSize());
			}
		}
	}

	private void handlePlatformCollision(List<Raindrop> raindropsToRemove, Raindrop drop) {
		for (Platform platform : this.platforms) {
			if (drop.insidePlatform(platform)) {
				raindropsToRemove.add(drop);
				return;
			}
		}
	}

	// FIXME: why doesn't Platform have an explode() method?
	private void handleExplosion(List<Platform> toRemove, Platform platform) {
		if (platform.willExplode()) {
			toRemove.add(platform);
			for (int i = 0; i < 50; i++) {
				this.raindrops.add(new Raindrop(platform.getBoundingBox()));
			}
		}
	}

	public void toggleBoxDirection() {
		this.dx *= -1;
	}

}
