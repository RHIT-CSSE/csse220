package chessPieces;

public class Bishop extends ChessPiece {

	public Bishop(boolean isWhite) {
		super(isWhite, "Bishop");
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		//diagonal move
		return dx == dy;
	}
}
