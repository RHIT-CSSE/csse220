package game;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import drops.AbstractDrop;
import platforms.BouncingPlatform;
import platforms.UserControlledPlatform;

// TODO: Refactor Raindrop, Platform, (and hopefully that lone box?) into GameObjects.
public abstract class GameObject {
	
	private double x, y;
	private double yVelocity;
	private double xVelocity;
	private boolean shouldRemove;
	private double width;
	private double height;
	protected GameComponent gameComponent;
	
	
	public GameObject(GameComponent gameComponent, double x, double y, double dx, double dy, double width, double height) {
		this.x = x;
		this.y = y;
		this.xVelocity = dx;
		this.yVelocity = dy;
		this.gameComponent = gameComponent;
		this.width = width;
		this.height = height;
	}
	
	public abstract void onRemove();
	public abstract void drawOn(Graphics2D g2);
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}

	// updatePosition, fall, ... can all be consolidated into an update method.
	public void update() {
		this.x += this.xVelocity;
		this.y += this.yVelocity;
	}
	
	public void reverseDirection() {
		this.xVelocity = -this.xVelocity;
		this.yVelocity = -this.yVelocity;
	}
	
	// fall, willExplode, ...
	public boolean shouldRemove() {
		return this.shouldRemove;
	}
	
	public void markToRemove() {
		this.shouldRemove = true;
	}
	
	public Rectangle2D.Double getBoundingBox() {
		return new Rectangle2D.Double(this.x, this.y, getWidth(), getHeight() );
	}

	public boolean overlaps(GameObject other) {
		return getBoundingBox().intersects(other.getBoundingBox());
	}
	
	public boolean isOffScreen() {
		boolean xLow = x < 0;
		boolean xHigh = x + width > gameComponent.getWidth();
		boolean yLow = y < 0;
		boolean yHigh = y + height > gameComponent.getHeight();
		return xLow || xHigh || yLow || yHigh;
	}
	
	public boolean offBottom() {
		return y > gameComponent.getHeight();
	}
	
	//first call inside of gameComponent between game objects
	public abstract void collideWith(GameObject other);
	
	//abstract class present for platforms to collide with
	public abstract void collideWithDrop(AbstractDrop drop);
	
	//specialized drops use these methods to execute the code
	//the platform classes expose methods and the drops call them with their implementation
	//of these methods
	public abstract void collideWithBouncingPlatform(BouncingPlatform p);
	public abstract void collideWithUserControlledPlatform(UserControlledPlatform p);
	

}
