package pets;

import java.util.ArrayList;
import java.util.List;

/**
 * This program features a zookeeper feeding her pets.
 * 
 * Simplify the program by creating a Pet interface and then 
 * removing as much duplicate code as you can.
 * Hint: use a single ArrayList of Pets.
 * 
 * @author Jason Yoder, Matt Boutell, Mark Hays, and their colleagues.
 *
 */
public class PetMain {

	private List<Cat> cats; 
	private List<Dog> dogs; 
	private List<Fish> fishes; 
	
	private Zookeeper zookeeper;
	
	public static void main(String[] args) {
		new PetMain();
	}

	public PetMain() {
		this.zookeeper = new Zookeeper("Mary");
		makePets();
		feedPets();
		countPetsEating();
	}

	public void makePets() {
		this.cats = new ArrayList<Cat>();
		this.dogs = new ArrayList<Dog>();
		this.fishes = new ArrayList<Fish>();
		
		this.cats.add(new Cat("Tiger"));
		this.cats.add(new Cat("Smokey"));
		this.cats.add(new Cat("Misty"));

		this.dogs.add(new Dog("Spot"));
		this.dogs.add(new Dog("Tiny"));

		this.fishes.add(new Fish("Bubbles"));
		this.fishes.add(new Fish("Comet"));
		this.fishes.add(new Fish("Flash"));
	}
	
	public void feedPets() {
		// Note: You are allowed to change the indices 
		// for it to work. If you merge all the pets into one 
		// list, the indices should be 0,2,4,5,6,7.
		this.zookeeper.feedCat(this.cats.get(0));
		this.zookeeper.feedCat(this.cats.get(2));

		this.zookeeper.feedDog(this.dogs.get(1));
		
		this.zookeeper.feedFish(this.fishes.get(0));
		this.zookeeper.feedFish(this.fishes.get(1));
		this.zookeeper.feedFish(this.fishes.get(2));
	}
	
	public void countPetsEating() {
		int count = 0;
		for (Cat cat : this.cats) {
			if (cat.isEating()) {
				count++;
			}
		}
		
		for (Dog dog : this.dogs) {
			if (dog.isEating()) {
				count++;
			}
		}
		
		for (Fish fish: this.fishes) {
			if (fish.isEating()) {
				count++;
			}
		}
	
		System.out.printf("There are %d pets eating\n", count);
	}
}
