package game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

import drops.DamagingDrop;
import drops.HealingDrop;
import drops.InvincibilityDrop;
import platforms.BouncingPlatform;
import platforms.UserControlledPlatform;

public class GameComponent extends JComponent {
	
	private static final double DAMAGE_DROPS_PERC = 0.9;
	private static final double HEALING_DROPS_PERC = 0.08;
	
	// Here is the game state. In a bigger game, this would live
	// in another class like Level.
	private int numTicks;


	// There are two types of platforms and three types of
	// drops in the game that interact.
	
	//TODO It might seems like this is a good idea to have one list, but
	//we might find that having separate lists can make handling collisions easier
	//private List<GameObject> gameObjects = new ArrayList<>();
	
	private List<AbstractDrop> drops = new ArrayList<>();
	private List<BouncingPlatform> platforms = new ArrayList<>();
	private UserControlledPlatform userPlatform;
	

	public GameComponent() {

		this.userPlatform = new UserControlledPlatform(10, 0, this);
		
		this.platforms.add(new BouncingPlatform(this, 200, 100, 5, 0));
		this.platforms.add(new BouncingPlatform(this,  30, 100, 0, 5));
		this.platforms.add(new BouncingPlatform(this, 130, 150, 0, 5 ));
		this.platforms.add(new BouncingPlatform(this, 230, 200, 0, 5));
		

	}

	public void drawScreen() {
		this.repaint();
		System.out.println("Tick " + this.numTicks);
		
		

		System.out.println("There are " + drops.size() + " raindrops.");
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		ArrayList<GameObject> gameObjects = new ArrayList<>();
		gameObjects.addAll(drops);
		gameObjects.addAll(platforms);
		gameObjects.add(userPlatform);
		
		
		for (GameObject gameObject: gameObjects) {
			gameObject.drawOn(g2);
		}


	}

	public void updateState() {
		// Each is big enough to be in a helper method.
		updateRaindrops();
		updatePlatforms();
		handleCollisions();
		this.numTicks++;
	}

	private void handleCollisions() {

		
		//FIXED
		
		for (AbstractDrop d : this.drops) {
			for (BouncingPlatform p: this.platforms) {
				if( !d.shouldRemove() && !p.shouldRemove() && d.overlaps(p)) {
					d.collideWith(p);
				}
			}
			if( !d.shouldRemove() && d.overlaps(this.userPlatform) ) {
				d.collideWith(this.userPlatform);
			}
		}

		
		List<GameObject> shouldRemove = new ArrayList<>();
		
		//FIXED
		ArrayList<GameObject> gameObjects = new ArrayList<>();
		gameObjects.addAll(drops);
		gameObjects.addAll(platforms);
		gameObjects.add(userPlatform);
		
		for(GameObject object: gameObjects){
			if(object.shouldRemove()){
				shouldRemove.add(object);
			}
		}
		
		for(GameObject object: shouldRemove){
			this.platforms.remove(object);
			this.drops.remove(object);
			object.onRemove();
		}
	}

	private void updateRaindrops() {
		double rand = Math.random();
		if (rand < DAMAGE_DROPS_PERC) {
			this.drops.add(new DamagingDrop(this, this.getWidth()));
		} else if (rand < DAMAGE_DROPS_PERC + HEALING_DROPS_PERC ) {
			this.drops.add(new HealingDrop(this, this.getWidth()));
		} else {  		//FIXED
			this.drops.add(new InvincibilityDrop(this, this.getWidth()));
		}
		
		
		//FIXED
		for (AbstractDrop drop: drops) {
			drop.update();
		}
		
		
		
	}

	private void updatePlatforms() {
		//FIXED
		for (BouncingPlatform gameObject: this.platforms) {
			gameObject.update();
		}
		userPlatform.update();
	}
		
	public void toggleBoxDirection() {
		//FIXED
		this.userPlatform.reverseDirection();
	}

	public void createRainDrop(Double boundingBox) {
		//FIXED
		this.drops.add(new DamagingDrop(this, boundingBox));
	}

}
