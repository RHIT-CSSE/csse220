package chessSupport;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import chessPieces.ChessPiece;


@SuppressWarnings("serial")
public class ChessBoard extends JComponent {

	public static int NUM_SQUARES_PER_SIDE = 8;
	public static final int SQUARE_SIZE = 64;
	
	private boolean isWhitesTurn = true;
	
	private IntPoint highlightedSquare = null;
	
	
	public ChessPiece[][] chessBoard = null;
	
	public ChessBoard() {
		this.addMouseListener(new ChessListener(this));		
	}
	
	public void setBoard(BoardLayoutProvider boardLayout) {
		chessBoard = boardLayout.GetBoard();
		isWhitesTurn = boardLayout.isWhitesTurn();
		this.highlightedSquare = null;
		this.repaint();
	}
	
	public static IntPoint getBoxFromCoordinates(IntPoint location) {
		return new IntPoint((int)(location.getX()/ChessBoard.SQUARE_SIZE), 
				(int)(location.getY()/ChessBoard.SQUARE_SIZE));
	}
	
	public static IntPoint getCoordinatesFromBox(IntPoint location) {
		return new IntPoint(location.getX()*ChessBoard.SQUARE_SIZE, 
				location.getY()*ChessBoard.SQUARE_SIZE);
	}
	

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		if (chessBoard == null) {
			g2.setFont(new Font("Times New Roman", Font.PLAIN, 36));
			g2.drawString("Select a board above.", 50, this.getHeight()/2);
			return;
		}
		
		boolean isWhite = true;
		int x = 0;
		int y = 0;
		for (int j=0;j<NUM_SQUARES_PER_SIDE;j++) {
			for (int i=0;i<NUM_SQUARES_PER_SIDE;i++) {
				if (isWhite) {
					g2.setColor(Color.LIGHT_GRAY);
				}
				else {
					g2.setColor(Color.DARK_GRAY);
				}
				g2.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
				
				if (chessBoard[i][j]!=null) {
					chessBoard[i][j].draw(g2, x, y, SQUARE_SIZE);
				}
				isWhite = !isWhite;
				x += SQUARE_SIZE;
			}
			isWhite = !isWhite;
			y += SQUARE_SIZE;
			x = 0;
		}
		if (highlightedSquare!=null) {
			g2.setColor(Color.CYAN);
			g2.setStroke(new BasicStroke(3));
			g2.drawRect((int)highlightedSquare.getX()*SQUARE_SIZE, (int)highlightedSquare.getY()*SQUARE_SIZE, 
					SQUARE_SIZE, SQUARE_SIZE);
		}
	}

	public ChessPiece getPiece(IntPoint point) {
		return chessBoard[(int)point.getX()][(int)point.getY()];
	}
	
	public void handleMove(ChessPiece selectedPiece, IntPoint selected) {
		
		if (highlightedSquare==null) {
			//highlight the clicked square if it matches the correct piece color
			if (selectedPiece != null && this.isWhitesTurn == selectedPiece.isWhite()) {
				highlightedSquare = selected;
			}
		}
		else {
			makeMove(selectedPiece, selected);
		}
		this.repaint();
	}

	private void makeMove(ChessPiece selectedPiece, IntPoint selected) {
		if (highlightedSquare.getX() == selected.getX() && 
			highlightedSquare.getY() == selected.getY()) {
			//User selected the same square, de-select highlighted square 
			highlightedSquare = null;
		}
		else {
			//check the move and move the piece if needed
			ChessPiece pieceToMove = this.getPiece(highlightedSquare);
			boolean canMove = pieceToMove.canJumpPieces() || !piecesInPath(highlightedSquare, selected);
			int dx = (int)(highlightedSquare.getX() - selected.getX());
			int dy = (int)(highlightedSquare.getY() - selected.getY());
			if (dx == 0 && dy == 0) {
				highlightedSquare = null;
				return;
			}
			canMove = canMove && !(dx==0 && dy==0);
			if (canMove) {
				if (selectedPiece == null) {
					canMove = canMove && pieceToMove.checkMove(dx, dy);
				}
				else {
					canMove = canMove && pieceToMove.checkAttack(dx,  dy, selectedPiece);
				}
			}
			if (canMove) {
				chessBoard[(int)selected.getX()][(int)selected.getY()] = pieceToMove;
				chessBoard[(int)highlightedSquare.getX()][(int)highlightedSquare.getY()]=null;
				highlightedSquare = null;
				isWhitesTurn  = !isWhitesTurn;
			}
		}
	}

	private boolean piecesInPath(IntPoint highlightedSquare, IntPoint selected) {
		int startX = (int)highlightedSquare.getX();
		int startY = (int)highlightedSquare.getY();
		int endX = (int)selected.getX();
		int endY = (int)selected.getY();
		boolean incX = startX != endX;
		boolean incY = startY != endY;
		int dx = Math.abs(endX - startX);
		int dy = Math.abs(endY - startY);
		if (!(dx == 0 || dy == 0) && dx != dy) {
			return true;
		}
		int run = incX ? Math.abs(endX - startX)/(endX-startX) : 0; 
		int rise = incY ? Math.abs(endY - startY)/(endY-startY) : 0;
		
		int curX = startX + run;
		int curY = startY + rise;
		while (curY != endY || curX != endX) {
			if (chessBoard[curX][curY]!=null) {
				return true;
			}
			curX += run;
			curY += rise;
		}
		return false;
	}	
	
	@Override
	public Dimension getMinimumSize() {
		return new Dimension(SQUARE_SIZE*NUM_SQUARES_PER_SIDE, SQUARE_SIZE*NUM_SQUARES_PER_SIDE);
	}
}


