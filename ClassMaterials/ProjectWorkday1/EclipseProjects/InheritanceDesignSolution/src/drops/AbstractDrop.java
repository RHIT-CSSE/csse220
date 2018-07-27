package drops;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import game.GameComponent;
import game.GameObject;
import platforms.BouncingPlatform;
import platforms.UserControlledPlatform;

public abstract class AbstractDrop extends GameObject {

	public AbstractDrop(GameComponent gameComponent, int range, double size) {
		super(gameComponent, Math.random()*range, 0, 0, 1, size, size);
	}
	
	public AbstractDrop(GameComponent component, Rectangle2D.Double box, double size ) {
		super(component, box.getMinX() + Math.random() * (box.getWidth()), box.getMinY() + Math.random() * (box.getHeight()), 0,1, size, size);
	}

	public void drawOn(Graphics2D g) {
		g.setColor( getColor() );
		Ellipse2D.Double drop = 
				new Ellipse2D.Double(this.getBoundingBox().x, this.getBoundingBox().y, this.getBoundingBox().getWidth(), this.getBoundingBox().getHeight() );
		g.fill(drop);
		g.setColor(Color.BLACK);
	}
	
	public abstract Color getColor();

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
	
	public abstract void collideWith(BouncingPlatform p);

	public void collideWith(UserControlledPlatform p) {
		if (this.overlaps(p)) {
			markToRemove();
		}
		
	}
	
}
