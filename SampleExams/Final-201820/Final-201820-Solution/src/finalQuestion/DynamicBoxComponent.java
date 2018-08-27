package finalQuestion;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/**
 * This class represents a box with a changing color and position which bounces around the screen.
 * 
 * Some variables or methods for this class may need to be added or modified.
 * 
 * 
 * @author Jason Yoder, Matt Boutell, Mark Hays
 * and their colleagues.
 */
public class DynamicBoxComponent extends JComponent {

	//This variable should NOT need to be changed
	private int numTicks;

	//TODO: This may need to be changed
	private ArrayList<DynamicBox> boxes;

	//This constructor initializes a single box
	public DynamicBoxComponent() {
		this.boxes = new ArrayList<DynamicBox>();
	}
	
	//This method updates the screen to view the current state of the Component
	public void drawScreen() {
		this.repaint();
		System.out.println("Tick " + this.numTicks);
	}

	//This method should draw anything considered to be part of the Component
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (DynamicBox box: boxes) {
			box.drawOn(g2);
		}
		
	}

	//This method updates the state of anything belonging to the Component, currently the single box and ticks passed
	public void updateState() {
		for (DynamicBox box: boxes) {
			box.updateState();
		}
		this.numTicks++;
	}

	public void addBall() {
		this.boxes.add( new DynamicBox(this));
		
	}

	public void toggleMovementPaused() {
		for (DynamicBox box: this.boxes) {
			box.togglePaused();
		}
		
	}


}
