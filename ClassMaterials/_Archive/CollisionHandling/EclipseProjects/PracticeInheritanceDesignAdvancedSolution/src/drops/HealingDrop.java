package drops;

import java.awt.Color;
import java.awt.geom.Rectangle2D.Double;

import game.GameComponent;
import platforms.AbstractPlatform;
/**
 *  This class represents a red drop that when
 *  hitting a bouncing platform should remove a raindrop from it
 * 
 */
public class HealingDrop extends AbstractDrop {

	private static final double SIZE = 10.0;
	private static final Color COLOR = Color.RED;
	
	public HealingDrop(Double box, GameComponent component) {
		super(box, component, COLOR, SIZE);
	}
	
	public HealingDrop(int width, GameComponent component) {
		super(width, component, COLOR, SIZE);
	}
	
	public void collideWithPlatform( AbstractPlatform other) {
		other.removeDrop();
		markToRemove();
	}

}
