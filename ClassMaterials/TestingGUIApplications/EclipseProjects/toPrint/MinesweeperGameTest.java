package minesweeperEasierTesting;

/**
 * Unit tests for the {@link MinesweeperGame}  model.
 * 
 * @author defoe on Nov 3, 2015.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import minesweeperEasier.MinesweeperGame;
import minesweeperEasier.MinesweeperGenerator;

public class MinesweeperGameTest {
	
	/**
	 *  Utility function for testing {@link MinesweeperGame#hasMine(int, int)}.
	 *  
	 * @param board String array representation of game board
	 * @param game MinesweeperGame instance
	 */
	public void assertHasMines(String[] board, MinesweeperGame game){
		for(int r = 0; r<board.length; r++){
			for(int c=0; c<board.length; c++){
				if(board[r].charAt(c) == 'X'){
					assertTrue(game.hasMine(r, c));
				} else{
					assertFalse(game.hasMine(r, c));
				}
			}
		}
	}
	
	/**
	 * Utility function for testing 
	 * {@link MinesweeperGame#getNeighborMineCount(int, int)}.
	 * 
	 * @param board String array representation of game board.
	 * @param boardResults String array representation of expected 
	 * 		  game board results
	 * @param game MinesweeperGame instance
	 */
	public void assertGetNeighborMineCount(String board[], 
			String[] boardResults, MinesweeperGame game){
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board.length; c++){
				if(board[r].charAt(c) != 'X'){
					assertEquals(
							game.getNeighborMineCount(r, c), 
							Integer.parseInt(boardResults[r].substring(c, c+1))
					);
				}
			}
		}
	}
	
		
	/**
	 * Unit Tests the {@link MinesweeperGame#hasMine(int, int)} method.
	 */
	@Test 
	public void testHasMine(){
		String[] board = {"   ", " X ", "   "};
		MinesweeperGenerator generator = new TestGameGenerator(board);
		MinesweeperGame game = new MinesweeperGame(generator);
		assertHasMines(board, game);
	}
	
	/**
	 * Unit tests the {@link MinesweeperGame#getNeighborMineCount(int, int)} method.
	 */
	@Test
	public void testGetNeighborMineCount(){
		String[] board = {"   ", " X ", "   "};
		String[] boardResults = {"111", "1X1", "111"};
		MinesweeperGenerator generator = new TestGameGenerator(board);
		MinesweeperGame game = new MinesweeperGame(generator);
		assertGetNeighborMineCount(board, boardResults, game);
	}
	
	
}
