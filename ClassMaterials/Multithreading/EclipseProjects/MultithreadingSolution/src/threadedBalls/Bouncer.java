package threadedBalls;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * This class implements a bouncing ball.
 * 
 * @author Curt Clifton. Created Nov 9, 2009.
 */
public class Bouncer implements Ball {

	private static final long MIN_DELAY_MS = 5;
	private static final long DELAY_RANGE_MS = 25;
	private static final int RADIUS = 40;
	private static final Color BALL_COLOR = Color.YELLOW;

	private int x;
	private int y;
	private final Ellipse2D image = new Ellipse2D.Double();

	/*
	 * xStep and yStep are each one of {-1, 1}. Apparently velocity of the ball
	 * is controlled by changing the sleep delay using in the run method.
	 */
	private int xStep = Math.random() > 0.5 ? -1 : 1;
	private int yStep = Math.random() > 0.5 ? -1 : 1;
	private long delayInMS = (long) (Math.random() * DELAY_RANGE_MS + MIN_DELAY_MS);

	/**
	 * Constructs a bouncing ball at the given coordinates.
	 * 
	 * @param x
	 * @param y
	 */
	public Bouncer(int x, int y) {
		this.x = x;
		this.y = y;
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
		try {
			while (true) {
				this.x += this.xStep;
				this.y += this.yStep;

				bounceIfNeeded();

				Thread.sleep(this.delayInMS);
			}
		} catch (InterruptedException e) {
			// nothing to do
		}
	}

	private void bounceIfNeeded() {
		if (this.x < 0) {
			this.xStep *= -1; // reverse
			this.x *= -1; // pull back in bounds
		}

		if (this.y < 0) {
			this.yStep *= -1; // reverse
			this.y *= -1; // pull back in bounds
		}

		int xMax = (int) BallContainer.SIZE.getWidth();
		int yMax = (int) BallContainer.SIZE.getHeight();

		if (this.x > xMax) {
			this.xStep *= -1; // reverse
			this.x = xMax - (this.x - xMax); // pull back in bounds
		}

		if (this.y > yMax) {
			this.yStep *= -1; // reverse
			this.y = yMax - (this.y - yMax); // pull back in bounds
		}
	}
}
