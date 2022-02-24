import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;


/**
 * 
 * Implements the fillTextRectangle function for your use
 * 
 * @author Buffalo
 *
 */
public class RectangleTextUtils {

	/*
	 * Draws a character at the given position
	 */
	public static void drawBoxedCharacter(int x, int y, char c, Graphics2D g2) {
		fillTextRectangle(x, y, 30, 45, c + "", g2);
	}
	
	/**
	 * 
	 * Draws text filling a rectangle on the graphics object
	 * 
	 * You shouldn't need to call this function
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
	private static void fillTextRectangle(int x, int y, int width, int height, String text, Graphics2D g2) {
		
		
		g2.drawRect((int)x,y, width, (int) height);

		// a tiny adjustment to make sure the text is within
		// the borders rather than writing over them		
		x = x + 2;
		y = y + 2;
		width = width - 4;
		height = height - 4;
		
		Font font = g2.getFont();
		FontRenderContext frc = g2.getFontRenderContext();
		TextLayout layout = new TextLayout(text, font, frc);
		Rectangle2D bounds = layout.getBounds();
		g2 = (Graphics2D) g2.create();
		
		g2.translate(x , y );

		g2.scale(width/bounds.getWidth(), height/bounds.getHeight());
		layout.draw(g2, (float)-bounds.getX(), (float)-bounds.getY());
		
		
	}	
}
