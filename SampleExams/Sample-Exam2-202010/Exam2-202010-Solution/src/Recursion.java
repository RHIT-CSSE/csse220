

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recursion {

	/**
	 * You are given two ArrayLists of integers (of potentially different sizes).  
	 * You are to return an ArrayList filled with the minimums of each corresponding 
	 * element of the inputs.
	 * 
	 * For example:
	 * s1 = {1, 10, 3, 50, 4}
	 * s2 = {2,  9, 5, 20, 8}
	 * 
	 * you should return an ArrayList = {1, 9, 3, 20, 4}, which is the minimum element
	 * in each position of the two ArrayLists.
	 * 
	 * If you are given two lists of different sizes, for the corresponding element, you
	 * just take the element from the ArrayList that is the larger.
	 * 
	 * For example:
	 * s1 = {1, 10, 3, 50, 4}
	 * s2 = {2,  9, 5}
	 * 
	 * you should return an ArrayList = {1, 9, 3, 50, 4}, which took the last two elements
	 * of the first ArrayList since there were no corresponding elements.
	 * 
	 * You are not required to use a helper method for this one, although you can if you
	 * wish.  Using a helper method might make the solution a bit easier, however.  You may 
	 * make changes to the input parameters s1 and s2 if you wish, but it is not required.
	 * 
	 * You will get 3 points for getting this to work with ArrayLists of the same size.
	 * And you will get 3 points for getting this to work with ArrayLists of different sizes.
	 * Note, if you get it working for ArrayLists of different sizes, it should essentially
	 * work when they are the same size.
	 * 
	 * @param s1 the first ArrayList of integers
	 * @param s2 the second ArrayList of integers
	 * 
	 * @return an ArrayList that contains the minimum element from each corresponding ArrayList
	 * 
	 * 
	 */
	public static ArrayList<Integer> minimums(List<Integer> s1, List<Integer> s2) {
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		minimumsHelper(resultArray, 0, s1, s2);
		return resultArray;
	}
	
	private static void minimumsHelper(ArrayList<Integer> resultArray, int curIndex, List<Integer> s1, List<Integer> s2) {
		if(curIndex == Math.max(s1.size(), s2.size())) return;
		if(curIndex < s1.size() && curIndex < s2.size())
			resultArray.add(Math.min(s1.get(curIndex), s2.get(curIndex)));
		else if(curIndex < s1.size())
			resultArray.add(s1.get(curIndex));
		else if(curIndex < s2.size())
			resultArray.add(s2.get(curIndex));
		
		curIndex++;
		minimumsHelper(resultArray, curIndex, s1, s2);
	}
	
	public static ArrayList<Integer> minimumsNoHelper(List<Integer> s1, List<Integer> s2) {
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		if(s1.isEmpty() && s2.isEmpty()) {
			return resultArray;
		} else if (!s1.isEmpty() && !s2.isEmpty()) {
			int val1 = s1.remove(0);
			int val2 = s2.remove(0);
			resultArray = minimumsNoHelper(s1, s2);
			resultArray.add(0, Math.min(val1, val2));
		} else if (!s1.isEmpty()) {
			int val = s1.remove(0);
			resultArray = minimumsNoHelper(s1, s2);
			resultArray.add(0, val);
		} else if (!s2.isEmpty()) {
			int val = s2.remove(0);
			resultArray = minimumsNoHelper(s1, s2);
			resultArray.add(0, val);
		}
		return resultArray;
	}
	
	
	
	
	/**
	 * For this problem, you should use recursion to find the 3rd capital letter
	 * in a string. You are to return the index of that third capital letter. If
	 * a third capital letter is not in the String, you should return -1.
	 * 
	 * You will probably want to use a helper method for this one.  You should not
	 * make any changes to the input String.
	 * 
	 * For this method, you will want to use the Character class to determine if a letter
	 * is upper case.  Below is an example usage:
	 * 		char curLetter = input.charAt(0);
	 * 		Character.isUpperCase(curLetter) will return true if curLetter is an upper case letter
	 * 
	 * @param input - the String you are to find the third capital letter in
	 * @return the index of the third capital letter, -1 if a third one does not 
	 * exist in the input String
	 */
	public static int findThirdCapital(String input) {
		return findThirdCapitalHelper(input, 0, 0);
	}
	
	private static int findThirdCapitalHelper(String input, int curLetter, int numFound) {
		if(curLetter == input.length()) {
			return -1;
		}
		if(Character.isUpperCase(input.charAt(curLetter))) {
			numFound++;
			if(numFound == 3)
				return curLetter;
		}
		curLetter++;
		return findThirdCapitalHelper(input, curLetter, numFound);
	}
	
	
	
	
	
	/**
	 * For this problem, you are to use recursion to flip values after a certain condition.
	 * You are given an array if integers.  Once you find the FIRST negative number (<0), every
	 * number AFTER that should be negated.  You should make changes to the input array itself.
	 * Every number that appears BEFORE the first negative number should remain unchanged.
	 * The very first negative number that you reach should also remain unchanged but, again, every
	 * subsequent number should be negated whether it is positive or negative.
	 * 
	 * For example:
	 * Given an array = {1, 2, 3, 4, 5, 6, 7, -1, 1, 2, 3, -1, -2, -3}, you should change the array
	 *               to {1, 2, 3, 4, 5, 6, 7, -1, -1, -2, -3, 1, 2, 3}
	 * 
	 * If there are no negative numbers anywhere in the array, then the whole array should remain 
	 * unchanged.
	 * 
	 * You will need a recursive helper method for this one.
	 * 
	 * @param input - the array of integers to go through and negate all values after the first negative
	 * 
	 * @return nothing you are changing the input array in place
	 * 
	 */
	public static void flipAfterNegative(int[] input) {
		flipAfterNegativeHelper(input, 0, false);
	}
	
	private static void flipAfterNegativeHelper(int[] input, int curIndex, boolean foundNeg) {
		if(curIndex == input.length)
			return;
		if(!foundNeg) {
			if(input[curIndex] < 0)
				foundNeg = true;
		} else {
			input[curIndex] = -input[curIndex];
		}
		
		flipAfterNegativeHelper(input, curIndex+1, foundNeg);
	}
	
	

	
	/**
	 * For this problem, you are given a HashMap that maps a String city name to an ArrayList of 0 - 2 cities that 
	 * can be reached from that city.  This problem can be done in two parts.  The first part (worth 3 points) is 
	 * to return ANY path from fromCity to toCity.  The second part (worth 3 points) is to return the shortest path 
	 * from fromCity to toCity.  Note, getting the second part to work assures that the first part also works.
	 * 
	 * You can assume THERE ARE NO LOOPS (e.g., a loops is where A can go to B and B can go to A).  You can also 
	 * assume that all nodes can reach toCity (there are no dead-end paths). 
	 * 
	 * DO NOT CHANGE or make changes to the HashMap!
	 * 
	 * For example, consider the HashMap:
	 * [ "A" -> ["B", "D"]
	 *   "B" -> ["F", "C"]
	 *   "C" -> ["F", "D"]
	 *   "D" -> ["F"]
	 *   "E" -> []
	 *   "F" -> ["E"]
	 * ]
	 * 
	 * The path from "A" to "E" can be ["A", "B", "C", "D", "F", "E"] or can also be ["A", "B", "F", "E"] as
	 * the shortest path.
	 * 
	 * The path from "A" to "F" can be ["A", "B", "F"] or ["A", "D", "F"]
	 * 
	 * If D were to map to ["F", "E"] instead of just "F", then the shortest path from "A" to "E" is ["A", "D", "E"]
	 * 
	 * You can use a helper method if you wish, but it is not needed.
	 *    
	 * 	
	 * @param toCity the city you are to find the path to
	 * @param fromCity the starting city to find the path to toCity
	 * @param cityToCity the HashMap of city names to ArrayLists of 0-2 cities that can be reached from a city
	 * @return the ArrayList that contains the path from fromCity to toCity (3 points for ANY path, and 3
	 * more points for the SHORTEST path).
	 */
	public static ArrayList<String> findBestCityPath(String toCity, String fromCity, HashMap<String, ArrayList<String>> cityToCity) {
		ArrayList<String> citiesVisited = new ArrayList<String>();
		citiesVisited.add(fromCity);
		ArrayList<String> curCities = cityToCity.get(fromCity);
		if(curCities.contains(toCity)) {
			citiesVisited.add(toCity);
			return citiesVisited;
		}
		
		ArrayList<String> tempResult = null;
		ArrayList<String> bestResult = null;
		
		/*for(String city : curCities) {
			tempResult = findBestCityPath(toCity, city, cityToCity);
			if(bestResult == null)
				bestResult = tempResult;
			else if(tempResult.size() < bestResult.size())
				bestResult = tempResult;
		}
		
		
		for(String result : bestResult) {
			citiesVisited.add(result);
		}*/
		
		//without using loops
		if(curCities.size() > 0) {
			bestResult = findBestCityPath(toCity, curCities.get(0), cityToCity);
		}
		if(curCities.size() > 1) {
			tempResult = findBestCityPath(toCity, curCities.get(1), cityToCity);
			if(tempResult.size() < bestResult.size()) {
				bestResult = tempResult;
			}
		}
		citiesVisited = bestResult;
		citiesVisited.add(0, fromCity);
		
		return citiesVisited;
	}
}
