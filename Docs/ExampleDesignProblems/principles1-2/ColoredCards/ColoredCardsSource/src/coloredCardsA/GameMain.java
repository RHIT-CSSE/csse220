package coloredCardsA;

import java.util.ArrayList;

//Notice the recurring loops in these methods. How can we avoid these?
public class GameMain {

    private ArrayList<Card> allCards = new ArrayList<>();
    
    public void handleMoveRandomCard(String startPlayerName, String endPlayerName) {
        ArrayList<Card> candidates = new ArrayList<>();
        for (Card c : this.allCards) {
            if (c.getOwnerPlayerName() != null && c.getOwnerPlayerName().equals(startPlayerName)) {
                candidates.add(c);
            }
        }
        if (candidates.isEmpty()) {
            return;
        }
        int idx = (int) (Math.random() * candidates.size());
        Card chosen = candidates.get(idx);
        chosen.setOwnerPlayerName(endPlayerName);
    }

    public void handleAddBonus(String playerName, String colorName, int bonusAmount) {
        for (Card c : this.allCards) {
            if (c.getOwnerPlayerName() != null && c.getOwnerPlayerName().equals(playerName)) {
                if (c.getColor() != null && c.getColor().equals(colorName)) {
                    c.setColorBonusForCurrentPlayer(bonusAmount);
                } else {
                    c.setColorBonusForCurrentPlayer(0);
                }
            }
        }
    }

    public int handleComputeHandValueForPlayer(String playerName) {
        int total = 0;
        for (Card c : this.allCards) {
            if (c.getOwnerPlayerName() != null && c.getOwnerPlayerName().equals(playerName)) {
                total = total + c.computePointsIncludingBonus();
            }
        }
        return total;
    }
}
