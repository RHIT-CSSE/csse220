package animationWithLines;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * A component to hold the animated object.
 * 
 * @author Matt Boutell, modified by <YOUR NAME>. Created Jan 30, 2010.
 */
public class AnimationComponent extends JPanel {
	private double angle;
	private double radius;
	private int nRectangles;
	private static final double DELTA_ANGLE = 2.3998277;
	private static final double RADIUS_GROWTH_FACTOR = 1.5;
	private static final double SQUARE_SIZE = 20;
	private static final int DRAWING_SIZE = 1000;
	private static final int MAX_RECTANGLES = 3000;
	private double xo = 0.0;
	private double yo = 0.0;
	

	/**
	 * Creates a new component.
	 * 
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
		double x = 0;
		double y = 0;
		
		for (int i = 0; i < this.nRectangles; i++) {
			
			x = DRAWING_SIZE / 2 + this.radius * Math.cos(this.angle);
			y = DRAWING_SIZE / 2 + this.radius * Math.sin(this.angle);
			// Angle determines hue of color. Decreasing saturation over time,
			// as the number of rectangles increases, causes it to fade
			// over time. 
			float hue = (float) (this.angle / (2 * Math.PI));
			float saturation = i/(float)(Math.pow(this.nRectangles, 1));
			g2.setColor(Color.getHSBColor(hue, saturation, 1.0f));
			//g2.fill(new Rectangle2D.Double(x, y, SQUARE_SIZE, SQUARE_SIZE));
			g2.drawLine((int)this.xo, (int)this.yo, (int)x, (int)y);
			if(!(i == this.nRectangles - 1)){
				this.xo = x;
				this.yo = y;
			}
			
			this.radius += RADIUS_GROWTH_FACTOR;
			this.angle += DELTA_ANGLE; 
		}
		//this is the epileptic square if you want to remove it
		g2.setColor(Color.BLACK);
		g2.fillRect((int)(this.xo-(SQUARE_SIZE/2)), (int)(this.yo-(SQUARE_SIZE/2)), (int)SQUARE_SIZE, (int)SQUARE_SIZE);
		g2.fillRect((int)(x-(SQUARE_SIZE/2)), (int)(y-(SQUARE_SIZE/2)), (int)SQUARE_SIZE, (int)SQUARE_SIZE);
	}

	/**
	 * Move the shape to the next location, resetting once the screen is full
	 * of some fixed number of rectangles.
	 */
	public void addSquare() {
		if (this.nRectangles > MAX_RECTANGLES) {
			this.nRectangles = 0;
		}
		this.nRectangles++;
		this.repaint();
	}
}
