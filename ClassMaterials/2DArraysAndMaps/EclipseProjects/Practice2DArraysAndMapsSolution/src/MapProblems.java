import java.util.ArrayList;
import java.util.HashMap;


/**
 * A few problems on using HashMaps.
 *
 * @author TODO <Add your name here>.
 *         Created Dec 15, 2013.
 */
public class MapProblems {
	
	/**
	 * For a particular class, everybody chooses a nickname.
	 * It defeats the purpose of a nickname if more than one
	 * person has it, so we want nicknames to be unique.
	 * 
	 * If there is a duplicate nickname, returns the nickname.
	 * You can assume there is at most one duplicated nickname
	 * 
	 * If no nickname is duplicated, returns null
	 * 
	 * Examples:
	 * ["Steve S", "Steve K", "Sarah"] ["Stevo", "Bumbly", "Stevo"]
	 * returns "Stevo"
	 * 
	 * ["Jason", "Michael H", "Michael W"] ["Fast Jason", "Buffalo", "Michael"]
	 * return null
	 * 
	 * @param listOfRealNames listOfNicknames 
	 * @return duplicated nickanme or null
	 */
	public static String duplicateNicknames(String[] names, String[] nicknames) {
		HashMap<String,String> map = new HashMap<>();
		for(int i = 0; i < names.length; i++) {
			if(map.containsKey(nicknames[i])){
				return nicknames[i];
			}
			map.put(nicknames[i],names[i]);
		}
		return null;
	}
	
	/**
	 * There is a card game you play with lettered cards.  In this game,
	 * your goal is to collect as many of the same card as you can.
	 * 
	 * To score your hand, look through your cards one at a time.
	 * If this is the first time you've seen this card, score 1 point.
	 * Otherwise, you score the number of that card you've seen thus far + 1.
	 * 
	 * So for example, the hand "ABAA" is worth 7 points.
	 * 1 for the first A
	 * 1 for the first B
	 * 2 for the second A
	 * 3 for the third A
	 * 
	 * This function computes the score of the given hand.
	 * @param hand 
	 * @return the score of the given hand
	 */
	public static int computeScore(String hand) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		int score = 0;
		for(int i = 0; i < hand.length(); i++) {
			char current = hand.charAt(i);
			if(!map.containsKey(current)) {
				map.put(current,0);
			}
			map.put(current, map.get(current) + 1);
			score += map.get(current);
		}
		return score;
	}
	
	/**
	 * Takes a HashMap of Integers to Strings and converts it to a HashMap
	 * of Strings to Integers.
	 * 
	 * For example:
	 * 
	 * {1->"A",2->"B",3->"C"} yields {"A"->1,"B"->2,"C"->3}
	 * 
	 * You can assume that original HashMap has no duplicates in its values.
	 * E.g. a map like {1->"A",2->"A"} does not exist.
	 * @param input a HashMap of Integers to Strings
	 * @return a corresponding HashMap of Strings to Integers.
	 * 
	 */
	public static HashMap<String,Integer> reverseMap(HashMap<Integer,String> input) {
		HashMap<String,Integer> output = new HashMap<String,Integer>();
		for(int key : input.keySet()) {
			output.put(input.get(key), key);
		}
		return output;
	}
	
	/**
	 * Imagine a set of cities connected by one-way highways.  The map of cities of other cities is
	 * represented by a HashMap, where the city name is associated with other cities it has a road to.
	 * 
	 * So for example, a map like this:
	 * 
	 * {"A"->["B","C"],"B"->"D","C"->[],"D"->[]}
	 * 
	 * Represents cities connected like this:
	 * 
	 * A->B->D
	 *  \
	 *   ->C
	 * 
	 * Note that there can be loops (e.g. there might be a road from A to B AND a road from B to A)
	 * 
	 * Write a function to determine if there is a way to get from one city to another.  So in the
	 * above example:
	 * 
	 * canTravelTo(map,"A","D") returns true
	 * canTravelTo(map,"C","A") returns false
	 * canTravelTo(map,"B","A") returns false
	 * 
	 * This is a slightly tougher problem.  Try it, then ask for a hint if you need it.
	 * @param cities 
	 * @param startCity 
	 * @param endCity 
	 * @return true if there is a way to get from one city to another; false otherwise.
	 */
	public static boolean canTravelTo(HashMap<String,ArrayList<String>> cities, String startCity, String endCity) {
		ArrayList<String> citiesToCheck = new ArrayList<String>();
		citiesToCheck.add(startCity);
		ArrayList<String> checkedCities = new ArrayList<String>();
		
		while(!citiesToCheck.isEmpty()) {
			if(citiesToCheck.contains(endCity)) {
				return true;
			}
			String current = citiesToCheck.remove(0);
			if(checkedCities.contains(current)){
				continue;
			}
			citiesToCheck.addAll(cities.get(current));
			checkedCities.add(current);
		}
		return false;
	}

}
