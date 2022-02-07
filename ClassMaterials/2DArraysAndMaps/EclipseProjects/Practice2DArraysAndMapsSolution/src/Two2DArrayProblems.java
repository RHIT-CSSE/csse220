
/**
 * TODO Put here a description of what this class does.
 *
 * @author TODO <Add your name here>.
 *         Created Dec 15, 2013.
 */
public class Two2DArrayProblems {
	
	/**
	 * 
	 * Count the number of times 4 occurs in the array.  So
	 * the array
	 * 
	 * 		int[][] intArray2 = 
     *       {{0,0,0},
     *       {4,4,0}};
     *
     *       returns 2
	 * @param data 
	 * @return the number of times 4 occurs in the array.
	 */
	public static int count4s(int[][] data) {
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] == 4) {
					count++;
				}
			}
		}
		return count;
	}
	
	/**
	 * Takes an array of strings, all of which have equal length.
	 * 
	 * Returns a 2D array of characters, where the characters
	 * correspond to the strings.  
	 * 
	 * {"abc",
	 *  "def"} yields {{'a','b','c'},
     *                 {'d','e','f'}};
	 * @param input 
	 * @return a 2D array of characters, where the characters
	 * correspond to the strings. 
	 *  
	 */
	public static char[][] stringsToCharArrays(String[] input) {
		int strLength = input[0].length();
		char[][] output = new char[input.length][strLength];
		for(int i = 0; i < input.length; i++) {
			String current = input[i];
			for(int j = 0; j < strLength; j++) {
				output[i][j] = current.charAt(j);
			}
		}
		return output;
	}
	
	/**
	 * Takes a square array of integers.
	 * 
	 * Returns true if the array is symmetric.  That is if
	 * the array[i,j] == array[j,i] for all i and j
	 * 
	 * So {{1,0,0},
	 *     {0,1,0},
	 *     {0,0,1}} returns true
     *
     *    {{1,0,3},
	 *     {0,1,0},
	 *     {0,0,1}} returns false because [0,2] != [2,0]
	 * @param input 
	 * @return true if the array is symmetric, false otherwise.
	 */
	public static boolean isSymmetric(int[][] input) {
		for(int i = 0; i < input.length; i++) {
			for(int j = i+1; j < input.length; j++) {
				if(input[i][j] != input[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Takes an array of integers representing a map.
	 * 
	 * On the map there is one square representing the person: '@'
	 * At least one and maybe more squares representing an exit: 'X'
	 * And empty squares: '.'
	 * 
	 * The function returns the shortest distance from the person to 
	 * an exit.  Note the person can't move diagonally so it is the
	 * Manhattan distance. 
	 * 
	 * If you're not sure what "Manhattan distance" is, be sure to 
	 * look it up! Having that definition makes things much easier.
	 * 
	 *  For example, in the map 
	 *  @...
	 *  .X.X
	 *  
	 *  The function returns 2 (east, south)
	 *  
	 *  X.XX
	 *  ....
	 *  .@.. returns 3
	 *  
	 * @param input 
	 * @return the shortest Manhattan distance from the person to 
	 * an exit.
	 */
	public static int distanceToExit(char[][] input) {
		int atRow = -1;
		int atColumn = -1;
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				if(input[i][j] == '@') {
					atRow = i;
					atColumn = j;
				}
			}
		}
		int minDistance = Integer.MAX_VALUE;
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				if(input[i][j] == 'X') {
					int distance = Math.abs(i - atRow) + Math.abs(j - atColumn);
					minDistance = Math.min(minDistance, distance);
				}
			}
		}
		return minDistance;
	}
}
