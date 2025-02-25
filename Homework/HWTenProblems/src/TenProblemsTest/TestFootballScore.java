package TenProblemsTest;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import TenProblems.RunAllTests;
import TenProblems.TenProblems;

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
		assertEquals(9, TenProblems.footballScore("FFF".toCharArray()));
		testsPassed++;
	} // testFootballScoreN0
	
	@Test
	public void testFootballScoreN02() {
		numberOfTests++;
		assertEquals(21, TenProblems.footballScore("TTT".toCharArray()));
		testsPassed++;
	} // testFootballScoreN02
	
	@Test
	public void testFootballScoreN03() {
		numberOfTests++;
		assertEquals(17, TenProblems.footballScore("TFT".toCharArray()));
		testsPassed++;
	} // testFootballScoreN03
	
	@Test
	public void testFootballScoreN04() {
		numberOfTests++;
		assertEquals(7, TenProblems.footballScore("T".toCharArray()));
		testsPassed++;
	} // testFootballScoreN04
	
	@Test
	public void testFootballScoreN05() {
		numberOfTests++;
		assertEquals(3, TenProblems.footballScore("F".toCharArray()));
		testsPassed++;
	} // testFootballScoreN05
	
	@Test
	public void testFootballScoreN06() {
		numberOfTests++;
		assertEquals(30, TenProblems.footballScore("FFFFFFFFFF".toCharArray()));
		testsPassed++;
	} // testFootballScoreN06
	
	@Test
	public void testFootballScoreN07() {
		numberOfTests++;
		assertEquals(0, TenProblems.footballScore("".toCharArray()));
		testsPassed++;
	} // testFootballScoreN07

}
