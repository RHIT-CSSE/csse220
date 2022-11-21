package ballStrikeCounter;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *  A Tracker is the main application that demos a Baseball state tracker.
 * 
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         Help from anyone other than a CSSE220 Instructor or CSSE220 TA must
 *         be cited. If you didn't get any outside help, then you can simply
 *         state below: "I did not receive any outside help"
 ***************************************************************************************
 *         Help Citation (for this or any other files in this assignment)
 * 
 *         TODO: cite your help here
 *************************************************************************************** 
 */

public class Tracker {
	private JLabel label = new JLabel();

	// Call this to update the text on the label.
	public void updateLabel(int numBalls, int numStrikes) {
		this.label.setText("<html>Balls: " + numBalls + "<br />Strikes: " + numStrikes + "</HTML>");
	}

	public static void main(String[] args) {
		new Tracker();
	}

	public Tracker() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.add(label, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		
		// TODO: Add buttons and listeners to make things work.
		

		// The following line is given to show you how to use the given method:
		updateLabel(0, 0);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
