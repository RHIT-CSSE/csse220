package drops;

import java.awt.Color;
import java.awt.geom.Rectangle2D.Double;

import game.GameComponent;
import platforms.AbstractPlatform;
/**
 *  This class represents a yellow drop that when
 *  hitting a bouncing platform should make it invincible
 * 
 */
public class InvincibilityDrop  extends AbstractDrop{

	private static final double SIZE = 20.0;
	private static final Color COLOR = Color.YELLOW;
	
	public InvincibilityDrop(Double box, GameComponent component) {
		super(box, component, COLOR, SIZE);
	}
	
	public InvincibilityDrop(int width, GameComponent component) {
		super(width, component, COLOR, SIZE);
	}
	
	public void collideWithPlatform( AbstractPlatform other) {
		other.makeInvinciple();
		markToRemove();
	}

}
