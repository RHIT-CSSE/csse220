package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class UndoListener implements ActionListener {

	private JLabel label;
	private ArrayList<Integer> ints;
	
	public UndoListener(JLabel label, ArrayList<Integer> ints) {
		this.ints = ints;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(ints.size() == 1) return;
		ints.remove(ints.size() - 1);
		label.setText(ints.get(ints.size() - 1) + "");
	}

}
