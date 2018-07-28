import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class RectContainer {
	
	private int highestX;
	private int lowestX;
	private int highestY;
	private int lowestY;
	
	public RectContainer() {
		highestX = 0;
		lowestX = 1000;
		highestY = 0;
		lowestY = 1000;
	}
	
	public void addRect(RedRect rect) {
		lowestX = Math.min(lowestX, rect.getX());
		lowestY = Math.min(lowestY, rect.getY());
		highestX = Math.max(highestX, rect.getX() + rect.getWidth());
		highestY = Math.max(highestY, rect.getY() + rect.getHeight());
	}
	
	public void draw(Graphics2D g2) {
		
		g2.drawRect(lowestX, lowestY, highestX - lowestX, highestY - lowestY);
	}
}
