import java.awt.Point;


/**
 * A single method class that needs to be tested. The JUnit test 
 * file should be named TestThisClassTest.java.
 *
 */
public class TestThisClass {

	/**
	 * Takes two points and returns the slope rounded to the
	 * nearest 3 decimal digits as a String.  An undefined 
	 * slope will result in returning the string "Undefined"
	 * 
	 * 
	 * @param Point p1
	 * @param Point p2
	 * @return the slope as a string rounded to the nearest thousandth 
	 */
	public static String getSlope(Point p1, Point p2) {
		// TODO: build Unit tests that test this function appropriately
		//
		// For full credit, your tests must contain at least 3 asserts
		// that test *different* cases (e.g. boundary cases, etc.)
		// However, your tests do not need to be exhaustive.
		//
		// Your test should use the JUnit framework and be in its own file
		// TestThisClassTest.java.
		
		return (p1.x==p2.x) ? "Undefined" : 
			String.format("%.3f", (((double)(p2.y-p1.y)/(double)(p2.x-p1.x))+0.0f));
	}
	
}
