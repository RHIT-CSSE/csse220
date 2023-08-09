
public class LoopProbs {
	
	/**
	 * Returns a number containing only 1s of the given length
	 * 
	 * For example:
	 * 3 returns 111
	 * 6 returns 111111
	 * 1 returns 1
	 * 
	 * You can assume the number will be positive and the result will
	 * fit in an long.
	 * 
	 */
	public static long bunchOfOnes(int length) {
		long current = 0;
		for(int i = 0; i < length; i++) {
			current = current*10 + 1;
		}
		return current;
	}
	
	/**
	 * Returns the factorial of a given number.
	 * 
	 * For example:
	 * 
	 * fact(3) = 3*2*1 = 6
	 * fact(5) = 5*4*3*2*1 = 120
	 * 
	 * You can assume the number will be positive and the result will
	 * fit in an long.
	 * 
	 * Use a for loop to solve this problem, not recursion (if you 
	 * know what recursion is)
	 * 
	 */
	public static long fact(int num) {
		// TODO: Please provide an implementation for this one
		return 0;
	}
	
	
	/**
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 * If the supplied string is null or empty, then returns an empty string.
	 * 
	 * For example:
	 * "Code" returns "CCoCodCode"
	 * "abc" returns "aababc"
	 * "ab" returns "aab"
	 * "" return ""
	 */
	public static String stringSplosion(String str) {
		if(str == null || str.length() == 0)
			return "";
		
		String result = "";
		
		int index = 0;
		while(index < str.length()) {
			result += str.substring(0, index + 1);
			++index;
		}
		return result;
	}

	/**
	 * Returns a new string made of every other char 
	 * starting with the first. 
	 * Returns an empty string if the supplied string is 
	 * null or empty.
	 * 
	 * For example:
	 * "Hello" returns "Hlo"
	 * "Hi" returns "H"
	 * "Heeololeo" returns "Hello"
	 * null returns ""
	 */
	public static String stringBits(String str) {
		// TODO: Please provide an implementation for this one
		return null;
	}

	
	/**
	 * Returns the number of "xx" in the given string. 
	 * Overlapping is allowed, so "xxx" contains 2 "xx".
	 * 
	 * For example:
	 * "abcxx" should return 1
	 * "xxx" should return 2
	 * "xxxx" should return 3
	 * "" returns 0
	 */
	public static int countXX(String str) {
		if(str == null || str.length() == 0)
			return 0;
		
		int count = 0;
		int index = 0;
		
		while(index < str.length() - 1) {
			if(str.charAt(index) == 'x' && 
					str.charAt(index + 1) == 'x')
				++count;
			
			// Another way to do the above test using substring would be:
			// if(str.substring(index, index + 2).equals("xx"))
			//	++count
			
			++index;
		}
		
		return count;
	}
	
	/**
	 * Returns true if every "x" appear in pair.
	 * Returns false if no instance of "x" is found
	 * in the string.
	 * 
	 * For example:
	 * "aabb" should return false
	 * "axxbb" should return true
	 * "axaxax" should return false
	 * "xxxx" should return true
	 * "aaxxxb" should return false because the last x is followed by b
	 */
	public static boolean pairedX(String str) {
		// TODO: Please provide an implementation for this one
		return false;
	}

	
	
}
