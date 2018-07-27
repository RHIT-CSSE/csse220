package minesweeperEasierTesting;

import minesweeperEasier.MinesweeperGenerator;

public class TestGameGenerator implements MinesweeperGenerator {

	private boolean[][] mines;
	public TestGameGenerator(String[] board) {
		int size = board[0].length();
		mines = new boolean[size][size];  
		for(int r=0; r<board.length; r++){
			for(int c=0; c<board[r].length(); c++){
				mines[r][c] = board[r].charAt(c) == 'X';
			}
		}
	}
	
	@Override
	public boolean[][] getMinesweeperGame() {
		return mines;
	}

}
