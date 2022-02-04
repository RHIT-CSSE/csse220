import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * This class starts the FanViewer demonstration project.
 * 
 * @author Curt Clifton. Created Dec 8, 2010.
 */
public class FanViewer {
	private static final Dimension FRAME_SIZE = new Dimension(640,480);

	/**
	 * Starts the viewer.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args) {
		JFrame fanFrame = new JFrame();
		
		fanFrame.setTitle("Fantastic!");
		fanFrame.setSize(FRAME_SIZE);
		
		fanFrame.add(new FanComponent());
		
		fanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fanFrame.setVisible(true);
	}
}
