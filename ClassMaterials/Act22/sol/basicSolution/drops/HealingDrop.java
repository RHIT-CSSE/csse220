package drops;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import game.GameComponent;
import game.GameObject;
import platforms.BouncingPlatform;


/**
 *  This class represents a red drop that when
 *  hitting a bouncing platform should remove a raindrop from it
 * 
 */
public class HealingDrop extends AbstractDrop {

	private static final double SIZE = 10.0;
	private static final Color COLOR = Color.RED;
	

	public HealingDrop(GameComponent component, int range) {
		super(component, range, SIZE);
	}
	
	public HealingDrop(GameComponent component, Rectangle2D.Double box ) {
		super( component, box, SIZE);
	}


	@Override
	public Color getColor() {
		return COLOR;
	}

	@Override
	public void collideWith(BouncingPlatform p) {
		if (p.getInvincibilityCount() <= 0) {
			p.setRainDropsCollected( 0);
			this.markToRemove();
		}
	}
	

}
