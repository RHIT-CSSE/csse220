package swingIntro;

import javax.swing.JComponent;
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

public class MyComponent extends JComponent {

    private void drawSimpleSquare(Graphics2D g2) {
        final int sqLocX = 10;
		final int sqLocY = 10;
		// When width = height then rectangle is a square
		final int sqWidth = 10;
		final int sqHeight = 10;

		Rectangle square = new Rectangle(sqLocX, sqLocY, sqWidth, sqHeight);
		g2.draw(square);
    }

    private void drawUsingColors(Graphics2D g2) {
        int componentWidth = this.getWidth();
        int componentHeight = this.getHeight();
        Color incomingColor = g2.getColor();
        // Look up RGB/RGBa color codes; there are lots of color picker tools online
        Color backgroundColor = new Color(128, 0, 128, 128);
        g2.setColor(backgroundColor);
        // This fills in the entire component and gives it a background color
        Rectangle r1 = new Rectangle(5, 5, componentWidth, componentHeight);
        g2.fill(r1);
        // Reset the color back to original incoming - important to always reset,
        // otherwise it is like you are forever changing the paint color
        g2.setColor(incomingColor);
    }

    /**
     * ensures: handles painting all items to the component when called by Java Swing
     * @param g Graphics context to paint to
     */
	@Override
	protected void paintComponent(Graphics g) {
		// Asks the superclass, JComponent, to do its behind-the-scenes work
		super.paintComponent(g);

		// Treat Graphics 'g' as if it were a Graphics2D by casting
        // (this is a quirk of Java Swing changing over time)
		Graphics2D g2 = (Graphics2D) g;

		this.drawSimpleSquare(g2);

        this.drawUsingColors(g2);

        // TODO Implement the methods below

		this.drawManyRectangles(g2);

		this.drawShapesLines(g2);

		this.drawSomeText(g2);

		this.drawUsingArc(g2);

		this.drawRoundedRect(g2);
	}

    /**
     * TODO: Draw multiple rectangles (squares) starting at a fixed location.
     * - Use a loop to increase the size of each square.
     * - Draw each square using the Graphics2D object.
     * - The squares should not overlap and should be visible within the component.
     */
    private void drawManyRectangles(Graphics2D g2d) {

    }

    /**
     * TODO: Draw a circle and two lines.
     * - Draw a circle at a specified location.
     * - Draw a diagonal line starting from the center of the circle.
     * - Draw a horizontal line starting from the same center.
     * - Use appropriate classes from java.awt.geom for shapes and lines.
     */
    private void drawShapesLines(Graphics2D g2d) {

    }

    /**
     * TODO: Draw text on the component.
     * - Set a custom font for the text.
     * - Look for the appropriate class in java.awt,
     * and the appropriate methods in Graphics2D for
     * getting/setting font and drawing strings to the screen
     * - Draw a string at a specified location.
     * - Reset the font to its original value after drawing.
     */
    private void drawSomeText(Graphics2D g2d) {

    }

    /**
     * TODO: Draw multiple colored arcs to form a "pac-man" shape.
     * - Use a loop to draw arcs at different angles.
     * - Look for the appropriate class in java.awt.geom
     * - Change the color for each arc segment.
     * - Use Arc2D.PIE for the arc type.
     * - Reset the color to its original value after drawing.
     */
    private void drawUsingArc(Graphics2D g2d) {

    }

    /**
     * TODO: Draw a filled rounded rectangle.
     * - Set a fill color.
     * - Draw a rounded rectangle at a specified location.
     * - Look for the appropriate class in java.awt.geom
     * - Reset the color to its original value after filling.
     */
    private void drawRoundedRect(Graphics2D g2d) {

    }

}
