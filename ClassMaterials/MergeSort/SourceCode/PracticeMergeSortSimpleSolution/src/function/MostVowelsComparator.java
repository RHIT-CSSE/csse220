package function;

import java.util.Comparator;

/**
 * This Comparator orders strings by the number of vowels they contain.
 * 
 * @author Delvin Defoe and you. Created Nov 4, 2015.
 */
public class MostVowelsComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		// TODO: implement
		return countVowels(o1) - countVowels(o2);
	}
	
	private int countVowels(String s){
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int count = 0;
		for(char c : s.toCharArray()){
			for(char vowel: vowels){
				if((Character.toLowerCase(c))== vowel){
					count++;
				}	
			}
		}
		return count;
	}
}