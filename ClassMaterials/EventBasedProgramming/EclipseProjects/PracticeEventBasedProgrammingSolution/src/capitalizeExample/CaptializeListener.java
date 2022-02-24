package capitalizeExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CaptializeListener implements ActionListener {

	JButton buttonToUpdate;
	boolean isUpperCase;
	
	public CaptializeListener(JButton b) {
		this.buttonToUpdate = b;
		this.isUpperCase = Character.isUpperCase(b.getText().charAt(0));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(isUpperCase) {
			buttonToUpdate.setText(buttonToUpdate.getText().toLowerCase());
			isUpperCase = false;
		} else {
			buttonToUpdate.setText(buttonToUpdate.getText().toUpperCase());
			isUpperCase = true;
		}

	}

}
