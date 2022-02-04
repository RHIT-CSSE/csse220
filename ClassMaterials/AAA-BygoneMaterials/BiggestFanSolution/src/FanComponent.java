import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

/**
 * This class handles the drawing of the contents of the fan viewer frame. It
 * uses several Fan objects, plus some other shapes.
 * 
 * @author Curt Clifton. Created Dec 8, 2010.
 */
public class FanComponent extends JComponent {

	private static final int BIG_FAN_BLADE_COUNT = 5;
	private static final double BIG_FAN_SIZE = 100.0;
	private static final int LITTLE_FAN_BLADE_COUNT = 3;
	private static final double LITTLE_FAN_SIZE = 30.0;
	private static final double LITTLE_FAN_SEPARATION = 70.0;
	private static final double LITTLE_FAN_ROTATION_DEGREES = 15;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		// Fills the entire graphics area with blue for the sky, so we can
		// paint the other shapes on top of it.
		Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, this.getWidth(),
				this.getHeight());
		g2.setColor(Color.BLUE);
		g2.fill(sky);

		// Draws a very large ellipse, mostly outside the window, to simulate a
		// nice rolling hill.
		Ellipse2D.Double ground = new Ellipse2D.Double(-this.getWidth(),
				0.5 * this.getHeight(), 3 * this.getWidth(), 2 * this
						.getHeight());
		g2.setColor(Color.GREEN);
		g2.fill(ground);

		// Draws a big fan in the middle
		Fan bigFan = new Fan(this.getWidth() / 2.0, this.getHeight() / 2.0,
				BIG_FAN_SIZE, BIG_FAN_BLADE_COUNT, Color.RED);
		bigFan.drawOn(g2);

		// Draws a line of fans by translating and rotating
		Fan littleFan = new Fan(LITTLE_FAN_SEPARATION, this.getHeight() * 0.75,
				LITTLE_FAN_SIZE, LITTLE_FAN_BLADE_COUNT, Color.YELLOW);
		double numberOfLittleFans = (this.getWidth() - 2 * LITTLE_FAN_SEPARATION)
				/ LITTLE_FAN_SEPARATION;
		for (int i = 0; i < numberOfLittleFans; i++) {
			littleFan.drawOn(g2);
			littleFan.translate(LITTLE_FAN_SEPARATION, 0.0);
			littleFan.rotate(LITTLE_FAN_ROTATION_DEGREES);
		}
	}

}
