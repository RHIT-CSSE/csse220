import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		frame.setBounds(100, 100, 300, 130);

		//note: if you need to convert a int to a string, you can do it like this
		//String someString = Integer.toString(someInt);
		//if you need to convert a string to an int, you can do it like this
		//int x = Integer.parseInt("2");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIQuestionMain r = new GUIQuestionMain();
		r.displayWindow();
	}
}
