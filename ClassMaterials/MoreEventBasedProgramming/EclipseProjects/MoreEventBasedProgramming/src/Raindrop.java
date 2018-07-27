import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Raindrop {
	private double x;
	private double y;
	private double yVelocity = 3;
	// All raindrops are the same constant size
	private static final double SIZE = 5.0;
	
	public Raindrop(int range) {
		this.x = Math.random()*range;
		this.y = 0;
	}
	
	/**
	 * @param bottom The y-coordinate of the bottom of the screen.
	 * @return True if the raindrop fell off the bottom of the screen
	 */
	public boolean fall(int bottom) {
		this.y += this.yVelocity;
		return this.y > bottom;
	}
	
	public void drawOn(Graphics2D g) {
		g.setColor(Color.BLUE);
		Ellipse2D.Double drop = 
				new Ellipse2D.Double(this.x, this.y, SIZE, SIZE);
		g.fill(drop);
		g.setColor(Color.BLACK);
	}
		
}
