package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Draws a shape.
 * 
 * @author Curt Clifton.
 */
public class ShapeDrawer extends JComponent {

	private MyShape shape;

	/**
	 * Constructs a component for drawing the given shape.
	 * 
	 * @param shape
	 */
	ShapeDrawer(MyShape shape) {
		this.shape = shape;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.shape.drawOn((Graphics2D) g);
	}

}
