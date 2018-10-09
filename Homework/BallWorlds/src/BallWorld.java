

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

/**
 * A simulation of a set of bouncing balls.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class BallWorld implements BallEnvironment, Drawable, Temporal {
	private static final int UPDATE_INTERVAL_MS = 10;
	private final int width;
	private final int height;
	private final Color color;

	private final List<Ball> balls = new ArrayList<Ball>();
	private final List<Ball> ballsToAdd = new ArrayList<Ball>();
	private final List<Ball> ballsToRemove = new ArrayList<Ball>();

	private final Shape background;
	private boolean isPaused = false;

	/**
	 * Constructs a new world that has the given dimensions and the given
	 * background color.
	 * 
	 * @param width
	 * @param height
	 * @param color
	 */
	public BallWorld(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;

		this.background = new Rectangle2D.Double(0, 0, this.width, this.height);

		// Creates a timer which periodically informs this world of the
		// passage of time.
		Timer advanceStateTimer = new Timer(UPDATE_INTERVAL_MS, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				timePassed();
			}
			
		});
		
		advanceStateTimer.start();
	}

	// -------------------------------------------------------------------------
	// BallEnvironment interface

	@Override
	public synchronized void addBall(Ball ball) {
		this.ballsToAdd.add(ball);
	}

	@Override
	public synchronized void removeBall(Ball ball) {
		this.ballsToRemove.add(ball);
	}

	@Override
	public synchronized Ball nearestBall(Point2D point) {
		Ball nearest = null;
		double nearestDistance = Double.MAX_VALUE;
		for (Ball b : this.balls) {
			double distance = point.distance(b.getCenterPoint());
			if (distance < nearestDistance) {
				nearestDistance = distance;
				nearest = b;
			}
		}
		return nearest;
	}

	@Override
	public boolean isInsideWorldX(Point2D point) {
		return point.getX() >= 0 && point.getX() <= this.width;
	}

	@Override
	public boolean isInsideWorldY(Point2D point) {
		return point.getY() >= 0 && point.getY() <= this.height;
	}

	@Override
	public boolean isInsideWorld(Point2D point) {
		return isInsideWorldX(point) && isInsideWorldY(point);
	}

	@Override
	public Dimension getSize() {
		return new Dimension(this.width, this.height);
	}

	@Override
	public synchronized List<Drawable> getDrawableParts() {
		return new ArrayList<Drawable>(this.balls);
	}

	@Override
	public Point2D getCenterPoint() {
		double x = this.width / 2;
		double y = this.height / 2;
		return new Point2D.Double(x, y);
	}

	// -------------------------------------------------------------------------
	// Drawable interface

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public Shape getShape() {
		return this.background;
	}

	// -------------------------------------------------------------------------
	// Temporal interface

	@Override
	public synchronized void timePassed() {
		if (!this.isPaused) {
			for (Temporal t : this.balls) {
				t.timePassed();
			}
		}
		this.balls.removeAll(this.ballsToRemove);
		this.ballsToRemove.clear();
		this.balls.addAll(this.ballsToAdd);
		this.ballsToAdd.clear();
	}

	@Override
	public void die() {
		// Ignored
	}

	@Override
	public void setIsPaused(boolean isPaused) {
		this.isPaused = isPaused;
	}

	@Override
	public boolean getIsPaused() {
		return this.isPaused;
	}
}
