package shapes;

import java.awt.Graphics2D;

/**
 * This interface represents any shape in the example.
 *
 * @author Curt Clifton.
 */
interface MyShape {
	/**
	 * Draws this shape on the given graphics object.
	 *
	 * @param g
	 */
	void drawOn(Graphics2D g);
}
