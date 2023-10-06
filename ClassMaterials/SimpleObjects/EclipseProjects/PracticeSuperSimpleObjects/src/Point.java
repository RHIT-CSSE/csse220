/**
 * This class represents a 2d point and allows distance calculations
 * using both static and instance methods.
 * 
 * @author Jason Yoder
 *
 */
public class Point {
	
	//CONSTANT for the origin (never changes)
	public static final Point ORIGIN = new Point(0,0);
	
	//Instance Variables
	private double x, y;
	
	//Constructor
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Note: main is a static method
	public static void main(String[] args) {
		Point a = new Point( 0, 0 );
		Point b = new Point( 3, 4);
		
		//Static method called on the class itself
		// "How far are Abe and Betty from each other?"
		System.out.println(  Point.distanceBetween(a,b) );
		
		//Instance method called on a SPECIFIC INSTANCE (Object) of Point
		// "Abe, how far away is Betty from you?"
		System.out.println(  a.distanceTo( b ) );
	}
	
	/**
	 * INSTANCE METHOD:
	 * Returns the distance from one Point to another
	 * 
	 * @param other Point
	 * @return distance between this Point and some other Point
	 */
	private double distanceTo(Point other) {
		return distanceFormulaCalc(this.x, other.x, this.y, other.y);
	}

	/**
	 * STATIC METHOD:
	 * Returns the distance between two given Points
	 * 
	 * @param a
	 * @param b
	 * @return distance between two Points
	 */
	private static double distanceBetween(Point a, Point b) {
		return distanceFormulaCalc(a.x, b.x, a.y, b.y);
	}
	
	/** 
	 * Applies distance formula to two points giving each 
	 * coordinate as input (x1, y1) (x2, y2)
	 * 
	 * @param x1, x2, y1, y2
	 * @return distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceFormulaCalc(double x1, double x2, double y1, double y2 ) {
		double xDiff = x1-x2;
		double yDiff = y1-y2;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
}
