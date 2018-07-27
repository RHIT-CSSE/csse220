package threadedBalls;

import java.awt.Graphics2D;

/**
 * This is the type of balls in the system.
 * 
 * @author Curt Clifton. Created Nov 9, 2009.
 */
public interface Ball extends Runnable {

	/**
	 * Asks this ball to render a snapshot of itself on the given graphics
	 * object.
	 * 
	 * @param g2
	 */
	void drawOn(Graphics2D g2);
}
