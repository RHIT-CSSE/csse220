package chessPieces;

public class Queen extends ChessPiece {

	public Queen(boolean isWhite) {
		super(isWhite, "Queen");
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		if (dx == 0 || dy == 0) {
			//horizontal or vertical move
			return true;
		}
		//diagonal move
		return dx == dy;
	}
}
