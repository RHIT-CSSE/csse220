package game.collisions;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import game.Platform;
import game.Raindrop;

// TODO: Refactor Raindrop, Platform, (and hopefully that lone box?) into GameObjects.
public interface GameObject {
	
	// updatePosition, fall, ... can all be consolidated into an update method.
	void update();
	
	// fall, willExplode, ...
	boolean shouldRemove();
	
	// Called when object is removed.
	// ie to create the explosion.
	void onRemove();
	
	void drawOn(Graphics2D g2);
	
	// "Double Dispatch" design pattern.
	
		// Initial collision method.
		// GameComponent always calls this method to handle collisions.
		// Each subclass always calls one of the specific methods below.
		// e.g. Platform.collideWith will just call:
		// 			other.collideWithPlatform(this)
		void collideWith(GameObject other);
		
		// Subclass-specific collision methods.
		// A RainDrop might not care that it has collided with a platform,
		// so it might call:
		//			other.collideWithDrop(this)
		// to let the platform absorb the raindrop.
		void collideWithPlatform(Platform thisPlatform);
	
		// Beware infinite loops: someone must eventually "handle" the collision.
		void collideWithDrop(Raindrop thisRaindrop);
		
		// FIXME: are we STILL using Rectangle2D to represent the user's box?
		void collideWithBox(Rectangle2D.Double thisBox);
}
