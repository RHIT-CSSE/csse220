package slides;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This class demonstrates ActionListeners.
 * 
 * @author Curt Clifton. Created Oct 7, 2008.
 */
public class BreakfastMain {

	int count = 0;
	
	//instance
	public void doSomething() {
		count++;
		
	}
	
	/**
	 * Starts the program.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		// Note that it's a little complicated to create inner classes
		// if you're in a static function.  To avoid a bit of this 
		// complexity, we're initializing an instance of a class.
		
		int trackSomething = 10;
		
		BreakfastMain main = new BreakfastMain();
		
		main.createWindows();
	}
	
	
	
	
	public void createWindows() {
		
		count++;
		
		
		/*
		 * TODO: Use JOptionPane to get description of porridge flavor; update
		 * inner classes to use the String.
		 */
		JFrame frame = new JFrame();
		frame.setTitle("Breakfast for Goldilocks");

		JButton eatButton = new JButton("Eat Porridge");
		frame.add(eatButton);
		// TODO: add an ActionListener using an external class

		// TODO: add an ActionListener using an inner class

		// TODO: add an ActionListener using an anonymous class
		
		eatButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setTitle("made a change!");
				count++;
			}
			
		});
		
		

		/*
		 * CONSIDER: pack() sets the size of the frame based on what we've put
		 * in it:
		 */
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	


}
