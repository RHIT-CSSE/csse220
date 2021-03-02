package function;

import java.util.Comparator;

/**
 * This Comparator orders strings by the number of vowels they contain.
 * 
 * @author Delvin Defoe and you. Created Nov 4, 2015.
 */
public class MostVowelsComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO implement
		return 0;
	}
	
	public int countVowels(String s) {
		int count=0;
		String vowels = "aeiouAEIOU";
		for (int i=0; i< s.length;  i++) {
			if (  vowels.contains( s.substring(i,i+1)   ) ) {
				count++;
			}
		}
		return count;
		
	}
	
	

}
