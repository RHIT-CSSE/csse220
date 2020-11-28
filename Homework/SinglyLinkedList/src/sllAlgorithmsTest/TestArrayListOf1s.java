package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sllAlgorithms.RunAllTests;
import sllAlgorithms.Algorithms;

public class TestArrayListOf1s {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestArrayListOf1s.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testArraylistOf1sN01() {
		int[] t0 = {};

		numberOfTests++;
		assertEquals("[]", Algorithms.arraylistOf1s(t0).toString());
		testsPassed++;
	} // testArraylistOf1sN01

	@Test
	public void testArraylistOf1sN02() {
		int[] t1 = { 1, 2, 3 };

		numberOfTests++;
		assertEquals("[1] first=[1] last=[1]", Algorithms.arraylistOf1s(t1).toString());
		testsPassed++;
	} // testArraylistOf1sN02

	@Test
	public void testArraylistOf1sN03() {
		int[] t2 = { 1, 1000, 21111 };

		numberOfTests++;
		assertEquals("[1, 1000] first=[1] last=[1000]", Algorithms.arraylistOf1s(t2).toString());
		testsPassed++;
	} // testArraylistOf1sN03

	@Test
	public void testArraylistOf1sN04() {
		int[] t3 = { 21, 311, 4111 };

		numberOfTests++;
		assertEquals("[]", Algorithms.arraylistOf1s(t3).toString());
		testsPassed++;
	} // testArraylistOf1sN04
	
	@Test
	public void testArraylistOf1sN05() {
		int[] t3 = { 21, 311, 14111 };

		numberOfTests++;
		assertEquals("[14111] first=[14111] last=[14111]", Algorithms.arraylistOf1s(t3).toString());
		testsPassed++;
	} // testArraylistOf1sN05

} // end class TestArrayListOf1s
