package chessPieces;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;


//In student code this starts as an interface. The goal is to start implementing something like a King,
//which has fairly simple movement, then try a Bishop and note how much code is duplicated. Then show 
//pulling items into an abstract class.
public abstract class ChessPiece  {

	private boolean isWhite;
	protected boolean canJumpPieces = false;
	private String name;
	
	public ChessPiece(boolean isWhite, String name) {
		this.isWhite = isWhite;
		this.name = name;
	}
	
	public abstract boolean checkMove(int dx, int dy);
	
	public void draw(Graphics2D graphics2, int x, int y, int squareSize) {
		//String fileName = "images/" + name.toLowerCase() + "-";
		String fileName = "/images/" + name.toLowerCase() + "-";
		fileName += this.isWhite() ? "white" : "black";
		fileName += ".png";
		BufferedImage img;
		try {
			//img = ImageIO.read(new File(fileName));
			InputStream stream = getClass().getResourceAsStream(  fileName );
			img = ImageIO.read( stream );
			graphics2.drawImage(img, x, y, squareSize, squareSize, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean checkAttack(int dx, int dy, ChessPiece piece) {
		if (this.isWhite == piece.isWhite) {
			return false;
		}
		return this.checkMove(dx, dy);
	}
	
	public boolean isWhite() {
		return this.isWhite;
	}
	public boolean canJumpPieces() {
		return this.canJumpPieces;
	}
}
