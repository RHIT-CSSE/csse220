import java.util.ArrayList;
import java.util.HashMap;


/**
 * A few problems on using HashMaps.
 *
 * @author TODO <Add your name here>.
 */
public class MapProblems {
	
	/**
	 * ensures: finds and returns a duplicated nickname found in nicknames
	 * @param realNames String[] real names
	 * @param nicknames String[] corresponding nicknames
	 * <br>requires: at least one nickname is duplicated in the nicknames array
	 * @return the duplicated nickname
	 * 
	 * <br>Hint: process the incoming arrays by building
	 * a Map<String, String> where key = nickname and value = realname
	 * While building the map, if a key already exists, then you know it is a duplicate
	 */
	public static String duplicateNicknames(String[] realNames, String[] nicknames) {
		return null;
	} // duplicateNicknames
	
	
	/**
	 * ensures: total score for a hand of cards is computed and returned
	 * @param handOfCards String of characters where each card is represented with 1 character, e.g., "KQKQQ"
	 * @return the total score based on the number of times a card appears in the handOfCards:
	 * <br>a letter appears 1 time counts as 1 point
	 * <br>for the 2nd appearance, that 2nd appearance will score 2 points 
	 * <br>for the 3rd appearance that 3rd appearance will score 3 points, etc.
	 * <br>Example:
	 * <br>if handOfCards = "KQKQQ" then the corresponding score is 1 + 1 + 2 + 2 + 3 = 9
	 */
	public static int computeTotalScore(String handOfCards) {
		return -1;
	} // computeTotalScore
	
	
	/**
	 * ensures: builds and returns an inverse of inputMap, that is:
	 * <br> inputMap's values become the keys for the returned map
	 * <br> inputMap's corresponding keys become the values in the returned map
	 * @param inputMap a HashMap from String to Integer
	 * @return an inverse of inputMap from Integer to String
	 * <br>Example:
	 * <br>if inputMap = {1->"A",2->"B",7->"X"} then the returned value is {"A"->1,"B"->2,"X"->7}
	 * 
	 */
	public static HashMap<String, Integer> inverseMap(HashMap<Integer, String> inputMap) {
		return null;
	} // inverseMap
	
	
	/**
	 * ensures: builds and returns a map of letters (a-z) to their frequencies
	 * requires: input only contains letters a-z (lower-case)
	 * 
	 * @param inputString a String of cipher text (coded message) 
	 * @return a map of each letter from a to z to the number of times it appears in inputString (can omit if zero)
	 * <br>Example:
	 * <br>if inputString = "abcccbx", the returned map is {'a'->1, 'b'->2, 'c'->3, 'x'-> 1}
	 * 
	 * Side note: letter frequencies can be useful in cryptanalysis <a href="https://en.wikipedia.org/wiki/Frequency_analysis">(Wikipedia article)<a/> 
	 *  
	 */
	public static HashMap<Character, Integer> computeLetterFrequencies(String inputString) {
		return null;
	} // computeLetterFrequencies
	
	
	/**
	 * ensures: true is returned if there is a route from startCity to endCity found in roadMap
	 * @param roadMap is a Map from String to ArrayList&lt;String&gt;
	 * <br> where the key is a city name and its corresponding values is a list of cities reachable from the key
	 * @param startCity String identifying the starting city in a potential route
	 * @param endCity String identifying the ending city in a potential route
	 * @return true if there is a route from startCity to endCity, false otherwise
	 * <br>Example:
	 * <br>if roadMap = {"A"->["B","C"],"B"->"D","C"->[],"D"->[]}
	 * <br>canTravelTo(roadMap, "A", "D") returns true
	 * <br>canTravelTo(roadMap, "C", "A") returns false
	 * <br>canTravelTo(roadMap,"B", "A") returns false
	 */
	public static boolean canTravelTo(HashMap<String, ArrayList<String>> roadMap, String startCity, String endCity) {
		// TODO This problem is a bit trickier, do this one last if you have time. 
		// HINT: You will need to keep track of which cities you have explored already, 
		// 		 and which ones you need to explore next.  
		return false;
	} // canTravelTo

}
