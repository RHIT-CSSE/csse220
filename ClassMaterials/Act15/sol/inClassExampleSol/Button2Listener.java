package inClassExampleSol;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2Listener implements ActionListener {

	private int current = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("print " + current++);

	}

}
