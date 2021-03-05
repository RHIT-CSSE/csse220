package MapsTest;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import MapsHW.Maps;
import MapsHW.RunAllTests;



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
		assertEquals('a', Maps.mostCommonCharacter("aaab"));
		testsPassed++;
	} // testMostCommonCharacterN01
	
	@Test
	public void testMostCommonCharacterN02() {
		numberOfTests++;
		assertEquals('a', Maps.mostCommonCharacter("bbaaa"));
		testsPassed++;
	} // testMostCommonCharacterN02
	
	@Test
	public void testMostCommonCharacterN03() {
		numberOfTests++;
		assertEquals('c', Maps.mostCommonCharacter("abcbcdc"));
		testsPassed++;
	} // testMostCommonCharacterN03
	
	@Test
	public void testMostCommonCharacterN04() {
		numberOfTests++;
		assertEquals('a', Maps.mostCommonCharacter("a"));
		testsPassed++;
	} // testMostCommonCharacterN04
	
	@Test
	public void testMostCommonCharacterN05() {
		numberOfTests++;
		assertEquals('l', Maps.mostCommonCharacter("hello"));
		testsPassed++;
	} // testMostCommonCharacterN05

}
