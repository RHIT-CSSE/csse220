package game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import drops.DamagingDrop;
import drops.HealingDrop;
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

	public GameComponent() {

		this.gameObjects.add(new UserControlledPlatform(10, 0, this) );
		this.gameObjects.add(new BouncingPlatform(this, 200, 100, 5, 0));
		this.gameObjects.add(new BouncingPlatform(this,  30, 100, 0, 5));
		this.gameObjects.add(new BouncingPlatform(this, 130, 150, 0, 5 ));
		this.gameObjects.add(new BouncingPlatform(this, 230, 200, 0, 5));
		

	}

	public void drawScreen() {
		this.repaint();
		System.out.println("Tick " + this.numTicks);
		
		
		//TODO remove this use of instanceof !
		int countDrops = 0;
		for (GameObject gameObject: gameObjects) {
			if (gameObject instanceof DamagingDrop ||
					gameObject instanceof HealingDrop ) {
				countDrops++;
			}
		}
		System.out.println("There are " + countDrops + " raindrops.");
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
		// Each is big enough to be in a helper method.
		updateRaindrops();
		updatePlatforms();
		handleCollisions();
		this.numTicks++;
	}

	private void handleCollisions() {

		
		//TODO this code is terrible to understand and maintain there has to be a better way!
		
		for (GameObject o1: gameObjects) {
			for (GameObject o2: gameObjects) {
			
				//UGLY CODE!!!!
				
				//  handle DamagingDrop and bouncing platform collisions
				if (o1 instanceof DamagingDrop && o2 instanceof BouncingPlatform ) {
					DamagingDrop r = (DamagingDrop)o1;
					BouncingPlatform p = (BouncingPlatform)o2;
					if( !r.shouldRemove() && !p.shouldRemove()) {
						if (r.overlaps(p)) {
							p.setRainDropsCollected( p.getRainDropsCollected() + BouncingPlatform.WATER_INCREMENT);
							r.markToRemove();
						}
					}
				}
				if (o2 instanceof DamagingDrop && o1 instanceof BouncingPlatform ) {
					DamagingDrop r = (DamagingDrop)o2;
					BouncingPlatform p = (BouncingPlatform)o1;
					if( !r.shouldRemove() && !p.shouldRemove()) {
						if (r.overlaps(p)) {
							p.setRainDropsCollected( p.getRainDropsCollected() + BouncingPlatform.WATER_INCREMENT);
							r.markToRemove();
						}
					}
				}
			
				//  handle HealingDrop and bouncing platform collisions
				if (o1 instanceof HealingDrop && o2 instanceof BouncingPlatform ) {
					HealingDrop r = (HealingDrop)o1;
					BouncingPlatform p = (BouncingPlatform)o2;
					if( !r.shouldRemove() && !p.shouldRemove()) {
						if (r.overlaps(p)) {
							p.setRainDropsCollected( 0 );
							r.markToRemove();
						}
					}
				}
				if (o2 instanceof HealingDrop && o1 instanceof BouncingPlatform ) {
					HealingDrop r = (HealingDrop)o2;
					BouncingPlatform p = (BouncingPlatform)o1;
					if( !r.shouldRemove() && !p.shouldRemove()) {
						if (r.overlaps(p)) {
							p.setRainDropsCollected( 0 );
							r.markToRemove();
						}
					}
				}
			
				//Handle DamagingDrop and user platform collisions
				if (o1 instanceof DamagingDrop && o2 instanceof UserControlledPlatform ) {
					DamagingDrop r = (DamagingDrop)o1;
					UserControlledPlatform p = (UserControlledPlatform)o2;
					if ( p.getBoundingBox().intersects(r.getBoundingBox() ) ) {
						r.markToRemove();
					}
				}
				if (o2 instanceof DamagingDrop && o1 instanceof UserControlledPlatform ) {
					DamagingDrop r = (DamagingDrop)o2;
					UserControlledPlatform p = (UserControlledPlatform)o1;
					if ( p.overlaps(r) ) {
						r.markToRemove();
					}
				}
				//HealingDrop and UserControlledPlatform
				if (o1 instanceof HealingDrop && o2 instanceof UserControlledPlatform ) {
					HealingDrop r = (HealingDrop)o1;
					UserControlledPlatform p = (UserControlledPlatform)o2;
					if ( p.overlaps(r)  ) {
						r.markToRemove();
					}
				}
				if (o2 instanceof HealingDrop && o1 instanceof UserControlledPlatform ) {
					HealingDrop r = (HealingDrop)o2;
					UserControlledPlatform p = (UserControlledPlatform)o1;
					if ( p.overlaps(r) ) {
						r.markToRemove();
					}
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

	private void updateRaindrops() {
		double rand = Math.random();
		if (rand < DAMAGE_DROPS_PERC) {
			this.gameObjects.add(new DamagingDrop(this, this.getWidth() ));
		} else if (rand < DAMAGE_DROPS_PERC + HEALING_DROPS_PERC ) {
			this.gameObjects.add(new HealingDrop(this, this.getWidth() ));
		} 
		
		
		//TODO remove this use of instanceof !
		for (GameObject gameObject: gameObjects) {
			if (gameObject instanceof DamagingDrop ||
					gameObject instanceof HealingDrop 	) {
				gameObject.update();
			}
		}
		
		
		
	}

	private void updatePlatforms() {
		//TODO remove this use of instanceof !
		for (GameObject gameObject: gameObjects) {
			if (gameObject instanceof BouncingPlatform ||
					gameObject instanceof UserControlledPlatform) {
				gameObject.update();
			}
		}
	}
		
	public void toggleBoxDirection() {
		//TODO remove this use of instanceof !
		for (GameObject gameObject: gameObjects) {
			if (gameObject instanceof UserControlledPlatform) {
				gameObject.reverseDirection();
			}
		}
	}

	public void createRainDrop(Double boundingBox) {
		this.gameObjects.add(new DamagingDrop(this, boundingBox ));
	}

}
