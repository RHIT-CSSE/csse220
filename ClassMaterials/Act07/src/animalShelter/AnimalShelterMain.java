package animalShelter;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Class representing a small local animal shelter. 
 */
public class AnimalShelterMain {

    private HashMap<Integer, Animal> animals;
    private HashMap<String, Animal> animalsByName;

    /**
     * Construct a new animal shelter object with no animals. 
     */
    public AnimalShelterMain() {
        this.animals = new HashMap<>();
        this.animalsByName = new HashMap<>();
    }

    /**
     * Add the given animal to the shelter.  
     * 
     * @param newAnimal
     */
    public void addAnimal(Animal newAnimal) {
        this.animals.put(newAnimal.getID(), newAnimal);
        this.animalsByName.put(newAnimal.getName(), newAnimal);
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
        Animal animal = this.animals.get(id);
        if (animal != null) {
            animal.setWeight(newWeight);
        }
    }

    /**
     * Retrieve an Animal with the given name. 
     * 
     * @param name
     * @return the first Animal found with the given name, or null if none found
     */
    public Animal getAnimalByName(String name) {
        return this.animalsByName.get(name);
    }

    /**
     * Retrieve an Animal with the given ID.
     * 
     * @param id
     * @return the Animal with the given ID, or null if none found
     */
    public Animal getAnimalByID(int id) {
        return this.animals.get(id);
    }

    /**
     * Handle user commands using if-else if-else structure
     * 
     * @param command the command string entered by user
     * @param scanner the Scanner object for additional input
     */
    public void handleCommand(String command, Scanner scanner) {
        if (command.equals("add animal")) {
            System.out.print("Enter animal ID: ");
            int id = scanner.nextInt();
            
            System.out.print("Enter animal name (or press Enter for UNKNOWN): ");
            String name = scanner.nextLine();
            if (name.trim().isEmpty()) {
                name = "UNKNOWN";
            }
            
            System.out.print("Enter animal species (or press Enter for UNKNOWN): ");
            String species = scanner.nextLine();
            if (species.trim().isEmpty()) {
                species = "UNKNOWN";
            }
            
            Animal newAnimal;
            if (name.equals("UNKNOWN") && species.equals("UNKNOWN")) {
                newAnimal = new Animal(id);
            } else {
                newAnimal = new Animal(id, name, species);
            }
            
            addAnimal(newAnimal);
            System.out.println("Animal added successfully: " + newAnimal);
            
        } else if (command.equals("search id")) {
            System.out.print("Enter animal ID to search: ");
            int id = scanner.nextInt();
            
            Animal found = getAnimalByID(id);
            if (found != null) {
                System.out.println("Animal found: " + found);
            } else {
                System.out.println("No animal found with ID: " + id);
            }
            
        } else if (command.equals("search name")) {
            System.out.print("Enter animal name to search: ");
            String name = scanner.nextLine();
            
            Animal found = getAnimalByName(name);
            if (found != null) {
                System.out.println("Animal found: " + found);
            } else {
                System.out.println("No animal found with name: " + name);
            }
            
        } else if (command.equals("update weight")) {
            System.out.print("Enter animal ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter new weight: ");
            double weight = scanner.nextDouble();
            
            updateAnimalWeight(id, weight);
            Animal updated = getAnimalByID(id);
            if (updated != null) {
                System.out.println("Weight updated: " + updated);
            } else {
                System.out.println("No animal found with ID: " + id);
            }
            
        } else if (command.equals("list all")) {
            if (animals.isEmpty()) {
                System.out.println("No animals in the shelter.");
            } else {
                System.out.println("All animals in the shelter:");
                for (Animal animal : animals.values()) {
                    System.out.println("  " + animal);
                }
            }
            
        } else if (command.equals("help")) {
            System.out.println("Available commands:");
            System.out.println("  add animal    - Add a new animal to the shelter");
            System.out.println("  search id     - Search for an animal by ID");
            System.out.println("  search name   - Search for an animal by name");
            System.out.println("  update weight - Update an animal's weight");
            System.out.println("  list all      - List all animals in the shelter");
            System.out.println("  help          - Show this help message");
            System.out.println("  quit          - Exit the program");
            
        } else if (command.equals("quit")) {
            System.out.println("Goodbye!");
            
        } else {
            System.out.println("Unknown command: " + command);
            System.out.println("Type 'help' to see available commands.");
        }
    }

    public static void main(String[] args) {
        AnimalShelterMain shelter = new AnimalShelterMain();
        Scanner scanner = new Scanner(System.in);
        
        // Add some initial animals for testing        
        Animal fido = new Animal(31516, "Fido", "dog");
        Animal mittens = new Animal(54321, "Mittens", "cat");
        shelter.addAnimal(fido);
        shelter.addAnimal(mittens);
        mittens.setWeight(13.4);
        
        System.out.println("Welcome to the Animal Shelter Management System!");
        System.out.println("Type 'help' to see available commands.");
        System.out.println();
        
        String command = "";
        while (!command.equals("quit")) {
            System.out.print("Enter command: ");
            command = scanner.nextLine().trim().toLowerCase();
            System.out.println();
            
            shelter.handleCommand(command, scanner);
            System.out.println();
        }
        
        scanner.close();
    }
}