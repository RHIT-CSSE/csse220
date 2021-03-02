package function;

import java.util.Comparator;

/**
 * This comparator orders strings in reverse alphabetical order
 * 
 * @author Curt Clifton and you. Created Jan 11, 2011.
 */
public class ReverseAlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		
		return -1 *   o1.compareTo(o2) ;
	}
}