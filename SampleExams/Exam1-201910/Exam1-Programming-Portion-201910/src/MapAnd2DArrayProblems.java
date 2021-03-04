import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MapAnd2DArrayProblems {
	
	/**
	 * Input arrays a1 and a2 have the same number of columns, but
	 * may not have the same number of rows.
	 * 
	 * Your task is to create and return a new 2D array that contains
	 * a1's rows as the top part of the new 2D array, and a2's rows at the
	 * bottom part of the new 2D array
	 * 
	 * For example:
	 * a1 = {{0,1},{2,3},{4,5}} - has 3 rows
	 * a2 = {{6,7}} - has 1 row
	 * putTogether(a1, a2) --> {{0,1},{2,3},{4,5},{6,7}} - has 4 rows
	 * 
	 * a1 = {{0,1,-1},{2,3,-10},{4,5,-100}}
	 * a2 = {{6,7,800},{5,4,3},{1,2,3},{33,44,55}}
	 * putTogether(a1, a2) --> {{0,1,-1},{2,3,-10},{4,5,-100},{6,7,800},{5,4,3},{1,2,3},{33,44,55}}
	 * 
	 * a1 = {{0}}
	 * a2 = {{1}}
	 * putTogether(a1, a2) --> {{0},{1}}
	 * 
	 */
	public static int [][] putTogether(int[][] a1, int [][] a2) {
		
		return null;
	}
	
	/**
	 * Given a hash map and a set of values to find, find all the keys that are associated with
	 * the values in valuesToFind, put those keys into a new ArrayList and return that ArrayList
	 * Note: the order in which the keys appear in the returned ArrayList does not matter
	 * 
	 * If none of valuesToFind are associated with any key in the map, then return an empty ArrayList
	 * 
	 * For example:
	 * map = {87="falcon", 91="sparrow", 12="woodpecker", 10="woodpecker", 11="blackbird"}
	 * valuesToFind = {"sparrow", "falcon"}
	 * <87,91> is returned (or <91,87> is returned, either one)
	 * 
	 * map = {87="falcon", 91="sparrow", 12="woodpecker", 10="woodpecker", 11="blackbird"}
	 * valuesToFind = {"woodpecker", "falcon"}
	 * <87,11,12> is returned (in any order)
	 * 
	 * map = {87="falcon", 91="sparrow", 10="woodpecker", 11="blackbird"}
	 * valuesToFind = {}
	 * <> is returned
	 * 
	 * map = {87="falcon", 91="sparrow", 10="woodpecker", 11="blackbird"}
	 * valuesToFind = {"pileated", "owl"}
	 * <> is returned
	 * 
	 * map = {}
	 * valuesToFind = {"pileated", "owl"}
	 * <> is returned
	 * 
	 * @param map 
	 * @param valueToFind
	 * @return key in map associated with valueToFind, or -1 if no key associated with valueToFind
	 */
	public static ArrayList<Integer> findKeysThatMatchesValues(HashMap<Integer,String> map, HashSet<String> valuesToFind) {
		
		return null;		
	}
}
