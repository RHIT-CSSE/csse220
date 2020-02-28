
/**
 * A set of recursion problems that require the use of recursive helper methods.  
 * Note that you only have to solve 2 of 3 of these to get full credit.
 *
 * Many of these problems have iterative solutions as well but you 
 * must use a recursive approach.
 *
 * @author wilkin.
 *         Created Feb 28, 2020.
 */
public class RecursiveHelperMethodsPractice {
	
	/**
	  * For this problem, you are to use recursion to find if each element
	  * of one array appears in the other array in the same order.  There
	  * may be extra values in the input array.
	  * 
	  * You'll want a helper function to solve this problem
	  * 
	  * Example 1:
	  * input = {1, 2, 3, 4, 5, 6, 7}
	  * toFind = {3, 4, 5}
	  * Given the above input, this should return true
	  * 
	  * Example 2:
	  * input = {1, 2, 3, 4 ,5, 6, 7}
	  * toFind = {1, 3, 5}
	  * Given the above input, this should return true
	  * 
	  * Example 3:
	  * input = {1, 3, 5, 7, 9}
	  * toFind = {3, 4, 5}
	  * false because 4 is not in the array this should return false
	  * 
	  * Example 4:
	  * input = {1, 3, 5, 7, 4}
	  * toFind = {3, 4, 5}
	  * false because the order is 3,5,4 in the input array
	  * 
	  * @param input - the array to find the values in
	  * @param toFind - the array to find in the other
	  * @return true if toFind is found in input, false otherwise
	  */
	
	static boolean findIn(int[] input, int[] toFind) {
		return false;
	}
	
	/**
	 * For this problem, you should use recursion to find the 3rd value greater than
	 * the input value called num.
	 * 
	 * in an integer array, you are to return the index of that third value that is
	 * greater than num.  If a third value greater than num does not exist, you should 
	 * return -1.
	 * 
	 * Do not make any changes to the array.
	 * 
	 * For example:
	 * input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	 * num = 4
	 * You should return the index of the value 7 (thus you are to return the index of
	 * 6) because it is the third value in the array greater than the value num = 4
	 * 
	 * @param input - the integer array you are to find the third element larger than num
	 * @param num - the value to find three elements greater than
	 * @return the index of the third value greater than num, -1 if a third one does not 
	 * exist in the input array
	 */
	public static int findThirdGreater(int[] input, int num) {
		return 0;
	}
	
	
	/**
	 * For this problem, you are given an array of integers.  You are to use 
	 * recursion to find the subsequence of elements that yields the highest
	 * sum.  A subsequence can be any set of the array values that are sequential.
	 * That is, if the values at indices 3, 4 and 5 produce the highest sum, that
	 * sum is what you should return.  You cannot sum numbers that are not sequential
	 * however.  For instance, you cannot return a sum that was from elements 
	 * 3, 4, 6 and 7.  Those values skipped element 5.
	 * 
	 * For the sake of simplicity, you can assume that there is a subsequence in
	 * the array that has a maximum sum and contains more than one element in the 
	 * sequence.  In other words, the subsequence with the highest sum will consist
	 * of at least two values.
	 * 
	 * For this problem, you will want to use a recursive helper method.
	 * 
	 * Below are some examples:
	 * input = {-1, -2, 3, 4, 6, -2, -2}
	 * The highest possible sum from any subsequence is 13, the value to return.
	 * 13 is from 3+4+6.  Those elements in sequence yielded the highest sum of
	 * any other subsequence.
	 * 
	 * 
	 * input = {-1, -2, 2, 5, 6, -1, 7, -3}
	 * The highest possible sum from any subsequence here is 19, the value to 
	 * return.  19 is from 2+5+6+(-1)+7.  Note that the subsequence from indices
	 * 2 to 6 yields a higher sum than 2 to 4 even though it includes a negative
	 * value.
	 * 
	 * 
	 * input = {-1, 2, 3, 4, -10, 5, 6, -3, 7, -20, 2, 3}
	 * The highest possible sum from any subsequence here is 15, the value to 
	 * return.  15 is from 5+6+(-3)+7.
	 * 
	 * @param input - The array of integers
	 * @return the highest possible sum of any subsequence
	 */
	public static int highestSubsequenceSum(int[] input) {
		
		return 0;
	}

}

