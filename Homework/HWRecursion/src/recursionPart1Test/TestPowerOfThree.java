package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTestsPart1;

public class TestPowerOfThree {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestPowerOfThree.class.getSimpleName();
		RunAllTestsPart1.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testPowerOfThree01() {
		numberOfTests++;
		assertEquals(true, Part1Problems.evenPowerOfThree(1));
		testsPassed++;
	} // testPowerOfThree01

	@Test
	public void testPowerOfThree02() {
		numberOfTests++;
		assertEquals(false, Part1Problems.evenPowerOfThree(3));
		testsPassed++;
	} // testPowerOfThree02

	@Test
	public void testPowerOfThree03() {
		numberOfTests++;
		assertEquals(true, Part1Problems.evenPowerOfThree(9));
		testsPassed++;
	} // testPowerOfThree03

	@Test
	public void testPowerOfThree04() {
		numberOfTests++;
		assertEquals(false, Part1Problems.evenPowerOfThree(14348907));
		testsPassed++;
	} // testPowerOfThree04

	@Test
	public void testPowerOfThree05() {
		numberOfTests++;
		assertEquals(true, Part1Problems.evenPowerOfThree(4782969));
		testsPassed++;
	} // testPowerOfThree05

	@Test
	public void testPowerOfThree06() {
		numberOfTests++;
		assertEquals(true, Part1Problems.evenPowerOfThree(729));
		testsPassed++;
	} // testPowerOfThree06

	@Test
	public void testPowerOfThree07() {
		numberOfTests++;
		assertEquals(false, Part1Problems.evenPowerOfThree(2187));
		testsPassed++;
	} // testPowerOfThree07

} // end TestPowerOfThree
