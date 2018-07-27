package tttEasier;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author hewner
 *
 */
public class TTTMain {


	private static class TTTListener implements ActionListener {
		private int row,column;
		private TTTGame game;
		private JLabel label;
		private JButton button;

		public TTTListener(int row, int col, TTTGame game, JLabel label, JButton button) {
			this.row = row;
			this.column = col;
			this.game = game;
			this.label = label;
			this.button = button;
		}

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			game.setPos(row, column);
			button.setText(game.getPos(row, column));
			if(game.isFinished()) {
				label.setText(game.getWinner() + " won!");
			} else {
				label.setText(game.getCurrentPlayer()+ "'s turn");
			}
			
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TTTGame game = new TTTGame();
			
		
		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Enjoy playing Tic Tac Toe");
		frame.add(label, BorderLayout.NORTH);
		
		JPanel bigPanel = initializePanel(game, label);
		frame.add(bigPanel);
		frame.setPreferredSize(new Dimension(575,400));
		frame.pack();
		frame.setVisible(true);

	}
	
	public static JPanel initializePanel(TTTGame game, JLabel label){
		JPanel bigPanel = new JPanel();
		bigPanel.setLayout(new GridLayout(3,3));
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				JButton button = new JButton(" ");
				bigPanel.add(button);
				button.addActionListener(new TTTListener(row, col, game, label, button));
			}
		}
		return bigPanel;
	}

}
