package polymorphism;

public class Zookeeper {
	private String name;
	
	public Zookeeper(String name) {
		this.name = name;
	}
	
	public void feedCat(Cat cat) {
		System.out.printf("%s is feeding %s. ", this.name, cat.getName());
		cat.eatFood();
	}

	public void feedDog(Dog dog) {
		System.out.printf("%s is feeding %s. ", this.name, dog.getName());
		dog.eatFood();
	}

	public void feedFish(Fish fish) {
		System.out.printf("%s is feeding %s. ", this.name, fish.getName());
		fish.eatFood();
	}	
}
