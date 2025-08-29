/**
 * Class representing an animal in a small local shelter. 
 * 
 * @author Ian Ludden
 */
public class Animal {

    private int id;
    private String name;
    private String species;
    private double weight; // in pounds

    public Animal(int id) {
        this.id = id;
        this.name = "UNKNOWN";
        this.species = "UNKNOWN";
        this.weight = 0.0;
    }

    public Animal(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.weight = 0.0;
    }

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
     * Getter for species instance variable (a.k.a. field, attribute)
     * 
     * @return the species of this animal (dog, cat, bird, rabbit, etc.)
     */
    public String getSpecies() {
        return this.species;
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
     * Return a String representation of this Animal. 
     */
    @Override
    public String toString() {
        return String.format("Animal (%d, %s, %s, %.2f lb.)", this.id, this.species, this.name, this.weight);
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

    public static void main(String[] args) {
        Animal namelessAnimal = new Animal(12345);
        Animal fido = new Animal(31516, "Fido", "dog");
        Animal mittens = new Animal(12345, "Mittens", "cat");

        System.out.println(namelessAnimal);
        System.out.println(fido);
        System.out.println(mittens);
        System.out.println(namelessAnimal == mittens);
        System.out.println(namelessAnimal.equals(mittens));

        mittens.setWeight(13.4);
        System.out.println("Mittens stress-ate too much tuna.");
        System.out.println(mittens);
    }
}
