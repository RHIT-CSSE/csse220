package inClassExample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sandbox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Three Buttons");
		
		JPanel panel = new JPanel();
		
		JButton firstButton = new JButton("1");
		firstButton.addActionListener(new Button1Listener());
		panel.add(firstButton);
		
		JButton secondButton = new JButton("2");
		secondButton.addActionListener(new Button2Listener());
		panel.add(secondButton);
		
		JButton thirdButton = new JButton("3");
		thirdButton.addActionListener(new Button3Listener(firstButton));
		panel.add(thirdButton);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
