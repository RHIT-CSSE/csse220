package Homework2DArraysTest;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Homework2DArrays.Homework2DArrays;
import Homework2DArrays.RunAllTests;

public class TestBallRestElevation {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBallRestElevation.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBallRestElevationN01() {
		int[][] array1 = {
				{9,9,9,9,9,9},
				{9,8,5,4,9,9},
				{9,7,9,9,9,9},
				{9,7,5,2,2,9},
				{9,9,9,9,9,9}};

		numberOfTests++;
		assertEquals(4, Homework2DArrays.ballRestElevation(array1));
		testsPassed++;
	} // testBallRestElevationN01
	
	@Test
	public void testBallRestElevationN02() {
		int[][] array3 = {
				{9,9,9,9,9,9},
				{9,8,9,4,1,9},
				{9,7,9,9,2,9},
				{9,6,5,4,3,9},
				{0,9,9,9,9,9}};
		
		numberOfTests++;
		assertEquals(1, Homework2DArrays.ballRestElevation(array3));
		testsPassed++;
	} // testBallRestElevationN02
	
	@Test
	public void testBallRestElevationN03() {
		int[][] array2 = {
				{9,9,9,9,9,9},
				{9,8,6,4,9,9},
				{9,5,9,9,9,9},
				{9,5,5,2,2,9},
				{9,9,9,9,9,9}};

		numberOfTests++;
		assertEquals(5, Homework2DArrays.ballRestElevation(array2));
		testsPassed++;
	} // testBallRestElevationN03

}
