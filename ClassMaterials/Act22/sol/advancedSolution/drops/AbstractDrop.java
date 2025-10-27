package drops;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import game.GameComponent;
import game.GameObject;
import platforms.AbstractPlatform;

public abstract class AbstractDrop extends GameObject {
	
	
	private Color color;
	
	public AbstractDrop(int range, GameComponent component, Color color, double size) {
		super(component, Math.random()*range, 0, 0, 1,size,size);
		this.color = color;
	}
	
	public AbstractDrop(Rectangle2D.Double box, GameComponent component, Color color, double size) {
		super(component, box.getMinX() + Math.random() * (box.getWidth()), box.getMinY() + Math.random() * (box.getHeight()), 0,1, size, size);
		this.color = color;
	}
	
	public void drawOn(Graphics2D g) {
		g.setColor( this.color );
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

	public abstract void collideWithPlatform( AbstractPlatform other) ;
	
	
}
