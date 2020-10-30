package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTests;

public class TestSummation {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestSummation.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testSummation01() {
		numberOfTests++;
		assertEquals(1, Part1Problems.summation(1));
		testsPassed++;
	} // testSummation01

	@Test
	public void testSummation02() {
		numberOfTests++;
		assertEquals(3, Part1Problems.summation(2));
		testsPassed++;
	} // testSummation02

	@Test
	public void testSummation03() {
		numberOfTests++;
		assertEquals(55, Part1Problems.summation(10));
		testsPassed++;
	} // testSummation03

	@Test
	public void testSummation04() {
		numberOfTests++;
		assertEquals(5050, Part1Problems.summation(100));
		testsPassed++;
	} // testSummation04

	@Test
	public void testSummation05() {
		numberOfTests++;
		assertEquals(1275, Part1Problems.summation(50));
		testsPassed++;
	} // testSummation05

} // end SummationTest
