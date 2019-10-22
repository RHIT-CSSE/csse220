

import java.util.List;

public class Recursion {

	private static void joinHelper(int[] resultArray, int insertIndex, List<Integer> s1, List<Integer> s2) {
		if (!((s1.size() == 0) && (s2.size() == 0))) {
			if ((s1.size() > 0) && (s2.size() > 0)) {
				resultArray[insertIndex] = (s1.get(0) < s2.get(0)) ? s1.remove(0) : s2.remove(0);
			} else if (s1.size() > 0) {
				resultArray[insertIndex] = s1.remove(0);
			} else if (s2.size() > 0) {
				resultArray[insertIndex] = s2.remove(0);
			}
			insertIndex++;
			joinHelper(resultArray, insertIndex, s1, s2);
		}
	}

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
		int[] resultArray = new int[s1.size() + s2.size()];
		joinHelper(resultArray, 0, s1, s2);
		return resultArray;
	}

	// **************************************************************

	private static int lastLocationHelper(String s, int currentLoc, char c) {
		if (currentLoc == s.length()) {
			return -1;
		} else {
			int nextLoc = lastLocationHelper(s, currentLoc + 1, c);
			if (nextLoc >= 0) {
				return nextLoc;
			} else if (s.charAt(currentLoc) == c) {
				return currentLoc;
			} else {
				return -1;
			}
		}
	}

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
		return lastLocationHelper(s, 0, c);
	}

	// **************************************************************

	private static int countHelper(String subString, String huntingGround, int countSoFar) {
		if (subString.length() == 0) {
			return 0;
		} else if (huntingGround.length() < subString.length()) {
			return countSoFar;
		} else {
			int subLength = subString.length();
			if (subString.equals(huntingGround.substring(0, subLength))) {
				return countHelper(subString, huntingGround.substring(subLength), countSoFar + 1);
			} else {
				return Math.max(countSoFar, countHelper(subString, huntingGround.substring(1), 0));
			}
		}
	}

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
		return countHelper(subString, huntingGround, 0);
	}
	
	// **************************************************************

	/**
	 *  Takes two int parameters, x and logX
	 *  
	 *  Returns true iff log2(x) = logX
	 *  Where log2 means log base 2
	 *  e.g.
	 *  isExactlyLog2Of(8,3) returns true because 2^3 = 8
	 *  
	 *  See RecursionTest.java for 4 example calls
	 */
	public static boolean isExactLog2Of(int x, int logX) {
		if (x < 1) {
			return false;
		} else if ((x == 1) && (logX == 0))  {
			return true;
		} else {
			return isExactLog2Of(x/2, logX - 1);
		}		
	}
	
		
	
	
	

}
