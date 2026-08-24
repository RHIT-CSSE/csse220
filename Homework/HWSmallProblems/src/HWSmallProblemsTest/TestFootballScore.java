package HWSmallProblemsTest;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HWSmallProblems.RunAllTests;
import HWSmallProblems.HWSmallProblems;

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
		RunAllTests.outputResults(testsPassed, numberOfTests, TestFootballScore.class.getSimpleName());
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testFootballScoreN01() {
		numberOfTests++;
		assertEquals(9, HWSmallProblems.footballScore("FFF".toCharArray()));
		testsPassed++;
	} // testFootballScoreN0
	
	@Test
	public void testFootballScoreN02() {
		numberOfTests++;
		assertEquals(21, HWSmallProblems.footballScore("TTT".toCharArray()));
		testsPassed++;
	} // testFootballScoreN02
	
	@Test
	public void testFootballScoreN03() {
		numberOfTests++;
		assertEquals(17, HWSmallProblems.footballScore("TFT".toCharArray()));
		testsPassed++;
	} // testFootballScoreN03
	
	@Test
	public void testFootballScoreN04() {
		numberOfTests++;
		assertEquals(7, HWSmallProblems.footballScore("T".toCharArray()));
		testsPassed++;
	} // testFootballScoreN04
	
	@Test
	public void testFootballScoreN05() {
		numberOfTests++;
		assertEquals(3, HWSmallProblems.footballScore("F".toCharArray()));
		testsPassed++;
	} // testFootballScoreN05
	
	@Test
	public void testFootballScoreN06() {
		numberOfTests++;
		assertEquals(30, HWSmallProblems.footballScore("FFFFFFFFFF".toCharArray()));
		testsPassed++;
	} // testFootballScoreN06
	
	@Test
	public void testFootballScoreN07() {
		numberOfTests++;
		assertEquals(0, HWSmallProblems.footballScore("".toCharArray()));
		testsPassed++;
	} // testFootballScoreN07

}
