package Map2DArrayTest;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Map2DArray.MapAnd2DArray;
import Map2DArray.RunAllTests;


public class TestLongestRepeatSequence {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestLongestRepeatSequence.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testLongestRepeatSequenceN01() {
		char[][] foo = {{'a','b','c'},{'d','d','e'}};
		numberOfTests++;
		assertEquals(2,MapAnd2DArray.longestRepeatSequence(foo));
		testsPassed++;		
	} // testLongestRepeatSequenceN01
	
	@Test
	public void testLongestRepeatSequenceN02() {
		char[][] foo2 = {{'a','b','b'},{'b','e','f'}};

		numberOfTests++;
		assertEquals(3,MapAnd2DArray.longestRepeatSequence(foo2));
		testsPassed++;
	} // testLongestRepeatSequenceN02
	
	@Test
	public void testLongestRepeatSequenceN03() {
		char[][] foo3 = {{'a','b','b'},{'b','e','f'},{'b','e','f'},{'b','e','f'}};

		numberOfTests++;
		assertEquals(3,MapAnd2DArray.longestRepeatSequence(foo3));
		testsPassed++;
	} // testLongestRepeatSequenceN03
	
	@Test
	public void testLongestRepeatSequenceN04() {
		char[][] foo4 = {{'a','b','b'},{'b','e','f'},{'b','e','q'},{'q','q','q'}};

		numberOfTests++;
		assertEquals(4,MapAnd2DArray.longestRepeatSequence(foo4));
		testsPassed++;		
	} // testLongestRepeatSequenceN04
	
}
