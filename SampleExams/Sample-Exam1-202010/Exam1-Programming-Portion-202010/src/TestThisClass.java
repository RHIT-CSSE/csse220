
public class TestThisClass {

	/**
	 * Given a string, returns the number of Qs.  Both
	 * uppercase and lowercase qs should be included in the 
	 * count.
	 *
	 * @param the string
	 */
	public static int numberOfQs(String input) {
		int count, count2;
		count = 0;
		count2 = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'Q')
				count++;
			if(input.charAt(i) == 'q')
				count2++;
		}
		return count;
	}
}
