package comparing;

import java.util.Comparator;

public  class ByPerimeterComparator implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		return o2.getPerimeter() - o1.getPerimeter();
	}

}
