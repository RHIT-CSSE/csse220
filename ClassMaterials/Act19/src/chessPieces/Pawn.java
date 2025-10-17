package chessPieces;

public class Pawn extends ChessPiece {

	private boolean hasMoved;
	
	public Pawn(boolean isWhite) {
		super(isWhite, "Pawn");
	}
	
	private boolean movedCorrectDirection(int dy) {
		if (this.isWhite()) {
			return dy > 0;
		}
		return dy < 0;
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		if (!movedCorrectDirection(dy)) {
			return false;
		}
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		if (dx>0) {
			return false;
		}
		if (dy == 1) {
			this.hasMoved = true;
			return true;
		}
		
		if (!hasMoved && dy == 2) {
			hasMoved = true;
			return true;
		}
		return false;
	}
	
	@Override 
	public boolean checkAttack(int dx, int dy, ChessPiece piece) {
		if (this.isWhite() == piece.isWhite()) {
			return false;
		}
		if (!movedCorrectDirection(dy)) {
			return false;
		}
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		return dx == 1 && dy == 1;
	}
	
	/**
	 * This method is to be used for additional scenarios to indicate that a Pawn has already moved.
	 */
	public void setHasMovedTrue() {
		this.hasMoved = true;
	}
}
