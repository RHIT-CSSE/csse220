package events;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


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
		
		
		JPanel panel = new JPanel();
		for(int i = 1; i <= 12; i++ ) {
			JButton b = new JButton("To " + i);
			b.addActionListener(new ButtonListener(c, i));
			panel.add(b);
		}
		frame.add(panel, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		HourTimerViewer viewer = new HourTimerViewer();
		viewer.makeWindow();
	}
	
	

}
