package recursion;

/**
 * 
 * These problems should ALL be solved recursively - not with the use of rarely
 * used library functions, for loops, or while loops.
 * 
 * You can use a recursive helper function on any problem 
 * if that makes it easier for you.
 * 
 * Solve any 3 of these 4 problems for full credit. No bonus points for doing
 * the 4th. :)
 * 
 */

public class Recursion {
	/**
	 * Count Consecutive Pairs. Given a String you must return the 
	 * number of times that two characters occur consecutively within it.
	 * 
	 * 
	 * For example, 
	 * "hello" returns 1. 
	 * "mississippi" returns 3. 
	 * "csse220" returns 2. 
	 * "smthng" returns 0. 
	 * "EEEEeek!" returns 4.
	 * "" returns 0.
	 * 
	 * Reminder: no loops on any of these problems. You may use a recursive
	 * helper method if you like, but it isn't required.
	 * 
	 * @param input - a String
	 * @return int  - the number of consecutive letter found in input
	 */
	public static int countConsecutivePairs(String input) {
		if (input.length() == 1 || input.length() == 0) {
			return 0;
		}
		if (input.charAt(0) == input.charAt(1)) {
			return 1 + countConsecutivePairs(input.substring(1));
		} else {
			return countConsecutivePairs(input.substring(1));
		}
	}

	/**
	 * You are given an array of integers. You are to determine if
	 * there are more even numbers, odd numbers, or a tie. If there are
	 * more  even number then you should return "evens". If there are more
	 * odd numbers then you should return "odds". If there are an equal
	 * number of evens and odds, you should return "tie".
	 * 
	 * Examples:   evensOddsOrTie( {1,2,3,4,5,6 } ) -> "tie"
	 *             evensOddsOrTie( {1,2,3,4,5 } )   -> "odds"
	 *             evensOddsOrTie( {2,3,4,5,6 } )   -> "evens"
	 *             evensOddsOrTie( {3 } )           -> "odds"
	 *             evensOddsOrTie( {1,1,4,4,8,6 } ) -> "evens"
	 *             evensOddsOrTie( { } )            -> "tie"
	 * 
	 * Reminder: no loops on any of these problems. You may use a recursive
	 * helper method if you like, but it isn't required.
	 * 
	 * @param nums - array of ints
	 * @return String - "tie" "odds" or "evens" depending on how many evens/odds appear
     */
	public static String evensOddsOrTie(int[] nums) {
		int val = evensOddsOrTieHelper(nums, 0);
		if ( val > 0 ) {
			return "evens";
		} else if ( val < 0) {
			return "odds";
		}else {
			return "tie";
		}
	}
	
	public static int evensOddsOrTieHelper(int[] nums, int pos) {
		if (pos == nums.length) {
			return 0;
		}
		if (nums[pos] % 2 == 0) {
			return 1 + evensOddsOrTieHelper(nums, pos+1);
		} else {
			return -1 + evensOddsOrTieHelper(nums, pos+1);
		}
	}
	
	
	/** 
	 * Returns the average length of the Strings in an array of Strings as a double.
	 * 
	 * You can assume a NON-EMPTY array (although the array may contain empty-strings i.e. "" )
	 * 
	 * ["apple","banana","orange","left"]  returns true.
	 * ["a","aa","aaa","aaaa"] returns 2.5;
	 * [""] returns 0.0;
	 * 
	 * Hint: you will want a helper method for this problem
	 * 
	 * @param words : Array of Strings
	 * @return average length of strings in array
	 */
	public static double averageWordLength(String[] words) {
		if (words.length == 0) {
			return 0.0;
		}
		return averageWordLengthHelper(words, 0) / words.length; 
	}
	
	public static double averageWordLengthHelper(String[] words, int pos) {
		if ( pos > words.length-1) {
			return 0;
		}else if ( pos == words.length-1) {
			return words[pos].length();
		} else {
			return words[pos].length() + averageWordLengthHelper(words, pos+1);
		}
		
	}
	
	/**
	 * This method returns true if the given array contains matching pairs 
	 * of positive and negative numbers (with the same absolute value) 
	 * in opposite relative positions. (This is similar to a palindrome.)
	 * 
	 * You can assume all numbers in the first half of the array are positive
	 * and all numbers in the second half of  the array are negative. (Zero
	 * will not appear in the array)
	 * 
	 * Examples:
	 *  [ 1, 2, -2, -1 ]   returns true
	 *  [ 7, 3, -3, -7 ]   returns true
	 *  [ 1, 2, 3, -3, -2, -1 ] returns true
	 *  []  returns true
	 *  
	 *  [1 2 3 -2 -1] returns false
	 *  [-3] returns false
	 *  [ 1, 2, -1, -2 ]   returns false
	 *  [ 9, 3, -9, -3 ]   returns false
	 *  [ 1, 2, 3, -4, -1, -1 ] returns false
	 * 
	 * You'll want to use a recursive helper method for this one.
	 * 
	 * *YOU MAY NOT MAKE A COPY OF THE ARRAY*
	 * 
	 * Hint: you will want a helper method for this problem
	 * 
	 * @param ar  - array of integers
	 * @return boolean indicating if the positive and negative numbers match
	 */
	public static boolean hasMatchingPositiveAndNegatives(int[] ar) {
		if (ar.length %2 == 1) {
			return false;
		}
		return hasMatchingPositiveAndNegativesHelper(ar, 0, ar.length-1);
	}
	
	private static boolean hasMatchingPositiveAndNegativesHelper(int[] ar, int pos1, int pos2) {
		if ( pos2 < pos1) {
			return true;
		}
		if ( pos2 == pos1) {
			return false;
		}
		if (ar[pos1] == -ar[pos2] ) {
			return hasMatchingPositiveAndNegativesHelper( ar, pos1+1, pos2-1 );
		} else {
			return false;
		}
	}

	
	
	
	
	/**
	 *  NOT USED IN THIS EXAM
	 *  
	 *  
	 *  
	 * Returns true for any String whose vowels alone are a palindrome.
	 * 
	 * Assume all characters are lowercase.
	 * 
	 * "", "a", "acad", "ababba", "abbbea", "onegoodness"  return true.
	 * "apple","basdeioei","done","testing" return false
	 * 
	 * Hint: you may want to write a function to determine is a character
	 * is a vowel
	 * 
	 */
	public static boolean isAVowelPalindrome(String s) {
		//length 0,1 means we have symmetry
		if (s.length() <= 1) {
			return true;
		}
		//if the first letter is a vowel, find a match before moving on
		if ( isVowel( s.charAt(0)  ) ) {
			//if matching vowels at beginning and end shrink both ends
			if (s.charAt(0) == s.charAt(s.length()-1 ) ) {
				return isAVowelPalindrome( s.substring(1, s.length() -1 ));
			// if its not a vowel at the end, shrink end
			} else if ( !isVowel(s.charAt(s.length()-1) )  ) {
				return isAVowelPalindrome( s.substring( s.length()-1 ));
			//if it is a vowel at the end, but doesnt match return false
			} else {
				return false;
			}
		} else {
			//otherwise move forward to find a vowel
			return isAVowelPalindrome( s.substring(1));
		}
	}
	
	public static boolean isVowel(char c) {
		return c == 'a' ||
				c == 'e' ||
				c == 'i' ||
				c == 'o' ||
				c == 'u' ;
	}
	


}
