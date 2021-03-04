package chessPieces;
import java.awt.Graphics2D;

public interface ChessPiece  {
	
	boolean checkMove(int dx, int dy);
	void draw(Graphics2D graphics2, int x, int y, int squareSize);

	boolean checkAttack(int dx, int dy, ChessPiece piece);
	
	boolean isWhite();
	boolean canJumpPieces();
}
