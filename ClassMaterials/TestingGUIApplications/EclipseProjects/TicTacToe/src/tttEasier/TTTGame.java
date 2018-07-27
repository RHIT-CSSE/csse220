package tttEasier;

public class TTTGame {

	private char[][] cells;
	private char currentPlayer;
	boolean isFinished;
	
	public TTTGame() {
		cells = new char[3][3];
		currentPlayer = 'X';
		isFinished = false;
	}
	
	public String getCurrentPlayer() {
		return currentPlayer + "";
	}
	
	public boolean isSet(int row, int col) {
		return cells[row][col] != 0;
	}
	
	public String getPos(int row, int col) {
		if(!isSet(row,col)) return " ";
		return cells[row][col] + "";
	}
	
	public void setPos(int row, int col) {
		if (isFinished()) return;
		if (isSet(row, col)) return;
		cells[row][col] = currentPlayer;
		if(!checkFinished()) {
			currentPlayer = otherPlayer();
		}
	}
	
	boolean isMatch(int row, int col, int rowOffset, int colOffset) {
		int otherRow = row + rowOffset;
		int otherCol = col + colOffset;
		if(otherRow < 0 || otherRow > 2) return false;
		if(otherCol < 0 || otherCol > 2) return false;
		return cells[otherRow][otherCol] == cells[row][col];
	}
	
	boolean isWinCenter(int row, int col) {
		if(!isSet(row,col)) return false;
		if(isMatch(row,col,-1,0) && isMatch(row,col,1,0)) return true;
		if(isMatch(row,col,0,-1) && isMatch(row,col,0,1)) return true;
		if(isMatch(row,col,-1,-1) && isMatch(row,col,1,1)) return true;
		if(isMatch(row,col,-1,1) && isMatch(row,col,1,-1)) return true;
		return false;
	}
	
	boolean isFinished() {
		return isFinished;
	}

	String getWinner() {
		if(!isFinished) throw new RuntimeException("game not finished - no winner");
		return currentPlayer + "";
	}
	
	private char otherPlayer() {
		if(currentPlayer == 'X')
			return 'O';
		else
			return 'X';
	}
	
	private boolean checkFinished() {
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if (isWinCenter(r,c)) {
					isFinished = true;
				}
			}
		}
		return isFinished;
	}
}
