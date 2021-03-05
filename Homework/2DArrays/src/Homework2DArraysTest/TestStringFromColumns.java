package Homework2DArraysTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Homework2DArrays.Homework2DArrays;
import Homework2DArrays.RunAllTests;

public class TestStringFromColumns {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestStringFromColumns.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testStringFromColumnsN01() {
		char[][] foo = { { 'h', 'l', 'o' }, { 'e', 'l', '!' } };

		numberOfTests++;
		assertEquals("hello!", Homework2DArrays.stringFromColumns(foo));
		testsPassed++;
	} // testStringFromColumnsN01

	@Test
	public void testStringFromColumnsN02() {
		char[][] foo2 = { { 'a', 'b', 'c' }, { 'd', 'd', 'e' } };

		numberOfTests++;
		assertEquals("adbdce", Homework2DArrays.stringFromColumns(foo2));
		testsPassed++;
	} // testStringFromColumnsN02

	@Test
	public void testStringFromColumnsN03() {
		char[][] foo3 = { { 'w', ' ', 'h' }, { 'h', 'i', 'e' }, { 'a', 's', 'r' }, { 't', ' ', 'e' } };

		numberOfTests++;
		assertEquals("what is here", Homework2DArrays.stringFromColumns(foo3));
		testsPassed++;
	} // testStringFromColumnsN03

}
