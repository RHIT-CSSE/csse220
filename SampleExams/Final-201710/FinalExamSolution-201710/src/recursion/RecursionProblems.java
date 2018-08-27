package recursion;

public class RecursionProblems {

	/**
	 * Returns a version of the input string in which all pairs of adjacent duplicate
	 * elements have been separated by a hyphen.
	 *
	 * Your solution MUST use recursion in a natural way.
	 * 
	 *  Examples:
	 *  "food" --> "fo-od"
	 *  "balloon" --> "bal-lo-on"
	 *  "bookkeeper" --> "bo-ok-ke-eper"
	 *  "baaad" --> "ba-a-ad"
	 *  "nodups" --> "nodups"
	 *  "" --> ""
	 *  
	 * @param input
	 * @return
	 */
	public static String separateAdjacentDuplicates(String input) {
		if (input.length() <= 1) {
			return input;
		}
		char first = input.charAt(0);
		char second = input.charAt(1);
		if (first == second) {
			return first + "-" + separateAdjacentDuplicates(input.substring(1));
		} else {
			return first + separateAdjacentDuplicates(input.substring(1));
		}
	}
}
