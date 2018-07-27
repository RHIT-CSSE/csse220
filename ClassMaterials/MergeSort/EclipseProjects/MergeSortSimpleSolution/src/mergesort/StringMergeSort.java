package mergesort;

public class StringMergeSort {
	
	/**
	 * 
	 * Uses merge sort to sort the letters within a string.
	 * 
	 * For example, bdac becomes abcd
	 * ddbabad becomes aabbddd
	 * 
	 * You're more than welcome attempting to look at the code
	 * in MergeSort.java from SortingAndSearching but don't
	 * copy it and it may be easier to just start from
	 * scratch.
	 * 
	 * You shouldn't convert the strings to arrays.  Just
	 * use substring, charAt, and +...that's everything
	 * that's required.
	 * 
	 * Note that it's possible to compare characters
	 * with > and <.  So you can say
	 * 
	 * if(firstHalfSorted.charAt(0) < secondHalfSorted.charAt(0))
	 * 
	 * You'll want this function to be recursive...trust me.
	 * 
	 * @param input
	 * @return
	 */
	public static String stringMergeSort(String input) {
		
		if(input.length() <= 1) {
			return input;
		}
		
		int cutPoint = input.length() / 2;
		String firstHalf = input.substring(0,cutPoint);
		String secondHalf = input.substring(cutPoint);
		String firstHalfSorted = stringMergeSort(firstHalf);
		String secondHalfSorted = stringMergeSort(secondHalf);
		String output = "";
		
		while(firstHalfSorted.length() > 0 && secondHalfSorted.length() > 0) {
			if(firstHalfSorted.charAt(0) < secondHalfSorted.charAt(0)) {
				output += firstHalfSorted.charAt(0);
				firstHalfSorted = firstHalfSorted.substring(1);
			} else {
				output += secondHalfSorted.charAt(0);
				secondHalfSorted = secondHalfSorted.substring(1);
			}
		}
		
		return output + firstHalfSorted + secondHalfSorted;
	}
	
}
