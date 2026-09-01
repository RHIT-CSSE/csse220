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
		// FIXME: delete body for template
		int length = this.text.length();

		if (length <= 1) {
			return true;
		}
		// Checks first and last
		char first = Character.toLowerCase(this.text.charAt(0));
		char last = Character.toLowerCase(this.text.charAt(length - 1));
		if (!Character.isLetter(first)) {
			Sentence shorter = new Sentence(this.text.substring(1));
			return shorter.isPalindrome();
		}
		if (!Character.isLetter(last)) {
			Sentence shorter = new Sentence(this.text.substring(0, length - 1));
			return shorter.isPalindrome();
		}
		// first and last are both letters
		if (first == last) {
			Sentence shorter = new Sentence(this.text.substring(1, length - 1));
			return shorter.isPalindrome();
		} else {
			return false;
		}
	}

	// FIXME: delete for template
	/**
	 * Checks whether the substring of this.text between start and end,
	 * inclusive, is a palindrome.
	 * 
	 * @param start
	 * @param end
	 * 
	 * @return true iff the substring between start and end is a palindrome
	 */
	public boolean isPalindrome(int start, int end) {
		if (end - start <= 1) {
			return true;
		}

		// If start character is not a letter, throw it out
		char firstChar = this.text.charAt(start);
		if (!Character.isLetter(firstChar)) {
			return isPalindrome(start + 1, end);
		}

		// If end character is not a letter, throw it out
		char lastChar = this.text.charAt(end);
		if (!Character.isLetter(lastChar)) {
			return isPalindrome(start, end - 1);
		}

		// Both start and end characters are letters, if they match, throw both
		// out
		if (Character.toLowerCase(firstChar) == Character.toLowerCase(lastChar)) {
			return isPalindrome(start + 1, end - 1);
		}

		// Both start and end characters were letters and they didn't match
		return false;
	}

	/**
	 * @return a NEW sentence object whose text is the reverse of this one
	 */
	public Sentence reverse() {
		/*
		 * TODO: implement and JUnit test this method. Your solution must be
		 * recursive.
		 */
		return new Sentence(reverseHelper(0));
	}

	// FIXME: delete for template
	/**
	 * @param i
	 * @return the reverse of this.text.substring(i)
	 */
	private String reverseHelper(int i) {
		if (i == this.text.length()) 
			return "";
		return reverseHelper(i + 1) + this.text.charAt(i);
	}

	@Override
	public String toString() {
		return this.text;
	}

}
