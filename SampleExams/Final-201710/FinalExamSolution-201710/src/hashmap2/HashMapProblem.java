package hashmap2;

import java.util.HashMap;

public class HashMapProblem {
	/**
	 * Checks if the array is made entirely of pairs of strings, rearranged in any order. 
	 * A pair can appear multiple times (e.g. there could be 3 pairs of As) . Return true 
	 * for an empty array as well.
	 * 
	 * While this could be solved in various ways, you MUST use a HashMap to earn credit.
	 * 
	 * Examples:
	 * isAllPairs(["X"]) --> false
	 * isAllPairs(["A","A"]) --> true
	 * isAllPairs(["A","A","A","A"]) --> true
	 * isAllPairs(["A","B","A"]) --> false
	 * isAllPairs(["A","B","B","A"]) --> true
	 * isAllPairs(["A","B","C","B","C","A"]) --> true
	 * isAllPairs(["A","B","A","A","B","A"]) --> true
	 * isAllPairs(["A","A","A"]) --> false
	 * isAllPairs(["A","B","C","A"]) --> false
	 * isAllPairs(["C","E","E","E","C","C"]) --> false
	 * isAllPairs([]) --> true
	 */
	public static boolean isAllPairs(String[] strings) {
		HashMap<String, Integer> counts = new HashMap<>();
		for (String string: strings) {
			Integer count = counts.get(string);
			if (count == null) {
				counts.put(string, 1);
			} else {
				counts.put(string, count+1);
			}
		}
		for (int count: counts.values()) {
			if (count % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}
