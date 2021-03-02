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
		
		//TODO 1: base case - strings of 0 or 1 length are already sorted
		if (input.length() < 2) {
			return input;
		}
		//TODO 2: split the string in half forming 2 smaller strings
		int mid = input.length() / 2;
		
		String first = input.substring(0,mid);
		String last = input.substring(mid);
		
		
		return merge( stringMergeSort(first), stringMergeSort(last)   );
	}

	private static String merge(String firstSorted, String lastSorted) {
		//continue check first pos until one of the stringsis empty
		String answer = "";
		while ( firstSorted.length() > 0  &&  lastSorted.length() > 0 ) {
			if ( firstSorted.charAt(0) <  lastSorted.charAt(0) ) {
				answer += firstSorted.charAt(0);
				firstSorted = firstSorted.substring(1);
			} else {
				answer += lastSorted.charAt(0);
				lastSorted = lastSorted.substring(1);
			}
		}
		//one is empty...

		answer += firstSorted + lastSorted;
		
		return answer;
	}

	
	
	
	
	
	
	
	
	
	/**** hint
	 
     Ok there are two stages.  Stage 1 is when both strings have some characters remaining
     
      My while loop looked like this:
            String output = "";
      		while(firstHalfSorted.length() > 0 && secondHalfSorted.length() > 0) {

	        //figure out which string has the next character at the head
	        //then remove it from that string and add it to my output string
	  
	 Stage 2, at least one of the strings is empty.  You have to check if the other string
	 is empty too and if not, append it to the output string 
	
	 */
	
	
	
	
	
}
