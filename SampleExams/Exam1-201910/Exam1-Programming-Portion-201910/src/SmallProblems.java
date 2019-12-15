import java.util.ArrayList;

import org.hamcrest.MatcherAssert;

public class SmallProblems {

	/**
	 * The following method takes in a String and returns a new ArrayList made of
	 * characters. The characters in the array list are copies of those found only
	 * in the even indexed locations of the String, but they are in reverse order.
	 * 
	 * For Example: "Hello" => <'o','l','H'> "oalbacfdfeufB" =>
	 * <'B','u','f','f','a','l','o'> "Z" => <'Z'> "" => <>
	 *
	 * @param input - The original string - will not be null
	 * @return - A new ArrayList of character from the even indexed locations of the
	 *         input string, but in reverse order
	 */
	public static ArrayList<Character> extractAndReverse(String input) {
		
		return null;
	}

	/**
	 * In this problem, an array represents the squares on an unusual board game.
	 * 
	 * An positive index represents an instruction to move forward (e.g. a 2 means 
	 * "move forward 2 squares").  A negative index means move backwards.
	 * 
	 * Squares that have a 0 are "end locations".  Once there, no more movement is 
	 * possible.
	 * 
	 * Given a board and a starting position (index), the goal of the function
	 * is to compute the path till arriving on an end location.
	 * 
	 * You can assume:
	 * a.  An instruction will never move you off the board
	 * b.  The path will not have any cycles (we'll address this issue in the next
	 * part of the problem).
	 * 
	 * Return an ArrayList of indices visited in inputA in the order in which they
	 * were visited, starting with startLoc in position zero of the ArrayList.
	 * 
	 * Examples: computeBoardPathV1([2,-1,0], 1) --> <1,0,2>
	 * computeBoardPathV1([3,3,-2,0,-2], 1) --> <1,4,2,0,3>
	 * computeBoardPathV1([6,4,2,0,-1,-3,-5], 0) --> <0,6,1,5,2,4,3>
	 * computeBoardPathV1([6,4,2,0,-1,-3,-5], 4) --> <4,3>
	 * computeBoardPathV1([0], 0) --> <0>
	 * 
	 * This is only part of the problem.  Solving this function but not V2 is worth 5 points.
	 * 
	 * @param input the game board
	 * @param startingLoc the index where the path should start
	 * @return The indexes traveled from startingLoc to the 0 "end location"
	 */
	public static ArrayList<Integer> computeBoardPathV1(int[] input, int startLoc) {
		
		return null;
	}

	/**
	 * This is the same problem as followRelativeIndicesV1 (the operation above)
	 * except that there might be cycles in the path so that zero will never be
	 * reached from the startLoc
	 * 
	 * Start from your V1 code, and make modifications to handle cycles.
	 * 
	 * If there are no cycles, then this operation should work produce the same
	 * output as V1 (above)
	 * If there a cycle is detected by your operation, it should return an empty
	 * ArrayList
	 * 
	 * 
	 * Examples: computeBoardPathV2([2,-1,0], 1) --> <1,0,2>
	 * computeBoardPathV2([4,2,4,0,-2,-4,-6], 5) --> <5,1,3>
	 * computeBoardPathV2([4,2,4,0,-2,-4,-6], 2) --> <>
	 * computeBoardPathV2([1,-1,0], 0) --> <>
	 * 
	 * Solving both V1 and V2 is worth 10 points.
	 * 
	 * @param input the game board
	 * @param startingLoc the index where the path should start
	 * @return The indexes traveled from startingLoc to the 0 "end location", or the empty
	 * list the result produces a cycle
	 */
	public static ArrayList<Integer> computeBoardPathV2(int[] input, int startLoc) {
		
		return null;
	}
}
