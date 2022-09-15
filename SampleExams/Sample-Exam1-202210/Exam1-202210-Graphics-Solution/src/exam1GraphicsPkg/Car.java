package exam1GraphicsPkg;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;

/**
 * Class: Car
 * @author CSSE Faculty
 * <br>Purpose: To store car information (i.e., color, rotation, and coordinates) and to draw the car
 * <br>Restrictions: none
 * <br>For example: 
 * <pre>
 *    Car car1 = new Car();
 * </pre>
 */
public class Car {

	// ------
	// CONSTANTS
	// ------

	// ------
	// Default values for Car
	// ------
	private static final int DEFAULT_X_CENTER_OF_CAR = 90;
	private static final int DEFAULT_Y_CENTER_OF_CAR = 70;
	private static final Color DEFAULT_TIRE_COLOR = Color.BLACK;
	private static final Color DEFAULT_WINDOW_COLOR = Color.GRAY;
	private static final Color DEFAULT_HEAD_LIGHT_COLOR = Color.YELLOW;

	// ------
	// TODO: Add instance variables as needed
	// ------
	private Color carColor;
	private double rotationFactor;
	private double scaleFactor;
	private int xCenterOfCar;
	private int yCenterOfCar;

	// ------
	// TODO Part 2A: Add 4-parameter constructor
	// ------
	/**
	 * ensures: all instance variables are initialized
	 */
	public Car() {
		this.carColor = Color.RED;
		this.rotationFactor = 0.0;
		this.scaleFactor = 1.0;
		this.xCenterOfCar = DEFAULT_X_CENTER_OF_CAR;
		this.yCenterOfCar = DEFAULT_Y_CENTER_OF_CAR;
	} // Car

	public Car(Color carColor, double scaleFactor, int xCenerOfCar, int yCenterOfCar) {
		this.carColor = carColor;
		this.scaleFactor = scaleFactor;
		this.xCenterOfCar = xCenerOfCar;
		this.yCenterOfCar = yCenterOfCar;
	} // Car
	
	private int scaled(int k) {
		return (int) (k * this.scaleFactor);
	} // scaled

	/**
	 * ensures: shape drawn at (xLoc, yLoc) with fillColor
	 * 
	 * This operation is not given to students, it is used here to draw all shapes except Body Part 1
	 */
	private void fillRectangularShape(Graphics2D g2, RectangularShape r, int xLoc, int yLoc, Color fillColor) {
		Color incomingColor = g2.getColor();
		g2.setColor(fillColor);
		g2.translate(xLoc, yLoc);
		g2.fill(r);
		g2.translate(-xLoc, -yLoc);
		g2.setColor(incomingColor);
	} // fillRectangle

	/**
	 * ensures: Body Part 1 is drawn with respect to the car's center coordinates 
	 * @param g2
	 * 
	 * This operation is provided as an example for students.
	 */
	private void drawBodyPart1(Graphics2D g2) {
		// Declare constants used to create and draw body part 1
		final int widthOfCarBodyPart1 = scaled(180);
		final int heighOfCarBodyPart1 = scaled(70);
		// Set Body Part 1's (x, y) translation offsets from car's center
		final int xOffsetCarBodyPart1 = scaled(-90); // i.e., 90 units to the left of the center
		final int yOffsetCarBodyPart1 = scaled(-20); // i.e., 20 units above the center
		// Set the (width, height) arc width for rounded corners of RoundRectangle2D
		final int roundingArcWidth = 10;
		final int roundingArcHeight = 10;

		// Create body part 1
		RoundRectangle2D carBodyP1 = new RoundRectangle2D.Double(0, 0, widthOfCarBodyPart1, heighOfCarBodyPart1, roundingArcWidth, roundingArcHeight);

		// Draw body part 1
		Color incomingColor = g2.getColor();
		g2.setColor(this.carColor);
		g2.translate(xOffsetCarBodyPart1, yOffsetCarBodyPart1);
		g2.fill(carBodyP1);
		g2.translate(-xOffsetCarBodyPart1, -yOffsetCarBodyPart1);
		g2.setColor(incomingColor);
	} // drawBodyPart1
	
	
	public void setRotationFactor(double rotationFactor) {
		this.rotationFactor = rotationFactor;
	} // end setRotationFactor


	/**
	 * ensures: entire car (body parts, windows, wheels, and head light) are created
	 * and drawn
	 * 
	 * @param g2
	 */
	private void drawCar(Graphics2D g2) {
		// ------
		// Provided code does the following
		// 1) Translate g2's origin to the car object's center which is at (this.xCenterOfBoundingRect, this.yCenterOfBoundingRect)
		// 2) Draw car's Body Part 1
		// 3) Untranslate g2's origin from the car's center
		// ------

		// Translate g2's origin to car's center
		g2.translate(this.xCenterOfCar, this.yCenterOfCar);
		g2.rotate(this.rotationFactor);

		// ===============
		// Draw Car Body Part 1
		// Does this drawing with respect to car's center
		// This has been done for you as an example
		// ===============
		drawBodyPart1(g2);

		// ==================================================================================
		// TODO: Part 1A
		// ==================================================================================
		// Draw Car Body Part 2
		// Use a Rectangle2D (not rounded)
		// Use method 'drawBodyPart1' method as an example
		// See how 'drawBodyPart1' declares constant variables to hold specific number values
		//   Follow this pattern when you have specific number values in your code
		// ==================================================================================
		final int heighOfCarBodyPart2 = scaled(50);
		final int widthOfCarBodyPart2 = scaled(100);
		final int xOffsetCarBodyPart2 = scaled(-50);
		final int yOffsetCarBodyPart2 = scaled(-70);
		Rectangle2D carBodyP2 = new Rectangle2D.Double(0, 0, widthOfCarBodyPart2, heighOfCarBodyPart2);
		fillRectangularShape(g2, carBodyP2, xOffsetCarBodyPart2, yOffsetCarBodyPart2, this.carColor);

		// ==========================================================
		// TODO: Part 1B
		// ==========================================================
		// Draw Car Windows - front and rear
		// Use a Rectangle2D (not rounded)
		// Use DEFAULT_WINDOW_COLOR declared at the top of this class
		// ==========================================================

		final int widthFrontWindow = scaled(40);
		final int widthRearWindow = scaled(30);
		final int heightWindow = scaled(30);
		final int xOffsetFrontWindow = scaled(0);
		final int yOffsetFrontWindow = scaled(-60);
		final int xOffsetRearWindow = scaled(-40);
		final int yOffsetRearWindow = scaled(-60);

		Rectangle2D frontWindow = new Rectangle2D.Double(0, 0, widthFrontWindow, heightWindow);
		fillRectangularShape(g2, frontWindow, xOffsetFrontWindow, yOffsetFrontWindow, Car.DEFAULT_WINDOW_COLOR);
		Rectangle2D rearWindow = new Rectangle2D.Double(0, 0, widthRearWindow, heightWindow);
		fillRectangularShape(g2, rearWindow, xOffsetRearWindow, yOffsetRearWindow, Car.DEFAULT_WINDOW_COLOR);

		// ========================================================
		// TODO: Part 1C
		// ========================================================
		// Draw Car Tires - front and rear
		// Use a Ellipse2D 
		// Use DEFAULT_TIRE_COLOR declared at the top of this class
		// ========================================================
		final int widthTire = scaled(40);
		final int heightTire = scaled(40);
		final int xOffsetFrontTire = scaled(40);
		final int yOffsetFrontTire = scaled(30);
		final int xOffsetRearTire = scaled(-70);
		final int yOffsetRearTire = scaled(30);

		Ellipse2D tire = new Ellipse2D.Double(0, 0, widthTire, heightTire);
		fillRectangularShape(g2, tire, xOffsetFrontTire, yOffsetFrontTire, Car.DEFAULT_TIRE_COLOR);
		fillRectangularShape(g2, tire, xOffsetRearTire, yOffsetRearTire, Car.DEFAULT_TIRE_COLOR);

		// ==============================================================
		// TODO: Part 1D
		// ==============================================================
		// Draw Car Head light
		// Use a Ellipse2D 
		// Use DEFAULT_HEAD_LIGHT_COLOR declared at the top of this class
		// ==============================================================
		final int widthHeadLight = scaled(10);
		final int heightHeadLight = scaled(20);
		final int xOffsetHeadLight = scaled(80);
		final int yOffsetHeadLight = scaled(-10);

		Ellipse2D headLight = new Ellipse2D.Double(0, 0, widthHeadLight, heightHeadLight);
		fillRectangularShape(g2, headLight, xOffsetHeadLight, yOffsetHeadLight, Car.DEFAULT_HEAD_LIGHT_COLOR);

		// Translate g2's origin to back to its original location
		g2.rotate(-this.rotationFactor);
		g2.translate(-this.xCenterOfCar, -this.yCenterOfCar);
	} // drawCar

	/**
	 * ensures: drawCar is called
	 * 
	 * @param g2
	 */
	public void drawOn(Graphics2D g2) {
		// It is good practice to name the primary public draw operation 'drawOn'
		// then have this operation call internal (private) methods to draw the various
		// items from the scene
		// In this problem, we are only drawing the car
		drawCar(g2);
	} // drawOn
	

	@Override
	public String toString() {
		return "Car [carColor=" + carColor + ", rotationFactor=" + rotationFactor + ", scaleFactor=" + scaleFactor
				+ ", xCenerOfCar=" + xCenterOfCar + ", yCenterOfCar=" + yCenterOfCar + "]";
	}

}
