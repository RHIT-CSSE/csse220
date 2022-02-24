package polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * This program features a zookeeper feeding her pets.
 * 
 * Your job is to use inheritance and/or interfaces to remove 
 * as much code duplication as you can. 
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
		showPetSpecialAbilities();
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
		this.dogs.add(new Dog("Athena"));

		this.fishes.add(new Fish("Bubbles", 3));
		this.fishes.add(new Fish("Comet", 1));
		this.fishes.add(new Fish("Flash", 5));
	}
	
	public void feedPets() {
		// Note: You are allowed to change these 
		// indices if needed to keep the output the 
		// same as the original. (Hint: if you move 
		// all the pets to a single list, the indices 
		// below will change from 0,2,1,0,1,2 to 
		// 0,2,4,6,7,8)
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
	
	private void showPetSpecialAbilities() {
		for (Cat cat : this.cats) {
			cat.doSpecialCatAbility();
		}
		
		for (Dog dog : this.dogs) {
			dog.doSpecialDogAbility();
		}
		
		for (Fish fish: this.fishes) {
			fish.doSpecialFishAbility();
		}
	}
}