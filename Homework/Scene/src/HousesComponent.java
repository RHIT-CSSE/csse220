
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Draws some Houses on a graphics area.
 * 
 * @author Matt Boutell
 */
public class HousesComponent extends JComponent {

	/**
	 * Draws Houses.
	 */
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2 = (Graphics2D) graphics;

		// TODO: Implement the House class constructor to take the house's
		// color and the (x,y) location of the upper-left corner of the house
		// body. Then implement a drawOn() function that draws the house, as specified in the assignment.
		// When done, you should see two houses when you run HousesViewer.

		House house = new House(200, 100, Color.RED);
		house.drawOn(graphics2);

		// I found the RGB values for the aqua color from colorpicker.com
		Color aqua = new Color(50, 230, 92);
		House house2 = new House(50, 250, aqua);
		house2.drawOn(graphics2);
		
	}
}
