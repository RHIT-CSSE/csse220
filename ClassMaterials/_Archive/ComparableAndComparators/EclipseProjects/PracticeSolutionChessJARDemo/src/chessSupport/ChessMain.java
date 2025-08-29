package chessSupport;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessMain {

	private static int HEIGHT_ADJUSTMENT = 47;
	private static int WIDTH_ADJUSTMENT = 18;
	private static int BUTTON_PANEL_SIZE = 35; 
	
	public static void main(String[] args) {
		int heightWidth = ChessBoard.NUM_SQUARES_PER_SIDE * ChessBoard.SQUARE_SIZE;
		
		JFrame frame = new JFrame();

		ChessBoard chessBoard = new ChessBoard();
		chessBoard.setBoard(new StandardBoardProvider());
		
		frame.add(chessBoard, BorderLayout.CENTER);

		frame.setSize(heightWidth + WIDTH_ADJUSTMENT, heightWidth+HEIGHT_ADJUSTMENT + BUTTON_PANEL_SIZE);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
