package pets;

public class Fish implements Pet {
	private String name;
	private boolean isEating;

	public Fish(String name) {
		this.name = name;
		this.isEating = false;
	}
	
	public void eatFood() {
		System.out.println("Fish " + name + " is eating food.");
		this.isEating = true;
	}
	
	public boolean isEating() {
		return this.isEating;
	}
	
	public String getName() {
		return this.name;
	}
}
