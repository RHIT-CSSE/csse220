import java.util.ArrayList;

/**
 * Class representing a small local animal shelter. 
 */
public class AnimalShelterMain {

    private ArrayList<Animal> animals;

    /**
     * Construct a new animal shelter object with no animals. 
     */
    public AnimalShelterMain() {
        this.animals = new ArrayList<>();
    }

    /**
     * Add the given animal to the shelter.  
     * 
     * @param newAnimal
     */
    public void addAnimal(Animal newAnimal) {
        this.animals.add(newAnimal);
    }

    /**
     * String representation of this shelter with all its animals. 
     */
    @Override
    public String toString() {
        return String.format("AnimalShelterMain with animals: %s", this.animals);
    }

    /**
     * Update weight of animal with given ID
     * 
     * @param id
     * @param newWeight
     */
    public void updateAnimalWeight(int id, double newWeight) {
        for (Animal animal : animals) {
            if (animal.getID() == id) {
                animal.setWeight(newWeight);
            }
        }
    }

    /**
     * Retrieve an Animal with the given name. 
     * 
     * @param name
     * @return the first Animal found with the given name, or null if none found
     */
    public Animal getAnimalByName(String name) {
        for (Animal animal : animals) {
            if (name.equals(animal.getName())) {
                return animal;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalShelterMain shelter = new AnimalShelterMain();

        Animal namelessAnimal = new Animal(12345);
        shelter.addAnimal(namelessAnimal);
        System.out.println(shelter);

        Animal fido = new Animal(31516, "Fido", "dog");
        Animal mittens = new Animal(12345, "Mittens", "cat");
        shelter.addAnimal(fido);
        shelter.addAnimal(mittens);
        mittens.setWeight(13.4);
        shelter.addAnimal(new Animal(11111));
        System.out.println(shelter);

        String nameToSearch = "Fido";
        System.out.println("\nSearching for " + nameToSearch + "...");
        System.out.println(shelter.getAnimalByName(nameToSearch));
        double newMittensWeight = 8.7;
        shelter.updateAnimalWeight(mittens.getID(), newMittensWeight);
        System.out.println(mittens);
    }
}
