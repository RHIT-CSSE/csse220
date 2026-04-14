package coloredCardsB;

import java.util.ArrayList;

/**
 * A lot of searching huh?
 * Responsibilities: orchestrates game actions and computations
 */
public class GameMain {
    
    private ArrayList<Player> players = new ArrayList<>();
    
    public void handleMoveRandomCard(String startPlayerName, String endPlayerName) {
        Player start = getPlayer(startPlayerName);
        Player end = getPlayer(endPlayerName);
        start.moveRandomCardTo(end);
    }

    public void handleAddBonus(String playerName, String colorName, int bonusAmount) {
        Player p = getPlayer(playerName);
        p.addBonus(colorName, bonusAmount);
    }

    public int handleComputeHandValueForPlayer(String playerName) {
        Player p = getPlayer(playerName);
        return p.computeHandValue();
    }

    public void handleAddPlayer(String name) {
        Player p = new Player(name);
        players.add(p);
    }

    public void handleAddCard(String playerName, String colorName, int points) {
        Player p = getPlayer(playerName);
        p.addCard(colorName, points);
    }

    private Player getPlayer(String name) {
        for (Player p : players) {
            if (p.getName() != null && p.getName().equals(name)) {
                return p;
            }
        }
        Player p = new Player(name);
        players.add(p);
        return p;
    }
}
