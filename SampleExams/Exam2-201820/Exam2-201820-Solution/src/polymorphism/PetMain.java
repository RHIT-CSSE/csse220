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
	private List<Pet> pets; 
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
		this.pets = new ArrayList<Pet>();

		this.pets.add(new Cat("Tiger"));
		this.pets.add(new Cat("Smokey"));
		this.pets.add(new Cat("Misty"));

		this.pets.add(new Dog("Spot"));
		this.pets.add(new Dog("Tiny"));
		this.pets.add(new Dog("Athena"));

		this.pets.add(new Fish("Bubbles", 3));
		this.pets.add(new Fish("Comet", 1));
		this.pets.add(new Fish("Flash", 5));
	}
	
	public void feedPets() {
		// Note: You are allowed to change these 
		// indices if needed to keep the output the 
		// same as the original. (Hint: if you move 
		// all the pets to a single list, the indices 
		// below will change from 0,2,1,0,1,2 to 
		// 0,2,4,6,7,8)
		this.zookeeper.feedPet(this.pets.get(0));
		this.zookeeper.feedPet(this.pets.get(2));

		this.zookeeper.feedPet(this.pets.get(4));
		
		this.zookeeper.feedPet(this.pets.get(6));
		this.zookeeper.feedPet(this.pets.get(7));
		this.zookeeper.feedPet(this.pets.get(8));
	}
	
	public void countPetsEating() {
		int count = 0;
		for (Pet pet : this.pets) {
			if (pet.isEating()) {
				count++;
			}
		}
		System.out.printf("There are %d pets eating\n", count);
	}
	
	private void showPetSpecialAbilities() {
		for (Pet pet : this.pets) {
			pet.doSpecialAbility();
		}
	}
}