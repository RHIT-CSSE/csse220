package coloredCardsB;

/**
 * ColorCategory is so empty!
 * Responsibilities: tracks total points for a color, the number of cards, and the color bonus; computes points including bonus.
 */
public class ColorCategory {
    private int totalPoints;
    private String color;
    private int numberOfCards;
    private int colorBonus;

    public ColorCategory(String color) {
        this.color = color;
    }

    public int computePointsIncludingBonus() {
        return totalPoints + numberOfCards * colorBonus;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void incrementNumberOfCards() {
        numberOfCards++;
    }

    public void decrementNumberOfCards() {
        numberOfCards--;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void addPoints(int points) {
        totalPoints += points;
    }

    public void subtractPoints(int points) {
        totalPoints -= points;
    }

    public int getColorBonus() {
        return colorBonus;
    }

    public void setColorBonus(int amount) {
        colorBonus = amount;
    }
}
