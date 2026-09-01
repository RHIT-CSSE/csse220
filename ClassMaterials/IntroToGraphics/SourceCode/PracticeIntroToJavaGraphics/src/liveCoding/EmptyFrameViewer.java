package liveCoding;
import javax.swing.JFrame;

/**
 * A simple graphics program
 * 
 * @author CSSE Faculty
 */
public class EmptyFrameViewer {
		private JFrame frameViewer;
	
	//
	// ****************************************************************************************
	//
	
	private void runApp() {
		final int frameWidth = 300;
		final int frameHeight = 400;
		final int frameLocX = 250;
		final int frameLocY = 350;
		frameViewer = new JFrame();
		
		frameViewer.setTitle("An Empty Frame");
		frameViewer.setLocation(frameLocX, frameLocY);
		frameViewer.setSize(frameWidth, frameHeight);
		frameViewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frameViewer.setVisible(true);	
	} // runApp
	
	//
	// ****************************************************************************************
	//

	public static void main(String[] args) {
		EmptyFrameViewer app = new EmptyFrameViewer();
		app.runApp();
	} // main

} // EmptyFrameViewer