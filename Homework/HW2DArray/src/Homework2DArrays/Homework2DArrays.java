package Homework2DArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Class: Homework2DArrays
 * @author CSSE Faculty
 * Purpose: provide practice with 2D arrays
 * 
 */
public class Homework2DArrays {
	
	/**
	 * 
	 * Given a square array, determines if it is diagonal
	 * That is, returns true if all values in the array are 0 
	 * except the main diagonal.  The main diagonal is entries of the form
	 * data[i][j] where i == j.  Elements on the main
	 * diagonal can be 0 or any other number.
	 * 
	 * Examples:
	 * {{1,0,0},
	 *  {0,2,0}
	 *  {0,0,3}} yields true
	 *  
	 * {{1,0,9},
	 *  {0,2,0},
	 *  {0,0,3}} yields false because 0,2 is nonzero
	 * 
	 * {{0,0,0},
	 *  {0,0,0},
	 *  {0,0,3}} yields true because there can be 0
	 *                  entries on the diagonal if desired
	 * @param data input array
	 * @return true if it is diagonal, false otherwise
	 */
	public static boolean isDiagonal(int[][] data) {
		
		return false;
	} // isDiagonal
	
	/**
	 * 
	 * Given a 2D array populated with a sequence of characters 
	 * that wrap from the rightmost position to the leftmost position 
	 * on the next row, find the length of the longest sequence of repeated 
	 * characters. 
	 * 
	 * For example
	 * 
	 * abba
	 * dafa
	 * 
	 * Has a longest sequence of 2 for the 2 repeated
	 * bs
	 * 
	 * 2 Bs yield the longest repeat sequence here. Note that the As do not 
	 * follow after each other and hence, do not get considered.
	 * 
	 * The array is considered to "wrap" 
	 * from the rightmost position to the leftmost
	 * position on the next line.
	 * 
	 * For example:
	 * 
	 * abcdd
	 * ddefg
	 * 
	 * Is considered to have a longest sequence of 4
	 * because the two ds on the right "wrap around"
	 * to connect with the two ds on the next line 
	 * 
	 * @param data
	 * @return the length of the longest sequence
	 */
	public static int longestRepeatSequence(char[][] data) {
		
		return 0;
	} // longestRepeatSequence
	
	/**
	 * Given a 2D array of characters, returns a string consisting of all the characters
	 * in column-order, that is, one column at a time, going from left to right.
	 * 
	 * For example, 
	 * 
	 * hlo
	 * el! 
	 * 
	 * returns the string "hello!"
	 * 
	 * @param data rectangular 2D array.
	 * @return a single string made of all the characters in each column.
	 */
	public static String stringFromColumns(char[][] data) {
		return "replace this";
	} // stringFromColumns
	
	
	/**
	 * Given A specific starting position and distance
	 * returns a 10x10 character array with all positions
	 * that are less than or equal to that manhattan distance 
	 * from the starting position marked with an x.
	 * 
	 * Recall the manhattan distance is the distance
	 * in terms of number of direct steps North South East West.
	 *
	 * You can compute the manhanttan distance with this formula
        * distance = |x1 - x2| + |y1 - y2|
	 * 
	 * Unmarked cells should be filled with a period '.'
	 * 
	 * For example, given row=1,col=1,distance 1
	 * .x........
	 * xxx.......
	 * .x........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * 
	 * For example, given row=1,col=6,distance 2
	 * .....xxx..
	 * ....xxxxx.
	 * .....xxx..
	 * ......x...
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........

	 * 
	 * @param row starting position row
	 * @param col starting position col
	 * @param distance
	 * @return new 10x10 char array with correct squares marked
	 */
	public static char[][] distanceArray(int row, int col, int distance) {
		
		return null;
	} // distanceArray
	
	
	// ***********************************************************************************************
	// BONUS: Extra credit problem
	// ***********************************************************************************************
	
	/**
	 * 
	 * Feel free to skip this one if you don't have time.
	 * It's a little harder.
	 * 
	 * You are given a map indicating the elevation of
	 * a small area like a desk.  A ball is placed on the desk.
	 * The ball will roll downhill going north south east or west.
	 *
	 * The ball always starts at position 1,1
	 *
	 * It will always choose the path of steepest descent.
	 * It will eventually come to rest when it is at a position
	 * where all neighboring positions are higher/equal.  
	 * Return the elevation of that position.
	 * 
	 * You can assume that map will be such that the ball
	 * will always come to rest without moving through an edge
	 * 
	 * You can assume there will always be one steepest
	 * position for the ball to go to
	 * 
	 * For example, in an array like this:
	 * 9999
	 * 9549
	 * 9999 yields 4
	 * The ball would start in 1,1 (5) rolls to 4 and stops
	 * 
	 * 99999999999
	 * 98711111199
	 * 96999999999
	 * 95444444399
	 * 99999999999 yields 4
	 * The ball starts at 8, follows steepest decent to 6
	 * Then at the first 4 there is no lower position so it
	 * stops
	 * 
	 * @param map map indicating elevation
	 * @return height where the ball stops
	 */
	public static int ballRestElevation(int[][] map) {
		return 0;
	} // ballRestElevation
	

	
}
