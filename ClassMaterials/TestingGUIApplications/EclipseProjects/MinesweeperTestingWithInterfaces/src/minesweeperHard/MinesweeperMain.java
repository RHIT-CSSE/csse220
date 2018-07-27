package minesweeperHard;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MinesweeperMain {

	public static final int SIZE = 7;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		JFrame frame = new JFrame("Minesweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Enjoy playing minesweeper");
		frame.add(label, BorderLayout.NORTH);
		
		MinesweeperButton buttons[][] = new MinesweeperButton[SIZE][SIZE];
		
		JPanel bigPanel = new JPanel();
		for(int row = 0; row < SIZE; row++) {
			JPanel panel = new JPanel();
			for(int col = 0; col < SIZE; col++) {
				MinesweeperButton button = new MinesweeperButton();
				buttons[row][col] = button;
				panel.add(button);
			}
			bigPanel.add(panel);
		}
		
		int offset[] = {0,1,-1};
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				MinesweeperButton button = buttons[i][j];
				for(int offsetX : offset) {
					for(int offsetY : offset) {
						addNeighbor(i + offsetX, j + offsetY, button, buttons);
					}
				}
			}
		}
		
		frame.add(bigPanel);
		frame.setPreferredSize(new Dimension(575,400));
		frame.pack();
		frame.setVisible(true);

	}

	public static void addNeighbor(int row, int column, MinesweeperButton button,
			MinesweeperButton buttons[][]) {
		if(row < 0 || column < 0)
			return;
		if(row >= SIZE || column >= SIZE)
			return;
		if(buttons[row][column] == button)
			return;
		button.addNeighbor(buttons[row][column]);
	}
}
