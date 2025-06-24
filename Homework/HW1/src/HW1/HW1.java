package HW1;

/**
 **************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         TODO: cite your help here or say "only used CSSE220 materials"
 ****************************************************************************************
 * 
 * <dl> 
 * <dt>Class:</dt><dd>HW1</dd>
 * 
 * <dt>Purpose:</dt>
 * <dd>The problems in this assignment give you practice with 
 * loops, arrays, conditionals, and primitives.</dd> 
 * 
 * <dt>Learning targets:</dt>
 * <dd>
 * <ul>
 * <li>I can identify components of simple Java programs.</li>
 * <li>I can use Java primitives in the context of small methods.</li>
 * <li>I can evaluate Java expressions that use the % operator with integers.</li>
 * <li>I can explain the difference between integer and floating-point division.</li> 
 * <li>I can apply Java operator precedence.</li>
 * <li>I can declare and initialize array variables of primitive types.</li>
 * <li>I can iterate (i.e., loop) over arrays of primitives.</li>
 * <li>I can read Java API documentation to learn how to use built-in methods.</li>
 * </ul></dd></dl>
 * 
 * @author CSSE Faculty
 */

public class HW1 {

	/**
	 * Determine if a given positive integer has a 5 in the second rightmost digit
	 * 
	 * For example:
	 * 
	 * 5 returns false 52 returns true 151 returns true 30050 returns true 5000
	 * returns false
	 * 
	 * Hint: you'll want to use the modulus operator % and the division operation /
	 * 
	 * Don't convert the number to a string!
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
	 * (Why?) 
	 * 
	 * Requires: for loops
	 */
	public static double pow(int num, int power) {
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
	 * Given a particular point in the coordinate plane, compute the point's
	 * distance from the origin (0,0)
	 * 
	 * For example
	 * 
	 * distanceFromOrigin(-1,0) returns 1 
	 * distanceFromOrigin(77,77) returns 108.894
	 * distanceFromOrigin(-3,-4) returns 5
	 * 
	 * Search the web for "Java square root" to figure out how to do it, and 
	 * cite your source in the help citation at the top of the file. 
	 */
	public static double distanceFromOrigin(double x, double y) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
}
