package mergesort;

public class StringMergeSort {
	
	/**
	 * ensures String returned contains all of s1 and s2's characters and is sorted
	 * @param s1 input String
	 * @param s2 input String
	 * <br>requires: sorted(s1) and sorted(s2)
	 * @return String retVal = permutation(s1 + s2) and sorted(retVal)
	 */
	private static String mergeStrings(String s1, String s2) {
		String retVal = "";
		while(s1.length() > 0 && s2.length() > 0) {
			if(s1.charAt(0) < s2.charAt(0)) {
				retVal += s1.charAt(0);
				s1 = s1.substring(1);
			} else {
				retVal += s2.charAt(0);
				s2 = s2.substring(1);
			} // end if
		} // end while
		// Fact either |s1| = 0 or |s2| = 0
		return retVal + s1 + s2;
	} // mergeStrings
	
	/**
	 * ensures: String returned is a sorted version of inputString
	 * @param inputString
	 * @return String retVal = permutation(input) and sorted(retVal)
	 * <br>requires: input != null
	 * <br>decreasing: |inputString|
	 */
	public static String stringMergeSort(String inputString) {

		if (inputString.length() < 2) {
			// at base case
			return inputString;
		} else {
			// not at base case
			// fact: |inputString| >= 2
			int midPoint = inputString.length() / 2;

			String firstHalfSorted = stringMergeSort(inputString.substring(0, midPoint));
			String secondHalfSorted = stringMergeSort(inputString.substring(midPoint));

			return mergeStrings(firstHalfSorted, secondHalfSorted);
		} // end if
	} // stringMergeSort
	
}
