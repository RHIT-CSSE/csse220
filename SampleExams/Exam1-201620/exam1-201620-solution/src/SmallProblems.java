public class SmallProblems {
	
	/**
	 * Returns true if the number is a power of 7, false otherwise.
	 * 
	 * For example:
	 * 
	 * 7 returns true
	 * 49 returns true
	 * 16807 returns true (7^5)
	 * 1 returns true
	 * 6 returns false
	 * 18 returns false
	 * 0 returns false
	 * any negative number returns false
	 * 
	 * @param input number to check
	 * @return true if power of seven
	 */
	public static boolean isPowerOfSeven(int input) {
		if(input < 1) return false;
		while(input != 1) {
			if(input % 7 != 0) {
				return false;
			}
			input = input / 7;
		}
		return true;
	}
	
	/**
	 * Returns true if a string contains the same number of left brackets ([) and right brackets (])
	 * 
	 * For example:
	 * 
	 * "[]" returns true
	 * "[hello]" returns true
	 * "x]x]x[x[x" returns true
	 * "" returns true
	 * "[" returns false
	 * "[[[]]" returns false
	 * 
	 * @param input string to check
	 * @return true if has equal number of [ and ]
	 */
	public static boolean equalBrackets(String input) {
		int left = 0;
		int right = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ']') right++;
			if(input.charAt(i) == '[') left++;
		}
		return left == right;
	}
	/**
	 * Returns a new int array which is the input int array repeated twice.
	 * 
	 * {1,2} returns {1,2,1,2}
	 * {5,6,100} returns {5,6,100,5,6,100}
	 * {66} returns {66,66}
	 * {} returns {}
	 * 
	 * @param input
	 * @return new array with the input repeated
	 */
	public static int[] repeatArray(int[] input) {
		int[] result = new int[input.length*2];
		for(int i = 0; i < input.length; i++) {
			result[i] = input[i];
			result[i+input.length] = input[i];
		}
		return result;
	}
}
