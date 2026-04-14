package coloredCardsB;

import java.util.ArrayList;

/**
 * Player is awfully long and complicated...
 * Responsibilities: stores player name; can compute hand value, move a random card to another player, and add color bonus.
 */
public class Player {
    private String name;
    private ArrayList<ColorCategory> categories = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        categories.add(new ColorCategory("red"));
        categories.add(new ColorCategory("blue"));
        categories.add(new ColorCategory("green"));
    }

    public int computeHandValue() {
        int total = 0;
        for (ColorCategory c : categories) {
            total += c.computePointsIncludingBonus();
        }
        return total;
    }

    public void moveRandomCardTo(Player otherPlayer) {
        ArrayList<ColorCategory> candidates = new ArrayList<>();
        for (ColorCategory c : categories) {
            if (c.getNumberOfCards() > 0) {
                candidates.add(c);
            }
        }
        if (candidates.isEmpty()) {
            return;
        }
        int idx = (int) (Math.random() * candidates.size());
        ColorCategory chosen = candidates.get(idx);
        // Is this a valid way to calculate points?
        int avgPoints = chosen.getTotalPoints() / chosen.getNumberOfCards();
        chosen.decrementNumberOfCards();
        chosen.subtractPoints(avgPoints);
        otherPlayer.addCard(chosen.getColor(), avgPoints);
    }

    public void addBonus(String color, int amount) {
        for (ColorCategory c : categories) {
            if (c.getColor() != null && c.getColor().equals(color)) {
                c.setColorBonus(amount);
            } else {
                c.setColorBonus(0);
            }
        }
    }

    public void addCard(String color, int points) {
        ColorCategory c = getCategoryOrNull(color);
        if (c == null) {
            c = new ColorCategory(color);
            categories.add(c);
        }
        c.incrementNumberOfCards();
        c.addPoints(points);
    }

    private ColorCategory getCategoryOrNull(String color) {
        for (ColorCategory c : categories) {
            if (c.getColor() != null && c.getColor().equals(color)) {
                return c;
            }
        }
        return null;
    }
}
