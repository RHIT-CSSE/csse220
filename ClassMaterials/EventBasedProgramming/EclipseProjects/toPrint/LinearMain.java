


import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * Implements the main method of the game Linear Lights Out as described in the homework.
 * 
 * @author Curt Clifton.
 */
public class LinearMain {

	private static JFrame frame;
	private static int nButtons;

	/**
	 * Starts the game.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nButtonsString = 
			JOptionPane.showInputDialog("How many buttons would you like?");
		nButtons = Integer.parseInt(nButtonsString);
		
		frame = new LightsOutFrame(nButtons);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
