package polymorphism;

public class Fish extends Pet {
	private int numWiggles;

	public Fish(String name, int numWiggles) {
		super(name);
		this.numWiggles = numWiggles;
	}
	
	@Override
	public void doSpecialAbility() {
		System.out.println(getName() + " says, time to move!");
		for (int j = 1; j <= this.numWiggles; j++) {
			System.out.println("Wiggle " + j);
		}
	}
}
