//package pets;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * This program features a zookeeper feeding her pets.
// *
// * Simplify the program by creating a Pet interface and then
// * removing as much duplicate code as you can.
// * Hint: use a single ArrayList of Pets.
// *
// * @author Jason Yoder, Matt Boutell, Mark Hays, and their colleagues.
// *
// */
//public class PetMain {
//
//	private List<Pet> pets;
//	private Zookeeper zookeeper;
//
//	public static void main(String[] args) {
//		new PetMain();
//	}
//
//	public PetMain() {
//		this.zookeeper = new Zookeeper("Mary");
//		makePets();
//		feedPets();
//		countPetsEating();
//	}
//
//	public void makePets() {
//		this.pets = new ArrayList<Pet>();
//
//		this.pets.add(new Cat("Tiger"));
//		this.pets.add(new Cat("Smokey"));
//		this.pets.add(new Cat("Misty"));
//
//		this.pets.add(new Dog("Spot"));
//		this.pets.add(new Dog("Tiny"));
//
//		this.pets.add(new Fish("Bubbles"));
//		this.pets.add(new Fish("Comet"));
//		this.pets.add(new Fish("Flash"));
//	}
//
//	public void feedPets() {
//		this.zookeeper.feedPet(this.pets.get(0));
//		this.zookeeper.feedPet(this.pets.get(2));
//
//		this.zookeeper.feedPet(this.pets.get(4));
//
//		this.zookeeper.feedPet(this.pets.get(5));
//		this.zookeeper.feedPet(this.pets.get(6));
//		this.zookeeper.feedPet(this.pets.get(7));
//	}
//
//	public void countPetsEating() {
//		int count = 0;
//		for (Pet pet : this.pets) {
//			if (pet.isEating()) {
//				count++;
//			}
//		}
//
//		System.out.printf("There are %d pets eating\n", count);
//	}
//}
