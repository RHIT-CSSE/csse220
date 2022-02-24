package events;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The class that sets up the gui.
 * This class needs to be modified the most.
 * 
 * @author hewner
 *
 */
public class HourTimerViewer {

	/**
	 * The width of the frame.
	 */
	public static final int WIDTH = 600;
	/**
	 * The height of the frame.
	 */
	public static final int HEIGHT = 600;

	public void makeWindow() {
		JFrame frame = new JFrame();
		
		frame.setTitle("Tic Toc");
		
		HourTimerComponent c = new HourTimerComponent();
		
		c.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.add(c);
		
				
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		HourTimerViewer viewer = new HourTimerViewer();
		viewer.makeWindow();
	}
	
	

}
