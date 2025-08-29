package chessPieces;

public class Knight extends ChessPiece {

	public Knight(boolean isWhite) {
		super(isWhite, "Knight");
		this.canJumpPieces = true; 
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		return ((dx == 1 && dy == 2) || (dx == 2 && dy == 1)); 
	}	
}
