package shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * This class represents a circle.
 *
 * @author Curt Clifton.
 */
public class MyCircle implements MyShape {
	private Ellipse2D circ;

	/**
	 * Constructs a new circle with the given location and diameter.
	 *
	 * @param x
	 * @param y
	 * @param size
	 */
	MyCircle(double x, double y, double size) {
		this.circ = new Ellipse2D.Double(x, y, size, size);
	}

	public void drawOn(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.draw(this.circ);
	}

}
