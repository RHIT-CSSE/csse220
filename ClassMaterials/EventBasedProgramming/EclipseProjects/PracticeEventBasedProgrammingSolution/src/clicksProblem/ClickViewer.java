package clicksProblem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class ClickViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,600);
		JButton clearButton = new JButton("Clear Screen");
		final ClickComponent component = new ClickComponent();
		MouseListener dl = new ClickListener(component);
		
		frame.add(component, BorderLayout.CENTER);
		frame.add(clearButton, BorderLayout.SOUTH);
		component.addMouseListener(dl);
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				component.clear();
				component.repaint();
			}
			
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
