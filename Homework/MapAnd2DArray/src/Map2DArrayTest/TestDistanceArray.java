package Map2DArrayTest;
import static org.junit.Assert.assertArrayEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Map2DArray.MapAnd2DArray;
import Map2DArray.RunAllTests;

public class TestDistanceArray {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestDistanceArray.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown
	
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
			
		numberOfTests++;
		assertArrayEquals(expected, MapAnd2DArray.distanceArray(1, 1, 1));
		testsPassed++;
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

		numberOfTests++;
		assertArrayEquals(expected, MapAnd2DArray.distanceArray(0, 0, 1));
		testsPassed++;
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

		numberOfTests++;
		assertArrayEquals(expected, MapAnd2DArray.distanceArray(1, 6, 2));
		testsPassed++;
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

		numberOfTests++;
		assertArrayEquals(expected, MapAnd2DArray.distanceArray(6, 6, 2));
		testsPassed++;
	} // testDistanceArrayN04

}
