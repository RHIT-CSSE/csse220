package polymorphism;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void doSpecialAbility() {
		System.out.println(getName() + " says: Yawn. Zzz...");
	}
}
