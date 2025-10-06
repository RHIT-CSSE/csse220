package inClassExampleSol;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button3Listener implements ActionListener {
	
	private JButton other;
	
	public Button3Listener(JButton other) {
		this.other = other;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = other.getText();
		int temp = Integer.parseInt(text);
		other.setText(""+(temp+1));

	}

}
