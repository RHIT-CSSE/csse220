//package fractals;
//
//import java.awt.Graphics2D;
///**
// * 	  A class that defines a Koch Snowflake.
// *    It includes code to draw it in a graphics context.
// *    It tracks the location, size, and recursive depth.
// *
// *
// *    Read about it here:
// *    https://en.wikipedia.org/wiki/Koch_snowflake
// *
// *    Video explaining it here:
// *    https://www.khanacademy.org/math/geometry-home/geometry-volume-surface-area/koch-snowflake/v/koch-snowflake-fractal
// *
// */
//public class Snowflake {
//
//	private static final boolean DRAW_OVALS = false;
//	private static final int OVAL_SIZE=4;
//	private int x;
//	private int y;
//	private int side;
//	private int depth;
//
//	public Snowflake(int x, int y, int side, int depth) {
//		this.x = x;
//		this.y = y;
//		this.side = side;
//		this.depth= depth;
//	}
//
//	public void drawOn(Graphics2D g2d) {
//		g2d = (Graphics2D)g2d.create();
//
//		//move to upper left corner
//		g2d.translate(this.x, this.y);
//		// draw first side
//		drawFractalLine(0,0, this.side, 0, this.depth, g2d);
//		//move pen to end of first line
//		g2d.translate(this.side, 0);
//		//rotate 120 degrees to draw next side
//		g2d.rotate(2*Math.PI/3);
//		//draw second side
//		drawFractalLine(0,0, this.side, 0, this.depth, g2d);
//		//move pen to end of second line
//		g2d.translate(this.side, 0);
//		//rotate 120 degrees to draw next side
//		g2d.rotate(2*Math.PI/3);
//		//draw third side
//		drawFractalLine(0,0, this.side, 0, this.depth, g2d);
//		//move pen to end of third side (original location)
//		g2d.translate(this.side, 0);
//		//rotate back to original orientation
//		g2d.rotate(2*Math.PI/3);
//
//	}
//
//	private void drawFractalLine(int x1, int y1, int x2, int y2, int depth, Graphics2D g2d) {
//		if (depth == 1) {
//			//base case - just a straight line
//			g2d.drawLine(x1, y1, x2, y2);
//		} else {
//			g2d = (Graphics2D)g2d.create();
//			//move one third of the line's distance
//			int xDist = (x2-x1)/3;
//			int yDist = (y2-y1)/3;
//			//first 3rd
//			if (DRAW_OVALS)
//				g2d.fillOval(-OVAL_SIZE/2, -OVAL_SIZE/2, OVAL_SIZE, OVAL_SIZE);
//			drawFractalLine(0, 0, xDist, yDist, depth-1, g2d);
//			g2d.translate(xDist, yDist);
//			//middle recursion
//			g2d.rotate(-Math.PI/3);
//			if (DRAW_OVALS)
//				g2d.fillOval(-OVAL_SIZE/2, -OVAL_SIZE/2, OVAL_SIZE, OVAL_SIZE);
//			drawFractalLine(0, 0, xDist, yDist, depth-1, g2d);
//			g2d.translate(xDist, yDist);
//			g2d.rotate(2*Math.PI/3);
//			if (DRAW_OVALS)
//				g2d.fillOval(-OVAL_SIZE/2, -OVAL_SIZE/2, OVAL_SIZE, OVAL_SIZE);
//			drawFractalLine(0, 0, xDist, yDist, depth-1, g2d);
//			g2d.translate(xDist, yDist);
//			g2d.rotate(-Math.PI/3);
//			if (DRAW_OVALS)
//				g2d.fillOval(-OVAL_SIZE/2, -OVAL_SIZE/2, OVAL_SIZE, OVAL_SIZE);
//			drawFractalLine(0, 0, xDist, yDist, depth-1, g2d);
//			g2d.translate(xDist, yDist);
//			if (DRAW_OVALS)
//				g2d.fillOval(-OVAL_SIZE/2, -OVAL_SIZE/2, OVAL_SIZE, OVAL_SIZE);
//		}
//
//	}
//
//
//
//
//}
