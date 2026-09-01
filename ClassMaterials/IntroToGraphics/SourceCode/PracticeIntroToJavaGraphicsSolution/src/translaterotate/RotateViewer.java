package translaterotate;
import java.awt.Dimension;
import javax.swing.JFrame;



/**
 * 
 * Runs the Rotate Example
 *
 */
public class RotateViewer {
	
	public static final int COMPONENT_WIDTH = 600;
	public static final int COMPONENT_HEIGHT = 600;	
	private JFrame rotateFrame;

	//
	// ****************************************************************************************
	//

	private void runApp() {
		final int frameLocX = 250;
		final int frameLocY = 350;
		rotateFrame = new JFrame();
		RotateComponent rotateComponent = new RotateComponent();
		rotateComponent.setPreferredSize(new Dimension(COMPONENT_WIDTH,COMPONENT_HEIGHT));
		rotateFrame.add(rotateComponent);
		
		rotateFrame.setTitle("Rotate");
		rotateFrame.setLocation(frameLocX, frameLocY);
		rotateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		rotateFrame.pack();
		rotateFrame.setVisible(true);	
	} // runApp

	//
	// ****************************************************************************************
	//

	public static void main(String[] args) {
		RotateViewer app = new RotateViewer();
		app.runApp();
	} // main

} // RotateViewer
