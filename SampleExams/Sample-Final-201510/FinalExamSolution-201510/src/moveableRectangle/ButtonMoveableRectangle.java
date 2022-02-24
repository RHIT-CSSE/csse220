package moveableRectangle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonMoveableRectangle extends MoveableRectangle implements
		ActionListener {

	ButtonMoveableRectangle(Color color ) {
		super(color);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if(source.getText().equals("UP")) {
			setyVelocity(-1);
			setxVelocity(0);
		}
		if(source.getText().equals("DOWN")) {
			setyVelocity(1);
			setxVelocity(0);
		}
		if(source.getText().equals("LEFT")) {
			setyVelocity(0);
			setxVelocity(-1);
		}
		if(source.getText().equals("RIGHT")) {
			setyVelocity(0);
			setxVelocity(1);
		}

	}

}
