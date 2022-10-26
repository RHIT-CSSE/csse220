package game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

import drops.AbstractDrop;
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
	private List<GameObject> gameObjects = new ArrayList<>();
	private UserControlledPlatform userPlatform;
	
	public GameComponent() {
		this.userPlatform = new UserControlledPlatform(10, 0, this);
		this.gameObjects.add( this.userPlatform );
		this.gameObjects.add(new BouncingPlatform(this, 200, 100, 5, 0));
		this.gameObjects.add(new BouncingPlatform(this,  30, 100, 0, 5));
		this.gameObjects.add(new BouncingPlatform(this, 130, 150, 0, 5 ));
		this.gameObjects.add(new BouncingPlatform(this, 230, 200, 0, 5));
		

	}

	public void drawScreen() {
		this.repaint();
		System.out.println("Tick " + this.numTicks);
		
		
		//This is harder now to keep track of
		//System.out.println("There are " + this.drops + " raindrops.");
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		for (GameObject gameObject: gameObjects) {
			gameObject.drawOn(g2);
		}


	}

	public void updateState() {
		
		addRaindrops();
		for (GameObject gameObject: this.gameObjects) {
			gameObject.update();
		}
		handleCollisions();
		this.numTicks++;
	}

	private void handleCollisions() {

		for(GameObject o1: gameObjects){
			for(GameObject o2: gameObjects){
				if( o1 != o2 && !o1.shouldRemove() && !o2.shouldRemove() && o1.overlaps(o2)) {
					o1.collideWith(o2);
				}
			}
		}
		
		List<GameObject> shouldRemove = new ArrayList<>();
		for(GameObject object: gameObjects){
			if(object.shouldRemove()){
				shouldRemove.add(object);
			}
		}
		for(GameObject object: shouldRemove){
			this.gameObjects.remove(object);
			object.onRemove();
		}
	}

	private void addRaindrops() {
		double rand = Math.random();
		if (rand < DAMAGE_DROPS_PERC) {
			this.gameObjects.add(new DamagingDrop(this, this.getWidth()));
		} else if (rand < DAMAGE_DROPS_PERC + HEALING_DROPS_PERC ) {
			this.gameObjects.add(new HealingDrop(this, this.getWidth()));
		} else {  		//FIXED
			this.gameObjects.add(new InvincibilityDrop(this, this.getWidth()));
		}
		
	}

	public void toggleBoxDirection() {
		//FIXED
		this.userPlatform.reverseDirection();
	}

	public void createRainDrop(Double boundingBox) {
		//FIXED
		this.gameObjects.add(new DamagingDrop(this, boundingBox));
	}

}
