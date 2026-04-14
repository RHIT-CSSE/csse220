package coloredCardsA;

//This class is suspiciously small.
public class Card {

    private int pointValue;
    private String color;
    private String ownerPlayerName;
    private int colorBonusForCurrentPlayer;

    public Card(int pointValue, String color, String ownerPlayerName) {
        this.pointValue = pointValue;
        this.color = color;
        this.ownerPlayerName = ownerPlayerName;
    }

    public int computePointsIncludingBonus() {
        return pointValue + colorBonusForCurrentPlayer;
    }

    public int getPointValue() {
        return pointValue;
    }

    public String getColor() {
        return color;
    }

    public String getOwnerPlayerName() {
        return ownerPlayerName;
    }

    public int getColorBonusForCurrentPlayer() {
        return colorBonusForCurrentPlayer;
    }

    public void setOwnerPlayerName(String ownerPlayerName) {
        this.ownerPlayerName = ownerPlayerName;
        
    }

    public void setColorBonusForCurrentPlayer(int colorBonusForCurrentPlayer) {
        this.colorBonusForCurrentPlayer = colorBonusForCurrentPlayer;
    }
}
