package comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Driver class containing main for running and testing 
 * Collections.sort on the Rectangle class
 * 
 * @author CSSE Faculty
 *
 */
public class RectangleDriver {

	private ArrayList<Rectangle> rectangles;
	
	private void runApp() {
		this.rectangles = new ArrayList<>();
		
		this.rectangles.add(new Rectangle(5, 5));
		this.rectangles.add(new Rectangle(1, 20));
		this.rectangles.add(new Rectangle(3, 3));
		
		System.out.println(this.rectangles);
		System.out.println("Before sorting: " + this.rectangles);
		// TODO #1 - uncomment the following line, then go to Rectangle.java and do TODO #2
//		Collections.sort(this.rectangles);
		System.out.println(" After sorting: " + this.rectangles);	
		
		// TODO #3 - declare a variable called byCircumference using type Comparator<Rectangle>, make it sort by non-increasing circumference
		// Then uncomment the following line
//		Collections.sort(this.rectangles, byCircumference);
		
		System.out.println("After sorting by circumference (largest first) : " + this.rectangles);
	} // runApp
	
	
	public static void main(String[] args) {
		RectangleDriver app = new RectangleDriver();
		app.runApp();
	} // main
}
