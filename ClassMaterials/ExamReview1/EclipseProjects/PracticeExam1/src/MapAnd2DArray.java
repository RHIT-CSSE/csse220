import java.util.HashMap;

/*
 * DO EXACTLY 2 OF THESE 3 PROBLEMS
 * 
 * For the problem you choose not to be graded on, please delete
 * ALL code (except for the return statement so it will compile).
 * 
 * You will NOT get extra credit for attempting more than 2 out of 3. 
 */

public class MapAnd2DArray {

	/* In a particular word game, players score points based
	 * on the length of the words they score.  So "java" is 
	 * worth 4 points.  
	 * 
	 * Given two arrays, one of the words scored
	 * and one of the player who scored each word, the
	 * function should return the name of the highest
	 * scoring player.  If more than one player has
	 * the high score, the function should return "TIE".
	 * 
	 * For example:
	 * 
	 * ["dog","ninja","cat","mango"] ["Alice","Bob","Alice","Charles"] 
	 * 
	 * Alice gets 6 points for dog + cat
	 * Bob gets 5 points for ninja
	 * Charles gets 5 points for mango
	 * 
	 * The function should return "Alice"
	 * 
	 * 2nd example:
	 * ["hand","is","by","say"] ["Bob","Charles","Charles","Alice"]
	 * Bob gets 4 points for hand
	 * Charles gets 4 points for is + by
	 * Alice gets 3 points for say
	 * 
	 *  The function should return "TIE"
	 *  
	 *  You can assume the arrays will not be empty
	 *  
	 *  It is easiest to use a HashMap to solve this problem.  Other solutions
	 *  will be accepted for full credit though.
	 */
	public static String wordgameWinner(String[] words, String[] scorerName) {
		return null;
	}
	
	/* This function takes two HashMaps of Integers to Integers.  The keys of the second
	 * map include all the values of the first map.  The function should return
	 * a new map which maps the keys of the first map to their corresponding 
	 * values of the second map.
	 * 
	 * For example:
	 * {1=2,5=7} {2=100,7=200} returns {1=100,5=200}
	 * {55=6,77=7,2=10} {10=-1,7=2000,6=0} returns {55=0,77=2000,2=-1}
	 * 
	 * DO NOT MODIFY the maps passed in as parameters.  Return a new map.
	 */
	public static HashMap<Integer,Integer> transitiveMap(HashMap<Integer,Integer> first,
			HashMap<Integer,Integer> second) {
		return null;
	}
	
	/* This function takes a 2D array of integers where the first index represents
	 * rows and the second index represents columns.
	 * 
	 * If 2D array has a column consisting of all 0s, the function should return
	 * the index of the column.  If more than one column is all zeros, the function
	 * should return the index of the lowest numbered column.  If the function
	 * has no zero columns, the function should return -1.
	 * 
	 * Examples:
	 * 
	 * {{1,0,0},
	 *  {2,0,0},
	 *  {0,0,3}} yields 1
	 *  
	 * {{1,2,9},
	 *  {0,0,0},
	 *  {0,0,3}} yields -1 (no columns)
	 * 
	 * {{1,0,0,0,0},
	 *  {0,9,0,0,0}} yields 2
	 */
	public static int getZeroColumn(int[][] array) {
		return 0;
	}
}
