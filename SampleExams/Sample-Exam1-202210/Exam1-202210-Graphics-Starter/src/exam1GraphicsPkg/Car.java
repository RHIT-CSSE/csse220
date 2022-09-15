package exam1GraphicsPkg;
import java.awt.Color;
import java.awt.Graphics2D;
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
	// CONSTANTS and fields
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
	// TODO: Add fields as needed
	// ------
	private Color carColor;
	private int xCenterOfCar;
	private int yCenterOfCar;

	//
	//*****************************************************************************************
	//

	/**
	 * ensures: all instance variables are initialized
	 */
	public Car() {
		this.carColor = Color.RED;
		this.xCenterOfCar = DEFAULT_X_CENTER_OF_CAR;
		this.yCenterOfCar = DEFAULT_Y_CENTER_OF_CAR;
	} // Car

	// ------
	// TODO Part 2: Add 4-parameter constructor here
	// ------


	//
	//*****************************************************************************************
	//
	
	/**
	 * ensures: Body Part 1 is drawn with respect to the car's center coordinates 
	 * @param g2
	 * 
	 * This operation is provided as an example for students.
	 */
	private void drawBodyPart1(Graphics2D g2) {
		// Declare constants used to create and draw body part 1
		final int widthOfCarBodyPart1 = 180;
		final int heighOfCarBodyPart1 = 70;
		// Set Body Part 1's (x, y) translation offsets from car's center
		final int xOffsetCarBodyPart1 = -90; // i.e., 90 units to the left of the center
		final int yOffsetCarBodyPart1 = -20; // i.e., 20 units above the center
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
	
	//
	//*****************************************************************************************
	//

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

		
		
		
		
		// ==========================================================
		// TODO: Part 1B
		// ==========================================================
		// Draw Car Windows - front and rear
		// Use a Rectangle2D (not rounded)
		// Use DEFAULT_WINDOW_COLOR declared at the top of this class
		// ==========================================================

		
		
		
		
		
		// ========================================================
		// TODO: Part 1C
		// ========================================================
		// Draw Car Tires - front and rear
		// Use a Ellipse2D 
		// Use DEFAULT_TIRE_COLOR declared at the top of this class
		// ========================================================

		
		
		
		
		
		
		// ==============================================================
		// TODO: Part 1D
		// ==============================================================
		// Draw Car Head light
		// Use a Ellipse2D 
		// Use DEFAULT_HEAD_LIGHT_COLOR declared at the top of this class
		// ==============================================================

		
		
		
		
		// Translate g2's origin to back to its original location
		g2.translate(-this.xCenterOfCar, -this.yCenterOfCar);
	} // drawCar
	
	//
	//*****************************************************************************************
	//

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

} // end class Car
