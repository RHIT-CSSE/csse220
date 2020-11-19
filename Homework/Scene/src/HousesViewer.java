import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Draws a bunch of houses, via the HousesComponent and Houses classes.
 * 
 * @author Matt Boutell. 
 *
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
