package stringUsage;

public class StringProbs {

	/**
	 * 
	 * If the sentence has a odd length, returns true if the middle character
	 * is 'Q'
	 * 
	 * If the sentence has an even length, returns false because there is no 
	 * middle character
	 * 
	 * I've provided the solutions and test cases for you on this one
	 * 
	 * For example:
	 *  
	 *  "hQz" returns true
	 *  "abc" returns false
	 *  "Q" returns true
	 *  "QQQQ" returns false
	 *  
	 */
	public static boolean hasMiddleQ(String word) {
		if(word.length() % 2 == 0)
			return false;
		int middleIndex = word.length()/2;     // dividing an int by and int
		                                       // always produces an int in 
		                                       // java.  It rounds down.
		// Note charAt returns a character
		// it's a bit like a string except it can only be
		// exactly one character long
		//
		// In java, single quotes represent characters
		// char myChar = 'Z';
		// char myChar2 = 'Word'; //error must be 1 character long
		//
		// double quotes represents strings
		//
		// String myString = "Z"; //works, but is a string
		// String myString2 = "Word"; //no  problem
		// String myString3 = ""; //even 0 length strings are fine
		// String myString4 = null; //allowed but different from ""
		//
		// compare characters with ==
		if(word.charAt(middleIndex) == 'Q') {
			return true;
		} else {
			return false;
		}
		// the above code could be written more briefly as
		// return word.charAt(middleIndex) == 'Q';
	}
	

	/**
	 * 
	 * Returns true if the first character matches the last character.
	 * 
	 * For example:
	 * "abca" returns true
	 * "abcd" returns false
	 * "a" returns true
	 * "" returns false
	 */	
	public static boolean firstMatchesLast(String input) {
		if(input.isEmpty()) return false;
		return input.charAt(0) == input.charAt(input.length() - 1);
	}
	
	/**
	 * Takes 2 strings, returns true if the first 4 characters match
	 * If either string has less than 4 characters, returns false
	 * 
	 * For example:
	 * "Xaaabb" & "Xaaacccc" returns true
	 * "aaaabb" & "aaacccc" returns false
	 * "abc" & "abc" returns false
	 */	
	public static boolean first4Match(String one, String two) {
		if(one.length() < 4 || two.length() < 4)
			return false;
		return one.substring(0, 4).equals(two.substring(0, 4));
	}
	
	/**
	 * Returns true if the string a just one string repeated twice
	 * 
	 * For example:
	 * "foofoo" returns true
	 * "foobar" returns false
	 * "foofoofoo" returns false
	 */	
	public static boolean isDoubled(String input) {
		String firstHalf = input.substring(0, input.length()/2);
		String secondHalf = input.substring(input.length()/2, input.length());
		return firstHalf.equals(secondHalf);
	}
	
}
