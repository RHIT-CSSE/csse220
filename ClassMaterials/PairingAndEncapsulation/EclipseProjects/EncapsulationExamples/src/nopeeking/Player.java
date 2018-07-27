package nopeeking;

import java.util.ArrayList;

/**
 * 
 * A class representing a player and the games they participated in
 *
 * @author hewner.
 *         Created Dec 27, 2013.
 */
public class Player {

	private String name;
	private ArrayList<Game> games;
	
	/**
	 * 
	 * Constructs a new player with the given name
	 *
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
		this.games = new ArrayList<Game>();
	}
	
	/**
	 * Adds a game to the player's record
	 *
	 * @param game
	 */
	public void addGame(Game game) {
		this.games.add(game);
	}
	
	/**
	 * 
	 * Returns the number of games the player has won
	 *
	 * @return wins
	 */
	public int countWins() {
		int count = 0;
		for(Game g : this.games) {
			if(g.didWin(this.name)) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Returns the player's name
	 * 
	 * @return player's name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * Prints a report of all the player's games and if they won or lost
	 *
	 */
	public void printGameReport() {
		for(Game g : this.games) {
			System.out.println(g.winReport(this.name));
		}
	}
}
