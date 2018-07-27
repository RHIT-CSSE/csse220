package edu.roseHulman.csse220.charges;

import java.awt.Graphics2D;

/**
 * This type represents an electrical charge in 2-d space.
 * 
 * @author Curt Clifton. Created Oct 3, 2008.
 */
public interface Charge {
	/**
	 * Calculates the force imposed by this charge on a positive unit charge at
	 * the given point in space.
	 * 
	 * @param x
	 * @param y
	 * @return the force vector
	 */
	Vector forceAt(int x, int y);

	/**
	 * Draws a representation of this charge onto the given graphics object.
	 * 
	 * @param g
	 */
	void drawOn(Graphics2D g);

}
