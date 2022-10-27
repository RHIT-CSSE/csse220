package clicksProblem;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickListener implements MouseListener {

	private ClickComponent component;
	
	public ClickListener(ClickComponent component) {
		this.component = component;
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		//TODO: Draw a circle on left-click, square on right-click 
		//(each with a height & width of 20, centered at the click location)
		//The circles should be blue, the squares should be red
		if (event.getButton()==MouseEvent.BUTTON1) {
			component.addCircle(event.getX(), event.getY(), 20, Color.BLUE);
		}
		else {
			component.addSquare(event.getX(), event.getY(), 20, Color.RED);
		}
		component.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// TODO Auto-generated method stub

	}

}
