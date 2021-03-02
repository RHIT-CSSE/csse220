package function;

import java.util.Comparator;

/**
 * This Comparator orders strings by their length. 
 * 
 * @author Curt Clifton and you. Created Jan 11, 2011.
 */
public class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// o1.length()   o2.length()
//		if (  o1.length()  <  o2.length()    ) {
//			return -1;
//		} else if (o1.length()  >  o2.length()) {
//			return 1;
//		} else {
//			return 0;
//		}
		
		return o1.length() - o2.length();
	}
}