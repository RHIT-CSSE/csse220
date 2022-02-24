package events;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CatViewer {

	/**
	 * The width of the frame.
	 */
	public static final int WIDTH = 400;
	/**
	 * The height of the frame.
	 */
	public static final int HEIGHT = 300;

	public void makeWindow() {
		JFrame frame = new JFrame();
		
		frame.setTitle("Curie Cat");
		
		CatComponent c = new CatComponent();
		
		c.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.add(c);
		
		
		JPanel panel = new JPanel();
		
		JButton left = new JButton("Left");
		left.addActionListener(new ButtonListener(c, -50, 0));
		panel.add(left);
		
		JButton right = new JButton("Right");
		right.addActionListener(new ButtonListener(c, 50, 0));;
		panel.add(right);
		
		JButton up = new JButton("Up");
		up.addActionListener(new ButtonListener(c, 0, -50));
		panel.add(up);
		
		JButton down = new JButton("Down");
		down.addActionListener(new ButtonListener(c, 0, 50));
		panel.add(down);
		
		frame.add(panel, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		CatViewer viewer = new CatViewer();
		viewer.makeWindow();
	}
	
	

}
