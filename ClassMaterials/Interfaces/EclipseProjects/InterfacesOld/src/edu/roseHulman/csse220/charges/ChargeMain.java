package edu.roseHulman.csse220.charges;

import javax.swing.JFrame;

/**
 * Starts the Charges application.
 * 
 * @author Curt Clifton. Created Oct 3, 2008.
 */
public class ChargeMain {

	private static final int HEIGHT = 600;
	private static final int WIDTH = 900;

	/**
	 * Starts the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setTitle("Charge!");

		Space space = new Space();
		addCharges(space);

		frame.add(space);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * Adds charges to the given space for simulation purposes.
	 * 
	 * @param space
	 *            the charge space to simulate (mutated)
	 */
	private static void addCharges(Space space) {
		space.addCharge(new PointCharge(10, 10, 3.0));
		space.addCharge(new PointCharge(20, 10, -3.0));
		space.addCharge(new PointCharge(15, 10, -3.0));

		// space.addCharge(new LinearCharge(1,1, 15, 15, 3));
		// TODO: experiment with other point charges 
		
		// TODO: add some linear charges
	}

}
