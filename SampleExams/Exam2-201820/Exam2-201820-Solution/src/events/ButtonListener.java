package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

	private CatComponent component;
	private int dx;
	private int dy;

	public ButtonListener(CatComponent component, int dx, int dy) {
		this.component = component;
		this.dx = dx;
		this.dy = dy;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		component.moveRoombaBy(dx, dy);
		component.extendPath();
	}

}
