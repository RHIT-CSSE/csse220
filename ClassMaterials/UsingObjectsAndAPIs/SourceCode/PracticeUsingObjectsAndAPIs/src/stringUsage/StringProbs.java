package stringUsage;
/**
 * In the very beginning, I care about you knowing about 4 string functions:
 * 
 * str.charAt(i) // returns the character a particular index
 * e.g.  "hello".charAt(1) returns 'e'
 * 
 * str.length() // returns the length of the string
 * e.g. "hello".length() returns 5
 * 
 * str.substring(i1,i2) // returns a string starting at index i1 and continuing to i2
 *                      // but not including it
 * e.g "hello".substring(1,3) returns "el"
 * 
 * str.equals(otherStr) //compares one string to another
 *                      // NEVER use str == otherStr
 *                      // unless you want to check if a str is null
 *                      // if(str == null)
 *                      // ONLY time == is correct for strings
 *                      
 * BUT in general more string functions can be found in the java docs:
 * http://download.oracle.com/javase/7/docs/api/ 
 * ...find "String" in the All Classes window on the right
 * 
 * @author hewner
 *
 */
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
		// YOU solve this one
		return false;
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
		if(one.length() < 4 || two.length() < 4) {
			return false;
		}
		if(one.substring(0, 4).equals(two.substring(0, 4))) {
			return true;
		} else {
			return false;
		}
		// above could be written more briefly as
		// return one.substring(0, 5).equals(two.substring(0, 5));
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
		// YOU solve this one
		return false;
	}
	
	
}
