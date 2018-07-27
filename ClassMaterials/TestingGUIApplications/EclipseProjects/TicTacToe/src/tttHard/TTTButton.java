package tttHard;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TTTButton extends JButton implements ActionListener {

	private TTTButton[][] buttons;
	private int row, col;
	private JLabel label;
	
	public TTTButton(JLabel label, TTTButton[][] buttons, int row, int col) {
		setText(" ");
		this.buttons = buttons;
		this.row = row;
		this.col = col;
		this.label = label;
		setFont(new Font(getFont().getName(), Font.PLAIN, 20));
		addActionListener(this);
	}

	boolean isMatch(int rowOffset, int colOffset) {
		int otherRow = row + rowOffset;
		int otherCol = col + colOffset;
		if(otherRow < 0 || otherRow > 2) return false;
		if(otherCol < 0 || otherCol > 2) return false;
		return buttons[otherRow][otherCol].getText().equals(getText());
	}
	
	boolean isWinCenter() {
		if(getText().equals(" ")) return false;
		if(isMatch(-1,0) && isMatch(1,0)) return true;
		if(isMatch(0,-1) && isMatch(0,1)) return true;
		if(isMatch(-1,-1) && isMatch(1,1)) return true;
		if(isMatch(-1,1) && isMatch(1,-1)) return true;
		return false;
	}
	
	boolean isWin() {
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(buttons[r][c].isWinCenter()) return true;
			}
		}
		return false;
	}
	
	String getCurrentPlayer() {
		return label.getText().substring(0,1);
	}
	
	String getOtherPlayer() {
		if(getCurrentPlayer().equals("X"))
			return "O";
		return "X";
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(isWin()) return;
		if(!getText().equals(" ")) return;
		setText(getCurrentPlayer());
		if(isWin()) {
			label.setText(getCurrentPlayer() + " wins!");
		} else {
			label.setText(getOtherPlayer() + " turn");
		}
	}
	
	
	
	
	
	
}
