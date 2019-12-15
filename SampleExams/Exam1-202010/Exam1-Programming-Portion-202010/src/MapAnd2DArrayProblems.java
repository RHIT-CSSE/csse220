import java.util.ArrayList;
import java.util.HashMap;

public class MapAnd2DArrayProblems {
	
	/**
	 * Takes an 2d array consisting of of 1s and 0s 
	 * representing a game board
	 * 
	 * Returns the length of the longest consecutive sequence of 1s
	 * in either rows or columns
	 * 
	 * Eg.
	 *    [[0,1,0,0,0],
	 *     [0,1,1,1,0]] returns 3
	 *     
	 *    [[1,0,0,0,1],
	 *     [0,1,1,0,1],
	 *     [1,1,0,1,1],
	 *     [1,0,1,1,0]] returns 3
	 *     
	 *    [[1,0,0,0,1]
	 *     [0,1,1,0,1],
	 *     [1,1,0,1,0],
	 *     [1,0,1,1,0]] returns 2      
	 *
	 * 	  [[1,0,0,0,1]
	 *     [0,1,1,0,1],
	 *     [1,1,0,1,0],
	 *     [1,0,1,1,1]] returns 3      
	 */
	public static int longest1Run(int [][] board) {
		
		return 0;
	}
	
	/**
	 * The given represents the results of a survey where students 
	 * listed who they were dating.  The key is the student who 
	 * answered the survey and the value is the name of their significant 
	 * other.  If a student said they weren't dating anyone, their value 
	 * will be "SINGLE". 
	 * 
	 * Assume all names are unique and included in the map.  Find all students 
	 * who said they were dating someone, but that someone didn't say they were
	 * dating them.  Note that SINGLE people should never be in the result list, 
	 * and neither should the special value "SINGLE".
	 * 
	 * Example Map: 
	 * { "Alice" => "Bill", 
	 * "Bill" => "Alice", 
	 * "Steve" => "Alice",
	 * "Pat" => "SINGLE",
	 * "Sam" => "Pat" }
	 * Should return ["Steve", "Sam"]       
	 *   
	 * 
	 * @param map 
	 * @param valueToFind
	 * @return key in map associated with valueToFind, or -1 if no key associated with valueToFind
	 */
	public static ArrayList<String> findUnexpectedSingles(HashMap<String,String> map) {
		
		return null;		
	}
}
