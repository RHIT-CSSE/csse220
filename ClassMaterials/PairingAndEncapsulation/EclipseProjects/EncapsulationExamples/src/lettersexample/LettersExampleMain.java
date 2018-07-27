package lettersexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * An example of a class that does not use encapsulated objects
 * and instead stores its data in a map.
 *
 * @author hewner.
 *         Created Dec 27, 2013.
 */
public class LettersExampleMain {

	/**
	 * 
	 * Gets a list of words and prints them by first letter
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		HashMap<Character,ArrayList<String>> map = new HashMap<Character,ArrayList<String>>();
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the word (or exit to quit).");
			String word = input.nextLine().trim();
			if(word.equals("exit")) {
				break;
			}
			char firstLetter = word.charAt(0);
			if(!map.containsKey(firstLetter)) {
				map.put(firstLetter, new ArrayList<String>());
			}
			map.get(firstLetter).add(word);
		}
		input.close();
		for(char letter : map.keySet()) {
			System.out.println("Words starting with " + letter + ": " + map.get(letter));
		}
	}

}
