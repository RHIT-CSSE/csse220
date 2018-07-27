package nopeeking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Represents a single 2v2 match
 *
 * @author hewner.
 *         Created Dec 27, 2013.
 */
public class Game {
	private ArrayList<String> players;
	private int winner;
	
	/**
	 * 
	 * Constructs a new game for a 4 element array of player names
	 * and an integer (1 or 2) indicating which team of players
	 * won
	 *
	 * @param players
	 * @param winner
	 */
	public Game(String[] players, int winner) {
		this.players = new ArrayList<String>(Arrays.asList(players));
		this.winner = winner;
	}
	
	/**
	 * 
	 * Returns true if the given player won the game
	 *
	 * @param playerName
	 * @return true if the given player won this game
	 */
	public boolean didWin(String playerName) {
		if(!this.players.contains(playerName))
			return false;
		if(this.players.indexOf(playerName) < 2 && this.winner == 1) {
			return true;
		}
		if(this.players.indexOf(playerName) >= 2 && this.winner == 2) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * String representing the game and if a specific player won
	 *
	 * @param playerName (for win/loss reporting)
	 * @return the game's description string
	 */
	public String winReport(String playerName) {
		String winOrLoss;
		if(this.didWin(playerName)) {
			winOrLoss = "win";
		} else {
			winOrLoss = "loss";
		}
		return String.format("%s & %s vs %s & %s (%s)", 
				this.players.get(0),
				this.players.get(1),
				this.players.get(2),
				this.players.get(3),
				winOrLoss);
	}
}
