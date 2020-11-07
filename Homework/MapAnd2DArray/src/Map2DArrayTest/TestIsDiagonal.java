package Map2DArrayTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Map2DArray.MapAnd2DArray;
import Map2DArray.RunAllTests;


public class TestIsDiagonal {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestIsDiagonal.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testIsDiagonalN01() {
		int[][] array = {{1,0,0},{0,2,0},{0,0,3}};
		numberOfTests++;
		assertEquals(true, MapAnd2DArray.isDiagonal(array));
		testsPassed++;
	} // testIsDiagonalN01
	
	@Test
	public void testIsDiagonalN02() {
		int[][] array = {{1,0,0},{0,2,0},{0,0,3}};
		numberOfTests++;
		array[0][2] = 44;
		assertEquals(false, MapAnd2DArray.isDiagonal(array));
		testsPassed++;
	} // testIsDiagonalN02
	
	@Test
	public void testIsDiagonalN03() {
		int[][] array2 = {{0,0},{0,99}};
		numberOfTests++;
		assertEquals(true, MapAnd2DArray.isDiagonal(array2));
		testsPassed++;
	} // testIsDiagonalN03
	
	@Test
	public void testIsDiagonalN04() {
		int[][] array2 = {{0,0},{0,99}};
		array2[1][0] = 5;
		numberOfTests++;
		assertEquals(false, MapAnd2DArray.isDiagonal(array2));
		testsPassed++;
	} // testIsDiagonalN04
	
	@Test
	public void testIsDiagonalN05() {
		int[][] array3 = {{1,0,0,0},{0,2,0,0},{0,0,3,0},{0,0,0,4}};
		numberOfTests++;
		assertEquals(true, MapAnd2DArray.isDiagonal(array3));
		testsPassed++;
	} // testIsDiagonalN05
	
	@Test
	public void testIsDiagonalN06() {
		int[][] array3 = {{1,0,0,0},{0,2,0,0},{0,0,3,0},{0,0,0,4}};
		array3[0][0] = 0;
		array3[0][3] = 5;
		numberOfTests++;
		assertEquals(false, MapAnd2DArray.isDiagonal(array3));
		testsPassed++;
	} // testIsDiagonalN06
	
}
