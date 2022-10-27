
public class RecursiveHelperFunctions {

	
	
	/**
	 * Returns the sum of all the elements in the array
	 * 
	 * This is difficult to do recursively without duplicating the array
	 * 
	 * You can assume the array has at least one element
	 * 
	 * Examples:
	 * For array {1,2,3,4}
	 * sumWholeArray(array) returns 10
	 * 
	 * @param array
	 * @return sum of array
	 */
	public static int sumWholeArray(int[] array) {
		return sumArray(0, array.length - 1, array);
	}
	
	/**
	 * 
	 * Sums an array recursively.
	 * 
	 * Both indexes are inclusive so sumArray(0,0,array) returns the first value
	 * of the array
	 * 
	 * You can assume that fromIndex is always <= toIndex
	 * 
	 * Examples:
	 * For array {1,2,3,4}
	 * sumArray(0,3,array) returns 10
	 * sumArray(1,3,array) returns 9
	 * sumArray(2,2,array) returns 3
	 * 
	 * @param fromIndex
	 * @param toIndex
	 * @param array
	 * @return sum of elements
	 */
	public static int sumArray(int fromIndex, int toIndex, int[] array) {
		if(fromIndex == toIndex)
			return array[fromIndex];
		return array[fromIndex] + sumArray(fromIndex+1,toIndex,array);
	}
	
	/**
	 * Returns true if the array is in increasing order
	 * 
	 * You'll want to use a recursive helper function
	 * 
	 * Examples:
	 * {1,2,3,4} returns true
	 * {2,3,4} returns true
	 * {4,3} returns false
	 * {4} returns true
	 * 
	 * @param array
	 * @return true if list is sorted in increasing order
	 */
	public static boolean isOrdered(int[] array) {
		return isOrderedAfterIndex(0, array);
	}

	public static boolean isOrderedAfterIndex(int index, int[] array) {
		if(index > array.length - 2)
			return true;
		if(array[index] > array[index + 1])
			return false;
		return isOrderedAfterIndex(index + 1, array);
	}
	
	/**
	 * Returns true if the string has exactly one uppercase letter, false otherwise
	 * 
	 * You'll want to use a recursive helper function
	 * 
	 * Use Character.isUpperCase to check if a letter is uppercase
	 * 
	 * Examples:
	 * "abc" returns false
	 * "aBc" returns true
	 * "aBcD" returns false
	 * "A" returns true
	 * "" returns false
	 * 
	 * @param input
	 * @return true if there is one uppercase character
	 */
	public static boolean hasExactlyOneUppercase(String input) {
		return countUppercase(input) == 1;
	}

	public static int countUppercase(String input) {
		if(input.isEmpty())
			return 0;
		if(Character.isUpperCase(input.charAt(0))) {
			return 1 + countUppercase(input.substring(1));
		} else {
			return countUppercase(input.substring(1));
		}
	}
	
	/**
	 * Returns the length of the longest chain of repeated characters
	 * 
	 * You'll want to use a recursive helper function
	 * 
	 * 
	 * Examples:
	 * "aaabaa" returns 3
	 * "aaabbbbcaaa" returns 4
	 * 	  
	 * @param input
	 * @return length of chain
	 */
	public static int longestChainLength(String input) {
		if(input.length() == 0)
			return 0;
		return longestChainWithLetter(input.charAt(0), 1, input.substring(1));
	}

	public static int longestChainWithLetter(char currentLetter, int currentChain, String input) {
		if(input.isEmpty())
			return currentChain;
		if(input.charAt(0) == currentLetter) {
			return longestChainWithLetter(currentLetter, currentChain + 1, input.substring(1));
		} else {
			int otherChain = longestChainWithLetter(input.charAt(0), 1, input.substring(1));
			return Math.max(currentChain, otherChain);
		}
	}


}
