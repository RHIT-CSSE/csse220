package platforms;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import game.GameComponent;
import game.GameObject;

/**
 * A Platform move around the screen and collects RainDrops.
 * 
 * A Platform can fill with Raindrops; when it does, it EXPLODES 
 * into a shower of RainDrops. 
 *
 */
public class BouncingPlatform extends GameObject {
	public static final int WIDTH = 80;
	public static final int HEIGHT = 20;

	public static final int RED_START = 222, GREEN_START=184, BLUE_START=135, WATER_INCREMENT=5;
	private static final int DROPS_ON_EXPLODE = 50;
	private int rainDropsCollected = 0;
	private int invincibilityCount;
	
	public BouncingPlatform(GameComponent gameComponent, int x, int y, int xVelocity, int yVelocity) {
		super(gameComponent, x, y, xVelocity, yVelocity, WIDTH, HEIGHT);
	}


	public void drawOn(Graphics2D g) {
		
		if (this.invincibilityCount > 0) {
			g.setColor(new Color(255,255,0));
			g.fill(new Rectangle2D.Double(getBoundingBox().x, getBoundingBox().y, this.getWidth(), this.getHeight()));
			
		} else {
			g.setColor(new Color(RED_START-rainDropsCollected, GREEN_START-rainDropsCollected, BLUE_START+rainDropsCollected));
			g.fill(new Rectangle2D.Double(getBoundingBox().x, getBoundingBox().y, this.getWidth(), this.getHeight()));
		}
		g.setColor(Color.BLACK);
	}
	
	public boolean willExplode() {
		return this.rainDropsCollected >= 255 - BLUE_START;
	}

	@Override
	public boolean shouldRemove() {
		return willExplode();
	}

	@Override
	public void onRemove() {
		for (int i = 0; i < DROPS_ON_EXPLODE; i++) {
			this.gameComponent.createRainDrop(this.getBoundingBox());
		}
	}

	public void bounce() {
		this.reverseDirection();
		this.update();
	}

	@Override
	public void update() {
		super.update();
		if ( isOffScreen()  ) {
			this.reverseDirection();
		}
		this.invincibilityCount--;
	}
	
	
	public void setRainDropsCollected(int drops) {
		this.rainDropsCollected = drops;
	}
	
	public int getRainDropsCollected() {
		return this.rainDropsCollected;
	}


	public void setInvincibilityCount(int i) {
		this.invincibilityCount = i;
		
	}
	
	public int getInvincibilityCount() {
		return this.invincibilityCount;
		
	}


	@Override
	public void collideWith(GameObject other) {
		other.collideWithBouncingPlatform(this);
	}


	@Override
	public void collideWithBouncingPlatform(BouncingPlatform p) {
		p.bounce();
		this.bounce();
	}


	@Override
	public void collideWithUserControlledPlatform(UserControlledPlatform p) {
		p.reverseDirection();
	}


	@Override
	public void collideWithDrop(AbstractDrop drop) {
		drop.collideWithBouncingPlatform(this);
	}
	


}
