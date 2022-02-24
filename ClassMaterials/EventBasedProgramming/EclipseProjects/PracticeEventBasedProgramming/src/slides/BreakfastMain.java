package slides;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		// Note that it's a little complicated to create inner classes
		// if you're in a static function.  To avoid a bit of this 
		// complexity, we're initializing an instance of a class.
		BreakfastMain main = new BreakfastMain();
		main.createWindows();
	}
	
	
	public void createWindows() {
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

		/*
		 * CONSIDER: pack() sets the size of the frame based on what we've put
		 * in it:
		 */
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	


}
