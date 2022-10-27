package rectangleExample;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawListener implements MouseListener {

	private DrawComponent component;
	private int x1;
	private int y1;
	
	public DrawListener(DrawComponent component) {
		this.component = component;
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {

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
		x1 = event.getX();
		y1 = event.getY();

	}

	@Override
	public void mouseReleased(MouseEvent event) {
		component.addRect(x1,y1,event.getX(), event.getY());
		component.repaint(); //cases paintComponent to be called
	}

}
