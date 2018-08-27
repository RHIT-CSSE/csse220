package polymorphism;

public abstract class Pet {
	private String name;
	private boolean isEating;

	public Pet(String name) {
		this.name = name;
		this.isEating = false;
	}
	
	public void eatFood() {
		System.out.println(this.getClass().getSimpleName()+ " " + name + " is eating food.");
		this.isEating = true;
	}
	
	public boolean isEating() {
		return this.isEating;
	}
	
	public String getName() {
		return this.name;
	}

	public abstract void doSpecialAbility();
}
