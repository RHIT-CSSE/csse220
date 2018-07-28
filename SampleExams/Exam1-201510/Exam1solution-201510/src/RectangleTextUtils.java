import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


/**
 * 
 * Implements the fillTextRectangle function for your use
 * 
 * @author Buffalo
 *
 */
public class RectangleTextUtils {

	/**
	 * 
	 * Draws text filling a rectangle on the graphics object
	 * 
	 * Note that drawing text to a specific size can sometimes by approximate
	 * Don't worry if it is off by a pixel or two
	 * 
	 * @param x - x coordinate of the upper left hand corner of the text
	 * @param y - y coordinate of the upper left hand corner of the text
	 * @param width - width of the text in pixels
	 * @param height - height of the text in pixels
	 * @param text - the text to write
	 * @param g2 - the graphics object to draw on
	 */
	public static void fillTextRectangle(int x, int y, int width, int height, String text, Graphics2D g2) {
		
		// a tiny adjustment to make sure the text is within
		// the borders rather than writing over them
		x = x + 2;
		y = y + 2;
		width = width - 4;
		height = height - 4;
		
		g2.translate(x + width/2, y + height/2);
		double textWidth = getTextWidth(text, g2);
		double textHeight = getTextHeight(text, g2);
		
		g2.scale(width/textWidth, height/textHeight);
		//g2.drawRect((int)-textWidth/2, (int)-textHeight/2, (int) textWidth, (int) textHeight);
		g2.drawString(text, (float) -textWidth/2, (float) textHeight/2);
		g2.scale(textWidth/width, textHeight/height);
		g2.translate(-x - width/2, - y - height/2);
		
	}
	
	/**
	 * 
	 * Returns how many pixels wide a string would be
	 * 
	 * You shouldn't need to call this function
	 * 
	 * @param text string to get height of
	 * @param g2 graphics object on which the string would be drawn
	 * @return width in pixels
	 */
	private static int getTextWidth(String text, Graphics2D g2) {
		Rectangle2D bounds = g2.getFont().getStringBounds(text, g2.getFontRenderContext());
		return (int) (bounds.getWidth());
	}
	
	/**
	 * 
	 * Returns how many pixels high a string would be
	 * 
	 * You shouldn't need to call this function
	 * 
	 * @param text string to get height of
	 * @param g2 graphics object on which the string would be drawn
	 * @return height in pixels
	 */
	private static int getTextHeight(String text, Graphics2D g2) {
		Rectangle2D bounds = g2.getFont().getStringBounds(text, g2.getFontRenderContext());
		return (int) (bounds.getHeight()/2);
	}	
	
}
