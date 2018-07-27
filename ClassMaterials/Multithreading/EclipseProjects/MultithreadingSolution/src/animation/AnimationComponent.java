package animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * A component to hold the animated object.
 * 
 * @author Matt Boutell. Created Jan 30, 2010.
 */
public class AnimationComponent extends JPanel {
	private double angle;
	private double radius;
	private static final double SIZE = 20;
	private static final int DRAWING_SIZE = 400;
	private static final int MAX_RECTANGLES = 144;
	private int nRectangles;

	/**
	 * Creates a new component.
	 */
	public AnimationComponent() {
		this.setPreferredSize(new Dimension(DRAWING_SIZE, DRAWING_SIZE));
		this.angle = 0;
		this.radius = 0;
		this.nRectangles = 0;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		this.setBackground(Color.WHITE);
		this.radius = 0;
		this.angle = 0;
		for (int i = 0; i < this.nRectangles; i++) {
			double x = DRAWING_SIZE / 2 + this.radius * Math.cos(this.angle);
			double y = DRAWING_SIZE / 2 + this.radius * Math.sin(this.angle);
			// Angle determines hue of color. Decreasing saturation over time,
			// as the number of rectangles increases, causes it to fade
			// over time. 
			float hue = (float) (this.angle / (2 * Math.PI));
			float saturation = i/(float)(Math.pow(this.nRectangles, 1.2));
			g2.setColor(Color.getHSBColor(hue, saturation, 1.0f));
			// Alternately, decreasing brightness over time makes it darker.
			//float brightness = 0.5f + 0.5f * i / this.nRectangles;
			//g2.setColor(Color.getHSBColor(hue, 1.0f, brightness));
			g2.fill(new Rectangle2D.Double(x, y, SIZE, SIZE));
			this.radius += 1.5;
			this.angle += Math.PI / 9; // 20 degrees
		}
	}

	/**
	 * Move the shape to the next location.
	 * 
	 */
	public void addSquare() {
		if (this.nRectangles > MAX_RECTANGLES) {
			this.nRectangles = 0;
		}
		this.nRectangles++;
		this.repaint();
	}
}
