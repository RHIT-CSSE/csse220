package Homework2DArraysTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import Homework2DArrays.Homework2DArrays;

//*** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestBallRestElevation {

	@Test
	public void testBallRestElevationN01() {
		int[][] array1 = {
				{9,9,9,9,9,9},
				{9,8,5,4,9,9},
				{9,7,9,9,9,9},
				{9,7,5,2,2,9},
				{9,9,9,9,9,9}};

		assertEquals(4, Homework2DArrays.ballRestElevation(array1));
	} // testBallRestElevationN01
	
	@Test
	public void testBallRestElevationN02() {
		int[][] array3 = {
				{9,9,9,9,9,9},
				{9,8,9,4,1,9},
				{9,7,9,9,2,9},
				{9,6,5,4,3,9},
				{0,9,9,9,9,9}};
		
		assertEquals(1, Homework2DArrays.ballRestElevation(array3));
	} // testBallRestElevationN02
	
	@Test
	public void testBallRestElevationN03() {
		int[][] array2 = {
				{9,9,9,9,9,9},
				{9,8,6,4,9,9},
				{9,5,9,9,9,9},
				{9,5,5,2,2,9},
				{9,9,9,9,9,9}};

		assertEquals(5, Homework2DArrays.ballRestElevation(array2));
	} // testBallRestElevationN03

}
