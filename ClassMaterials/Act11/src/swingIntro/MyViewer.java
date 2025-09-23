package swingIntro;

import javax.swing.JFrame;

/**
 * Draws various graphics objects:
 * rectangles, rounded rectangles,
 * lines, arcs, ellipses, etc.
 *
 * @author CSSE Faculty
 */
public class MyViewer {
    private JFrame frame;

    private void runApp() {

		// Set up the app's JFrame
		frame = new JFrame();

        // TODO: Add frame setup commands

		MyComponent component = new MyComponent();
		frame.add(component);

        // TODO: don't forget to make the frame visible
    }


    public static void main(String[] args) {
        MyViewer viewer = new MyViewer();
        viewer.runApp();
    }
}
