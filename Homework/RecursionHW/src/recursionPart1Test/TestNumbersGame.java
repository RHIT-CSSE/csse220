package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTestsPart1;

public class TestNumbersGame {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestNumbersGame.class.getSimpleName();
		RunAllTestsPart1.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testNumbersGame01() {
		numberOfTests++;
		assertEquals(true, Part1Problems.numbersGame(1));
		testsPassed++;
	} // testNumbersGame01

	@Test
	public void testNumbersGame02() {
		numberOfTests++;
		assertEquals(true, Part1Problems.numbersGame(8));
		testsPassed++;
	} // testNumbersGame02

	@Test
	public void testNumbersGame03() {
		numberOfTests++;
		assertEquals(true, Part1Problems.numbersGame(9));
		testsPassed++;
	} // testNumbersGame03

	@Test
	public void testNumbersGame04() {
		numberOfTests++;
		assertEquals(true, Part1Problems.numbersGame(15));
		testsPassed++;
	} // testNumbersGame04

	@Test
	public void testNumbersGame05() {
		numberOfTests++;
		assertEquals(false, Part1Problems.numbersGame(18));
		testsPassed++;
	} // testNumbersGame05

	@Test
	public void testNumbersGame06() {
		numberOfTests++;
		assertEquals(false, Part1Problems.numbersGame(21));
		testsPassed++;
	} // testNumbersGame06

} // end TestNumbersGame
