import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Draws a bunch of foxes, via the FoxComponent and Fox classes.
 * 
 * @author Ian Ludden, adapted from HousesViewer by Matt Boutell
 */
public class FoxViewer {
	public static final Dimension FOX_VIEWER_SIZE = new Dimension(500, 400);
	
	/**
	 * Constructs and displays the JFrame which displays Fox objects via a
	 * FoxComponent object.
	 * 
	 * @param args
	 *            Command-line arguments, ignored here.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(FOX_VIEWER_SIZE);
		frame.setTitle("I see foxes!");

		frame.add(new FoxComponent());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
