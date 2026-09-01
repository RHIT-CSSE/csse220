package examples;

/**
 * This class represents a single sentence. It is based on an example from
 * section 13.2 of Horstmann's Big Java, 3rd ed.
 * 
 * @author Cay Horstmann
 */
public class Sentence {

	private final String text;

	/**
	 * Creates a sentence object for the given string.
	 * 
	 * @param text
	 */
	public Sentence(String text) {
		this.text = text;
	}

	/**
	 * Main entry point for example.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		String str = "Go hang a salami, I'm a lasagna hog.";
		Sentence sent = new Sentence(str);
		System.out.println(sent.isPalindrome());
	}

	/**
	 * Checks whether this sentence is a palindrome. Palindromic sentences are
	 * considered to be those the read the same forward or backward, ignoring
	 * case, punctuation, and spaces.
	 * 
	 * Examples:
	 * 
	 * new Sentence("deified");
	 * 
	 * new Sentence("I prefer Pi");
	 * 
	 * new Sentence("A man, a plan, a canal -- Panama!");
	 * 
	 * new Sentence("Madam, I'm Adam");
	 * 
	 * new Sentence("Go hang a salami, I'm a lasagna hog.");
	 * 
	 * @return true iff this sentence is a palindrome
	 */
	public boolean isPalindrome() {
		// TODO: implement this method
		return false;
	}

	/**
	 * @return a NEW sentence object whose text is the reverse of this one
	 */
	public Sentence reverse() {
		/*
		 * TODO: implement and JUnit test this method.  Your solution must be
		 * recursive.
		 */
		return null;
	}
	
	@Override
	public String toString() {
		return this.text;
	}
}
