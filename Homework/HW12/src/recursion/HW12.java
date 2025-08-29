package recursion;

/**
 * Class: HW12
 * @author CSSE Faculty
 * Purpose: Provide practice implementing recursive operations that may or may not require a separate recursive helper operation
 *  
 */
public class HW12 {

	/**
	  * For this problem, you are to use recursion to find if each element
	  * of one array appears in the other array in the same order.  There
	  * may be extra values in the input array.
	  * <br>
	  * Example 1:
	  * input = {1, 2, 3, 4, 5, 6, 7}
	  * toFind = {3, 4, 5}
	  * Given the above input, this should return true
	  * <br>
	  * Example 2:
	  * input = {1, 2, 3, 4 ,5, 6, 7}
	  * toFind = {1, 3, 5}
	  * Given the above input, this should return true
	  * <br>
	  * Example 3:
	  * input = {1, 3, 5, 7, 9}
	  * toFind = {3, 4, 5}
	  * false because 4 is not in the array this should return false
	  * <br>
	  * Example 4:
	  * input = {1, 3, 5, 7, 4}
	  * toFind = {3, 4, 5}
	  * false because the order is 3,5,4 in the input array
	  *
	  * @param input - the array to find the values in
	  * @param toFind - the array to find in the other
	  * @return true if toFind is found in input, false otherwise
	  */
	
	public static boolean findIn(int[] input, int[] toFind) {
		throw new UnsupportedOperationException("TODO: Implement this method");
	} // findIn


	/**
	 * In this problem, you will calculate
	 * <a href="https://en.wikipedia.org/wiki/Compound_interest">compound interest</a>
	 * with monthly compounding. You are given an initial principal amount, an
	 * annual interest rate (as a percentage), and the number of months to compound.
	 * You should return the final balance after the specified number of months.
	 * <br>
	 * The formula for monthly compounding is:
	 * New Balance = Previous Balance * (1 + (annual rate / 100) / 12)
	 * <br>
	 * For example:
	 * principal = 1000.0, annualRate = 6.0, months = 12
	 * After 12 months, the balance should be approximately 1061.68
	 * <br>
	 * principal = 5000.0, annualRate = 4.8, months = 24
	 * After 24 months, the balance should be approximately 5502.74
	 *
	 * @param principal - the initial amount of money
	 * @param annualRate - the annual interest rate as a percentage (e.g., 6.0 for 6%)
	 * @param months - the number of months to compound
	 * @return the final balance after compounding for the specified months
	 */
	public static double compoundInterest(double principal, double annualRate, int months) {
		throw new UnsupportedOperationException("TODO: Implement this method");
	} // compoundInterest


	/**
	 * For this problem, you are given a string and need to recursively check whether the string is a near-palindrome.
	 * A near-palindrome is defined as a string that can become a palindrome by changing at most one character.
	 * (Recall that a palindrome is a string that reads the same forwards and backwards.)
	 * <br>
	 * Examples:
	 * "racecar" is a palindrome, so it is also a near-palindrome (no changes needed).
	 * "facecar" can become "racecar" by changing 'l' to 'r', so it is a near-palindrome (one change needed).
	 * "hello" cannot become a palindrome with just one change, so it is not a near-palindrome (two changes needed).
	 * "abca" can become "abba" or "acca" by changing 'c' to 'b' or 'b' to 'c', so it is a near-palindrome (one change needed).
	 * <br>
	 * @param input the string to check
	 * @return true if the string is a near-palindrome, false otherwise
	 */
	public static boolean isNearPalindrome(String input) {
		throw new UnsupportedOperationException("TODO: Implement this method");
	} // isNearPalindrome


	/**
	 * For this problem, you are given an array of integers.  You are to use 
	 * recursion to find the subsequence of elements that yields the highest
	 * sum.  A subsequence can be any set of the array values that are sequential.
	 * That is, if the values at indices 3, 4 and 5 produce the highest sum, that
	 * sum is what you should return.  You cannot sum numbers that are not sequential
	 * however.  For instance, you cannot return a sum that was from elements 
	 * 3, 4, 6 and 7.  Those values skipped element 5.
	 * <br>
	 * For the sake of simplicity, you can assume that there is a subsequence in
	 * the array that has a maximum sum and contains more than one element in the 
	 * sequence.  In other words, the subsequence with the highest sum will consist
	 * of at least two values.
	 * <br>
	 * Below are some examples:
	 * input = {-1, -2, 3, 4, 6, -2, -2}
	 * The highest possible sum from any subsequence is 13, the value to return.
	 * 13 is from 3+4+6.  Those elements in sequence yielded the highest sum of
	 * any other subsequence.
	 * <br>
	 * input = {-1, -2, 2, 5, 6, -1, 7, -3}
	 * The highest possible sum from any subsequence here is 19, the value to 
	 * return.  19 is from 2+5+6+(-1)+7.  Note that the subsequence from indices
	 * 2 to 6 yields a higher sum than 2 to 4 even though it includes a negative
	 * value.
	 * <br>
	 * input = {-1, 2, 3, 4, -10, 5, 6, -3, 7, -20, 2, 3}
	 * The highest possible sum from any subsequence here is 15, the value to 
	 * return.  15 is from 5+6+(-3)+7.
	 * 
	 * @param input - The array of integers
	 * @return the highest possible sum of any subsequence
	 */
	public static int highestSubsequenceSum(int[] input) {
		throw new UnsupportedOperationException("TODO: Implement this method");
	} // highestSubsequenceSum

	
} // end HW12
