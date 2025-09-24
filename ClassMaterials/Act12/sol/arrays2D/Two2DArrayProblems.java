//package arrays2D;
//
///**
// * TODO Put here a description of what this class does.
// *
// * @author CSSE Faculty
// */
//public class Practice2DArrayProblems {
//
//	/**
//	 *
//	 * Count the number of times 4 occurs in the array.  So
//	 * the array
//	 *
//	 * 		int[][] intArray2 =
//     *       {{0,0,0},
//     *       {4,4,0}};
//     *
//     *       returns 2
//	 * @param data
//	 * @return the number of times 4 occurs in the array.
//	 */
//	public static int count4s(int[][] data) {
//		int count = 0;
//		for(int i = 0; i < data.length; i++) {
//			for(int j = 0; j < data[i].length; j++) {
//				if(data[i][j] == 4) {
//					count++;
//				}
//			}
//		}
//		return count;
//	}
//
//
//
//	/**
//	 * Takes a square array of integers.
//	 *
//	 * Returns true if the array is symmetric.  That is if
//	 * the array[i,j] == array[j,i] for all i and j
//	 *
//	 * So {{1,0,0},
//	 *     {0,1,0},
//	 *     {0,0,1}} returns true
//     *
//     *    {{1,0,3},
//	 *     {0,1,0},
//	 *     {0,0,1}} returns false because [0,2] != [2,0]
//	 * @param input
//	 * @return true if the array is symmetric, false otherwise.
//	 */
//	public static boolean isSymmetric(int[][] input) {
//		for(int i = 0; i < input.length; i++) {
//			for(int j = i+1; j < input.length; j++) {
//				if(input[i][j] != input[j][i]) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//
//	/**
//	 * Takes an array of numbers (ints), all of which have equal number of digits.
//	 *
//	 * Returns a 2D array of ints, where the digits
//	 * correspond to the original numbers (ints).
//	 *
//	 *    [123, 456]
//	 *
//	 *     yields
//	 *
//	 *    [[1, 2, 3],
//     *     [4, 5, 6] ];
//	 * @param input
//	 * @return a 2D array of ints, where the digits
//	 * correspond to the original ints.
//	 *
//	 */
//	public static int[][] numbersToDigitArrays(int[] input) {
//		int numDigits=0;
//		//find the number of digits by repeatedly dividing until reaching zero
//		int firstNum = input[0];
//		while (firstNum != 0) {
//			numDigits++;
//			firstNum = firstNum/10;
//		}
//
//		//setup array based on number of digits and number of numbers
//		int[][] output = new int[input.length][numDigits];
//		for(int i = 0; i < input.length; i++) {
//			//grab current number
//			int current = input[i];
//			for(int j = numDigits-1; j >= 0; j--) {
//				output[i][j] = current % 10; // get the last digit
//				current = current / 10;
//			}
//		}
//		return output;
//
//	}
//
//	/**
//	 * Takes an array of integers representing a map.
//	 *
//	 * On the map there is one square representing the person: '@'
//	 * At least one and maybe more squares representing an exit: 'X'
//	 * And empty squares: '.'
//	 *
//	 * The function returns the shortest distance from the person to
//	 * an exit.  Note the person can't move diagonally so it is the
//	 * Manhattan distance.
//	 *
//	 * If you're not sure what "Manhattan distance" is, be sure to
//	 * look it up! Having that definition makes things much easier.
//	 *
//	 *  For example, in the map
//	 *  @...
//	 *  .X.X
//	 *
//	 *  The function returns 2 (east, south)
//	 *
//	 *  X.XX
//	 *  ....
//	 *  .@.. returns 3
//	 *
//	 * @param input
//	 * @return the shortest Manhattan distance from the person to
//	 * an exit.
//	 */
//	public static int distanceToExit(char[][] input) {
//		int atRow = -1;
//		int atColumn = -1;
//		for(int i = 0; i < input.length; i++) {
//			for(int j = 0; j < input[i].length; j++) {
//				if(input[i][j] == '@') {
//					atRow = i;
//					atColumn = j;
//				}
//			}
//		}
//		int minDistance = Integer.MAX_VALUE;
//		for(int i = 0; i < input.length; i++) {
//			for(int j = 0; j < input[i].length; j++) {
//				if(input[i][j] == 'X') {
//					int distance = Math.abs(i - atRow) + Math.abs(j - atColumn);
//					minDistance = Math.min(minDistance, distance);
//				}
//			}
//		}
//		return minDistance;
//	}
//}
