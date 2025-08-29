package addlettersProblem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class AddListener implements ActionListener {

	JLabel labelToAddTo;
	String textToAdd;
	
	public AddListener(JLabel textOutput, String string) {
		labelToAddTo = textOutput;
		textToAdd = string;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		labelToAddTo.setText(labelToAddTo.getText() + textToAdd);

	}

}
