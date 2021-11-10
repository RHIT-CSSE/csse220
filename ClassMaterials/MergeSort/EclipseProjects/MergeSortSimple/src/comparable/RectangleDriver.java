package comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * An example class for implementing comparable.
 * 
 * Rectangles should be sorted by area in increasing order.
 * 
 * @author hewner
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
	} // runApp
	
	
	public static void main(String[] args) {
		RectangleDriver app = new RectangleDriver();
		app.runApp();
	} // main
}
