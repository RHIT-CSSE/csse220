package HW1Test;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import HW1.RunAllTests;
import HW1.HW1;

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
		assertEquals(9, HW1.footballScore("FFF".toCharArray()));
		testsPassed++;
	} // testFootballScoreN0
	
	@Test
	public void testFootballScoreN02() {
		numberOfTests++;
		assertEquals(21, HW1.footballScore("TTT".toCharArray()));
		testsPassed++;
	} // testFootballScoreN02
	
	@Test
	public void testFootballScoreN03() {
		numberOfTests++;
		assertEquals(17, HW1.footballScore("TFT".toCharArray()));
		testsPassed++;
	} // testFootballScoreN03
	
	@Test
	public void testFootballScoreN04() {
		numberOfTests++;
		assertEquals(7, HW1.footballScore("T".toCharArray()));
		testsPassed++;
	} // testFootballScoreN04
	
	@Test
	public void testFootballScoreN05() {
		numberOfTests++;
		assertEquals(3, HW1.footballScore("F".toCharArray()));
		testsPassed++;
	} // testFootballScoreN05
	
	@Test
	public void testFootballScoreN06() {
		numberOfTests++;
		assertEquals(30, HW1.footballScore("FFFFFFFFFF".toCharArray()));
		testsPassed++;
	} // testFootballScoreN06
	
	@Test
	public void testFootballScoreN07() {
		numberOfTests++;
		assertEquals(0, HW1.footballScore("".toCharArray()));
		testsPassed++;
	} // testFootballScoreN07

}
