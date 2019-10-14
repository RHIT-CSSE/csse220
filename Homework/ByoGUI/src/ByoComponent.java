import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class ByoComponent {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public abstract int getPreferredWidth();
	public abstract int getPreferredHeight();
	public abstract void drawOn(Graphics2D g2);
	
	public void setPosition(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public boolean containsPoint(Point p) {
		Rectangle rect = new Rectangle(x, y, width, height);
		return rect.contains(p);
	}
	
	/**
	 *  By default this does nothing, but you can add your own version 
	 *  if you want your component to respond to mouse events
	 **/
	public void acceptClick(Point p) {
		
	}
}
