import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {

	private int num;
	private int[] points;
	private JButton button;
	
	public ButtonListener(int i, int[] points, JButton button) {
		num = i;
		this.points = points;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			sum += points[i];
		}
		System.out.println(points[4]);
		if(sum < points[4]) {
			points[num]++;
			button.setText(Integer.toString(points[num]));
		}

	}

}
