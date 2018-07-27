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
public class Rectangle implements Comparable<Rectangle>{
	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return this.width*this.height;
	}
	
	public String toString() {
		return this.width + "x" + this.height;
	}
	
	public static void main(String[] args) {
		ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
		rects.add(new Rectangle(5,5));
		rects.add(new Rectangle(1,20));
		rects.add(new Rectangle(3,3));
		
		Collections.sort(rects);
		
		System.out.println(rects);
	}

	@Override
	public int compareTo(Rectangle other) {
		return this.getArea() - other.getArea();
	}
}
