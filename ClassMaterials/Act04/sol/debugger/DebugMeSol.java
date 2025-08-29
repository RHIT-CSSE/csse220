package debugger;
/**
 * This class provides some buggy methods that you can use to practice with the
 * debugger. 
 */
public class DebugMeSol {

	/**
	 * Returns the number of permutations possible when chosing
	 * k elements from a set of size n without repetition
	 * 
	 * This formula for this is:
	 * 
	 * n!/(n-k)!
	 */
	public static int kPermutations(int n, int k) {
		int nFact = 1;
		for(int i = 2; i <= n; i++) {
			nFact = nFact*i; // <- causes an overflow, even if final 
			                 // result can be within int max
		}
		int nMinusKFact = 1;
		for(int j = 2; j <= n - k; j++) {
			nMinusKFact = nMinusKFact*j;
		}
		
		return nFact/nMinusKFact;
	}

	/**
	 * 
	 * If the sentence ends with "!", this function should return a string with all letters uppercase.
	 * If the sentence does not end with "!",. the function return the original string. 
	 * 
	 * For example:
	 *  
	 *  "hello!" becomes "HELLO!"
	 *  "hello?" becomes "hello?"
	 *  "I am excited to be here!" becomes "I AM EXCITED TO BE HERE!"
	 *  "boring" becomes "boring"
	 *  
	 */
	public static String uppercaseIfExclaimation(String sentence) {

		if(sentence.charAt(sentence.length() - 1) == '!') {
			sentence.toUpperCase(); // <- strings are immuatble.  Returns a result that is ignored
		} 
		return sentence;
	}

	/**
	 * 
	 * Returns true if the array is the same elements repeated
	 * twice.
	 * 
	 * For example,
	 * 
	 * {1,2,1,2} returns true
	 * {7,3,7,7,3,7} returns true
	 * {1,2,3,4} returns false
	 * {1,2,2,1} returns false
	 * {1,3,1} returns false
	 *
	 * @param input the input array
	 * @return
	 */
	public static boolean isArrayDoubled(int[] input) {

		int[] firstHalf = new int[input.length/2];
		int[] secondHalf = new int[input.length/2];
		for(int i = 0; i < input.length/2; i++) {
			firstHalf[i] = input[i];
			secondHalf[i] = input[input.length/2 + i];
		}
		boolean result = firstHalf.equals(secondHalf); // <- equals does not compare arrays by value
		return result;
	}

	
	public static int praticeCreatingExceptionBreakpoint() {
		int[] foo = {1,2,3};
		return foo[100];
	}

	
}
