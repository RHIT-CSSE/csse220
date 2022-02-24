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

	JButton buttons[];
	int data[];
	JLabel output;
	
	public GUIQuestionMain() {
	}

	class Listener implements ActionListener {

		int index;
		
		public Listener(int index) {
			this.index = index;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			data[index]++;
			refresh();
		}
		
	}
	
	public void refresh() {
		buttons[0].setText(data[0] + "");
		buttons[1].setText(data[1] + "");
		output.setText(" = " + data[0] * data[1]);
		
	}
	
	public void displayWindow() {
		buttons = new JButton[] {new JButton(), new JButton() };
		data = new int[] {1,1};
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 300, 130);
		JPanel panel = new JPanel();
		JButton bottom = new JButton("Reset to 1");
		JLabel times = new JLabel(" x ");
		output = new JLabel("");
		refresh();
		
		buttons[0].addActionListener(new Listener(0));
		buttons[1].addActionListener(new Listener(1));
		bottom.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				data[0] = 1;
				data[1] = 1;
				refresh();
			}
		});
		
		
		panel.add(buttons[0]);
		panel.add(times);
		panel.add(buttons[1]);
		panel.add(output);
		frame.add(panel);
		//note: if you need to convert a int to a string, you can do it like this
		//String someString = Integer.toString(someInt);
		//if you need to convert a string to an int, you can do it like this
		//int x = Integer.parseInt("2");
		
		frame.add(bottom, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIQuestionMain r = new GUIQuestionMain();
		r.displayWindow();
	}
}
