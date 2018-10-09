

import java.awt.geom.Point2D;

/**
 * Represents things that can be moved.
 * 
 * @author Curt Clifton. Created Jan 23, 2011.
 */
public interface Relocatable {

	/**
	 * Re-centers this object to the given.
	 * 
	 * @param point
	 */
	void moveTo(Point2D point);

	/**
	 * Returns the center point of this object.
	 * 
	 * @return the center point
	 */
	Point2D getCenterPoint();

}