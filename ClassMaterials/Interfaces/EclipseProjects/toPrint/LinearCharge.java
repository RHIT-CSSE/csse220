package edu.roseHulman.csse220.charges;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * This represents a linear charge (like a straight wire) in space.
 * 
 * @author Curt Clifton. Created Jan 18, 2011.
 */
public class LinearCharge implements Charge {
	private static final int NUMBER_OF_STEPS = 100;
	private double startX;
	private double startY;
	private double endX;
	private double endY;
	private double charge;

	/**
	 * Constructs a new linear charge in 2d space.
	 * 
	 * @param startX
	 * @param startY
	 * @param endX
	 * @param endY
	 * @param charge
	 */
	public LinearCharge(double startX, double startY, double endX, double endY,
			double charge) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.charge = charge;
	}

	@Override
	public void drawOn(Graphics2D g) {
		Point2D start = new Point2D.Double(this.startX, this.startY);
		Point2D end = new Point2D.Double(this.endX, this.endY);
		Line2D line = new Line2D.Double(start, end);

		if (this.charge >= 0) {
			g.setColor(Color.BLUE);
		} else {
			g.setColor(Color.RED);
		}

		g.draw(line);
	}

	@Override
	public Vector forceAt(int x, int y) {
		// Calculate the force at x, y by treating the linear charge as a
		// whole series of itty-bitty point charges.
		double px = this.startX;
		double py = this.startY;
		double stepX = (this.endX - this.startX) / NUMBER_OF_STEPS;
		double stepY = (this.endY - this.startY) / NUMBER_OF_STEPS;
		double partialCharge = this.charge / (NUMBER_OF_STEPS + 1);

		Vector force = Vector.ZERO;
		for (int i = 0; i <= NUMBER_OF_STEPS; i++) {
			PointCharge ittyBittyCharge = new PointCharge(px, py, partialCharge);
			// accumulate force
			Vector partialForce = ittyBittyCharge.forceAt(x, y);
			force = force.add(partialForce);
			px += stepX;
			py += stepY;
		}

		return force;
	}
}
