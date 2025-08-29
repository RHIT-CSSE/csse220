package chessSupport;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;

import chessPieces.ChessPiece;

public class ChessListener implements MouseListener {

	private ChessBoard board = null;
	
	public ChessListener(ChessBoard board) {
		this.board = board;
	}
	
	@Override
	public void mouseClicked(MouseEvent ev) {
		IntPoint selected = ChessBoard.getBoxFromCoordinates(
				new IntPoint(ev.getX(), ev.getY()));
		System.out.println("Clicked:" +selected.getX() + " " + selected.getY());
		ChessPiece selectedPiece = board.getPiece(selected);
		board.handleMove(selectedPiece, selected);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
}