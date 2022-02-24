package moveableRectangle;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


/**
 * The superclass of your moveable rectangles.
 * 
 * You can modify this class if you'd like but it isn't necessary.
 * 
 * @author hewner
 *
 */
public class MoveableRectangle {
	
	private static final int WIDTH = 40;
	private static final int HEIGHT = 90;

	private double centerX;
	private double centerY;
	private Color color;

	private double xVelocity;
	private double yVelocity;


	/**
	 * I don't recommend you use this constructor
     *  call the parameterized constructor below
	 */
	public MoveableRectangle() {
		// hint: 
		this(Color.BLACK);
	}
	
	/**
	 * Creates a new rectangle at a random location
	 * @param color - the color to draw the rectangle
	 */
	public MoveableRectangle(Color color) {
		Random random = new Random();
		this.centerX = (640 - WIDTH)*random.nextDouble() + WIDTH/2.0;
		this.centerY = (480 - HEIGHT)*random.nextDouble() + HEIGHT/2.0;
		this.color = color;
		this.xVelocity = 0;
		this.yVelocity = 0;
	}
	
	/**
	 * Draws the rectangle on the graphics object
	 * 
	 * @param g - the graphics object to draw on
	 */
	public void drawOn(Graphics2D g) {
	
		g.setColor(this.color);
		g.fillRect((int) (this.centerX - WIDTH/2), (int) (this.centerY - HEIGHT/2), WIDTH, HEIGHT);
	}
	
	/**
	 * Moves the shape one "step" in the direction of the velocity
	 * 
	 * Won't move the shape if it's out of bounds
	 * 
	 * @param maxX max x coordinate
	 * @param maxY max y coordinate
	 */
	public void updatePosition(int maxX, int maxY) {
		double newX = this.centerX + this.xVelocity;
		double newY = this.centerY + this.yVelocity;
		
		if(newX - WIDTH/2 > 0 && newX + WIDTH/2 < maxX) {
			this.centerX = newX;
		}
		
		if(newY - HEIGHT/2 > 0 && newY + HEIGHT/2 < maxY) {
			this.centerY = newY;
		}
	}
	
	public String toString() {
		return getClass().getName() + " (centerX=" + this.centerX +
				", centery=" + this.centerY +
				", xVel=" + this.xVelocity +
				", yVel=" + this.yVelocity + ")";
	}

	
	/**
	 * Getter
	 * @return x velocity
	 */
	public double getxVelocity() {
		return xVelocity;
	}

	/**
	 * Setter
	 * @param xVelocity new x veolcity
	 */
	public void setxVelocity(double xVelocity) {
		this.xVelocity = xVelocity;
	}

	/**
	 * Getter
	 * @return y velocity
	 */
	public double getyVelocity() {
		return yVelocity;
	}

	/**
	 * Setter
	 * @param yVelocity new y velocity
	 */
	public void setyVelocity(double yVelocity) {
		this.yVelocity = yVelocity;
	}

	/**
	 * Getter
	 * @return x coordinate of the center of the rectangle
	 */
	public double getCenterX() {
		return centerX;
	}

	/**
	 * Getter
	 * @return y coordinate of the center of the rectangle
	 */
	public double getCenterY() {
		return centerY;
	}
	
	/**
	 * Setter
	 * @param centerX new center x coordinate
	 */
	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}

	/**
	 * Setter
	 * @param centerY new center y coordinate
	 */
	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}
}
