package linearLightsOut;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Runs the Linear Lights Out application.
 * 
 * @author <TODO: YOUR NAME HERE>
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
public class LinearMain {

	/**
	 * Starts here.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nButtonsString = JOptionPane
				.showInputDialog("How many buttons would you like?");
		int nButtons = Integer.parseInt(nButtonsString);
		JFrame myFrame = new JFrame();
		// you'll want to think about how you want to manage the state of the game
		//also you want to add some buttons and stuff
		myFrame.setVisible(true);
	}
}
