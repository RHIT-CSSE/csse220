package rectangleExample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DrawViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Press and drag left button to draw rectangles");
		DrawComponent component = new DrawComponent();
		component.setPreferredSize(new Dimension(300,300));
		MouseListener dl = new DrawListener(component);
		
		frame.add(component, BorderLayout.CENTER);
		frame.add(label, BorderLayout.SOUTH);
		component.addMouseListener(dl);

		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
