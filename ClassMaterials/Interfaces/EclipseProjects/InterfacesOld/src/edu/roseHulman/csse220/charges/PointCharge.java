package edu.roseHulman.csse220.charges;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * This class represents a point charge in 2-d space.
 * 
 * @author Curt Clifton. Created Oct 3, 2008. Modified Jan 18, 2011.
 */
public class PointCharge implements Charge {

	private static final double DOT_SIZE = 0.5;
	private double x;
	private double y;
	private double charge;

	/**
	 * Constructs a new point charge at the given coordinates in space with the 
	 * given charge.
	 * 
	 * @param px
	 * @param py
	 * @param charge
	 */
	public PointCharge(double px, double py, double charge) {
		this.x = px;
		this.y = py;
		this.charge = charge;
	}

	public void drawOn(Graphics2D g) {
		Ellipse2D.Double circ = new Ellipse2D.Double(this.x - DOT_SIZE / 2, this.y
				- DOT_SIZE / 2, DOT_SIZE, DOT_SIZE);
		if (this.charge >= 0) {
			g.setColor(Color.BLUE);
		} else {
			g.setColor(Color.RED);
		}

		g.fill(circ);

	}

	public Vector forceAt(int x, int y) {
		/*
		 * Field strength is proportional to charge and inversely proportional
		 * to square of distance. Field is directed away from positive charge.
		 */
		int chargeSign = (int) Math.signum(this.charge);
		if (chargeSign == 0) {
			return Vector.ZERO;
		}
		double xDist = chargeSign * (x - this.x);
		double yDist = chargeSign * (y - this.y);
		double magnitude = Math.abs(this.charge)
				/ (xDist * xDist + yDist * yDist);
		double direction = Math.atan2(yDist, xDist);
		return new Vector(magnitude, direction);
	}

	@Override
	public String toString() {
		return String.format("Point charge of %5.3f at (%3d,%3d)", this.charge,
				this.x, this.y);
	}
}
