package gravity;

import java.awt.Color;
import java.awt.Graphics2D;


/**
 * The superclass of your moveable rectangles.
 * 
 * You can modify this class if you'd like but it isn't necessary.
 * 
 * @author hewner
 *
 */
public class GravityRect {
	
	private static final int WIDTH = 45;
	private static final int HEIGHT = 25;

	private int centerX;
	private int centerY;


	public GravityRect(int x, int y) {
		this.centerX = x;
		this.centerY = y;
	}
	
	/**
	 * Draws the rectangle on the graphics object
	 * 
	 * @param g - the graphics object to draw on
	 */
	public void drawOn(Graphics2D g) {
		g.setColor(fillColor());
		g.fillRect(this.centerX - WIDTH/2, this.centerY - HEIGHT/2, WIDTH, HEIGHT);
		g.setColor(Color.BLACK);
		g.drawRect(this.centerX - WIDTH/2, this.centerY - HEIGHT/2, WIDTH, HEIGHT);
	}

	public Color fillColor() {
		return Color.GRAY;
	}
	
	public void drop() {
		if(this.centerY + HEIGHT/2 >= GravityRectComponent.FLOOR_HEIGHT) {
			this.centerY = GravityRectComponent.FLOOR_HEIGHT - HEIGHT/2;
		} else {
			this.centerY += dropSpeed();
		}
	}

	public int dropSpeed() {
		return 10;
	}
}
