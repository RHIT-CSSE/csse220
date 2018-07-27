package edu.roseHulman.csse220.charges;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * This immutable class represents a vector in 2-d space.
 * 
 * @author Curt Clifton. Created Oct 3, 2008.
 */
public class Vector {
	/**
	 * Vectors with magnitude greater than this are clipped.
	 */
	private static final double MAX_RENDERED_MAGNITUDE = 1.0;

	/**
	 * Vector intensity is scaled to magnitude. This is the minimum percentage
	 * intensity used. Having a minimum avoids having small vectors "wash out".
	 */
	private static final double MIN_COLOR_INTENSITY = 0.1;

	/**
	 * Size of the dot rendered at the vector's tail in space units.
	 */
	private static final double TAIL_DOT_SIZE = 0.1;

	private double magnitude;
	private double direction;

	/**
	 * The vector with magnitude 0.
	 */
	public static final Vector ZERO = new Vector(0, 0);

	/**
	 * Constructs a new 2-d vector with the given magnitude and direction.
	 * 
	 * @param magnitude
	 * @param direction
	 */
	public Vector(double magnitude, double direction) {
		this.magnitude = magnitude;
		this.direction = direction;
	}

	/**
	 * Constructs a new vector that is the result of adding this vector and the
	 * given one.
	 * 
	 * @param other
	 * @return the sum of this and other
	 */
	public Vector add(Vector other) {
		double x = this.getXComponent() + other.getXComponent();
		double y = this.getYComponent() + other.getYComponent();
		double magnitude = Math.sqrt(x * x + y * y);
		double direction = Math.atan2(y, x);
		return new Vector(magnitude, direction);
	}

	/**
	 * Draws a representation of this vector at the given coordinates on the
	 * given graphics object. The coordinates represent the "tail end" of the
	 * vector in space.
	 * 
	 * @param x
	 * @param y
	 * @param g
	 */
	public void draw(int x, int y, Graphics2D g) {
		Point2D tailEnd = new Point2D.Double(x, y);

		final double renderedMagnitude = Math.min(this.magnitude,
				MAX_RENDERED_MAGNITUDE);
		final double headX = x + renderedMagnitude * Math.cos(this.direction);
		final double headY = y + renderedMagnitude * Math.sin(this.direction);
		Point2D headEnd = new Point2D.Double(headX, headY);

		Ellipse2D tailDot = new Ellipse2D.Double(x - TAIL_DOT_SIZE / 2, y
				- TAIL_DOT_SIZE / 2, TAIL_DOT_SIZE, TAIL_DOT_SIZE);
		Line2D line = new Line2D.Double(tailEnd, headEnd);
		if (renderedMagnitude < this.magnitude) {
			// Clipped, so use different color
			g.setColor(Color.WHITE);
		} else {
			float intensity = (float) (MIN_COLOR_INTENSITY + (1 - MIN_COLOR_INTENSITY)
					* (this.magnitude / MAX_RENDERED_MAGNITUDE));
			Color c = new Color(0.0f, intensity, 0.0f);
			g.setColor(c);
		}
		g.fill(tailDot);
		// Only renders lines for non-infinite vectors
		if (this.magnitude != Double.POSITIVE_INFINITY) {
			g.draw(line);
		}
	}

	/**
	 * @return the x component of this vector
	 */
	public double getXComponent() {
		return Math.cos(this.direction) * this.magnitude;
	}

	/**
	 * @return the y component of this vector
	 */
	public double getYComponent() {
		return Math.sin(this.direction) * this.magnitude;
	}

	/**
	 * @return the magnitude of this vector
	 */
	public double magnitude() {
		return this.magnitude;
	}

	/**
	 * @return the direction of this vector in radians
	 */
	public double direction() {
		return this.direction;
	}

	@Override
	public String toString() {
		return String.format("[%5.3f @ %5.3f]", this.magnitude, this.direction);
	}
}
