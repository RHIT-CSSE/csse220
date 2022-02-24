import java.util.ArrayList;

public class Exception {

	/**
	 *  
	 * We have some code that almost works.  This function converts an array of
	 * integer strings (e.g. {"2","4","99999"} to an ArrayList of Integers.
	 * 
	 * The code works correctly except if the input array has some bad non-number
	 * strings (e.g. {"2","zzz","99999"}).  In that case currently the function throws a
	 * NumberFormatException
	 * 
	 * TODO Add error handling so that when an unconvertable string is encountered, the function
	 * prints a warning and then ignores the string and continues processing the rest of 
	 * the list.  You should not change the overall algorithm - instead just add try/catch 
	 * logic as appropiate.
	 * 	   
	 * Example:
	 * {"1","2","?","4"} should return [1,2,4] and print one warning
	 */

	public static ArrayList<Integer> convertToInts(String[] data) {
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(String numberAsString : data) {
			int converted = Integer.parseInt(numberAsString);
			output.add(converted);
		}
		
		return output;
	}


}
