import java.awt.Color;
import java.awt.Graphics2D;

public class ThreeByThree {

	private static final int SQUARE_WIDTH = 30;

	/* feel free to modify this class and add fields and methods as you need */
	
	
	public void drawOn(Graphics2D g) {
		// some example code that draws one box
		
		g.setColor(Color.WHITE);
		g.fillRect(30, 30, SQUARE_WIDTH, SQUARE_WIDTH);
		g.setColor(Color.BLACK);
		g.drawRect(30, 30, SQUARE_WIDTH, SQUARE_WIDTH);
	}
		
}
