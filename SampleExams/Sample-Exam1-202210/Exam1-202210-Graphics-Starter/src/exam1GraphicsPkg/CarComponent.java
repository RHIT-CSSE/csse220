package exam1GraphicsPkg;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * Class: CarComponent extends JComponent
 * @author CSSE Faculty
 * <br>Purpose: To implement the paintComponent callback operation
 * <br>Restrictions: none
 * <br>For example: 
 * <pre>
 *    JComponent carComponent = new CarComponent();
 * </pre>
 */
public class CarComponent extends JComponent {
	private static final long serialVersionUID = 1L;

	/**
	 * ensures: creates and draws the objects required to solve the 3 parts of this app
	 * @param g - the graphics object for drawing
	 */
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.drawString("Part 1", 1, 20);
		g2.drawString("Part 2", 1, 200);
		g2.drawString("Part 3", 1, 400);
		
		// -----------
		// TODO Part 1
		// 
		// For this part, modify the Car class, add code to draw the remaining body part, windows, tires, and head light
		// -----------
		Car car1 = new Car();
		car1.drawOn(g2);

		

		// -----------
		// TODO Part 2
		//
		// Part 2A Add a 4-parameter constructor to the Car class that allows a client program to create a Car object with:
		//          (1) the car's color
		//			(2) a scaling factor
		//          (3) the car's xCenter coordinate
		//          (4) the car's yCenter coordinate
		//          (*) Part 2A might require you to add additional field(s) to the Car class
		//          (*) Make the default scaling factor equal to 1.0
		//
		// Part 2B 
		//			Modify the Car class's 'drawCar' method so that it draws the car taking into account the scaling factor
		//
		// Part 2C
		//			Just below, use this new constructor create and draw a 3 new Car objects
		//			blueCar: color = Color.BLUE, scaling factor = 1.25, with the car's center located at (150, 275) 
		//			orangeCar: color = Color.ORANGE, scaling factor = 0.75, with the car's center located at (400, 275) 
		//			orangeCar: color = Color.PINK, scaling factor = 0.25, with the car's center located at (550, 275) 
		// -----------

		// -----------------------
		// Place Part 2C code here
		// -----------------------
		

		
		

		// -----------
		// TODO Part 3
		//
		// Part 3A Modify the Car class to allow the client program to add a rotation factor
		//          (1) Add a setter method to the Car class to allow client program to set the car's rotation factor
		//			(2) Modify the 'drawCar'  method so that the car is rotated by this rotation factor
		//          (*) This rotation factor is in radians, e.g., 1/2 * Math.PI
		//			(*) Part 3A might require you to add additional field(s) to the Car class
		//          (*) Make the default rotation factor equal to zero
		//
		// Part 3B - Create and draw 9 cars - these cars will be in drawn in various flipped positions
		//			(1) Color = MAGENTA
		//			(2) Scaling factor = 0.50
		//			(2) 1st car with center at (100, 450), 2nd car at (200, 450), 3rd car at (300, 450), etc.
		//          (3) 1st car's rotation factor is 0.0, 2nd car's is 1/4 * PI, then 1/2 * PI, then 3/4 * PI, etc. 
		//          (*) All work for Part 3B should be done here in this file (unless this part reveals defects in your Car class methods)
		// -----------

		// ----------------------
		// Place Part 3 code here
		// ----------------------
		
	} // paintComponent
	
} // CarComponent
