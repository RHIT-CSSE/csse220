package chessCodeBeforeAbstractClass;
import java.awt.Graphics2D;

public interface ChessPiece  {
	
	boolean checkMove(int x, int y);
	void draw(Graphics2D graphics2, int x, int y, int squareSize);

	boolean checkAttack(int x, int y, ChessPiece piece);
	
	boolean isWhite();
	boolean canJumpPieces();
}
