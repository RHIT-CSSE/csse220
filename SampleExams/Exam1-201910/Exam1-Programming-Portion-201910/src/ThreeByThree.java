import java.awt.Color;
import java.awt.Graphics2D;

public class ThreeByThree {

	private static final int DEFAULT_X = 0;
	private static final int DEFAULT_Y = 0;
	private static final Color DEFAULT_COLOR = Color.WHITE;
	private static final int SQUARE_WIDTH = 30;

	private int x, y;
	private Color[][] cellColors = new Color[3][3];
	
	/* feel free to modify this class and add fields and methods as you need */
	
	public ThreeByThree() {
		this.x = DEFAULT_X;
		this.y = DEFAULT_Y;
		for (int r=0; r < 3; r++ ) {
			for (int c=0; c < 3; c++ ) {
				this.cellColors[r][c] = DEFAULT_COLOR;
			}
		}
		
	}
	
	
	
	public ThreeByThree(int x, int y, Color backgroundColor) {
		this.x = x;
		this.y = y;
		for (int r=0; r < 3; r++ ) {
			for (int c=0; c < 3; c++ ) {
				this.cellColors[r][c] = backgroundColor;
			}
		}
	}

	public void drawOn(Graphics2D g) {
		// some example code that draws one box
		
		g = (Graphics2D)g.create();  ///nice trick to avoid having to 
		//untranslate and un rotate at the end
		
		//loop across rows and columns to draw each square
		for (int r=0; r < 3; r++ ) {
			
			for (int c=0; c < 3; c++ ) {
				g.translate( c*SQUARE_WIDTH,  r*SQUARE_WIDTH);
				g.setColor( this.cellColors[r][c] );
				g.fillRect( this.x, this.y, SQUARE_WIDTH, SQUARE_WIDTH);
				g.setColor( Color.BLACK);
				g.drawRect( this.x, this.y, SQUARE_WIDTH, SQUARE_WIDTH);
				g.translate( -c*SQUARE_WIDTH, -r*SQUARE_WIDTH);
			}
		}
	}


	public void setCellColor(int row, int col, Color color) {
		this.cellColors[row][col] = color;
	}

	public ThreeByThree copyTo(int x, int y) {
		ThreeByThree newThreeByThree = new ThreeByThree(x,y,Color.WHITE);
		for (int r=0; r < 3; r++ ) {
			for (int c=0; c < 3; c++ ) {
				newThreeByThree.cellColors[r][c] = this.cellColors[r][c];
			}
		}
		return newThreeByThree;
	}
		
}
