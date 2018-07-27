import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class GameComponent extends JComponent {
	// Here is the game state. In a bigger game, this would live
	// in another class like Level.
	private Rectangle2D.Double box;
	private int STARTING_DX = 10;
	private int dx;
	private List<Raindrop> raindrops = new ArrayList<>();
	private int numTicks;
	private static final int BOX_SIZE = 20;
	private static final int BOX_X = 10;
	private static final int BOX_Y = 200;
	
	public GameComponent() {
		this.box = new Rectangle2D.Double(BOX_X, BOX_Y , BOX_SIZE, BOX_SIZE);
		this.dx = STARTING_DX;
	}
	
	public void updateState() {
		// Each is big enough to be in a helper method.
		updateBox();
		updateRaindrops();
		this.numTicks++;
	}
	
	
	public void drawScreen() {
		this.repaint();
		System.out.println("Tick " + this.numTicks);
		System.out.println("There are " + this.raindrops.size() + " raindrops.");
	}
	
	private void updateBox() {
		this.box.x += this.dx;
		
		//Keep the box from going off the screen 
		if ( this.box.x > this.getWidth() - box.getWidth() ) {
			this.box.x = this.getWidth() - box.getWidth();
		} else if (this.box.x < 0 ) {
			this.box.x = 0;
		}
	}
	
	private void updateRaindrops() {
		if (Math.random() < 0.5) {
			this.raindrops.add(new Raindrop(this.getWidth() ));
		}

		// Alternatively, we could use the number of ticks to get more regular rain.
		//if (this.numTicks % 2 == 0) {
		//	this.raindrops.add(new Raindrop(this.getWidth()));
		//}
		
		// List<Raindrop> raindropsToRemove = new ArrayList<>();
		
		// Any drops that fall off the bottom of the 
		// screen should be removed. Removing within the foreach
		// loop gives a concurrent modification exception.
		// We can make a list of ones to remove (which I think is most general), 
		// or use an iterator,
		// or use an indexed loop and iterate backwards.
		for (Raindrop drop : this.raindrops) {
			boolean shouldRemove = drop.fall(this.getHeight());
			
			//TODO include this code when ready to
			//if (shouldRemove ) {
			//	this.raindrops.remove(drop);
			//}
			
		}

// We'll uncomment this once we see why this approach it is needed.
//		for (Raindrop drop : raindropsToRemove) {
//			this.raindrops.remove(drop);
//		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(this.box);
		// TODO: Draw raindrops

	}
}
