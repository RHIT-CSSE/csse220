package hourtimer;
import java.awt.Dimension;

import javax.swing.JFrame;


/**
 * 
 * Runs the HourTimer program
 *
 */
public class HourTimerViewer {
	public static final int COMPONENT_WIDTH = 600;
	public static final int COMPONENT_HEIGHT = 600;	
	private JFrame hourTimerFrame;

	//
	// ****************************************************************************************
	//

	private void runApp() {
		final int frameLocX = 250;
		final int frameLocY = 350;
		hourTimerFrame = new JFrame();
		HourTimerComponent hourTimerComponent = new HourTimerComponent();
		hourTimerComponent.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
		hourTimerFrame.add(hourTimerComponent);

		hourTimerFrame.setTitle("Tic Toc");
		hourTimerFrame.setLocation(frameLocX, frameLocY);
		hourTimerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		hourTimerFrame.pack();
		hourTimerFrame.setVisible(true);
	} // runApp

	//
	// ****************************************************************************************
	//

	public static void main(String[] args) {
		HourTimerViewer app = new HourTimerViewer();
		app.runApp();
	} // main

}
