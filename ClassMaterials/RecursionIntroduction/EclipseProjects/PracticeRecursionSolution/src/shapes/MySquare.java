package shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * This class represents a square.
 *
 * @author Curt Clifton.
 */
public class MySquare implements MyShape {

	private Rectangle2D square;

	/**
	 * Constructs a new square at the given location and size.
	 *
	 * @param x
	 * @param y
	 * @param size
	 */
	MySquare(double x, double y, double size) {
		this.square = new Rectangle2D.Double(x,y,size,size);
	}

	public void drawOn(Graphics2D g) {
		g.setColor(Color.RED);
		g.draw(this.square);
	}

}
