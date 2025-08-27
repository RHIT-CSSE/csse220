
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Draws some Foxes on a graphics area.
 *
 * @author Ian Ludden, adapted from HousesComponent by Matt Boutell
 */
public class FoxComponent extends JComponent {

	/**
	 * Draws Fox objects to the screen.
	 */
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2 = (Graphics2D) graphics;

		Color foxOrange = new Color(195, 88, 23); // C35817 in hex
		Fox fox1 = new Fox(200, 100, foxOrange);
		fox1.drawOn(graphics2);

		// There are also many built-in colors in the Color class.
		Fox fox2 = new Fox(50, 250, Color.BLUE);
		fox2.drawOn(graphics2);
		
	}
}
