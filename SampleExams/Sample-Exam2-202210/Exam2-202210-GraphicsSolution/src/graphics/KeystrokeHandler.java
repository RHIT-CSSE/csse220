package graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeystrokeHandler implements KeyListener {
	
	private ResponsiveCarComponent component;
	
	//
	// ************************************************************************
	//

	public KeystrokeHandler() {
		System.out.println("KeystrokeHandler()");
	}
	
	//
	// ************************************************************************
	//

	public KeystrokeHandler(ResponsiveCarComponent component) {
		this.component = component;
	}
	
	//
	// ************************************************************************
	//

	@Override
	public void keyPressed(KeyEvent ke) {
		final int upArrow = 38;
		final int downArrow = 40;
		final int rightArrow = 39;
		final int leftArrow = 37;
		final int spaceKey = 32;
		
		final int north = 270;
		final int south = 450;  // for some reason or another 90 did not work
		final int east = 0;
		final int west = 180;
		
		final int moveDistance = 50;
		
		switch (ke.getKeyCode()) {
		case upArrow:
			component.setCarDirection(north);
			break;
		case rightArrow:
			component.setCarDirection(east);
			break;	
		case leftArrow:
			component.setCarDirection(west);
			break;	
		case downArrow:
			component.setCarDirection(south);
			break;	
		case spaceKey:
			component.moveCarForward(moveDistance);
			break;
		} // end switch

		component.repaint();
	} // keyPressed
	
	//
	// ************************************************************************
	//
	
	@Override
	public void keyReleased(KeyEvent ke) {
	} // keyReleased

	//
	// ************************************************************************
	//

	@Override
	public void keyTyped(KeyEvent ke) {
	} // keyTyped

}
