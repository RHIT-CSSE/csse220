package pets;

public class Dog  implements Pet {
	private String name;
	private boolean isEating;

	public Dog(String name) {
		this.name = name;
		this.isEating = false;
	}
	
	public void eatFood() {
		System.out.println("Dog " + name + " is eating food.");
		this.isEating = true;
	}
	
	public boolean isEating() {
		return this.isEating;
	}
	
	public String getName() {
		return this.name;
	}
}
