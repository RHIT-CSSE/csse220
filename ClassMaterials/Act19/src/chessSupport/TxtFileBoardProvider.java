package chessSupport;

import chessPieces.ChessPiece;
import chessPieces.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Provides a chess board layout by reading from a text file.
 * The first line of the text file indicates whose turn it is (e.g., "W" for White's turn, "B" for Black's turn).
 * Each of the next eight lines contains eight characters indicating the piece present on each square, according to the following encoding:
 * - K is king
 * - Q is queen
 * - N is knight
 * - B is bishop
 * - R is rook
 * - P is pawn
 * - . is empty
 * - Uppercase indicates white, lowercase indicates black
 *
 * See chessPositions/opera.txt for an example.
 *
 * @author Ian Ludden
 */
public class TxtFileBoardProvider implements BoardLayoutProvider {

    private String fileName;
    private boolean isWhitesTurn = false;

    public TxtFileBoardProvider(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ChessPiece[][] GetBoard() {
        ChessPiece[][] board = new ChessPiece[ChessBoard.NUM_SQUARES_PER_SIDE][ChessBoard.NUM_SQUARES_PER_SIDE];

        File f = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            System.err.println(e.getMessage());
            // Basic error handling: return an empty board (all nulls)
            return board;
        }

        try {
            // First line indicates whose turn it is
            String first = scanner.nextLine().trim().toUpperCase();
            isWhitesTurn = first.equalsIgnoreCase("W");

            // Read the next NUM_SQUARES_PER_SIDE lines, one per board row
            for (int row = 0; row < ChessBoard.NUM_SQUARES_PER_SIDE; row++) {
                if (!scanner.hasNextLine()) {
                    System.err.println("Unexpected end of file while reading board at row " + row);
                    break;
                }
                // Retrieve each of the lines representing a row on the board
                String line = scanner.nextLine();
                for (int col = 0; col < ChessBoard.NUM_SQUARES_PER_SIDE; col++) {
                    // Invert row and col to match the ChessBoard class coordinate system
                    int boardRow = col;
                    int boardCol = row;

                    // Aside: We do not check for line length here; if it's too short, we'll get an exception (how could we handle it better?)

                    char currentChar = line.charAt(col);
                    if (currentChar == '.') {
                        board[boardRow][boardCol] = null;
                        continue;
                    }
                    boolean isWhite = Character.isUpperCase(currentChar);
                    char lower = Character.toLowerCase(currentChar);
                    ChessPiece piece = null;
                    switch (lower) {
                        case 'k' -> piece = new King(isWhite);
                        case 'q' -> piece = new Queen(isWhite);
                        case 'n' -> piece = new Knight(isWhite);
                        case 'b' -> piece = new Bishop(isWhite);
                        case 'r' -> piece = new Rook(isWhite);
                        case 'p' -> piece = new Pawn(isWhite);
                        default ->
                            // Unknown character: leave null and warn
                            // Aside: This uses System.err to print to the error output stream, which by default will show as red text in many consoles
                                System.err.println("Unknown piece character '" + currentChar + "' at row " + row + ", col " + col + " in file " + fileName);
                    }
                    board[boardRow][boardCol] = piece;
                }
            }
        } finally {
            // Always close the scanner to avoid resource leaks!
            // For a fancier approach, look into Java's try-with-resources feature:
            // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
            scanner.close();
        }

        return board;
    }

    @Override
    public boolean isWhitesTurn() {
        return isWhitesTurn;
    }
}
