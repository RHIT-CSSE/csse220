/**
 * 
 */


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Implements the functionality of the Linear Lights Out game as described in the homework
 * 
 * @author Delvin Defoe and Curt Clifton.  Created on April 21, 2011.
 * 
 */
@SuppressWarnings("serial")
public class LightsOutFrame extends JFrame {
	private final String GAME_TITLE = "Linear Lights Out!";
	private final String WINNER_TITLE = "We have a winner!";
	private JButton[] toggleButtons;
	private int nButtons;

	/**
	 * Constructs a frame for the Linear Lights Out game
	 * 
	 * @param nButtons
	 *            The number of buttons in this game
	 */
	public LightsOutFrame(int nButtons) {
		this.nButtons = nButtons;
		this.setTitle(GAME_TITLE);

		this.setTitle(GAME_TITLE);

		JPanel buttonsPanel = new JPanel();
		this.add(buttonsPanel);
		toggleButtons = new JButton[nButtons];

		for (int i = 0; i < nButtons; i++) {
			final JButton button = new JButton();
			toggleButtons[i] = button;
			button.addActionListener(new Toggler(i));
			buttonsPanel.add(button);
		}
		scrambleButtons(toggleButtons);

		// Sets up the controls
		JPanel controlsPanel = new JPanel();
		this.add(controlsPanel, BorderLayout.SOUTH);
		JButton newGameButton = new JButton("New Game");
		controlsPanel.add(newGameButton);
		newGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrambleButtons(toggleButtons);
			}
		});

		JButton quitButton = new JButton("Quit");
		controlsPanel.add(quitButton);
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LightsOutFrame.this.dispose();
				System.exit(0);
			}
		});

	}

	/**
	 * This class handles button click events for the Linear Lights
	 * Out game. It toggles this given button between displaying an 
	 * X and displaying an O.
	 * 
	 * @author Curt Clifton and Delvin Defoe.  Refactored by Delvin Defoe
	 * on April 21, 2011.
	 *
	 */
	private class Toggler implements ActionListener {

		private int index;

		/**
		 * Constructs a toggler object for the button with the given index
		 * within the given set of buttons.
		 * 
		 * @param i
		 */
		public Toggler(int i) {
			this.index = i;
		}

		public void actionPerformed(ActionEvent e) {
			// Toggles button and neighbors
			int minIndex = (this.index == 0) ? this.index : this.index - 1;
			int maxIndex = (this.index == LightsOutFrame.this.nButtons - 1) ? this.index
					: this.index + 1;
			for (int i = minIndex; i <= maxIndex; i++) {
				toggle(toggleButtons[i]);
			}

			if (isWin()) {
				LightsOutFrame.this.setTitle(WINNER_TITLE);
			}
		}

	}

	/**
	 * Sets the labels of all the buttons in the given array to a random
	 * assortment of Xs and Os.
	 * 
	 * @param toggleButtons
	 */
	private void scrambleButtons(JButton[] toggleButtons) {
		this.setTitle(GAME_TITLE);
		for (JButton button : toggleButtons) {
			if (Math.random() < 0.5) {
				button.setText("X");
			} else {
				button.setText("O");
			}
		}
	}

	/**
	 * @return whether the game has been won
	 */
	private boolean isWin() {
		String first = toggleButtons[0].getText();
		for (JButton b : toggleButtons) {
			if (!b.getText().equals(first))
				return false;
		}
		return true;
	}

	/**
	 * Toggles this given button between displaying an X and displaying an O.
	 * 
	 * @param button
	 */
	private void toggle(JButton button) {
		if (button.getText().equals("X")) {
			button.setText("O");
		} else {
			button.setText("X");
		}
	}

}
