package animationWithLines;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//This is the right one (Java suggests Timers from 4 packages...)
// import javax.swing.Timer; 


/**
 * An exercise showing various ways to do animation: 1. Manually via a button
 * press. 2. Using a timer 3. Using threads
 * 
 * @author Matt Boutell, modified by <YOUR NAME>. Created Jan 30, 2010.
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

		// TODO 1: Add Timer here to run the animation
		
		// TODO 2: Comment out the Timer and add a thread here to run the animation
		// Then make the AnimationComponent runnable
		Runnable animatorRunnable = new Runnable() {
			@Override
			public void run(){
				while(true) {
					animation.addSquare();
					try {
						Thread.sleep(100);// TODO try me at 1, 10, and 100
					} catch (InterruptedException exception) {
						// TODO Auto-generated catch-block stub.
						exception.printStackTrace();
					}
				}
			}
		};
		
		Thread t1 = new Thread(animatorRunnable);
		t1.start();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
