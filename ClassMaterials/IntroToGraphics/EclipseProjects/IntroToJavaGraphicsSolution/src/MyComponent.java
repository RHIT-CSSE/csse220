import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;

/**
 * This class draws simple objects using Graphics2D.
 * 
 * @author Curt Clifton. Created Sep 10, 2008.
 */
public class MyComponent extends JComponent {
	/*
	 * No Javadoc is needed, because we inherit one. (Hover on paintComponent.)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		// Asks the superclass to do its work
		super.paintComponent(g);

		// Recovers Graphics2D object
		Graphics2D graphics2 = (Graphics2D) g;

		// Draws a simple rectangle
		Rectangle box = new Rectangle(10, 20, 30, 40);
		graphics2.draw(box); // <-- opposite order from zellegraphics

		// Draws many rectangles
		for (int i = 10; i < (this.getWidth() - 10); i += 10) {
			box = new Rectangle(10, 10, i, i);
			graphics2.draw(box);
		}

		// Drawing some other shapes
		Ellipse2D.Double circ = new Ellipse2D.Double(10, 400, 20, 20);
		graphics2.draw(circ);
		Line2D.Double line1 = new Line2D.Double(20, 410, 60, 450);
		graphics2.draw(line1);
		Point2D p1 = new Point2D.Double(60, 450);
		Point2D p2 = new Point2D.Double(80, 430);
		Line2D.Double line2 = new Line2D.Double(p1, p2);
		graphics2.draw(line2);

		// Drawing some text
		graphics2.setFont(new Font("Times New Roman", Font.PLAIN, 72));
		graphics2.drawString("some text", 80, 430);

		// Changing colors
		Color c = new Color(128, 0, 128, 128);
		graphics2.setColor(c);
		box = new Rectangle(5, 5, this.getWidth(),
				this.getHeight());
		graphics2.fill(box);

		// Using Arc2D
		double degreeStepSize = 15.0;
		double colorStepSize = degreeStepSize * 256.0 / 360.0;
		int colorValue = 0;
		// Note:  arc angles increases in the counter clockwise direction.
		// They are also measured in degrees.
		for (double degree = 0.0; degree < 360.0; degree += degreeStepSize) {
			graphics2.setColor(new Color(colorValue, 255 - colorValue, 0));
			Arc2D.Double arc = new Arc2D.Double(250, 450, 100, 100, degree,
					degreeStepSize, Arc2D.PIE);
			graphics2.fill(arc);
			colorValue += colorStepSize;
		}

		// Using RoundRectangle
		RoundRectangle2D.Double roundtangle = new RoundRectangle2D.Double(10,
				500, 80, 40, 15, 15);
		graphics2.setColor(Color.YELLOW);
		graphics2.fill(roundtangle);
	}

}
