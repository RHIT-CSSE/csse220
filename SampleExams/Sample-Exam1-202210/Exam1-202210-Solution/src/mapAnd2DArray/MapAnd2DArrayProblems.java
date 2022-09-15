package mapAnd2DArray;
import java.util.ArrayList;
import java.util.HashMap;

public class MapAnd2DArrayProblems {
	
	/**
	 * For this problem, you are given a 2D array of integers.  In this array, there will 
	 * be exactly two 0 values.  You are to return the sum of all integers that appear after 
	 * the first 0 and before the second.
	 * 
	 * You can assume there will always be exactly two zeros in the array.  If they are 
	 * exactly next to one another, return 0.
	 * 
	 * Examples:
	 * input = [1, 2, 3, 4, 5,
	 *          6, 7, 0, 1, 0,
	 *          8, 9, 1, 2, 3]
	 * return 1 since it is only value that appears between the 0's
	 * 
	 * input = [1, 2, 3, 0, 5,
	 *          6, 7, 8, 1, 0,
	 *          8, 9, 1, 2, 3]
	 * return 27 (5+6+7+8+1)
	 * 
	 * input = [0, 2, 3, 4, 5,
	 *          6, 7, 8, 1, 2,
	 *          8, 9, 1, 2, 0]
	 * return 58 (2+3+4+5+6+7+8+1+2+8+9+1+2)
	 * 
	 * input = [1, 2, 3, 4, 5,
	 *          6, 7, 8, 1, 2,
	 *          8, 9, 1, 0, 0]
	 * return 0 since there are no values between the 0's
	 * 
	 * @param input the 2D array
	 * @return the sum of all digits that appear between the 0's
	 */
	public static int betweenTheZeros(int[][] input) {
		int sum = 0;
		
		boolean firstFound = false;
		for(int r = 0; r < input.length; r++) {
			for(int c = 0; c < input[0].length; c++) {
				if(!firstFound && input[r][c] == 0) {
					firstFound = true;
				} else if(firstFound && input[r][c] == 0) {
					return sum;
				} else if (firstFound) {
					sum += input[r][c];
				}
			}
		}
		
		return sum;
	}


	/**
	 * For this problem, you are given an actual dictionary in the sense that you have a HashMap of words
	 * mapped to String definitions.  We are interested in all the words that have a definition that contains
	 * the wordToFind.  You will construct an ArrayList of Strings and add all the words that have wordToFind
	 * in the definition.  If none of the words contain the wordToFind in the definition, return an empty 
	 * ArrayList.
	 * 
	 * For simplicity, assume all words and definitions are all lower case.  A function you might find useful
	 * from the String API is the split method.  The split method splits a string into an array of String objects
	 * separated by what is passed in.  Feel free to look this method up in the API for more info.
	 * 
	 * Examples (pay no attention to the informality of the definitions...):
	 * dictionary = {{"fire" -> "a hot source of energy"}, {"coffee" -> "a hot liquid made from beans"},
	 *               {"water" -> "a clear liquid made from H2O"}, {"glass" -> "a clear solid substance"},
	 *               {"tire" -> "a wheel made of rubber"}, {"electricity" -> "electrons moving to transfer 
	 *               energy"}}
	 * wordToFind = "hot"
	 * Return an ArrayList containing the words {"fire", "coffee"} since those are the only words that have a
	 * definition that contain the word "hot"
	 * 
	 * wordToFind = "energy"
	 * Return an ArrayList containing the words {"fire", "electricity"}
	 * 
	 * wordToFind = "liquid"
	 * Return an ArrayList containing the words {"coffee", "water"}
	 * 
	 * wordToFind = "clear"
	 * Return an ArrayList containing the words {"water", "glass"}
	 * 
	 * wordToFind = "rubber"
	 * Return an ArrayList containing the words {"tire"}
	 * 
	 * wordToFind = "flame"
	 * Return an empty ArrayList {} since the word does not appear in any definitions
	 *
	 * @param dictionary - the HashMap that maps words to their definitions
	 * @param wordToFind - the word to find in all the definitions
	 * @return an ArrayList that contains all the words that have wordToFind in the definitions
	 */
	public static ArrayList<String> findDefinitions(HashMap<String, String> dictionary, String wordToFind) {
		ArrayList<String> results = new ArrayList<String>();
		for(String word : dictionary.keySet()) {
			String[] defWords = dictionary.get(word).split(" ");
			for(int i = 0; i < defWords.length; i++) {
				if(wordToFind.equals(defWords[i]))
					results.add(word);
			}
		}
		return results;
	} 
}
