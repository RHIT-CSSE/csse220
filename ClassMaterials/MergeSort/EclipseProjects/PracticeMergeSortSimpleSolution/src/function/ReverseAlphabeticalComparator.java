package function;

import java.util.Comparator;

/**
 * This comparator orders strings in reverse alphabetical order
 * 
 * @author Delvin Defoe and you. Created Nov 4, 2015.
 */
public class ReverseAlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// TODO: implement
		return o2.compareTo(o1);
	}
}