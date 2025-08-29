package animalShelter;

/**
 * Class representing an animal in a small local shelter. 
 * 
 * @author Ian Ludden (luddenig)
 */
public abstract class Animal {

    private int id;
    private String name;
    private double weight; // in pounds
    private boolean isAdopted;
    private int birthYear;
    private int birthMonth; // 1 to 12

    public Animal(int id) {
        this.id = id;
        this.name = "UNKNOWN";
        this.weight = 0.0;
        this.isAdopted = false;
        this.birthYear = -1;
        this.birthMonth = -1;
    }

    public Animal(int id, String name) {
        this(id);
        this.name = name;
    }

    public Animal(int id, String name, int birthYear, int birthMonth) {
        this(id, name);
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
    }

    /**
     * Make a typical sound for this type of animal. 
     * @return onomatopoeia String for this type of animal's sound
     */
    public abstract String makeSound();

    /**
     * Getter (a.k.a. accessor) for id instance variable (a.k.a. field, attribute)
     * 
     * @return the unique identifier for this animal
     */
    public int getID() {
        return this.id;
    }

    /**
     * Getter for name instance variable (a.k.a. field, attribute)
     * 
     * @return the name of this animal
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for weight instance variable (a.k.a. field, attribute)
     * 
     * @return the weight of this animal in pounds
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Setter (a.k.a. mutator) for weight instance variable
     * @param newWeight
     */
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    /**
     * Getter for isAdopted instance variable. 
     * @return true if this animal has been adopted, false otherwise
     */
    public boolean isAdopted() {
        return this.isAdopted;
    }

    /**
     * Setter for isAdopted instance variable. 
     * @param isAdopted
     */
    public void setAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }

    /**
     * Getter for birth year instance variable. 
     * @return this animal's birth year
     */
    public int getBirthYear() {
        return this.birthYear;
    }

    /**
     * Getter for birth month instance variable. 
     * @return this animal's birth month, from 1 for January to 12 for December
     */
    public int getBirthMonth() {
        return this.birthMonth;
    }

    /**
     * Return a String representation of this Animal. 
     */
    @Override
    public String toString() {
        return String.format("%s (%d, %s, %.2f lb.)", this.getClass().getName(), this.id, this.name, this.weight);
    }

    /**
     * Check if other is an Animal with the same ID. 
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Animal)) {
            return false;
        }
        return this.id == ((Animal)other).id;
    }
}
