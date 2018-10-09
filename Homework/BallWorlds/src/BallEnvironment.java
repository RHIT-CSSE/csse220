

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.util.List;

/**
 * The type of an environment for holding Balls.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public interface BallEnvironment {

	/**
	 * Adds the given ball to this world.
	 * 
	 * @param ball
	 *            the ball to add, must not be null
	 */
	void addBall(Ball ball);

	/**
	 * Removes the given ball from this world, if it is in the world at all.
	 * Otherwise silently does nothing.
	 * 
	 * @param ball
	 *            the ball to remove
	 */
	void removeBall(Ball ball);

	/**
	 * Returns the ball that is closest to the given point.
	 * 
	 * @param point
	 * @return the nearest ball, or null if no balls in this world
	 */
	Ball nearestBall(Point2D point);

	/**
	 * Checks whether the given point is within the horizontal extents of this
	 * world. Ignores the vertical location of the point.
	 * 
	 * @param point
	 * @return true iff the given point is within the horizontal extents of this
	 */
	boolean isInsideWorldX(Point2D point);

	/**
	 * Checks whether the given point is within the vertical extents of this
	 * world. Ignores the horizontal location of the point.
	 * 
	 * @param point
	 * @return true iff the given point is within the vertical extents of this
	 */
	boolean isInsideWorldY(Point2D point);

	/**
	 * Checks whether the given point is within the bounds of this world, both
	 * vertically and horizontally.
	 * 
	 * @param point
	 * @return true iff the given point is within this world
	 */
	boolean isInsideWorld(Point2D point);

	/**
	 * Returns the size of this world.
	 * 
	 * @return the size
	 */
	Dimension getSize();

	/**
	 * Returns a list of the drawable parts in this environment.
	 * 
	 * @return a possibly-empty list
	 */
	public List<Drawable> getDrawableParts();

	/**
	 * Returns the center point of the world
	 * 
	 * @return the center point
	 */
	Point2D getCenterPoint();

}