import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;


public class GoBoard {

	private final int CENTER_X = 200;
	private final int CENTER_Y = 200;
	private final int CELL_WIDTH = 30;
	
	private final int STONE_DIAMETER = 26;
	
	// should be an inner class but we
	// haven't covered that yet
	private ArrayList<Integer> stoneX;
	private ArrayList<Integer> stoneY;
	private ArrayList<Color> stoneColor;
	
	public GoBoard() {
		this.stoneX = new ArrayList<Integer>();
		this.stoneY = new ArrayList<Integer>();
		this.stoneColor = new ArrayList<Color>();
	}
	
	public void drawOn(Graphics2D g) {
		
		int overallWidth = (this.CELL_WIDTH*9)/2;
		
		for(int i = 0; i <= 4; i++) {
			int offset = i*this.CELL_WIDTH;
			g.drawLine(this.CENTER_X - overallWidth, this.CENTER_Y + offset, this.CENTER_X + overallWidth, this.CENTER_Y + offset);
			g.drawLine(this.CENTER_X - overallWidth, this.CENTER_Y - offset, this.CENTER_X + overallWidth, this.CENTER_Y - offset);
			g.drawLine(this.CENTER_X - offset, this.CENTER_Y - overallWidth, this.CENTER_X - offset, this.CENTER_Y + overallWidth);
			g.drawLine(this.CENTER_X + offset, this.CENTER_Y - overallWidth, this.CENTER_X + offset, this.CENTER_Y + overallWidth);
		}
		
		for(int i = 0; i < this.stoneX.size(); i++) {
			drawStone(g, this.stoneX.get(i), this.stoneY.get(i), this.stoneColor.get(i));
		}
		
		//drawStone(g, 0, 0, Color.black);
		//drawStone(g, -1, 1, Color.white);
	}
	
	private void drawStone(Graphics2D g, int x, int y, Color color) {
		int upperLeftX = this.CENTER_X - this.STONE_DIAMETER/2 + x * this.CELL_WIDTH;
		int upperLeftY = this.CENTER_Y - this.STONE_DIAMETER/2 + y * this.CELL_WIDTH;
		g.setColor(color);
		g.fillOval(upperLeftX, upperLeftY, this.STONE_DIAMETER, this.STONE_DIAMETER);
		g.setColor(Color.black);
	}
	
	/**
	 * This function adds a stone to the board at
	 * the specified coordinates.  0,0 adds a stone
	 * in the center.  0,2 adds a stone two below
	 * the center.
	 * 
	 * @param color - color of the stone to place
	 * @param x - in our go coordinate system
	 * @param y - in our go coordinate system
	 */
	public void placeStone(Color color, int x, int y) {
		this.stoneX.add(x);
		this.stoneY.add(y);
		this.stoneColor.add(color);
	}
}
