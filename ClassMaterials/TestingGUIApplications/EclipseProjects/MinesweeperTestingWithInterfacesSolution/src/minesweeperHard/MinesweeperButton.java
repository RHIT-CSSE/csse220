package minesweeperHard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class MinesweeperButton extends JButton implements ActionListener {

	private ArrayList<MinesweeperButton> neighbors;
	private boolean hasMine;
	
	public MinesweeperButton() {
		neighbors = new ArrayList<MinesweeperButton>();
		hasMine = Math.random() < .3;
		setText("?");
		addActionListener(this);
	}
	
	public boolean hasMine() {
		return hasMine;
	}
	
	public void addNeighbor(MinesweeperButton neighbor) {
		neighbors.add(neighbor);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(hasMine) { 
			setText("X");
		} else {
			int count = 0;
			for(MinesweeperButton neighbor : neighbors) {
				if(neighbor.hasMine()) {
					count++;
				}
			}
			setText(count + "");
		}
		
	}
	
	
	
	
}
