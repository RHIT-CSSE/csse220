import java.util.ArrayList;

/*
 * DO EXACTLY 3 OF THESE 4 PROBLEMS
 * 
 * For the problem you choose not to be graded on, please delete
 * ALL code (except for the return statement so it will compile).
 * 
 * You will NOT get extra credit for attempting more than 3 out of 4. 
 */
public class SmallProblems {

	/**
	 * The following method takes in a list of foods and a list of veggies, and returns
	 * a NEW ArrayList of the provided foods that are vegetables. 
	 * 
	 * For Example:
	 * 		The following input:
	 * 			foods = {"potato chip", "carrot", "ice cream"}
	 * 			veggies = {"carrot", "celery", "onion"}
	 * 		RETURNS:
	 * 			{"carrot"}
	 * 		
	 * 		The following input:
	 * 			foods = {}
	 * 			veggies = {"carrot", "celery", "onion"}
	 * 		RETURNS:
	 * 			{}
	 * 
	 * 		The following input:
	 * 			foods = {"carrot", "celery", "onion"}
	 * 			veggies = {}
	 * 		RETURNS:
	 * 			{}
	 * 
	 * @param foods - The list of foods
	 * @param veggies - The list of vegetables
	 * @return A new ArrayList<String> of only the vegetables in foods.
	 */
	public static ArrayList<String> onlyVegetables(ArrayList<String> foods, ArrayList<String> veggies) {
		//TODO: Implement this
		return null;
	}
	/**
	 * The following method takes in a String and returns a String made up of every OTHER
	 * character of the original, STARTING WITH THE SECOND CHARACTER.
	 * 
	 * For Example: 
	 * 		"Hello" => "el"
	 * 		"Buffalo" => "ufl"
	 * 		"a" => ""
	 *
	 * @param original - The original string.
	 * @return - Every other character of the string, starting with the second character.
	 */
	public static String everyOther(String original) {
		//TODO: Implement this
		return null;
	}
	
	
	/**
	 * 
	 * Returns true when input contains the value to find within the first number of items
	 * specified. NOTE: numItemsToCheck is NOT guaranteed to be less than or equal to the 
	 * array length.
	 * 
	 * For Example:
	 * 		The following input:
	 * 			input = {1, 2, 3, 4, 5}
	 * 			numItemsToCheck = 3
	 * 			toFind = 2
	 * 		RETURNS:
	 * 			true
	 * 
	 * 		The following input:
	 * 			input = {5, 4, 3, 2, 1}
	 * 			numItemsToCheck = 3
	 * 			toFind = 2
	 * 		RETURNS:
	 * 			false
	 * 
	 * 		The following input:
	 * 			input = {1, 2, 3, 4, 5}
	 * 			numItemsToCheck = 7
	 * 			toFind = 4
	 * 		RETURNS:
	 * 			true
	 * 
	 * 		The following input:
	 * 			input = {1, 2, 3, 4, 5}
	 * 			numItemsToCheck = 0
	 * 			toFind = 1
	 * 		RETURNS:
	 * 			false
	 *
	 * @param input - The input array
	 * @param numItemsToCheck - The number of items to check.
	 * @param toFind - The value you're looking for.
	 * @return - Returns true when the toFind value is located within the specified number
	 * 				of items at the beginning of the array. Otherwise, false.
	 */
	public static boolean beginningContains(int[] input, int numItemsToCheck, int toFind) {
		//TODO: Implement this
		return false;
	}
	
	/**
	 * Returns a new 3 item array containing the first, middle, and last elements of the
	 * input array. 
	 * 
	 * You may assume that the input array has an ODD LENGTH and contains AT LEAST 3 ELEMENTS.
	 * 
	 * For Example:
	 * 		The following input:
	 * 			{1, 2, 3}
	 *		returns a NEW:
	 *			{1, 2, 3}
	 *		The following input:
	 * 			{1, 2, 3, 4, 5}
	 *		returns:
	 *			{1, 3, 5}
	 *	
	 *
	 * @param input - The input array, GUARANTEED to have AT LEAST 3 ELEMENTS and an ODD LENGTH.
	 * @return The array containing the first, middle, and last items of the given array.
	 */
	public static int[] firstMiddleLast(int[] input) {
		//TODO: Implement this
		return null;
	}
	
	
}
