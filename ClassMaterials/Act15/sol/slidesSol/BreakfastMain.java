package slidesSol;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This class demonstrates ActionListeners.
 * 
 * @author Curt Clifton. Created Oct 7, 2008.
 */
public class BreakfastMain {

	/**
	 * Starts the program.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		/*
		 * TODO: Use JOptionPane to get description of porridge flavor; update
		 * inner classes to use the String.
		 */
		final String tasteDescription = JOptionPane
				.showInputDialog("What does the porridge taste like? ");
		JFrame frame = new JFrame();
		frame.setTitle("Breakfast for Goldilocks");

		JButton eatButton = new JButton("Eat Porridge");
		frame.add(eatButton);
		// TODO: add an ActionListener using an external class
		ActionListener papaBear = new MyButtonListener();
		eatButton.addActionListener(papaBear);

		// TODO: add an ActionListener using an inner class
		class MamaBearListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Eww.  Too cold.  Tastes like "
						+ tasteDescription);
			}
		}
		eatButton.addActionListener(new MamaBearListener());

		// TODO: add an ActionListener using an anonymous class
		eatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hmm.  Just right.");
			}
		});

		/*
		 * CONSIDER: The responses are stored in a stack and popped so that the
		 * last is displayed first and the first is displayed last.
		 */

		/*
		 * CONSIDER: pack() sets the size of the frame based on what we've put
		 * in it:
		 */
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
