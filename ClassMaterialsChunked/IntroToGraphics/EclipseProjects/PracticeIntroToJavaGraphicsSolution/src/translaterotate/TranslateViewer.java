package translaterotate;
import java.awt.Dimension;
import javax.swing.JFrame;


/**
 * 
 * Runs the Translate Example
 *
 */
public class TranslateViewer {
	public static final int COMPONENT_WIDTH = 600;
	public static final int COMPONENT_HEIGHT = 600;	
	private JFrame translateFrame;

	//
	// ****************************************************************************************
	//

	private void runApp() {
		final int frameLocX = 250;
		final int frameLocY = 350;
		translateFrame = new JFrame();
		TranslateComponent translateComponent = new TranslateComponent();
		translateComponent.setPreferredSize(new Dimension(COMPONENT_WIDTH,COMPONENT_HEIGHT));
		translateFrame.add(translateComponent);
		
		translateFrame.setTitle("Translate");
		translateFrame.setLocation(frameLocX, frameLocY);
		translateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		translateFrame.pack();
		translateFrame.setVisible(true);	
	} // runApp

	//
	// ****************************************************************************************
	//

	public static void main(String[] args) {
		TranslateViewer app = new TranslateViewer();
		app.runApp();
	} // main

} // TranslateViewer
