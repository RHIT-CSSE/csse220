package chessPieces;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class King implements ChessPiece {
	private boolean isWhite;

	public King(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		return dx <= 1 && dy <= 1;
	}

	@Override
	public void draw(Graphics2D graphics2, int x, int y, int squareSize) {
		String fileName = "images/king" + "-";
		fileName += this.isWhite() ? "white" : "black";
		fileName += ".png";
		BufferedImage img;
		try {
			img = ImageIO.read(new File(fileName));
			graphics2.drawImage(img, x, y, squareSize, squareSize, null);
		} catch (IOException e) {}
	}

		
	
	@Override
	public boolean checkAttack(int dx, int dy, ChessPiece piece) {
		if (this.isWhite() == piece.isWhite()) {
			//don't attack your own pieces
			return false;
		}
		return checkMove(dx, dy);
	}

	@Override
	public boolean isWhite() {
		return this.isWhite;
	}

	@Override
	public boolean canJumpPieces() {
		return false;
	}
	
}
