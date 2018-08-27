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
	 * Count vowels. You must return the number of a, e, i, o, or u in the given
	 * string. For the purpose of this problem, don't consider y to be a vowel.
	 * 
	 * For simplicity, assume the string doesn't contain uppercase letters.
	 * 
	 * For example, 
	 * "hello" returns 2. 
	 * "buffalo hewner" returns 5. 
	 * "csse220" returns 1. 
	 * "smthng" returns 0. 
	 * "this would be a great problem" returns 9.
	 * 
	 * Reminder: no loops on any of these problems. You may use a recursive
	 * helper method if you like, but it isn't required.
	 */
	public static int countVowels(String input) {
		if (input.length() == 0) {
			return 0;
		}
		
		char c = input.charAt(0);
		int countThis = 0;
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			countThis = 1;
		}
		return countThis + countVowels(input.substring(1));
	}

	/**
	 * You are given a positive integer. Make a "move" as follows:
	 * If the integer is even, divide by 2, otherwise add 1. 
	 * Then repeat the process until you reach the number 1. 
	 * This method counts how many "moves"
	 * it takes to get to 1. 
	 * 
	 * Examples:   countMovesUntilOne(1) -> 0   ( 1 )
	 *             countMovesUntilOne(2) -> 1   ( 2/2  -> 1)
	 *             countMovesUntilOne(3) -> 3   ( 3+1  -> 4/2  -> 2/2 -> 1)
	 *             countMovesUntilOne(11) -> 6  ( 11+1 -> 12/2 -> 6/2 -> 3+1 -> 4/2 -> 2/2 -> 1)
	 */
	public static int countMovesUntilOne(int num) {
		if (num == 1) {
			return 0;
		}
		if (num % 2 == 0) {
			return 1 + countMovesUntilOne(num/2);
		} else {
			return 1 + countMovesUntilOne(num+1);
		}
	}
	
	/**
	 * This method returns true if the given array contains a sequence followed 
	 * by the same sequence, and no other elements
	 * 
	 * Examples:
	 * [1,2,3,1,2,3] and [4,5,2,3, 4,5,2,3] return true.
	 * [1,2,3,1,2,4] and [1,2,3,5,1,2,3] and [1,2,3,1,2,3,4] return false.
	 * 
	 * You'll want to use a recursive helper method for this one.
	 * Additional requirement: You cannot use Arrays.equals(), 
	 * but must compare the elements.
	 */
	public static boolean isDoubledArray(int[] ar) {
		if (ar.length %2 == 1) {
			return false;
		}
		return isDoubledArrayHelper(ar, 0, ar.length/2);
	}
	
	private static boolean isDoubledArrayHelper(int[] ar, int pos1, int pos2) {
		if (pos2 >= ar.length) {
			return true;
		}
		return ar[pos1] == ar[pos2] && isDoubledArrayHelper(ar, pos1+1, pos2+1);
	}

	/** 
	 * Returns true for the given string if every y at the 
	 * start of the string has a matching "triple z" (zzz) at the end 
	 * of the string - ignore all other characters. 
	 * You can assume that any y's all occur before any z's.
	 * Assume all characters are lowercase.
	 * 
	 * yaazzz, yyaazzzzzz, iyzzz, iyiizzzi, yaybcdzzzezzz all return true.
	 * iyiizzz returns true.
	 * yazz, iyiizi, and eyyeezzzezze return false
	 */
	public static boolean hasYTripleZ(String s) {
		if (s.length() == 0) {
			return true;
		}
		if (s.charAt(0) != 'y') {
			return hasYTripleZ(s.substring(1));
		}
		// s starts with a y. If there aren't enough chars, we bail out.
		if (s.length() < 4) {
			return false;
		}
		// If it ends with zzz, strip off the y and zzz.
		if (s.substring(s.length()-3, s.length()).equals("zzz")) {
			return hasYTripleZ(s.substring(1, s.length()-3));
		} 
		
		// strip off the final character and try again to find a zzz.
		return hasYTripleZ(s.substring(0, s.length()-1));
		
		
		
	}

}
