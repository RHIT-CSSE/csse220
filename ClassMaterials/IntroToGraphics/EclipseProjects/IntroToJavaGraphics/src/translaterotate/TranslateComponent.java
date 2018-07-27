package translaterotate;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 * Component on which to display HourTimer instances.
 *
 */
public class TranslateComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		//TODO: use a translate command to ensure that the face
		// always appears in the center of the window
		// HINT: use getWidth() and getHeight() to find the right size
		

		// draws a face, with upper left hand corner 0 0
		// you do not need to edit this code
		g2.drawRect(0, 0, 200, 150);
		g2.drawRect(20, 20, 50, 50);
		g2.drawRect(130, 20, 50, 50);
		g2.drawRect(60, 80, 80, 40);
		
		//WARNING: be sure to always undo any translate you've done
		
	}
	
	
}
