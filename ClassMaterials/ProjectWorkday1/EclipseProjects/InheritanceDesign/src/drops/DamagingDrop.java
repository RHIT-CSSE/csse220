package drops;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import game.GameComponent;
import game.GameObject;


/**
 *  This class represents a blue drop that when
 *  hitting a bouncing platform should add a raindrop to it
 * 
 */
public class DamagingDrop extends GameObject{

	private static final double SIZE = 5.0;
	private static final Color DAMAGING_DROP_COLOR = Color.BLUE;

	
	public DamagingDrop( GameComponent component, int range) {
		super(component, Math.random()*range, 0, 0, 1, SIZE, SIZE);
	}
	
	//constructor used to create drops when box explodes
	public DamagingDrop( GameComponent component, Rectangle2D.Double box ) {
		super(component, box.getMinX() + Math.random() * (box.getWidth()), box.getMinY() + Math.random() * (box.getHeight()), 0,1, SIZE, SIZE);
	}
	

	public void drawOn(Graphics2D g) {
		g.setColor( DAMAGING_DROP_COLOR );
		Ellipse2D.Double drop = 
				new Ellipse2D.Double(this.getBoundingBox().x, this.getBoundingBox().y, this.getBoundingBox().getWidth(), this.getBoundingBox().getHeight() );
		g.fill(drop);
		g.setColor(Color.BLACK);
	}
	
	@Override
	public void update() {
		super.update();
		if (offBottom() ) {
			markToRemove();
		}
	}

	@Override
	public void onRemove() {
		// Do nothing special.
	}



}
