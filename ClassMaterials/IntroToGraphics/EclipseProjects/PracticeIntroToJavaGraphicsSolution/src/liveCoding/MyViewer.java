package liveCoding;
import javax.swing.JFrame;

/**
 * Draws a various graphics objects: rectangles, rounded rectangles, lines, arcs, elipses
 * 
 * @author CSSE Faculty
 */
public class MyViewer {
	private JFrame viewerFrame;
	
	//
	// ****************************************************************************************
	//

	private void runApp() {
		final int frameWidth = 400;
		final int frameHeight = 600;
		final int frameLocX = 350;
		final int frameLocY = 150;
		
		// Set up the app's JFrame
		viewerFrame = new JFrame();
		viewerFrame.setTitle("I've been framed!");
		viewerFrame.setLocation(frameLocX, frameLocY);
		viewerFrame.setSize(frameWidth, frameHeight);
		viewerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyComponent component = new MyComponent();
		viewerFrame.add(component);
		
		viewerFrame.setVisible(true);		
	} // runApp
		
	//
	// ****************************************************************************************
	//

	public static void main(String[] args) {
		MyViewer app = new MyViewer();
		app.runApp();
	} // main

}
