package TenProblems;


/**
 * Class: TenProblems
 * 
 * @author CSSE Faculty Purpose: This exercise is intended to give you practice
 *         in Java with various algorithms learned in the previous course
 *         CSSE120
 *         
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         TODO: cite your help here or say "only used CSSE220 materials"
 *************************************************************************************** 
 */
public class TenProblems {

	/**
	 * Given a particular point in the coordinate plane, compute the point's
	 * distance from the origin (0,0)
	 * 
	 * For example
	 * 
	 * distanceFromOrigin(-1,0) returns 1 
	 * distanceFromOrigin(77,77) returns 108.894
	 * distanceFromOrigin(-3,-4) returns 5
	 * 
	 * Google for Java square root to figure out how to do it
	 */
	public static double distanceFromOrigin(double x, double y) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Determine if a given positive integer has a 5 in the second rightmost digit
	 * 
	 * For example:
	 * 
	 * 5 returns false 52 returns true 151 returns true 30050 returns true 5000
	 * returns false
	 * 
	 * Hint: you'll want to use the modulus operator % and the division operation /
	 * See section 4.2.3 for details. Don't convert the number to a string!
	 * 
	 * Bonus Hint: you usually should not use an if statement to return a boolean
	 * 
	 * if (x % 2 == 0) { 
	 *     // checks if x is even return true; 
	 * } else { 
	 *     return false;
	 * }
	 * 
	 * Instead, just return the result of the boolean test directly
	 * 
	 * return x % 2 == 0; //returns true or false
	 * 
	 * @param input
	 * @return
	 */
	public static boolean secondDigit5(int input) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	
	/**
	 * Returns the first number taken to the power of the second number
	 * 
	 * For example pow(2,3) returns 2^3 or 8
	 * 
	 * DO NOT USE FUNCTIONS in Math (yes, Math.pow is how you would really do it)
	 * Instead, write this code yourself as practice.
	 * 
	 * Don't forget about negative powers! But both parameters are integers, so you
	 * don't need to worry about fractional powers.
	 * 
	 * Hint: if you want to get the reciprocal of an integer, do it like this
	 * 1.0/coolInt not like this 1/coolInt
	 * 
	 * Why? See section 4.2.3 in your book
	 * 
	 * Requires: for loops
	 */
	public static double pow(int num, int power) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");

	}


	/**
	 * Finds the first number in an array divisible by 77 and returns it.
	 * 
	 * If no number is found, the function returns -1
	 * 
	 * Example: firstDivisibleBy77({88,24,154,77}) returns 154
	 * firstDivisibleBy77({5929, 280})             returns 5929 
	 * firstDivisibleBy77({1,2,3,4})               returns -1
	 * 
	 * Don't forget about the modulus operator (%)
	 */
	public static int firstDivisibleBy77(int[] numbers) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");

	}

	/**
	 * Creates an array of all the powers of two, up to (and including) the given
	 * exponent starting at 2^0.
	 * 
	 * If the given exponent is less than zero, return an empty array. You can do
	 * this by saying "return new int[0];"
	 * 
	 * For example: 
	 * powersOfTwo(3) returns {1,2,4,8} 
	 * powersOfTwo(0) returns {1}
	 * powersOfTwo(-66) returns {}
	 * 
	 * Requires: arrays, for loops
	 */
	public static int[] powersOfTwo(int maxExponent) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Given two arrays of integers that are the same length, returns a new array
	 * that contains the pairwise max of the corresponding elements of the original
	 * arrays (i.e. the larger of the two numbers in that slot in the original
	 * arrays)
	 * 
	 * For example: 
	 * maxArray({2,10},{1,200}) returns {2,200} 
	 * maxArray({-5, 60, 7},{-10,400,8}) returns {-5,400,8}
	 * 
	 * Requires: arrays, for loops
	 */
	public static int[] maxArray(int[] one, int[] two) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");

	}

	/**
	 * 
	 * Given two arrays, count the number of times the first array occurs in the
	 * second array. You can assume that the first array is shorter than the second.
	 * 
	 * For example: timesOccur({1,2}, {7,1,2,7,7,7,1,2,7}) returns 2
	 * timesOccur({1,1},       {1,1,1,3} returns 2 (in the 0th and 1st position)
	 * timesOccur({1,2},       {1,3,2,1} returns 0
	 * timesOccur({1,2,3},     {1,2,3,8,1,2,3,9,2}) return 2
     * timesOccur({1,2,3,4,5}, {2,1,2,3,4,5,7}) returns 1
	 * 
	 * Requires: arrays, nested for loops
	 */
	public static int timesOccur(int[] shorter, int[] longer) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");

	}
	
	/**
	 * Takes a char array that is all Ts or Fs.
	 * 
	 * T stands for touchdown and is worth 7 points. F stands for fieldgoal and is
	 * worth 3 points.
	 * 
	 * Returns the total score.
	 * 
	 * For example: [T,T] returns 14 [F,T,F] returns 13 [F,F,F,F] returns 12 [] returns 0;
	 * 
	 * 
	 * @param a char array of only Ts and Fs
	 * @return a score
	 */
	public static int footballScore(char[] input) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
	
	/**
	 * 
	 * Given a square array, determines if it is diagonal That is, returns true if
	 * all values in the array are 0 except the main diagonal. The main diagonal is
	 * entries of the form data[i][j] where i == j. Elements on the main diagonal
	 * can be 0 or any other number.
	 * 
     * Examples:
	 * {{1,0,0},
	 *  {0,2,0}
	 *  {0,0,3}} yields true
	 *  
	 * {{1,0,9},
	 *  {0,2,0},
	 *  {0,0,3}} yields false because 0,2 is nonzero
	 * 
	 * {{0,0,0},
	 *  {0,0,0},
	 *  {0,0,3}} yields true because there can be 0
	 *                  entries on the diagonal if desired
	 * 
	 * @param data input array
	 * @return true if it is diagonal, false otherwise
	 */
	public static boolean isDiagonal(int[][] data) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // isDiagonal

	/**
	 * 
	 * Given a 2D array populated with a sequence of characters that wrap from the
	 * rightmost position to the leftmost position on the next row, find the length
	 * of the longest sequence of repeated characters.
	 * 
	 * For example
	 * 
	 * abba 
	 * dafa
	 * 
	 * Has a longest sequence of 2 for the 2 repeated bs
	 * 
	 * 2 Bs yield the longest repeat sequence here. Note that the As do not follow
	 * after each other and hence, do not get considered.
	 * 
	 * The array is considered to "wrap" from the rightmost position to the leftmost
	 * position on the next line.
	 * 
	 * For example:
	 * 
	 * abcdd 
	 * ddefg
	 * 
	 * Is considered to have a longest sequence of 4 because the two ds on the right
	 * "wrap around" to connect with the two ds on the next line
	 * 
	 * @param data
	 * @return the length of the longest sequence
	 */
	public static int longestRepeatSequence(char[][] data) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // longestRepeatSequence
}
