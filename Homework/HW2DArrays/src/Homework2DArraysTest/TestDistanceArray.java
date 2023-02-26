package Homework2DArraysTest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import Homework2DArrays.Homework2DArrays;


//*** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestDistanceArray {
	
	// --------------------------------------------
	// Helper Operations
	// --------------------------------------------

	private char[][] convert1DStringArrayTo2DCharArray(String[] input) {
		final int rowMax = 10;
		final int colMax = 10;
		char[][] retVal = new char[rowMax][colMax];
		for(int r = 0; r < rowMax; r++) {
			for(int c = 0; c < colMax; c++) {
				retVal[r][c] = input[r].charAt(c);
			} // end for
		} // end for
		return retVal;
	} // convert1DStringArrayTo2DCharArray
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testDistanceArrayN01() {		
		 String[] test1 = {
		 ".x........",
		 "xxx.......",
		 ".x........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 };
		char[][] expected = convert1DStringArrayTo2DCharArray(test1);
			
		assertArrayEquals(expected, Homework2DArrays.distanceArray(1, 1, 1));
	} // testDistanceArrayN01
	
	@Test
	public void testDistanceArrayN02() {
		 String[] test2 = {
		 "xx........",
		 "x.........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 };
		char[][] expected = convert1DStringArrayTo2DCharArray(test2);

		assertArrayEquals(expected, Homework2DArrays.distanceArray(0, 0, 1));
	} // testDistanceArrayN02
	
	@Test
	public void testDistanceArrayN03() {
		String[] test3 = {
		 ".....xxx..",
		 "....xxxxx.",
		 ".....xxx..",
		 "......x...",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 };
		char[][] expected = convert1DStringArrayTo2DCharArray(test3);

		assertArrayEquals(expected, Homework2DArrays.distanceArray(1, 6, 2));
	} // testDistanceArrayN03
	
	@Test
	public void testDistanceArrayN04() {
		String[] test4 = {
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "......x...",
		 ".....xxx..",
		 "....xxxxx.",
		 ".....xxx..",
		 "......x...",
		 "..........",
		};
		char[][] expected = convert1DStringArrayTo2DCharArray(test4);

		assertArrayEquals(expected, Homework2DArrays.distanceArray(6, 6, 2));
	} // testDistanceArrayN04

}
