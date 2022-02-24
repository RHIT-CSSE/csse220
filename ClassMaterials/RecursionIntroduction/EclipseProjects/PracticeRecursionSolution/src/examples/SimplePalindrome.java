package examples;

public class SimplePalindrome {
	
	/**
	 * Returns true if the input string is a palindrome
	 * (reads the same backwards and forwards)
	 * 
	 * For example the string "aba" is a palindrome.
	 * The string "abc" is not because abc backwards is cba
	 * 
	 * Spaces are not considered special in this palindrome.
	 * See sentence for a more complex palindrome problem.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isPalindrome(String input) {
		if(input.length() <= 1)
			return true;
		if(input.charAt(0) != input.charAt(input.length() -1)) {
			return false;
		}
		return isPalindrome(input.substring(1,input.length()-1));
	}
	
	/**
	 * Returns true if the input array is a palindrome.
	 * 
	 * For example, the array {1,2,1} is a palindrome.
	 * The array {1,2,3} is not.
	 * 
	 * This problem is much easier with the use of
	 * a helper method.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isPalindromeIntArray(int[] input) {
		return isPalindromeIntArrayHelper(input, 0, input.length - 1);
	}
	
	public static boolean isPalindromeIntArrayHelper(int[] input, int leftPosition, int rightPosition) {
		if(leftPosition >= rightPosition)
			return true;
		if(input[leftPosition] != input[rightPosition])
			return false;
		return isPalindromeIntArrayHelper(input, leftPosition + 1, rightPosition - 1);
	}
	
}
