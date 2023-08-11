import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 * A few problems on using HashMaps.
 *
 * @author TODO <Add your name here>.
 *         Created Dec 15, 2013.
 */
public class MapProblems {
	
	/**
	 * ensures: finds and returns a duplicated nickname found in nicknames
	 * @param realNames String[] real names
	 * @param nicknames String[] corresponding nicknames
	 * requires: at least one nickname is duplicated
	 * @return the duplicated nickname
	 * 
	 * <br>Hint: process the incoming arrays by building
	 * a Map<String, String> where key = nickname and value = realname
	 * While building the map, if a key already exists, then you know it is a duplicate
	 */
	public static String duplicateNicknames(String[] realnames, String[] nicknames) {
		HashMap<String,String> nicknamesToRealnameMap = new HashMap<>();
		int k = 0;
		while (!nicknamesToRealnameMap.containsKey(nicknames[k])) {
			nicknamesToRealnameMap.put(nicknames[k],realnames[k]);			
			k++;
		} // end while
		return nicknames[k];
	}
	
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
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		int totalScore = 0;
		for(int k = 0, z = handOfCards.length(); k < z; k++) {
			char cardsLetter = handOfCards.charAt(k);
			if(!map.containsKey(cardsLetter)) {
				final int initialValue = 0;
				map.put(cardsLetter, initialValue);
			} // end if
			// Update the card's count
			map.put(cardsLetter, map.get(cardsLetter) + 1);
			// Update totalScore
			totalScore += map.get(cardsLetter);
		} // end for
		return totalScore;
	} // computeScore
	
	/**
	 * ensures: builds and returns an inverse of inputMap, that is:
	 * <br> inputMap's values become the keys for the returned map
	 * <br> inputMap's corresponding keys become the values in the returned map
	 * @param inputMap a HashMap from String to Integer
	 * @return an inverse of inputMap from Integer to String
	 * <br>Example:
	 * <br>if inputMap = {1->"A",2->"B",7->"X"} then the returned value is {"A"->1,"B"->2,"X"->7}
	 */
	public static HashMap<String, Integer> inverseMap(HashMap<Integer, String> inputMap) {
		HashMap<String, Integer> inversedMap = new HashMap<String, Integer>();
		Set<Integer> inputMapsKeySet = inputMap.keySet();
		
		// Use enhanced 'for' to traverse the set of all keys found in inputMap
		for (int oneKeyFromInputMap : inputMapsKeySet) {
			String reversedMapsKey = inputMap.get(oneKeyFromInputMap);
			// Do the inverting
			inversedMap.put(reversedMapsKey, oneKeyFromInputMap);
		} // end for
		return inversedMap;
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
		HashMap<Character, Integer> letterFreqs = new HashMap<Character, Integer>();
		
		for (int i = 0; i < inputString.length(); i++) {
			Character currentChar = inputString.charAt(i);
			if (letterFreqs.containsKey(currentChar)) {
				letterFreqs.put(currentChar, letterFreqs.get(currentChar) + 1);
			} else {
				letterFreqs.put(currentChar, 1);
			}
		}
		
		return letterFreqs;
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
		ArrayList<String> citiesAlreadyVisited = new ArrayList<String>();
		ArrayList<String> citiesToVisitNext = new ArrayList<String>();
		
		// We can solve this problem using breadth-first search 
		// (you might hear more about this in CSSE230 or CSSE473)
		
		// Start the visiting with startCity by adding it to cities to visit next
		citiesToVisitNext.add(startCity);
		while (!citiesToVisitNext.contains(endCity) && !citiesToVisitNext.isEmpty()) {
			// Facts:
			// 1) endCity is not in the list of cities to visit next
			// 2) there are still more cities remaining to visit
			
			String currentCityToVisit = citiesToVisitNext.remove(0);
			if (!citiesAlreadyVisited.contains(currentCityToVisit)) {
				// add current city to visit to list of cities visited
				citiesAlreadyVisited.add(currentCityToVisit);
				// add to cities to visit next all cities reachable from the current city
				citiesToVisitNext.addAll(roadMap.get(currentCityToVisit));
			} // end if
		} // end while
		
		// Fact:
		// while loop exited under 2 possibilities:
		// 1) (citiesToCheck.isEmpty() = true) which means there is no route from startCity to endCity
		//    because there are no more cities to be visited
		// 2) (citiesToCheck.contains(endCity) = true)  which means we found a route to endCity
		return citiesToVisitNext.contains(endCity);
	} // canTravelTo


}













