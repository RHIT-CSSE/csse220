package recursionTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursion.HW8;
import recursion.RunAllTests;

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
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testNumbersGame01() {
		numberOfTests++;
		assertEquals(true, HW8.numbersGame(1));
		testsPassed++;
	} // testNumbersGame01

	@Test
	public void testNumbersGame02() {
		numberOfTests++;
		assertEquals(true, HW8.numbersGame(8));
		testsPassed++;
	} // testNumbersGame02

	@Test
	public void testNumbersGame03() {
		numberOfTests++;
		assertEquals(true, HW8.numbersGame(9));
		testsPassed++;
	} // testNumbersGame03

	@Test
	public void testNumbersGame04() {
		numberOfTests++;
		assertEquals(true, HW8.numbersGame(15));
		testsPassed++;
	} // testNumbersGame04

	@Test
	public void testNumbersGame05() {
		numberOfTests++;
		assertEquals(false, HW8.numbersGame(18));
		testsPassed++;
	} // testNumbersGame05

	@Test
	public void testNumbersGame06() {
		numberOfTests++;
		assertEquals(false, HW8.numbersGame(21));
		testsPassed++;
	} // testNumbersGame06

	@Test
	public void testNumbersGame07() {
		numberOfTests++;
		assertEquals(true, HW8.numbersGame(22));
		testsPassed++;
	} // testNumbersGame07
	
	@Test
	public void testNumbersGame08() {
		numberOfTests++;
		assertEquals(true, HW8.numbersGame(24));
		testsPassed++;
	} // testNumbersGame08

} // end TestNumbersGame
