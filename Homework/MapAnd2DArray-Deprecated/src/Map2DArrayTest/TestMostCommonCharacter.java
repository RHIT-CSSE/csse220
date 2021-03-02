package Map2DArrayTest;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Map2DArray.RunAllTests;
import Map2DArray.MapAnd2DArray;



public class TestMostCommonCharacter {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestMostCommonCharacter.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testMostCommonCharacterN01() {
		numberOfTests++;
		assertEquals('a', MapAnd2DArray.mostCommonCharacter("aaab"));
		testsPassed++;
	} // testMostCommonCharacterN01
	
	@Test
	public void testMostCommonCharacterN02() {
		numberOfTests++;
		assertEquals('a', MapAnd2DArray.mostCommonCharacter("bbaaa"));
		testsPassed++;
	} // testMostCommonCharacterN02
	
	@Test
	public void testMostCommonCharacterN03() {
		numberOfTests++;
		assertEquals('c', MapAnd2DArray.mostCommonCharacter("abcbcdc"));
		testsPassed++;
	} // testMostCommonCharacterN03
	
	@Test
	public void testMostCommonCharacterN04() {
		numberOfTests++;
		assertEquals('a', MapAnd2DArray.mostCommonCharacter("a"));
		testsPassed++;
	} // testMostCommonCharacterN04
	
	@Test
	public void testMostCommonCharacterN05() {
		numberOfTests++;
		assertEquals('l', MapAnd2DArray.mostCommonCharacter("hello"));
		testsPassed++;
	} // testMostCommonCharacterN05

}
