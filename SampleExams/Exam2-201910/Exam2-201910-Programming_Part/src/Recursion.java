

import java.util.List;

public class Recursion {

	/**
	 * 
	 * Takes two parameters s1 and s2 of type List<Integer> 
	 * The integers in s1 and s2 appear in non-decreasing order 
	 * 
	 * Returns one int[] containing all the integers from s1 and s2 in non-decreasing order 
	 * Your can modify s1 and s2 if you want and my solution leaves s1 and s2 empty.
	 * 
	 * You will want to use a helper function for this one.
	 * 
	 * See RecursionTest.java for 5 example calls
	 * 
	 */
	public static int[] join(List<Integer> s1, List<Integer> s2) {
		return new int[0];
	}

	// **************************************************************

	/**
	 * 
	 * Takes a string s and and a character c 
	 * 
	 * Returns the index of the last location that c appears in s 
	 * 
	 * This solution does not require a helper function but you may find it handy to use one.
	 * 
	 * If c is not in s, then returns -1
	 * 
	 * See RecursionTest.java for 6 example calls
	 */
	public static int lastLocation(String s, char c) {
		
		return Integer.MIN_VALUE;
	}

	// **************************************************************

	/**
	 * 
	 * Takes two parameters, subString and huntingGround 
	 * 
	 * Returns the count of the max number of times that subString appears 
	 * consecutively (i.e., back-to-back) in string huntingGround
	 * 
	 * You will want to use a helper function for this one.
	 * 
	 * e.g.
	 * "XX" and "qXXXXqXX" returns 2 because the first XXXX is two repetitions
	 * and the second XX is one repetition
	 * 
	 * See RecursionTest.java for 9 example calls
	 */
	public static int countConsequtiveTimesSubstringAppears(String subString, String huntingGround) {
		return Integer.MIN_VALUE;
	}
	
	// **************************************************************

	/**
	 *  Takes two int parameters, x and logX
	 *  
	 *  Returns true iff log2(x) = logX
	 *  Where log2 means log base 2
	 *  eg
	 *  isExactlyLog2Of(8,3) returns true because 2^3 = 8
	 *  
	 *  See RecursionTest.java for 4 example calls
	 */
	public static boolean isExactLog2Of(int x, int logX) {
		return false;
	}
	
}
