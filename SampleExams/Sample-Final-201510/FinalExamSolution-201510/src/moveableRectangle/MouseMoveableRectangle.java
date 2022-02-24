package moveableRectangle;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseMoveableRectangle extends MoveableRectangle implements
		MouseListener {

	
	public MouseMoveableRectangle(Color color) {
		super(color);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int mouseX = e.getX();
		int mouseY = e.getY();
		if(mouseX > this.getCenterX()) {
			this.setxVelocity(1);
		} else {
			this.setxVelocity(-1);
		}

		if(mouseY > this.getCenterY()) {
			this.setyVelocity(1);
		} else {
			this.setyVelocity(-1);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
