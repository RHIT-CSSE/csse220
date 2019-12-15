import java.awt.Color;
import java.awt.Graphics2D;

public class ThreeByThree {

	private static final int SQUARE_WIDTH = 30;

	private int x;
	private int y;
	private Color color;
	private Color[][] cellColor;
	
	public ThreeByThree() {
		x = 0;
		y = 0;
		color = Color.WHITE;
		cellColor = new Color[3][3];
	}
	
	public ThreeByThree(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
		cellColor = new Color[3][3];
	}
	
	public void drawOn(Graphics2D g) {
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				g.setColor(color);
				if(cellColor[r][c] != null) {
					g.setColor(cellColor[r][c]);
				}
				g.fillRect(c*SQUARE_WIDTH + x, r*SQUARE_WIDTH + y, SQUARE_WIDTH, SQUARE_WIDTH);
				g.setColor(Color.BLACK);
				g.drawRect(c*SQUARE_WIDTH + x, r*SQUARE_WIDTH + y, SQUARE_WIDTH, SQUARE_WIDTH);
			}
		}
	}
	
	public void setCellColor(int row, int col, Color color) {
		cellColor[row][col] = color;
	}

	public ThreeByThree copyTo(int x, int y) {
		ThreeByThree result = new ThreeByThree();
		result.color = color;
		result.cellColor = new Color[3][3];
		result.x = x;
		result.y = y;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				result.cellColor[r][c] = cellColor[r][c];
			}
		}
		return result;
	}
	
}
