package liveCoding;
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
 * @author CSSE Faculty
 */
public class MyComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	
	//
	// ****************************************************************************************
	//

	private void drawSimpleSquare(Graphics2D g2d) {
		final int sqLocX = 10;
		final int sqLocY = 10;
		// When width = height then rectangle is a square
		final int sqWidth = 10;
		final int sqHeight = 10;
		
		Rectangle square = new Rectangle(sqLocX, sqLocY, sqWidth, sqHeight);
		g2d.draw(square); 
	} // drawSimpleRectangle

	//
	// ****************************************************************************************
	//

	private void drawManyRectangles(Graphics2D g2d) {
		final int rectLocX = 25;
		final int rectLocY = 25;
		final int startingWidthHeight = 10;
		int componentWidth = this.getWidth();
		
		for (int k = startingWidthHeight, z = (componentWidth - rectLocX); k < z; k += 10) {
			// r1's (x, y) = (rectLocX, rectLocY) always
			// r1's (width, height) = (k, k) which makes it a square
			Rectangle r1 = new Rectangle(rectLocX, rectLocY, k, k);
			g2d.draw(r1);
		} // end for
	} // drawManyRectangles

	//
	// ****************************************************************************************
	//

	private void drawShapesLines(Graphics2D g2d) {

		final int circleLocX = 10;
		final int circleLocY = 400;
		// When width = height then ellipse is a circle
		final int circleWidth = 30;
		final int circleHeight = 30;
		Ellipse2D.Double circle = new Ellipse2D.Double(circleLocX, circleLocY, circleWidth, circleHeight);
		g2d.draw(circle);
		
		// Draw a diagonal line NW to SE starting at the circle's center
		int circleCenterX = circleLocX + (circleWidth / 2);
		int circelCenterY = circleLocY + (circleHeight / 2);
		int lineToX = circleCenterX + 40;
		int lineToY = circelCenterY + 40;
		Line2D.Double line1 = new Line2D.Double(circleCenterX, circelCenterY, lineToX, lineToY);
		

		// Draw a horizontal line East starting at the circle's center
		g2d.draw(line1);
		Point2D p1 = new Point2D.Double(circleCenterX, circelCenterY);
		Point2D p2 = new Point2D.Double(lineToX, circelCenterY);
		Line2D.Double line2 = new Line2D.Double(p1, p2);
		g2d.draw(line2);
	} // drawShapesLinesPoints

	//
	// ****************************************************************************************
	//

	private void drawSomeText(Graphics2D g2d) {
		final int textLocX = 80;
		final int textLocY = 440;
		final int fontSize = 36;
		Font incomingFont = g2d.getFont();
		g2d.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
		// Letter "S" will be drawn at (textLocX, textLocY)
		g2d.drawString("Some text", textLocX, textLocY);
		// Reset the font back to original incoming - important to always reset
		g2d.setFont(incomingFont);
	} // drawSomeText

	//
	// ****************************************************************************************
	//

	private void drawUsingColors(Graphics2D g2d) {
		int componentWidth = this.getWidth();
		int componentHeight = this.getHeight();
		Color incomingColor = g2d.getColor();
		Color backgroundColor = new Color(128, 0, 128, 128);
		g2d.setColor(backgroundColor);
		// This fills in the entire component and gives it a background color
		Rectangle r1 = new Rectangle(5, 5, componentWidth,	componentHeight);
		g2d.fill(r1);
		// Reset the color back to original incoming - important to always reset
		g2d.setColor(incomingColor);
	} // drawUsingColors

	//
	// ****************************************************************************************
	//

	private void drawUsingArc(Graphics2D g2d) {		
		final double degreeStepSize = 15.0;
		final double colorStepSize = degreeStepSize * 256.0 / 360.0;
		Color incomingColor = g2d.getColor();
		int colorValue = 0;
		// Note:  
		// arc angles increases in the counter clockwise direction
		// arc angles are also measured in degrees
		// zero and 360 degrees are aligned with x-axis
		// Draw a "pac-man"
		for (double degree = 15.0, degreeMax = 345.0; degree < degreeMax; degree += degreeStepSize) {
			g2d.setColor(new Color(colorValue, 255 - colorValue, 0));
			Arc2D.Double arc = new Arc2D.Double(250, 450, 100, 100, degree,	degreeStepSize, Arc2D.PIE);
			g2d.fill(arc);
			colorValue += colorStepSize;
		} // end for
		// Reset the color back to original incoming - important to always reset
		g2d.setColor(incomingColor);
	} // drawUsingArc

	//
	// ****************************************************************************************
	//

	private void drawRoundedRect(Graphics2D g2d) {
		final int rectLocX = 10;
		final int rectLocY = 500;
		final int rectWidth = 80;
		final int rectHeight = 40;
		// arcWidth = arcHeight makes for symmetric rounded corners
		final int arcWidth = 15;
		final int arcHeight = 15;	
		Color incomingColor = g2d.getColor();	
		
		RoundRectangle2D.Double roundtangle = new RoundRectangle2D.Double(rectLocX, rectLocY, rectWidth, rectHeight, arcWidth, arcHeight);
		g2d.setColor(Color.YELLOW);
		g2d.fill(roundtangle);
		// Reset the color back to original incoming - important to always reset
		g2d.setColor(incomingColor);
	} // drawRoundedRect

	//
	// ****************************************************************************************
	//

	/**
	 * ensures: handles painting all items to the component when called by Java Swing
	 * @param g Graphics context to paint to
	 */
	@Override
	protected void paintComponent(Graphics g) {
		// Asks the superclass to do its work
		super.paintComponent(g);

		// Treat Graphics 'g' as if it were a Graphics2D
		Graphics2D g2d = (Graphics2D) g;

		this.drawSimpleSquare(g2d);

		this.drawManyRectangles(g2d);

		this.drawShapesLines(g2d);

		this.drawSomeText(g2d);
		
		this.drawUsingColors(g2d);

		this.drawUsingArc(g2d);

		this.drawRoundedRect(g2d);
	} // paintComponent

}
