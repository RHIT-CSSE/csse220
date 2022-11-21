import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Draws a bunch of houses, via the HousesComponent and Houses classes.
 * 
 * @author Matt Boutell. 
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
public class HousesViewer {
	public static final Dimension HOUSES_VIEWER_SIZE = new Dimension(500, 400);
	
	/**
	 * Constructs and displays the JFrame which displays Houses via a
	 * HousesComponent. 
	 * 
	 * @param args
	 *            Command-line arguments, ignored here.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(HOUSES_VIEWER_SIZE);
		frame.setTitle("I see houses!");

		frame.add(new HousesComponent());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
