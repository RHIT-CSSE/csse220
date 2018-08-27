package polymorphism;

public class Dog extends Pet {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void doSpecialAbility() {
		System.out.print(getName() + " says: ");
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
