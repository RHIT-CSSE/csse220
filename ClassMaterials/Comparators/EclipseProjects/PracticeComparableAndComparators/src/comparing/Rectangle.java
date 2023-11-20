package comparing;


/**
 * A Person class, designed for use with comparable.
 * 
 * TODO #2: Modify this class so that it implements Comparable<Rectangle>
 * 
 * Rectangle objects should be sorted in non-decreasing order by the rectangle's area
 * 
 * So the output of the driver main should be:
 *  [(3, 3), (1, 20), (5, 5)]
 * 
 * @author CSSE Faculty
 *
 */
public class Rectangle {
	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	} // Rectangle
	
	public int getArea() {
		return this.width * this.height;
	} // getArea
	
	public String toString() {
		return "(" + this.width + ", " + this.height + ")";
	} // toString

	
}
