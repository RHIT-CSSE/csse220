

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * A set of controls a single BallWorld.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class ControlsPanel extends JPanel {
	private static String[] BALL_NAMES = { "Pulsar", "Mover", "Bouncer",
			"Exploder" };

	/**
	 * Constructs controls for the given world.
	 * 
	 * @param world
	 */
	public ControlsPanel(final BallWorld world) {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		for (String bn : BALL_NAMES) {
			add(new BallButton(bn, world));
		}

		add(makePauseResumeButton(world));
	}

	/**
	 * Constructs a pause/resume toggle for the given temporal object.
	 * 
	 * @param temporalObj
	 * @return a new button the toggles the pause/resume state of the given
	 *         object.
	 */
	private JButton makePauseResumeButton(final Temporal temporalObj) {
		final JButton pauseResumeButton = new JButton("Pause");
		ActionListener pauser = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean isPaused = temporalObj.getIsPaused();
				isPaused = !isPaused;
				temporalObj.setIsPaused(isPaused);
				if (isPaused) {
					pauseResumeButton.setText("Resume");
				} else {
					pauseResumeButton.setText("Pause");
				}

			}
		};
		pauseResumeButton.addActionListener(pauser);
		Dimension preferredButtonSize = pauseResumeButton.getPreferredSize();
		Dimension maxButtonSize = new Dimension(preferredButtonSize.width * 2,
				preferredButtonSize.height);
		pauseResumeButton.setMaximumSize(maxButtonSize);
		return pauseResumeButton;
	}
}
