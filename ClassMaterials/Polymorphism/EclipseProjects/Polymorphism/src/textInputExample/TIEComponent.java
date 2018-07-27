package textInputExample;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * This component draws a shape according to some inputs.
 *
 * @author Curt Clifton.
 *         Created Oct 12, 2008.
 */
public class TIEComponent extends JComponent {
	private Rectangle shape;
	
	/**
	 * Constructs a component for viewing a rectangle with the given attributes.
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
	public TIEComponent(int x, int y, int w, int h) {
		this.shape = new Rectangle(x, y, w, h);
		this.setPreferredSize(new Dimension(400, 300));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(this.shape);
	}

	/**
	 * @return the x-coordinate of the contained shape
	 */
	public int getShapeX() {
		return (int) this.shape.getX();
	}

	/**
	 * @return the y-coordinate of the contained shape
	 */
	public int getShapeY() {
		return (int) this.shape.getY();
	}
	
	/**
	 * Sets the x-coordinate of the contained shape.
	 *
	 * @param x
	 */
	public void setShapeX(int x) {
		this.shape.x = x;
		this.repaint();
	}
	
	/**
	 * Sets the y-coordinate of the contained shape.
	 *
	 * @param y
	 */
	public void setShapeY(int y) {
		this.shape.y = y;
		this.repaint();
	}
}
