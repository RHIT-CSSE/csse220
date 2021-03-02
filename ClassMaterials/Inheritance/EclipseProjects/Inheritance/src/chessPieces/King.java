package chessPieces;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class King extends ChessPiece {
	

	public King(boolean isWhite) {
		super( isWhite );
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		return dx <= 1 && dy <= 1;
	}


	@Override
	public boolean canJumpPieces() {
		return false;
	}
	
}
