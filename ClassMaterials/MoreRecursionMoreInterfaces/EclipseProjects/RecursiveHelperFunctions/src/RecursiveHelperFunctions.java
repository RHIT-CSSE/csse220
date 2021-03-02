
/**
 * Code to help you practice functions that need recursive helpers
 * 
 * @author hewner
 *
 */
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
		
		
	
		return sumArraySingleIndex(0, array);
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
		return 0;
	}
	
	// 100
	// 0 99
	// n  n-1
	
	public static int sumArraySingleIndex(int index, int[] array) {
		System.out.println( "sumArraySingleIndex(" + index   );
		//base case
		if (  index == array.length - 1  ) {
			System.out.println( "returning" + array[index]  );
			return array[index];
		} else {
			System.out.println( "returning" + array[index] + " + remainder..."  );
			return array[index] + sumArraySingleIndex(index+1, array);
		}
		
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
		if (array.length <= 1) {
			return true;
		}
		return isOrderedHelper( 1, array);
	}
	
	
	public static boolean isOrderedHelper( int index, int[] array) {
		if (index == array.length -1) {
			//at end of array
			return array[index-1] < array[index];
		} else {
			//smaller problem
			if (  array[index-1] < array[index]  ) {
				//move on to the next index
				return isOrderedHelper( index+1, array);
			} else {
				//
				return false;
			}
		}
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
		return countUpper(input) == 1;
	}
	
	public static int countUpper( String input) {
		if (input.length() == 0) {
			return 0;
		}
		if ( Character.isUpperCase( input.charAt(0) )) {
			return 1 + countUpper(input.substring(1));
		} else {
			return countUpper(input.substring(1));
		}
		
	}
	
	
	
	
	public static boolean hasEOUL1(int index, boolean foundUpper, String input) {
		
		System.out.println("hasEOUL1: index:" + index + ", foundUpper " + foundUpper +" input:"+input    );
		if ( Character.isUpperCase( input.charAt(index) )) {
			if (foundUpper == true) {
				return false;
			} else {
				foundUpper = true;
			}
		}
		if ( index == input.length()-1 ) {
			return foundUpper;
		} else {
			return hasEOUL1(index+1, foundUpper, input);
		}
	}
	
	public static boolean hasEOUL2(int index, int numberOfUpper, String input) {
		if ( Character.isUpperCase( input.charAt(index) )) {
			numberOfUpper++;
		}
		
		if ( index == input.length()-1 ) {
			return numberOfUpper == 1;
		} else {
			if (numberOfUpper > 1) {
				return false;
			} else {
				return hasEOUL2(index+1, numberOfUpper, input);
			}
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
		return 0;
	}



}
