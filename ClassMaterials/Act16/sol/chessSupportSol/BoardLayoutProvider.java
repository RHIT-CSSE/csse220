package chessSupportSol;

import chessPiecesSol.ChessPiece;


public interface BoardLayoutProvider {

	ChessPiece[][] GetBoard();
	
	boolean isWhitesTurn();
}
