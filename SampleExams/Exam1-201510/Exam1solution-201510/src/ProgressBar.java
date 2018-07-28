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
	
	private double percentage;
	private int x, y, width, height;
	
	/**
	 * Creates a progress bar with the default values
	 * Located at (0,0), width 300, height 100
	 */
	public ProgressBar() {
		this.percentage = 0;
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
		this.x = 0;
		this.y = 0;
	}
	
	
	/**
	 * Creates a new progress bar
	 * 
	 * @param x upper left x coordinate
	 * @param y upper left y coordinate
	 * @param width width of bar (including border)
	 * @param height height of bar (including border)
	 */
	public ProgressBar(int x, int y, int width, int height) {
		this.percentage = 0;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	/**
	 * Set the percentage of progress that should be shown
	 * So setting it to 50 will make the bar half full
	 * 
	 * @param percentage (between 0 and 100)
	 */
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	
	/**
	 * Draws the progress bar on the given graphics object
	 * 
	 * @param g2
	 */
	public void drawOn(Graphics2D g2) {
		
		double barWidth = (this.width - BORDER_WIDTH*2);
		double completedWidth = barWidth*percentage/100;
		
		g2.setColor(BORDER_LINE_COLOR);
		g2.drawRect(this.x, this.y, this.width, this.height);
		
		g2.setColor(COMPLETED_COLOR);
		g2.fillRect(BORDER_WIDTH + x, BORDER_WIDTH + y, (int) completedWidth, this.height - BORDER_WIDTH*2);
		
		g2.translate(x + BORDER_WIDTH/2, y + this.height/2);
		
		g2.setColor(BORDER_LINE_COLOR);
		String text = this.percentage + "%";
		g2.rotate(Math.PI/2);
		RectangleTextUtils.fillTextRectangle(-this.height/2, -BORDER_WIDTH/2, this.height, BORDER_WIDTH,text,g2);
		g2.rotate(-Math.PI/2);
		g2.translate(-x - BORDER_WIDTH/2, -y - this.height/2);
		

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
