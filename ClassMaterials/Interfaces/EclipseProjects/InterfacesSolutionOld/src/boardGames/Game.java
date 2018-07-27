package boardGames;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author <TODO: Your name here>
 */
public interface Game {
	/*
	 * TODO: Add method declarations and documentation according to the
	 * description of Project 9.2 on p. 435 of Big Java. You do not have to
	 * provide implementations of the interface yet.
	 */

	/**
	 * Checks whether the move specified by the given string is currently valid
	 * in this game. The move string is dependent on the particular game begin
	 * played.
	 * 
	 * @param move
	 * @return whether the move is valid
	 */
	boolean isValidMove(String move);

	/**
	 * Updates the game state based on the given move. Requires that the move is
	 * currently valid in this game.
	 * 
	 * @param move
	 */
	void executeMove(String move);

	/**
	 * @return whether the game is over
	 */
	boolean isGameOver();

	/**
	 * @return a string representation of the current game state
	 */
	String getGameState();

	/*
	 * The methods above are sufficient for the specification given in the text.
	 * The remaining code here is a refinement.
	 */

	/**
	 * This inner enumeration specifies the two players.
	 */
	public enum Player {
		/**
		 * Player one.
		 */
		ONE,
		/**
		 * Player two.
		 */
		TWO;
	}
	
	/**
	 * Returns the winner of the game.  Requires isGameOver();
	 *
	 * @return the winner
	 */
	Player getWinner();
}
