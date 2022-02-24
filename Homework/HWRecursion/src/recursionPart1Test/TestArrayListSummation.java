package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTestsPart1;

public class TestArrayListSummation {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestArrayListSummation.class.getSimpleName();
		RunAllTestsPart1.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testArrayListSummation01() {
		numberOfTests++;
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		assertEquals(6, Part1Problems.arrayListSummation(values));
		testsPassed++;
	} // testArrayListSummation01

	@Test
	public void testArrayListSummation02() {
		numberOfTests++;
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40));
		assertEquals(46, Part1Problems.arrayListSummation(values));
		testsPassed++;
	} // testArrayListSummation02

	@Test
	public void testArrayListSummation03() {
		numberOfTests++;
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40, 25));
		assertEquals(71, Part1Problems.arrayListSummation(values));
		testsPassed++;
	} // testArrayListSummation03

	@Test
	public void testArrayListSummation04() {
		numberOfTests++;
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40, 25, 20000));
		assertEquals(20071, Part1Problems.arrayListSummation(values));
		testsPassed++;
	} // testArrayListSummation04

	@Test
	public void testArrayListSummation05() {
		numberOfTests++;
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40, 25, 20000, -71));
		assertEquals(20000, Part1Problems.arrayListSummation(values));
		testsPassed++;
	} // testArrayListSummation05

} // end TestArrayListSummation
