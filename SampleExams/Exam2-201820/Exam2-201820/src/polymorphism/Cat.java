package polymorphism;

public class Cat {
	private String name;
	private boolean isEating;

	public Cat(String name) {
		this.name = name;
		this.isEating = false;
	}
	
	public void eatFood() {
		System.out.println("Cat " + name + " is eating food.");
		this.isEating = true;
	}
	
	public boolean isEating() {
		return this.isEating;
	}
	
	public String getName() {
		return this.name;
	}

	public void doSpecialCatAbility() {
		System.out.println(this.name + " says: Yawn. Zzz...");
	}
}
