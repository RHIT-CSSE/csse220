import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ByoLabel extends ByoComponent {

	private static final int FONT_SIZE = 20;
	protected static final Font FONT = new Font("Lucida Sans",Font.PLAIN, FONT_SIZE);
	
	private String text;
	
	public ByoLabel(String text) {
		this.text = text;
	}
		
	
	@Override
	public int getPreferredWidth() {
		FontMetrics metrics = new JLabel("").getFontMetrics(FONT);
		return SwingUtilities.computeStringWidth(metrics, text) + 4;
	}

	@Override
	public int getPreferredHeight() {
		return FONT_SIZE + 4;
	}

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
	protected static void fillTextRectangle(int x, int y, int width, int height, String text, Graphics2D g2) {
		
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
		g2.scale(-width/bounds.getWidth(), -height/bounds.getHeight());
		g2.translate(-x , -y );		
	}	

	
	@Override
	public void drawOn(Graphics2D g2) {
		g2.setFont(FONT);
		fillTextRectangle(2 + getX(), 2 + getY(), getWidth() - 4, getHeight() - 4, text, g2);
	}
	
	public String getText() {
		return text;
	}

}
