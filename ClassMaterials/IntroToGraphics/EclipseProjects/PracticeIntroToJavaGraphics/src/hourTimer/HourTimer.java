package hourTimer;
import java.awt.Graphics2D;


/**
 * Represents a circular clock with a single hand--a minute hand.
 *
 * @author TODO <PUT_YOUR_NAME_HERE>.
 *         Created Dec 18, 2013.
 */
public class HourTimer {
	public static final int DEFAULT_RADIUS = 300;
	public static final int DEFAULT_CENTER_X = 300;
	public static final int DEFAULT_CENTER_Y = 300;
	public static final double RATIO_OF_HAND_LENGTH_TO_RADIUS = .9;
	public static final double RATIO_OF_HAND_WIDTH_TO_RADIUS = .1;
	
	
	// =======
	// Stage #1.1
	// Declare private fields that store:
	//   -- the (x, y) location of the clock face
	//   -- the radius of the clock face
	//   -- a rotation factor that tells where to draw the minute hand
	// ======
	
	// =======
	// Stage #1.2
	// Implement a zero parameter constructor that initializes the 4 fields declared in Stage #1.1
	// Use the first 3 DEFAULT values (above) and zero for the rotation factor
	// =======
	
	

	// =======
	// Stage #2.1
	// Implement the 3-parameter constructor required by Stage #2
	// One way to do this is to go back to HourTimerComponent.java and hover over the call to the 3-parameter constructor
	// When Eclipse pops up a dialog, choose the 'create' option
	// =======
	
	//
	// ****************************************************************************************
	//
	

	// =======
	// Stage #1.3
	// Implement the drawOn method (below)
	// =======
	
	/**
	 * ensures: when called by paintComponent, this draws the hour timer
	 * 
	 * @param g2d the graphics object to draw on
	 */
	public void drawOn(Graphics2D g2d) {
		// 1st translate using clockface's (x, y) coordinates
		// 2nd rotate for minute hand using rotation factor
		// 3rd use g2d.drawOval - centered on (x, y) coordinates
		// 4th draw minute hand
		// 5th unrotate
		// 6th untranslate
	} // drawOn


	//
	// ****************************************************************************************
	//
	
	// =======
	// Stage #3.1
	// Implement the setTime method (below)
	// =======

	/**
	 * ensures: sets the minute hand of the clock
	 * <br>At 0/60 puts the hand facing upwards (north)
	 * <br>At 30 puts the hand facing south 
	 * 
	 * @param minutes the number of minutes to represent with rotation
	 */
	public void setTime(double minutes) {

	} // setTime
	
}
