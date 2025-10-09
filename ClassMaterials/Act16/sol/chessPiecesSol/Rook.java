package chessPiecesSol;;

public class Rook extends ChessPiece {

	public Rook(boolean isWhite) {
		super(isWhite, "Rook");
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		//horizontal or vertical move, don't need to worry about case where 
		//both are zero because of ChessBoard check
		return dx == 0 || dy == 0;
	}	
}
