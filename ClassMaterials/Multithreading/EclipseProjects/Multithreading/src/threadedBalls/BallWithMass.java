package threadedBalls;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * This class models a ball with mass that responds to gravity.
 * 
 * @author Curt Clifton. Created Nov 9, 2009.
 */
public class BallWithMass implements Ball {
	private static final long DELAY_MS = 15;
	private static final double X_VELOCITY_RANGE = 6.0;
	private static final double X_VELOCITY_MIN = -3.0;
	private static final double G = .09;

	private static final int RADIUS = 25;
	private static final Color BALL_COLOR = Color.RED;

	private final Ellipse2D image = new Ellipse2D.Double();

	/*
	 * For this ball, the position and velocity are stored as floating point
	 * numbers. The run() loop sleeps for a constant time each cycle. The
	 * position and velocity are updated according to the usual classical
	 * physics with gravity.
	 */
	private double x;
	private double y;
	private double velX;
	private double velY;

	/**
	 * Drops a ball with mass from the given location.
	 * 
	 * @param x
	 * @param y
	 */
	public BallWithMass(int x, int y) {
		this.x = x;
		this.y = y;
		this.velX = Math.random() * X_VELOCITY_RANGE + X_VELOCITY_MIN;
		this.velY = 0;
	}

	@Override
	public void drawOn(Graphics2D g2) {
		this.image.setFrame(this.x - RADIUS, this.y - RADIUS, RADIUS * 2,
				RADIUS * 2);
		g2.setColor(BALL_COLOR);
		g2.fill(this.image);
	}

	@Override
	public void run() {
		// TODO: Implement this method to update velX, velY, x, and y fields.
	}

	private void bounceIfNeeded() {
		if (this.x < 0) {
			this.velX *= -1.0; // reverse
			this.x *= -1; // pull back in bounds
		}

		double xMax = BallContainer.SIZE.getWidth();
		double yMax = BallContainer.SIZE.getHeight();

		if (this.x > xMax) {
			this.velX *= -1.0; // reverse
			this.x = xMax - (this.x - xMax); // pull back in bounds
		}

		if (this.y > yMax) {
			this.velY *= -1.0; // reverse
			this.y = yMax - (this.y - yMax); // pull back in bounds
		}
	}

}
