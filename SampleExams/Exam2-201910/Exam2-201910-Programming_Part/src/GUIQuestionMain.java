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
		
		JLabel label = new JLabel("Current Max: 6");

		//note: if you need to convert a int to a string, you can do it like this
		//String someString = Integer.toString(someInt);
		//if you need to convert a string to an int, you can do it like this
		//int x = Integer.parseInt("2");
		
		
		frame.add(label, BorderLayout.NORTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIQuestionMain r = new GUIQuestionMain();
		r.displayWindow();
	}
}
