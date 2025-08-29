package chessSupport;

import chessPieces.ChessPiece;


public interface BoardLayoutProvider {

	ChessPiece[][] GetBoard();
	
	boolean isWhitesTurn();
}
