import java.util.ArrayList;

import org.hamcrest.MatcherAssert;

public class SmallProblems {

	
	/**
	 * In this problem, you will interchange two integer arrays of equal size into an 
	 * ArrayList of integers.  The first input will be interchanged in order of the 
	 * elements.  The second input should be interchanged in reverse order.
	 * 
	 * That is, given two arrays, the resulting ArrayList should contain the first element 
	 * of the first input, following the last input of the second input, and so on.
	 * 
	 *  For example:
	 *  	Given two arrays {1, 2, 3, 4, 5, 6, 7} and {10, 20, 30, 40, 50, 60, 70}
	 *  	you should return an ArrayList {1, 70, 2, 60, 3, 50, 4, 40, 5, 30, 6, 20, 7, 10}
	 *  
	 *  As a smaller example:
	 *  	Given two arrays {100, 200} and {4000, 5000}, you should 
	 *  	return {100, 5000, 200, 4000}
	 *  
	 *  Your code should work even if the arrays are empty.  In this case, you would return
	 *  and empty ArrayList
	 * 
	 * @param input1 the first input array (to be interchanged in order)
	 * @param input2 the second input array (to be interchanged in reverse order)
	 * @return the two arrays interchanged with the second input in reverse order
	 */
	public static ArrayList<Integer> interchange(int[] input1, int[] input2) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		for(int i = 0; i < input1.length; i++) {
			toReturn.add(input1[i]);
			toReturn.add(input2[input2.length - 1 - i]);
		}
		return toReturn;
	}
	
	/**
	 * For this problem, you are given an array of pairs of integers, except for maybe one.  
	 * You are to loop through the array to discover the value that does not have a corresponding 
	 * pair. If all values in the array have a corresponding pair, you should return -1.  You
	 * may assume that there is at most one value that does not have a corresponding pair.
	 * 
	 * For example, given the array {1, 2, 3, 1, 3}, you should return 2 because it is the only
	 * value that does NOT have a corresponding pair.
	 * 
	 * As another example, given the array {1, 1, 2, 3, 2, 3}, you should return -1 because all
	 * values have a corresponding pair.
	 * 
	 * As a final example, given the array {1, 2, 1, 2, 3, 4, 3, 4, 5}, you should return 5.
	 * 
	 * You may use a HashMap for this problem, but you are not required to.
	 *  
	 * @param input - the input integer array with pairs of numbers, one possibly missing
	 * @return the integer value of the element that does not have a corresponding pair, -1 otherwise
	 */
	public static int findThePairs(int[] input) {
 		for(int i = 0; i < input.length; i++) {
 			int curVal = input[i];
 			boolean found = false;
 			for(int j = 0; j < input.length; j++) {
 				if(j == i)
 					continue;
 				if(curVal == input[j]) {
 					found = true;
 					break;
 				}
 			}
 			if(!found)
 				return curVal;
 		}
 		
		return -1;
	}
	
	/**
	 * For this problem, you are given a String and you are to return an ArrayList of Strings
	 * that has every subrange String possible, starting from each character.
	 * 
	 * For example, given a String "abc", you are to return an ArrayList of Strings that have the
	 * values {"a", "ab", "abc", "b", "bc", "c"}
	 * 
	 * As a bigger example, if you are given the String "abcdef", you are to return an ArrayList
	 * of Strings that contain: {"a", "ab", "abc", "abcd", "abcde", "abcdef",
	 *							 "b", "bc", "bcd", "bcde", "bcdef",
	 *							 "c", "cd", "cde", "cdef",
	 *							 "d", "de", "def",
	 *							 "e", "ef", 
	 *						     "f"}
	 *
	 * A String of a single character, like "a" should result in returning an ArrayList of
	 * one String, namely "a"
	 * 
	 * An empty String should result in returning an empty ArrayList
	 * 
	 * The order of the elements within the returned ArrayList do not matter as long as it has
	 * all the required subrange Strings.
	 *  
	 * @param input - the String input you are to iterate over
	 * @return an ArrayList of Strings that contain all the possible subranges starting from each letter
	 */
	public static ArrayList<String> getSubrangeStrings(String input) {
		ArrayList<String> substrings = new ArrayList<String>();
		for(int i = 0; i < input.length(); i++) {
			for(int j = i+1; j <= input.length(); j++) {
				substrings.add(input.substring(i, j));
			}
		}
		return substrings;
	}
}

