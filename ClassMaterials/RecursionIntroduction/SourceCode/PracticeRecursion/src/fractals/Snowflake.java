package fractals;

import java.awt.Graphics2D;

/**
 * A class that defines a Koch Snowflake. It includes code to draw it in a
 * graphics context. It tracks the location, size, and recursive depth.
 * 
 * 
 * Read about it here: https://en.wikipedia.org/wiki/Koch_snowflake
 * 
 * Video explaining it here:
 * https://www.khanacademy.org/math/geometry-home/geometry-volume-surface-area/koch-snowflake/v/koch-snowflake-fractal
 * 
 */
public class Snowflake {

	private int x;
	private int y;
	private int side;
	private int depth;

	public Snowflake(int x, int y, int side, int depth) {
		this.x = x;
		this.y = y;
		this.side = side;
		this.depth = depth;
	}

	public void drawOn(Graphics2D g2d) {
		g2d = (Graphics2D) g2d.create();

		// TODO #1 - move to upper left corner

		// TODO #2 - recursively draw first side

		// TODO #3 - move pen to end of first line

		// TODO #4 - rotate 120 degrees to draw second side

		// TODO #5 - recursively draw second side

		// TODO #6 - move pen to end of second line

		// TODO #7 - rotate 120 degrees to draw third side

		// TODO #8 - recursively draw third side

		// TODO #9 - move pen to end of third side (original location)

		// TODO #10 - rotate back to original orientation

	}

	private void drawFractalLine(int x1, int y1, int x2, int y2, int depth, Graphics2D g2d) {
		// TODO #1 - check for base case and just draw a straight line if base case
		
		// TODO #2a - recursively draw one third of line's distance 
		
		// TODO #2b - move pen to end first third of line
		
		// TODO #3a - rotate 60 degrees outward
		
		// TODO #3b - recursively draw line 1/6 the distance of line
		
		// TODO #3c - rotate 120 degrees inward
		
		// TODO #3d - recursively draw line 1/6 the distance of line
		
		// TODO #3e - move pen to two thirds of line
		
		// TODO #4a - recursively draw final third of line's distance 
		
		// TODO #4b - move pen to end of line
	}

}
