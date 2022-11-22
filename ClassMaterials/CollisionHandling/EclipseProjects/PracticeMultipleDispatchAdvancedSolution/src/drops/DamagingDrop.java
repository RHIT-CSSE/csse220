package drops;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import game.GameComponent;
import game.GameObject;
import platforms.BouncingPlatform;
import platforms.UserControlledPlatform;


/**
 *  This class represents a blue drop that when
 *  hitting a bouncing platform should add a raindrop to it
 * 
 */
public class DamagingDrop extends AbstractDrop{

	private static final double SIZE = 5.0;
	private static final Color COLOR = Color.BLUE;

	
	public DamagingDrop(GameComponent component, int range) {
		super(component, range, SIZE);
	}
	
	public DamagingDrop(GameComponent component, Rectangle2D.Double box ) {
		super( component, box, SIZE);
	}

	@Override
	public Color getColor() {
		return COLOR;
	}
	
	@Override
	public void collideWithBouncingPlatform(BouncingPlatform p) {
		if (p.getInvincibilityCount() <= 0) {
			p.setRainDropsCollected( p.getRainDropsCollected() + BouncingPlatform.WATER_INCREMENT);
			this.markToRemove();
		}
	}

	@Override
	public void collideWithDrop(AbstractDrop drop) {
		//do nothing
	}

	





}
