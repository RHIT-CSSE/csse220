
public class TestThisClass {
	
	public static final int MIN_PASS_RESULT = 2000;
	public static final int MAX_PASS_RESULT = 4000;
	
	/**
	 * You're working in a quality control chemistry lab. Each time you get a 
	 * sample, it must be tested twice and pass twice for success. 
	 * 
	 * The following method tells you whether or not the sample must be
	 * retested: True means retest, False means no retest.
	 *
	 * Here are the rules:
	 *   - If the sample has not previously passed, it must be tested a second time: 
	 *   	  return true.
	 *   - If the sample is not within the MIN_PASS_RESULT (inclusive) and the 
	 *   		MAX_PASS_RESULT (inclusive):
	 *   	  return true
	 *	 - Otherwise:
	 *        return false
	 *
	 * @param hasPreviouslyPassed - indicates if the sample has passed a previous test
	 * @param currentResult - The result for the current test
	 * @return true, if the sample should be tested again, otherwise false.
	 */
	public static boolean retestSample(boolean hasPreviouslyPassed, int currentResult){
		//Current result has passed
		if (!hasPreviouslyPassed) {
			return true;
		}
		if (currentResult < MIN_PASS_RESULT || currentResult > MAX_PASS_RESULT) {
			//The sample has not passed.
			return true;
		}
		return false;
	}
}
