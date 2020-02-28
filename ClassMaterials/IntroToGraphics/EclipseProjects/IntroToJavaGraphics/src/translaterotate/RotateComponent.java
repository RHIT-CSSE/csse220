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
public class RotateComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		
		
		g2.translate(200,200);
		
		//drawing a rect so you can see the inital
		//pos of the face without rotation
		g2.setColor(Color.PINK);
		g2.drawRect(0, 0, 200, 150);
		g2.setColor(Color.BLACK);

		
		// TODO 1: Play with rotation so you get a feel how it works
		// 
		// TODO 2: Modify the code so that it rotates around the center
		// the face, rather than the upper left corner
		//
		// HINT: You'll have to adjust the way the drawing code
		// In particular, you'll have to draw centered at 0,0
		// not with 0,0 as the upper left corner
		// HINT 2: You may have to adjust the translate or the
		// Pink rectangle too
		double degreesToRotate = 30;
		g2.rotate(Math.toRadians(degreesToRotate));

		// draws a face, with upper left hand corner 0 0
		// you need to edit this code for TODO2
		g2.drawRect(0, 0, 200, 150);
		g2.drawRect(20, 20, 50, 50);
		g2.drawRect(130, 20, 50, 50);
		g2.drawRect(60, 80, 80, 40);
		
		//WARNING: be sure to always undo any translations you may have done
		g2.rotate(-Math.toRadians(degreesToRotate));
		g2.translate(-200, -200);
		
	}
	
	
}
