package edu.roseHulman.csse220.charges;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * This class represents 2 dimensional space with charges.
 * 
 * @author Curt Clifton. Created Oct 3, 2008.
 */
public class Space extends JComponent {
	private ArrayList<Charge> charges = new ArrayList<Charge>();

	/**
	 * The number of pixels per unit length of space.
	 */
	public static final int GRANULARITY = 30;

	/**
	 * Adds the given charge to this space.
	 * 
	 * @param charge
	 */
	public void addCharge(Charge charge) {
		this.charges.add(charge);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		// Transform graphics to use the specified granularity, but keep lines 
		// one pixel wide.
		g2.scale(GRANULARITY, GRANULARITY);
		int spaceWidth = this.getWidth() / GRANULARITY;
		int spaceHeight = this.getHeight() / GRANULARITY;
		g2.setStroke(new BasicStroke(1 / GRANULARITY));

		// Paints the background black
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, spaceWidth + 1, spaceHeight + 1);

		if (this.charges.isEmpty()) {
			// Skips calculations when there are no charges
			return;
		}

		// Accumulates the charge at each location and draws the vectors of the
		// field
		for (int sx = 0; sx < spaceWidth; sx++) {
			for (int sy = 0; sy < spaceHeight; sy++) {
				Vector v = Vector.ZERO;
				for (Charge c : this.charges) {
					v = v.add(c.forceAt(sx, sy));
				}
				v.draw(sx, sy, g2);
			}
		}

		// Draws the charges themselves on top of the field
		for (Charge c : this.charges) {
			c.drawOn(g2);
		}
	}
}
