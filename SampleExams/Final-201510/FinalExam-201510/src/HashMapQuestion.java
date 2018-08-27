import java.util.HashMap;


public class HashMapQuestion {
	
	/**
	 * Given a list of unusable words and an array of Strings, determine the word that 
	 * occurs the most in the array of strings but is not in the list of unusable words.
	 * 
	 * For example, given:
	 * unusableWords = {"a", "an", "the", "or", "but"};
	 * sentences = {"that is a big dog", "give a dog a bone", "curiosity killed the cat"};
	 * 
	 * While the word "a" is the most common word, since it is in the list of unusable 
	 * words, it should not be returned.  The word that appears above the most that
	 * is NOT an unusable word is the word "dog".  Thus, the String that should be 
	 * returned is "dog"
	 * 
	 * You may assume that all strings are in lower case so you do not need to worry
	 * about character case.  In the case of a tie, any of the top count will suffice.
	 * If there are no words in any sentences other than the unusable words, return
	 * the empty string "".
	 * 
	 * Hint: To split a String into individual words (where the space character
	 * is what separates the String), you can use the split method, as in:
	 * String str = "good luck on your exam";
	 * String[] individualWords = str.split(" ");
	 * individualWords would be populated with {"good","luck","on","your","exam"}
	 * 
	 * @param unusableWords - an array of Strings, where each String is a word that should
	 * 						  not be included in the final result.
	 * @param sentences - an array of Strings, where each String is a sentence composed of
	 * 					  words with no special characters, and every word is in lower case
	 * @return String - the most common word among all the sentences that is not a word that
	 * 					appears in the unusableWords array
	 */
	public static String findMostCommon(String[] unusableWords, String[] sentences) {
			
		return null;
	}
	
}
