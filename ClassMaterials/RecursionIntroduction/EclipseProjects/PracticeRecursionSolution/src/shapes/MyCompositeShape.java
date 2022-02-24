package shapes;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 * A shape composed of several other shapes.
 *
 * @author Curt Clifton.
 */
public class MyCompositeShape implements MyShape {
	private final List<MyShape> subShapes = new ArrayList<MyShape>();
	
	/**
	 * Adds the given shape to this composite shape.
	 *
	 * @param shape
	 */
	void add(MyShape shape) {
		this.subShapes.add(shape);
	}
	
	public void drawOn(Graphics2D g) {
		for (MyShape shape : this.subShapes) {
			shape.drawOn(g);
		}
	}

}
