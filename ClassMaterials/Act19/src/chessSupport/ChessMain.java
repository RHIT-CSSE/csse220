package chessSupport;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ChessMain {

	private static int HEIGHT_ADJUSTMENT = 47;
	private static int WIDTH_ADJUSTMENT = 18;
	private static int BUTTON_PANEL_SIZE = 35; 
	
	public static void main(String[] args) {
		int heightWidth = ChessBoard.NUM_SQUARES_PER_SIDE * ChessBoard.SQUARE_SIZE;
		
		JFrame frame = new JFrame();

		ChessBoard chessBoard = new ChessBoard();
		chessBoard.setBoard(new StandardBoardProvider());

        // For the source of the opera.txt and opera.csv files,
        // see https://en.wikipedia.org/wiki/Opera_Game, the position after move 12. 0-0-0 Rd8

        // TODO 1: Explore TxtFileBoardProvider
//        chessBoard.setBoard(new TxtFileBoardProvider("chessPositions/opera.txt"));

        // TODO 2: Explore CsvFileBoardProvider
//        chessBoard.setBoard(new CsvFileBoardProvider("chessPositions/opera.csv"));

        // Aside: There are also more advanced file formats for representing chess, such as PGN:
        // https://en.wikipedia.org/wiki/Portable_Game_Notation
		
		frame.add(chessBoard, BorderLayout.CENTER);

		frame.setSize(heightWidth + WIDTH_ADJUSTMENT, heightWidth+HEIGHT_ADJUSTMENT + BUTTON_PANEL_SIZE);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
