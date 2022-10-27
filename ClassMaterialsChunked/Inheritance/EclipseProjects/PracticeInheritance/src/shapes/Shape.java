package shapes;

/**
 * 
 * @author Claude Anderson (Modified MArk Weiss's code)
 *
 */
public interface Shape extends Comparable<Shape> {
	
	/**
	 * 
	 * @return the area of this shape
	 */
	public double getArea();

	/**
	 * 
	 * @return the perimeter of this shape
	 */
	public double getPerimeter();

	/**
	 * 
	 * @return half the perimeter of this shape
	 */
	public double getSemiPerimeter();
}
