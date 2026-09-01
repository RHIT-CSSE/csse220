package shapes;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * A sample program for recursively drawing shapes.
 * 
 * @author Curt Clifton.
 */
public class Main {

	private static final Dimension SIZE = new Dimension(800, 600);
	private static final int MAX_DEPTH = 2;
	private static final int MAX_SHAPE_SIZE = 150;
	private static final int NUMBER_OF_CHILDREN = 3;

	private static enum Kind {
		CIRCLE, RECTANGLE, COMPOSITE
	}

	/**
	 * Starts the sample program.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(SIZE);
		frame.setTitle("Shapes, Recursively");

		MyShape shape = buildShape(MAX_DEPTH);
		frame.add(new ShapeDrawer(shape));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private static MyShape buildShape(int depth) {
		// Gets some random values for the next shape
		double x = Math.random() * SIZE.getWidth();
		double y = Math.random() * SIZE.getHeight();
		double size = Math.random() * MAX_SHAPE_SIZE;

		// Picks the kind of shape to create
		Kind nextKind;
		if (depth > 0) {
			nextKind = Kind.COMPOSITE;
		} else { 
			// No more composites
			if (Math.random() < 0.5) {
				nextKind = Kind.CIRCLE;
			} else {
				nextKind = Kind.RECTANGLE;
			}
		}

		// Creates the shape.
		switch (nextKind) {
		case CIRCLE:
			return new MyCircle(x, y, size);
		case RECTANGLE:
			return new MySquare(x, y, size);
		case COMPOSITE:
			MyCompositeShape result = new MyCompositeShape();
			for (int i = 0; i < NUMBER_OF_CHILDREN; i++) {
				result.add(buildShape(depth - 1));
			}
			return result;
		default:
			throw new RuntimeException("Should never get here.");
		}
	}
}
