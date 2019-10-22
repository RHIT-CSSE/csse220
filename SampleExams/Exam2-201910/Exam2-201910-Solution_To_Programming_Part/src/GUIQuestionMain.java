import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIQuestionMain {

	public GUIQuestionMain() {
	}

	public void displayWindow() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton bottom = new JButton("Increase Max");
		JLabel label = new JLabel("Current Max: 6");
		int[] points = new int[5];
		points[4] = 6;
		
		frame.add(panel);
		//note: if you need to convert a int to a string, you can do it like this
		//String someString = Integer.toString(someInt);
		//if you need to convert a string to an int, you can do it like this
		//int x = Integer.parseInt("2");
		
		ArrayList<JButton> buttons = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			JButton button = new JButton("0");
			ButtonListener b = new ButtonListener(i, points, button);
			button.addActionListener(b);
			buttons.add(button);
			panel.add(button);
		}
		bottom.addActionListener(new ButtonListener2(points, label));
		frame.add(label, BorderLayout.NORTH);
		frame.add(bottom, BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIQuestionMain r = new GUIQuestionMain();
		r.displayWindow();
	}
}
