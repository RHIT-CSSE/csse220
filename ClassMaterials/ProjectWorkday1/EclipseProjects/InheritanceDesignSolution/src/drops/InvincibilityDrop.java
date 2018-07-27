package drops;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

import game.GameComponent;
import platforms.BouncingPlatform;

public class InvincibilityDrop extends AbstractDrop {

	private static final double SIZE = 20.0;
	private static final Color COLOR = Color.YELLOW;

	
	public InvincibilityDrop(GameComponent component, int range) {
		super(component, range, SIZE);
	}
	
	public InvincibilityDrop(GameComponent component, Rectangle2D.Double box ) {
		super( component, box, SIZE);
	}

	@Override
	public Color getColor() {
		return COLOR;
	}
	


	@Override
	public void collideWith(BouncingPlatform p) {
		if( !shouldRemove() && !p.shouldRemove()) {
			if (this.overlaps(p)) {
				p.setInvincibilityCount( 50 );
				this.markToRemove();
			}
		}
	}
	
}
