import javax.swing.JFrame;

/**
 * Draws a simple frame with a component for drawing shapes inside it. Based on
 * RectangleViewer from Big Java, Ch. 2.
 * 
 * @author Curt Clifton. Created Sep 10, 2008.
 */
public class MyViewer {
	/**
	 * Draws the frame.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		int frameWidth = 400;
		int frameHeight = 600;

		frame.setSize(frameWidth, frameHeight);
		frame.setTitle("I've been framed!");

		MyComponent component = new MyComponent();
		frame.add(component);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
