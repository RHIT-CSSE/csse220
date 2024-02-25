package recursionPart2;

/**
 * Class: Part2Problems
 * @author CSSE Faculty
 * Purpose: Provide practice implementing recursive operations that require a separate recursive helper operation
 *  
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         TODO: cite your help here or say "only used CSSE220 materials"
 *************************************************************************************** 
 */
public class Part2Problems {

	/**
	 * For this problem, you are to use recursion to find if each element of one
	 * array appears in the other array in the same order. There may be extra values
	 * in the input array.
	 * 
	 * You'll want a helper function to solve this problem
	 * 
	 * Example 1: input = {1, 2, 3, 4, 5, 6, 7} toFind = {3, 4, 5} Given the above
	 * input, this should return true
	 * 
	 * Example 2: input = {1, 2, 3, 4 ,5, 6, 7} toFind = {1, 3, 5} Given the above
	 * input, this should return true
	 * 
	 * Example 3: input = {1, 3, 5, 7, 9} toFind = {3, 4, 5} false because 4 is not
	 * in the array this should return false
	 * 
	 * Example 4: input = {1, 3, 5, 7, 4} toFind = {3, 4, 5} false because the order
	 * is 3,5,4 in the input array
	 * 
	 * @param input  - the array to find the values in
	 * @param toFind - the array to find in the other
	 * @return true if toFind is found in input, false otherwise
	 */

	public static boolean findIn(int[] input, int[] toFind) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * For this problem, you should use recursion to find the 3rd capital letter in
	 * a string. You are to return the index of that third capital letter. If a
	 * third capital letter is not in the String, you should return -1.
	 * 
	 * You will probably want to use a helper method for this one. You should not
	 * make any changes to the input String.
	 * 
	 * For this method, you will want to use the Character class to determine if a
	 * letter is upper case. Below is an example usage: char curLetter =
	 * input.charAt(0); Character.isUpperCase(curLetter) will return true if
	 * curLetter is an upper case letter
	 * 
	 * @param input - the String you are to find the third capital letter in
	 * @return the index of the third capital letter, -1 if a third one does not
	 *         exist in the input String
	 */
	public static int findThirdCapital(String input) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * For this problem, you are given an array of integers. You are to use
	 * recursion to find the subsequence of elements that yields the highest sum. A
	 * subsequence can be any set of the array values that are sequential. That is,
	 * if the values at indices 3, 4 and 5 produce the highest sum, that sum is what
	 * you should return. You cannot sum numbers that are not sequential however.
	 * For instance, you cannot return a sum that was from elements 3, 4, 6 and 7.
	 * Those values skipped element 5.
	 * 
	 * For the sake of simplicity, you can assume that there is a subsequence in the
	 * array that has a maximum sum and contains more than one element in the
	 * sequence. In other words, the subsequence with the highest sum will consist
	 * of at least two values.
	 * 
	 * For this problem, you will want to use a recursive helper method.
	 * 
	 * Below are some examples: input = {-1, -2, 3, 4, 6, -2, -2} The highest
	 * possible sum from any subsequence is 13, the value to return. 13 is from
	 * 3+4+6. Those elements in sequence yielded the highest sum of any other
	 * subsequence.
	 * 
	 * 
	 * input = {-1, -2, 2, 5, 6, -1, 7, -3} The highest possible sum from any
	 * subsequence here is 19, the value to return. 19 is from 2+5+6+(-1)+7. Note
	 * that the subsequence from indices 2 to 6 yields a higher sum than 2 to 4 even
	 * though it includes a negative value.
	 * 
	 * 
	 * input = {-1, 2, 3, 4, -10, 5, 6, -3, 7, -20, 2, 3} The highest possible sum
	 * from any subsequence here is 15, the value to return. 15 is from 5+6+(-3)+7.
	 * 
	 * @param input - The array of integers
	 * @return the highest possible sum of any subsequence
	 */
	public static int highestSubsequenceSum(int[] input) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
}
