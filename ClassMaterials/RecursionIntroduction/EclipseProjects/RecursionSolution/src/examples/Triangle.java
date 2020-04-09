package examples;

/**
 * A triangular shape composed of stacked unit squares like this:
 * 
 * <pre>
 * []
 * [][]
 * [][][]
 * [][][][]
 * </pre>
 * 
 * Based on example from Chapter 13 of Big Java, 3e.
 * 
 * Modified by Buffalo to pass width as a parameter
 * 
 * @author Cay Horstmann.
 */
public class Triangle {
	private int width;

	/**
	 * Constructs a triangular shape with the given width (and height).
	 * 
	 * @param width
	 */
	public Triangle(int width) {
		this.width = width;
	}
	
	/**
	 * returns the area of this triangle.
	 *
	 * @return the area
	 */
	public int getArea() {
		return computeAreaRecursively(this.width);
	}
	
	private static int computeAreaRecursively(int inputWidth) {
		//BASE CASE:
		//if we get to zero width we are done return 0
		if (inputWidth < 1) {
			return 0;
		}
		
		//RECURSIVE CALL:
		//calculate the area of a triangle with width 1 smaller than us
		int smallerArea = computeAreaRecursively(inputWidth - 1);
		
		
		//RETURN RESULT
		//the total area is the area of a triangle one smaller than us PLUS our width
		return smallerArea + inputWidth;
	}
	
	//Same as above except more compressed
	private static int computeAreaRecursively2(int inputWidth) {
		//BASE CASE:
		//if we get to zero width we are done return 0
		if (inputWidth < 1) {
			return 0;
		}
		//DO RECURSIVE CALL AND RETURN RESULT IN ONE LINE
		// "computeAreaRecursively(inputWidth - 1)" is calculated first, then inputWidth and its result are added
		// and then everything gets returned
		return inputWidth + computeAreaRecursively(inputWidth - 1) ;
	}
	
	//Same as above except EVEN more compressed
	private static int computeAreaRecursively3(int inputWidth) {
		//        TEST           ? result_if_TEST_is_TRUE  :  result_if_TEST_is_FALSE  
		return (inputWidth < 1) ? 0 : computeAreaRecursively(inputWidth - 1) + inputWidth;
	}
	
	
	
}
