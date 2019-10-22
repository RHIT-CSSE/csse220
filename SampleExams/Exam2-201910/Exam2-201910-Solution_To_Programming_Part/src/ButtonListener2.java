import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonListener2 implements ActionListener {

	private int[] points;
	private JLabel label;
	
	public ButtonListener2(int[] points, JLabel label) {
		this.points = points;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		points[4]++;
		label.setText("Current Max: " + points[4]);

	}

}
