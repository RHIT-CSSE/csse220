package exam1GraphicsPkg;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Class: CarViewer
 * @author CSSE Faculty
 * <br>Purpose: Create and set visible a Java Swing app
 * <br>Restrictions: none
 * <br>For example: 
 * <pre>
 *    Run as a Java Application
 * </pre>
 */
public class CarViewer {

	/**
	 * ensures: creates, initializes, and sets visible the CarViewer's frame and component
	 */
	private void driverMain() {
		final String frameTitle = "Car Drawing Graphics Question";
		final int frameWidth = 1000;
		final int frameHeight = 600;
		final int frameXLoc = 100;
		final int frameYLoc = 200;


		JFrame frame = new JFrame();
		frame.setTitle(frameTitle);
		frame.setSize(frameWidth, frameHeight);
		frame.setLocation(frameXLoc, frameYLoc);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponent carComponent = new CarComponent();
		frame.add(carComponent);
		frame.setVisible(true);
	} // driverMain
	
	// ------------------------------------------------------------

	/**
	 * The app's main entry point for the operating system 
	 * @param args - ignored
	 */
	public static void main(String[] args) {
		CarViewer carViewer = new CarViewer();
		carViewer.driverMain();
	} // main

} // end class CarViewer
