package StringsAndListsTest;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import StringsAndLists.StringsAndLists;
import StringsAndLists.RunAllTests;

@RunWith(RunAllTestsTestRunner.class)
public class TestFootballScore {
	
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		RunAllTests.outputResults(testsPassed, numberOfTests);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testFootballScoreN01() {
		numberOfTests++;
		assertEquals(9, StringsAndLists.footballScore("FFF"));
		testsPassed++;
	} // testFootballScoreN0
	
	@Test
	public void testFootballScoreN02() {
		numberOfTests++;
		assertEquals(21, StringsAndLists.footballScore("TTT"));
		testsPassed++;
	} // testFootballScoreN02
	
	@Test
	public void testFootballScoreN03() {
		numberOfTests++;
		assertEquals(17, StringsAndLists.footballScore("TFT"));
		testsPassed++;
	} // testFootballScoreN03
	
	@Test
	public void testFootballScoreN04() {
		numberOfTests++;
		assertEquals(7, StringsAndLists.footballScore("T"));
		testsPassed++;
	} // testFootballScoreN04
	
	@Test
	public void testFootballScoreN05() {
		numberOfTests++;
		assertEquals(3, StringsAndLists.footballScore("F"));
		testsPassed++;
	} // testFootballScoreN05
	
	@Test
	public void testFootballScoreN06() {
		numberOfTests++;
		assertEquals(30, StringsAndLists.footballScore("FFFFFFFFFF"));
		testsPassed++;
	} // testFootballScoreN06
	
	@Test
	public void testFootballScoreN07() {
		numberOfTests++;
		assertEquals(0, StringsAndLists.footballScore(""));
		testsPassed++;
	} // testFootballScoreN07

}
