package animation;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * An exercise showing various ways to do animation: 1. Manually via a button
 * press. 2. Using a timer 3. Using threads
 * 
 * @author Matt Boutell. Created Jan 30, 2010. Modified Feb 4, 2011, Curt
 *         Clifton.
 */
public class Main {

	/**
	 * Start here!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Watch Me Move");
		final AnimationComponent animation = new AnimationComponent();
		frame.add(animation);

		class AnimatorButton extends JButton implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				animation.addSquare();
			}
		}

		AnimatorButton animatorButton = new AnimatorButton();
		animatorButton.setText("Move it!");
		animatorButton.addActionListener(animatorButton);

		frame.add(animatorButton, BorderLayout.SOUTH);

		// ---------------------------------------------------------------------
		// FIXME: remove for the template
		// Solution using Timer:
		// Timer timer = new Timer(50, animatorButton);
		// timer.start();

		// FIXME: remove for the template
		// Solution using Threads:
		//		Runnable animatorRunnable = new Runnable() {
		//			@Override
		//			public void run() {
		//				try {
		//					while (true) {
		//						animation.addSquare();
		//						Thread.sleep(50);
		//					}
		//				} catch (InterruptedException exception) {
		//					exception.printStackTrace();
		//				}
		//			}
		//		};
		//
		//		Thread t = new Thread(animatorRunnable);
		//		t.start();
		// ---------------------------------------------------------------------

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
