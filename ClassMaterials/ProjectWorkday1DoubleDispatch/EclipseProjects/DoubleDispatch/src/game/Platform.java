package game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * A Platform move around the screen and collects RainDrops.
 * 
 * A Platform can fill with Raindrops; when it does, it EXPLODES 
 * into a shower of RainDrops. 
 *
 */
public class Platform {
	private double dx;
	private double dy;
	private double width = 80;
	private double height = 20;
	private int red = 222;
	private int green = 184;
	private int blue = 135;

	private int rainDropsCollected = 0;
	private Rectangle2D.Double box;

	public Platform(int x, int y, int xVelocity, int yVelocity) {
		this.dx = xVelocity;
		this.dy = yVelocity;
		this.box = new Rectangle2D.Double(x, y, this.width, this.height);
	}

	public void drawOn(Graphics2D g) {
		g.setColor(new Color(red, green, blue));
		g.fill(new Rectangle2D.Double(this.box.x, this.box.y, this.width, this.height));
	}

	public void bounceOff(Platform otherPlatform, Dimension screen) {
		this.reverseDirection();
		otherPlatform.reverseDirection();
		this.updatePosition(screen);
		otherPlatform.updatePosition(screen);
	}

	public void updatePosition(Dimension screen) {
		this.box.x += dx;
		this.box.y += dy;
		if (this.box.x < 0 || this.box.x + this.width > screen.getWidth()) {
			this.dx = -this.dx;
			this.updatePosition(screen);
		}
		if (this.box.y < 0 || this.box.y + this.height > screen.getHeight()) {
			this.dy = -this.dy;
			this.updatePosition(screen);
		}
	}

	public Rectangle2D.Double getBoundingBox() {
		return this.box;
	}

	public boolean intersects(Platform other) {
		return this.box.intersects(other.box);
	}

	public void addDrop() {
		int waterAmount = 5; // scaling factor to speed things up
		this.rainDropsCollected = this.rainDropsCollected + waterAmount;
		
		this.red -= waterAmount;
		this.green -= waterAmount;
		this.blue += waterAmount;
		
	}

	public boolean willExplode() {
		return this.rainDropsCollected >= 255 - 135;
	}

	public void reverseDirection() {
		this.dx = -this.dx;
		this.dy = -this.dy;
	}
}
