import java.awt.Color;
import java.awt.Graphics2D;



/**
 * A class for drawing progress bars
 * 
 * You can feel free to change this class any way you wish
 * 
 * @author (your name here)
 *
 */
public class ProgressBar {
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int BORDER_WIDTH = 25;
	private static final int DEFAULT_HEIGHT = 100;
	private static final Color COMPLETED_COLOR = Color.BLUE;
	private static final Color BORDER_LINE_COLOR = Color.BLACK;
	
	/**
	 * Creates a progress bar with the default values
	 * Located at (0,0), width 300, height 100
	 */
	public ProgressBar() {
	}
	
	/**
	 * Set the percentage of progress that should be shown
	 * So setting it to 50 will make the bar half full
	 * 
	 * @param percentage (between 0 and 100)
	 */
	public void setPercentage(double percentage) {
		
	}

	
	/**
	 * Draws the progress bar on the given graphics object
	 * 
	 * @param g2
	 */
	public void drawOn(Graphics2D g2) {		

		// HINT FOR PART 3
		// Drawing a string fitted to a particular size is tricky...don't try to do it yourself
		// Instead, use the handy static function we've provided you in RectangleTextUtils
		// (check out the comments in that class to see the details)
		//
		// It takes coordinates similar to drawRect, and draws the given text in that rectangle.
		// It won't draw the text rotated through.  You'll have to handle that in a similar
		// way to what you've done in BiggestFan or Faces.		
		
	}
	

	


	
}
