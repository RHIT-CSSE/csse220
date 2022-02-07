package function;

import java.util.Comparator;

/**
 * This Comparator orders strings by their length. 
 * 
 * @author Delvin Defoe and you. Created Nov 4, 2015.
 */
public class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// TODO: implement
		return o1.length() - o2.length();
	}
}