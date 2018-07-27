package minesweeperEasier;

/**
 * 
 */

/**
 * This class represents a 7x7 minesweeper game.
 * 
 * When the class is constructed, it populates
 * the game with a random selection of mines
 * 
 * 0| - X - - - - -  
 * 1| - - - - - - -  
 * 2| - - - - - X -  
 * 3| - - - - - - -  
 * 4| - - - X - - -  
 * 5| - - - - - - X  
 * 6| - - - - - - -  
 *  +--------------
 *    0 1 2 3 4 5 6  
 * 
 * (Xs represent mines)
 * 
 * To play, a player selects a slot.  Slots are indexed
 * in row, column order so the slot 0,1 has a mine in the example
 * 
 * First the program should call hasMine to determine if there is a mine there.
 * If there is a mine, the player looses and the program should display that.
 * 
 * Otherwise the program should call getNeighborMineCount and display
 * that (e.g. for index 1,0 the result would be 1 because it is diagonally
 * adjacent to 0,1)  
 * 
 * The goal of the player is to reveal all non-mine slots.
 * 
 * @author hewner
 *
 */
public class MinesweeperGame {

	private boolean[][] mines;
	
	/**
	 * Makes a new linear minesweeper board
	 */
	public MinesweeperGame(MinesweeperGenerator generator) {
		//Make a copy of the array so that nothing has outside access
		//to the references for the mines array
		boolean[][] input = generator.getMinesweeperGame();
		this.mines = new boolean[input.length][input[0].length];
		
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[0].length; j++) {
				this.mines[i][j] = input[i][j]; 
			}
		} 
	}
	
	/**
	 * Returns true if the index has a mine
	 * 
	 * If given coordinates outside the limits, always returns false
	 * 
	 * @param row - row to check
	 * @param column - column to check
	 * @return true if a mine
	 */
	public boolean hasMine(int row, int column) {
		if(row < 0 || row >= mines.length || column < 0 || column >= mines[0].length)
			return false;
		return mines[row][column];
	}
	
	/**
	 * Returns the number of mines adjacent to the given
	 * slot, including diagonals
	 * 
	 * @param row - row to check nearby
	 * @param column - column to check nearby
	 * @return number of mines adjacent
	 */
	public int getNeighborMineCount(int row, int column) {
		int rowOffsets[] = {-1,0,1};
		int colOffsets[] = {-1,0,1};
		int count = 0;
		for(int rowOffset : rowOffsets) {
			for(int colOffset : colOffsets) {
				if(rowOffset == 0 && colOffset == 0)
					continue;
				if(hasMine(row + rowOffset, column + colOffset)) {
					count++;
				}
			}
		}
		
		return count;
	}
}
