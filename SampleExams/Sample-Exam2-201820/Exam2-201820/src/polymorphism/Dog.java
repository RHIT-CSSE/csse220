package polymorphism;

public class Dog {
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

	public void doSpecialDogAbility() {
		System.out.print(this.name + " says: ");
		if (startsWithVowel(this.getName())) {
			System.out.println("Arf!");
		} else {
			System.out.println("Bow wow!");
		}
	}
	
	private boolean startsWithVowel(String s) {
		char ch = Character.toLowerCase(s.charAt(0));
		// When y is the first letter of a word, it isn't a vowel.
		return ch == 'a' || ch == 'e' || ch == 'i' 
				|| ch == 'o' || ch == 'u';
	}	
}
