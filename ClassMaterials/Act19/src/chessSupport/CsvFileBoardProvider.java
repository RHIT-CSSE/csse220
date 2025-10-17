package chessSupport;

import chessPieces.ChessPiece;
import chessPieces.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Provides a chess board layout by reading from a CSV file.
 * The first line is "Turn,W" or "Turn,B", indicating whose turn it is.
 * The next line is headers: "Piece,Color,File,Rank".
 * Each subsequent line represents a piece with the following columns:
 * - Piece: K (king), Q (queen), N (knight), B (bishop), R (rook), P (pawn)
 * - Color: W (white) or B (black)
 * - File: a-h (column)
 * - Rank: 1-8 (row)
 *
 * See chessPositions/opera.csv for an example.
 *
 * @author Ian Ludden
 */
public class CsvFileBoardProvider implements BoardLayoutProvider {

    private String fileName;
    private boolean isWhitesTurn = false;

    public CsvFileBoardProvider(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Convert a chess file character ('a'-'h') to a column index (0-7) using ASCII math.
     */
    private int fileCharToIndex(char fileChar) {
        return fileChar - 'a';
    }

    @Override
    public ChessPiece[][] GetBoard() {
        ChessPiece[][] board = new ChessPiece[ChessBoard.NUM_SQUARES_PER_SIDE][ChessBoard.NUM_SQUARES_PER_SIDE];

        File f = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            System.out.println(e.getMessage());
            // Basic error handling: return an empty board (all nulls)
            return board;
        }

        try {
            // First line indicates whose turn it is: "Turn,W" or "Turn,B"
            String turnLine = scanner.nextLine().trim();
            isWhitesTurn = turnLine.contains("W");

            // Second line is the header "Piece,Color,File,Rank", skip it
            scanner.nextLine();

            // Read each piece line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                // Split by comma: Piece,Color,File,Rank
                // Aside: the split method is very useful!
                // Alternatively, we could use a CSV parsing library for more complex cases
                String[] parts = line.split(",");
                if (parts.length < 4) {
                    System.err.println("Invalid line format (expected 4 fields): " + line);
                    continue;
                }

                // Standardize each part, so that we can support extra whitespace and case insensitivity
                char pieceChar = parts[0].trim().toUpperCase().charAt(0);
                char colorChar = parts[1].trim().toUpperCase().charAt(0);
                char fileChar = parts[2].trim().toLowerCase().charAt(0);
                int rank = Integer.parseInt(parts[3].trim());

                // Parse color
                boolean isWhite = (colorChar == 'W');

                // Parse file (row): 'a'-'h' -> 0-7
                int row = fileCharToIndex(fileChar);
                if (row < 0 || row >= ChessBoard.NUM_SQUARES_PER_SIDE) {
                    System.err.println("Invalid file character '" + fileChar + "' in line: " + line);
                    continue;
                }

                // Parse rank (column): 8, 7, 6, ..., 1 -> 0-7
                int col = ChessBoard.NUM_SQUARES_PER_SIDE - rank;
                if (col < 0 || col >= ChessBoard.NUM_SQUARES_PER_SIDE) {
                    System.out.println("Invalid rank " + rank + " in line: " + line);
                    continue;
                }

                // Create the piece based on the piece character
                ChessPiece piece = null;
                switch (pieceChar) {
                    case 'K' -> piece = new King(isWhite);
                    case 'Q' -> piece = new Queen(isWhite);
                    case 'N' -> piece = new Knight(isWhite);
                    case 'B' -> piece = new Bishop(isWhite);
                    case 'R' -> piece = new Rook(isWhite);
                    case 'P' -> piece = new Pawn(isWhite);
                    default -> {
                        System.err.println("Unknown piece character '" + pieceChar + "' in line: " + line);
                        continue;
                    }
                }

                // Place the piece on the board
                board[row][col] = piece;
            }
        } finally {
            scanner.close();
        }

        return board;
    }

    @Override
    public boolean isWhitesTurn() {
        return this.isWhitesTurn;
    }
}
