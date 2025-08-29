package chessSupport;
import chessPieces.*;

public class StandardBoardProvider implements BoardLayoutProvider {
	
	@Override
	public ChessPiece[][] GetBoard() {
		ChessPiece[][] chessBoard = new ChessPiece[ChessBoard.NUM_SQUARES_PER_SIDE][ChessBoard.NUM_SQUARES_PER_SIDE];
//		chessBoard[0][0] = new Rook(false);
//		chessBoard[1][0] = new Knight(false);
//		chessBoard[2][0] = new Bishop(false);
//		chessBoard[3][0] = new Queen(false);
//		chessBoard[4][0] = new King(false);
//		chessBoard[5][0] = new Bishop(false);
//		chessBoard[6][0] = new Knight(false);
//		chessBoard[7][0] = new Rook(false);
//		
//		chessBoard[0][1] = new Pawn(false);
//		chessBoard[1][1] = new Pawn(false);
//		chessBoard[2][1] = new Pawn(false);
//		chessBoard[3][1] = new Pawn(false);
//		chessBoard[4][1] = new Pawn(false);
//		chessBoard[5][1] = new Pawn(false);
//		chessBoard[6][1] = new Pawn(false);
//		chessBoard[7][1] = new Pawn(false);
//		
//		chessBoard[0][6] = new Pawn(true);
//		chessBoard[1][6] = new Pawn(true);
//		chessBoard[2][6] = new Pawn(true);
//		chessBoard[3][6] = new Pawn(true);
//		chessBoard[4][6] = new Pawn(true);
//		chessBoard[5][6] = new Pawn(true);
//		chessBoard[6][6] = new Pawn(true);
//		chessBoard[7][6] = new Pawn(true);
//
//		chessBoard[0][7] = new Rook(true);
//		chessBoard[1][7] = new Knight(true);
//		chessBoard[2][7] = new Bishop(true);
//		chessBoard[3][7] = new Queen(true);
//		chessBoard[4][7] = new King(true);
//		chessBoard[5][7] = new Bishop(true);
//		chessBoard[6][7] = new Knight(true);
//		chessBoard[7][7] = new Rook(true);
		return chessBoard;
	}

	@Override
	public boolean isWhitesTurn() {
		return true;
	}

}
