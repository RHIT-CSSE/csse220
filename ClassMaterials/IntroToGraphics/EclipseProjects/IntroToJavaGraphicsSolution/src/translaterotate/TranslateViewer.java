package translaterotate;
import java.awt.Dimension;

import javax.swing.JFrame;


/**
 * 
 * Runs the Translate Example
 *
 */
public class TranslateViewer {

	/**
	 * The width of the frame.
	 */
	public static final int WIDTH = 600;
	/**
	 * The height of the frame.
	 */
	public static final int HEIGHT = 600;

	/**
	 * The HourTimer program starts here 
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle("Translate");
		TranslateComponent c = new TranslateComponent();
		c.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.add(c);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
