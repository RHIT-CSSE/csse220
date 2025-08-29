package game;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public abstract class GameObject {	
	private double x, y;
	private double yVelocity;
	private double xVelocity;
	private boolean shouldRemove;
	private double width;
	private double height;
	protected GameComponent gameComponent;
	
	// ------------------------------------------------------------------------------------------------------------------

	public GameObject(GameComponent gameComponent, double x, double y, double dx, double dy, double width, double height) {
		this.x = x;
		this.y = y;
		this.xVelocity = dx;
		this.yVelocity = dy;
		this.gameComponent = gameComponent;
		this.width = width;
		this.height = height;
	} // GameObject
	
	public abstract void onRemove();
	public abstract void drawOn(Graphics2D g2);

	// updatePosition, fall, ... can all be consolidated into an update method.
	public void update() {
		this.x += this.xVelocity;
		this.y += this.yVelocity;
	} // update
	
	public void reverseDirection() {
		this.xVelocity = -this.xVelocity;
		this.yVelocity = -this.yVelocity;
	} // reverseDirection
	
	// fall, willExplode, ...
	public boolean shouldRemove() {
		return this.shouldRemove;
	} // shouldRemove
	
	public void markToRemove() {
		this.shouldRemove = true;
	} // markToRemove
	
	public Rectangle2D.Double getBoundingBox() {
		return new Rectangle2D.Double(this.x, this.y, getWidth(), getHeight());
	} // getBoundingBox

	public boolean overlaps(GameObject other) {
		return getBoundingBox().intersects(other.getBoundingBox());
	}
	
	public boolean isOffScreen() {
		boolean xLow = this.x < 0;
		boolean xHigh = this.x + this.width > gameComponent.getWidth();
		boolean yLow = this.y < 0;
		boolean yHigh = this.y + this.height > gameComponent.getHeight();
		return xLow || xHigh || yLow || yHigh;
	} // isOffScreen
	
	public boolean offBottom() {
		return this.y > gameComponent.getHeight();
	} // offBottom
	
	public double getX() {
		return this.x;
	} // getX
	
	public double getY() {
		return this.y;
	} // getY
	
	public double getWidth() {
		return this.width;
	} // getWidth
	public double getHeight() {
		return this.height;
	} // getHeight

}
