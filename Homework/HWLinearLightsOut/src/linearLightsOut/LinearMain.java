package linearLightsOut;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Runs the Linear Lights Out application.
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         TODO: cite your help here or say "only used CSSE220 materials"
 *************************************************************************************** 
 *         TODO: List each team member's name and email username here. 
 * @author First Student - studenfi
 * @author Second Student - studense 
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
		
		// TODO: Don't write code here before planning out your design in UML. 
		// Where will you store the buttons? 
		// How will action listeners access the needed data and/or methods? 

		myFrame.setVisible(true);
	}
}
