package threadedBalls;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Main entry point for the multithreaded animation demo.
 * 
 * @author Curt Clifton. Created Nov 9, 2009.
 */
public class Main {
	private static final int DEFAULT_FRAMES_PER_SECOND = 30;
	private static final int MIN_FRAMES_PER_SECOND = 5;
	private static final int MAX_FRAMES_PER_SECOND = 2
			* DEFAULT_FRAMES_PER_SECOND - MIN_FRAMES_PER_SECOND;
	private static final String INSTRUCTIONS = "Click to add Bouncer. "
			+ "Right-click to add BallWithMass. "
			+ "Drag slider to change animation rate.";

	/**
	 * Starts the demo.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		JFrame window = new JFrame("Multithreaded Ball Simulation");
		final BallContainer ballContainer = new BallContainer(
				DEFAULT_FRAMES_PER_SECOND);
		window.add(ballContainer);

		JLabel instructionsLabel = new JLabel(INSTRUCTIONS);
		window.add(instructionsLabel, BorderLayout.PAGE_START);

		final JSlider fpsSlider = new JSlider(MIN_FRAMES_PER_SECOND,
				MAX_FRAMES_PER_SECOND);
		window.add(fpsSlider, BorderLayout.PAGE_END);
		fpsSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ballContainer.setFPS(fpsSlider.getValue());
			}
		});

		window.setResizable(false);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
