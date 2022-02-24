package hashmap;

import java.util.ArrayList;
import java.util.HashMap;



public class HashMapProblem {
	/**
	 * @author Jason Yoder, Matt Boutell, Mark Hays.
	 * 
	 * Given a ArrayList of ArrayLists of Integers, calculate the total sums of each individual ArrayList
	 * if the sum is zero, do nothing, but if the total of an individual ArrayList is non-zero, then 
	 * add an entry to a HashMapwith the sum as a key and the ArrayList as its value.
	 * 
	 * Thus, the returned HashMap should have entries with the (non-zero) sum of a list mapped to the list itself.
	 * 
	 * You can assume each non-zero sum of the sublists will have a unique value
	 * You can safely assume that the passed in ArrayList of ArrayLists will be non-null.
	 * 
	 * For example:
	 * returnHashMapOfSumsAsKeys( [ [1,2] ] ) = { 3 -> [1,2]  }
	 * returnHashMapOfSumsAsKeys( [ [1,-1]  ) = {   }
	 * returnHashMapOfSumsAsKeys( [ [1,2], [1,-1], [-1,-2] ] ) = { 3 -> [1,2],   -3 -> [-1,-2]  } 
	 * 
	 * @param cityFlightMap The origin (String) to destinations (ArrayList<String>) mapping of flights
	 * @return An ArrayList<String> of the cities with flights that return to themselves
	 */
	public static HashMap<Integer, ArrayList<Integer>> returnHashMapOfSumsAsKeys(ArrayList<ArrayList<Integer>> listOfNumberLists ) {
		HashMap<Integer, ArrayList<Integer>> resultMap = new HashMap<Integer, ArrayList<Integer>>();
		for (ArrayList<Integer> numbers: listOfNumberLists) {
			int sum=0;
			for (Integer num: numbers) {
				sum += num;
			}
			if (sum != 0) {
				resultMap.put(sum, numbers);
			}
		}
		
		return resultMap;
	}
	
	
}
