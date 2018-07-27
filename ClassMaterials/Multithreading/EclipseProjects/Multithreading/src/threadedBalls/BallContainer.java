package threadedBalls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

/**
 * This component creates the balls and manages drawing and user interaction.
 * 
 * @author Curt Clifton. Created Nov 9, 2009.
 */
public class BallContainer extends JComponent {
	/**
	 * The size of the ball container.
	 */
	public static final Dimension SIZE = new Dimension(800, 600);
	private static final Color BACKGROUND_COLOR = Color.BLACK;

	private final List<Ball> balls = new ArrayList<Ball>();
	private Thread repainterThread;

	/**
	 * Creates an empty ball container.
	 * @param fps initial refresh rate in frames per second 
	 */
	public BallContainer(int fps) {
		this.setPreferredSize(SIZE);

		// Sets up mouse listener -- runs event dispatch thread.
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					createBouncer(e.getX(), e.getY());
					break;
				case MouseEvent.BUTTON3:
					createBallWithMass(e.getX(), e.getY());
				}
			}

		});

		// Creates thread to update animation
		Runnable r = new Repainter(fps);
		this.repainterThread = new Thread(r);
		this.repainterThread.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D background = new Rectangle2D.Double(0, 0, this.getWidth(),
				this.getHeight());
		g2.setColor(BACKGROUND_COLOR);
		g2.fill(background);

		for (Ball b : this.balls) {
			b.drawOn(g2);
		}
	}

	/**
	 * Creates a new bouncing ball. Should only be called by GUI thread (i.e.,
	 * from a listener or painter).
	 * 
	 * @param x
	 * @param y
	 */
	private void createBouncer(int x, int y) {
		Ball b = new Bouncer(x, y);
		this.balls.add(b);
		new Thread(b).start();
	}

	/**
	 * Creates a new ball with mass that responds to gravity. Should only be
	 * called by GUI thread (i.e., from a listener or painter).
	 * 
	 * @param x
	 * @param y
	 */
	private void createBallWithMass(int x, int y) {
		Ball b = new BallWithMass(x, y);
		this.balls.add(b);
		new Thread(b).start();
	}

	/**
	 * Sets the refresh rate of this container.
	 *
	 * @param frames the number of frames per second
	 */
	public void setFPS(int frames) {
		Runnable r = new Repainter(frames);
		Thread t = new Thread(r);
		this.repainterThread.interrupt();
		t.start();
		this.repainterThread = t;
	}

	private class Repainter implements Runnable {
		private final int fps;
		
		public Repainter(int fps) {
			this.fps = fps;
		}

		@Override
		public void run() {
			try {
				while (true) {
					Thread.sleep(1000 / this.fps);
					BallContainer.this.repaint();
				}
			} catch (InterruptedException e) {
				// nothing to do
			}
		}
	}

}
