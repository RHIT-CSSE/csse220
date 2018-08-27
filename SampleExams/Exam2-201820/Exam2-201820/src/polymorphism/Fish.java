package polymorphism;

public class Fish {
	private String name;
	private boolean isEating;
	private int numWiggles;

	public Fish(String name, int numWiggles) {
		this.name = name;
		this.isEating = false;
		this.numWiggles = numWiggles;
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

	public void doSpecialFishAbility() {
		System.out.println(this.name + " says, time to move!");
		for (int j = 1; j <= this.numWiggles; j++) {
			System.out.println("Wiggle " + j);
		}
	}
}
