import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * This class is a graphics shape that draws a fan. It's an abstract fan that
 * just shows the fan blades.
 * 
 * @author Curt Clifton. Created Dec 8, 2010.
 */
public class Fan {
	/**
	 * Used to calculate blade width from the given blade length.
	 */
	private static final double BLADE_ASPECT_RATIO = 0.618033989;

	private static final Color BORDER_COLOR = Color.BLACK;

	private double centerX;
	private double centerY;
	private double bladeLength;
	private int numberOfBlades;
	private Color color;
	private double angleInRadians = 0.0;

	/**
	 * Constructs a new fan with the given parameters.
	 * 
	 * @param centerX
	 * @param centerY
	 * @param bladeLength
	 * @param numberOfBlades
	 * @param color
	 */
	public Fan(double centerX, double centerY, double bladeLength,
			int numberOfBlades, Color color) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.bladeLength = bladeLength;
		this.numberOfBlades = numberOfBlades;
		this.color = color;
	}

	/**
	 * Draws the fan onto the given Graphics2D object.
	 * 
	 * @param graphics2
	 *            Graphics object onto which to draw
	 */
	public void drawOn(Graphics2D graphics2) {
		// TODO: implement

		// Moves the (0,0) origin of the graphics area to the center of the
		// fan. That allows us to avoid adding the centerX and centerY
		// coordinates to all our graphics coordinates.
		// NOTE: I'm calling the graphics area's translate method, not Fan's!
		graphics2.translate(this.centerX, this.centerY);

		// Paints the right number of fan blades onto the graphics area.
		double angleBetweenBlades = 2 * Math.PI / this.numberOfBlades;
		for (int i = 0; i < this.numberOfBlades; i++) {
			// Calculates the angle at which to draw the next blade.
			double angle = this.angleInRadians + i * angleBetweenBlades;

			// Calls a helper method to draw a single blade. I could do all
			// that work here, but putting it in a helper makes this code more
			// concise and easier to read.
			drawBlade(graphics2, angle);
		}

		// Moves the origin of the graphics area back to the original location.
		graphics2.translate(-this.centerX, -this.centerY);
	}

	// TODO: Add a helper method for drawing fan blades.
	/**
	 * Draws a single blade to the given graphics area at the given angle.
	 * 
	 * @param graphics2
	 * @param angle
	 */
	private void drawBlade(Graphics2D graphics2, double angle) {
		// Rotates the graphics area so we can "pretend" to draw a horizontal
		// rectangle, but get one that appears rotated in the window
		// NOTE: I'm calling the graphics area's rotate method, not Fan's!
		// NOTE: Rotating with a positive angle rotates points on the positive 
		// x axis toward the positive y axis.
		graphics2.rotate(angle);

		// Draws the blade.
		Rectangle2D.Double blade = new Rectangle2D.Double(0, 0,
				this.bladeLength, this.bladeLength * BLADE_ASPECT_RATIO);
		graphics2.setColor(this.color);
		graphics2.fill(blade);
		graphics2.setColor(BORDER_COLOR);
		graphics2.draw(blade);

		// Rotates the graphics area back so the next blade angle is zero-
		// based.  
		// NOTE: The drawn rectangle does not change its orientation as the graphics 
		// area is rotated back.
		graphics2.rotate(-angle);
	}

	/**
	 * Translates the fan by the given amount.
	 * 
	 * @param translateX
	 *            Amount to translate in the x direction
	 * @param translateY
	 *            Amount to translate in the y direction
	 */
	public void translate(double translateX, double translateY) {
		this.centerX += translateX;
		this.centerY += translateY;
	}

	/**
	 * Rotates the fan by the given number of degrees.
	 * 
	 * @param degreesToRotate
	 *            Number of degrees to rotate the fan (e.g. 180 to turn the fan
	 *            upside down)
	 */
	public void rotate(double degreesToRotate) {
		double radiansToRotate = Math.toRadians(degreesToRotate);
		this.angleInRadians += radiansToRotate;
	}

}
