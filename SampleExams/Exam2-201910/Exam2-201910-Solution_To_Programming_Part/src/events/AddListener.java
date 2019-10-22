package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class AddListener implements ActionListener {

	private JLabel label;
	private ArrayList<Integer> ints;
	private int increment;
	
	public AddListener(JLabel label, ArrayList<Integer> ints, int increment) {
		this.ints = ints;
		this.label = label;
		this.increment = increment;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int current = ints.get(ints.size() - 1);
		ints.add(current + increment);
		label.setText((current + increment) + "");
	}

}
