package recursion;

public class RecursionProblems {

	/**
	 * In this method you are given an String which contains words separate by spaces.
	 * You should return that String of words with the same words reversed in order.
	 * 
	 * 
	 * You are NOT allowed to use any Java loops to implement this feature. 
	 * 
	 * You CAN use a recursive helper function for this problem, but it is not required.
	 * 
	 * Example:
	 * reverseWordOrder("this is a test"), returns "test a is this"
	 * reverseWordOrder("a"), returns "a"
	 * reverseWordOrder(""), returns ""
	 * reverseWordOrder("arm the bear"), returns "bear the arm"
	 * 
	 * Note: you do NOT need to remove trailing spaces from your String
	 * 
	 * You CANNOT use split and should not convert the String to an array.
	 * 
	 * Hint: String.indexOf(" ") will return the index of the first " " substring in the string
	 *       (Or -1 if " " is not found)
	 */
	public static String reverseWordOrder(String sentence) {
		return reverseWordOrderHelper(sentence, "", 0).trim();
	}
	
	public static String reverseWordOrderHelper(String text, String currentWord, int index) {
		if ( index >= text.length() ) {
			return currentWord+ " ";
		} else if (text.charAt(index) == ' ') {
			currentWord += " ";
			return reverseWordOrderHelper(text, "", index+1) + currentWord ;
		} else {
			return reverseWordOrderHelper(text, currentWord+text.charAt(index), index+1) ;
		}
	}
	

}
