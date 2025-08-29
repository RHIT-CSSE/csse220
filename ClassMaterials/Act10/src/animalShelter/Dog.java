package animalShelter;

/**
 * Class representing a dog in the animal shelter. 
 * 
 * @author Ian Ludden (luddenig)
 */
public class Dog extends Animal {

    private boolean isHouseBroken;
    private double dailyWalkingMiles; // Needed daily average miles of walking

    public Dog(int id, String name, int birthYear, int birthMonth, boolean isHouseBroken, double dailyWalkingMiles) {
        super(id, name, birthYear, birthMonth);
        this.isHouseBroken = isHouseBroken;
        this.dailyWalkingMiles = dailyWalkingMiles;
    }

    public boolean isHouseBroken() {
        return isHouseBroken;
    }

    public void setHouseBroken(boolean isHouseBroken) {
        this.isHouseBroken = isHouseBroken;
    }

    public double getDailyWalkingMiles() {
        return dailyWalkingMiles;
    }

    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    public String toString() {
        String houseBrokenInfo = this.isHouseBroken ? "IS house broken" : "is NOT house broken";
        String walkingInfo = String.format("needs %.2f miles of walking daily", this.dailyWalkingMiles);
        return super.toString() + ", " + houseBrokenInfo + ", " + walkingInfo;
    }
    
}
