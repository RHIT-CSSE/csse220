package game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import game.collisions.GameObject;

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

		this.platforms.add(new Platform(200, 100, 20, 0, this));
		this.platforms.add(new Platform(30, 10, 0, 20, this));
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
		handleCollisions();
		this.numTicks++;
	}

	private void handleCollisions() {
		List<GameObject> allObjects = new ArrayList<>();
		//allObjects.add(box);
		allObjects.addAll(raindrops);
		allObjects.addAll(platforms);
		
		for(GameObject object: allObjects){
			// FIXME: make box a GameObject
			object.collideWithBox(this.box);
			
			for(GameObject object2: allObjects){
				if(object != object2 && !object.shouldRemove() && !object2.shouldRemove()){
					object.collideWith(object2);
				}
			}
		}
		
		List<GameObject> shouldRemove = new ArrayList<>();
		
		for(GameObject object: allObjects){
			if(object.shouldRemove()){
				shouldRemove.add(object);
			}
		}
		
		for(GameObject object: shouldRemove){
			// Not sure which one to remove from.
			// FIXME: maybe you could do more double dispatch??
			this.raindrops.remove(object);
			this.platforms.remove(object);
			object.onRemove();
		}
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
			this.raindrops.add(new Raindrop(this.getWidth(), this));
		}

		for (Raindrop drop : this.raindrops) {
			drop.update();
		}
	}

	private void updatePlatforms() {
		for (Platform platform : this.platforms) {
			platform.update();
		}
	}
		
	public void toggleBoxDirection() {
		this.dx *= -1;
	}

	public void createRainDrop(Double boundingBox) {
		this.raindrops.add(new Raindrop(boundingBox, this));
	}

}
