

import java.awt.Color;
import java.awt.Shape;

/**
 * Represents objects that have a shape and a fill color.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public interface Drawable {

	/**
	 * Returns the fill color that should be drawn to represent this object.
	 * 
	 * @return the fill color
	 */
	Color getColor();

	/**
	 * Returns the shape the should be drawn to represent this object.
	 * 
	 * @return the shape to draw
	 */
	Shape getShape();

}
