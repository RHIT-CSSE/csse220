package pets;

public class Zookeeper {
	private String name;
	
	public Zookeeper(String name) {
		this.name = name;
	}
	
	public void feedPet(Pet pet) {
		System.out.printf("%s is feeding %s. ", this.name, pet.getName());
		pet.eatFood();
	}

	
	
}
