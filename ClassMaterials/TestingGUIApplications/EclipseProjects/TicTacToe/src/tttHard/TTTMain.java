package tttHard;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TTTMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("X Turn");
		frame.add(label, BorderLayout.NORTH);
		
		TTTButton buttons[][] = new TTTButton[3][3];
		
		JPanel bigPanel = new JPanel();
		bigPanel.setLayout(new GridLayout(3,3));
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				TTTButton button = new TTTButton(label, buttons, row, col);
				button.setFont(new Font(button.getFont().getName(), Font.PLAIN, 20));
				buttons[row][col] = button;
				bigPanel.add(button);
			}
		}
				
		frame.add(bigPanel);
		frame.setPreferredSize(new Dimension(575,400));
		frame.pack();
		frame.setVisible(true);

	}
}
