package Homework2DArraysTest;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Homework2DArrays.Homework2DArrays;
import Homework2DArrays.RunAllTests;


public class TestLongestRepeatSequence {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestLongestRepeatSequence.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testLongestRepeatSequenceN01() {
		char[][] foo = {{'a','b','c'},{'d','d','e'}};
		numberOfTests++;
		assertEquals(2,Homework2DArrays.longestRepeatSequence(foo));
		testsPassed++;		
	} // testLongestRepeatSequenceN01
	
	@Test
	public void testLongestRepeatSequenceN02() {
		char[][] foo2 = {{'a','b','b'},{'b','e','f'}};

		numberOfTests++;
		assertEquals(3,Homework2DArrays.longestRepeatSequence(foo2));
		testsPassed++;
	} // testLongestRepeatSequenceN02
	
	@Test
	public void testLongestRepeatSequenceN03() {
		char[][] foo3 = {{'a','b','b'},{'b','e','f'},{'b','e','f'},{'b','e','f'}};

		numberOfTests++;
		assertEquals(3,Homework2DArrays.longestRepeatSequence(foo3));
		testsPassed++;
	} // testLongestRepeatSequenceN03
	
	@Test
	public void testLongestRepeatSequenceN04() {
		char[][] foo4 = {{'a','b','b'},{'b','e','f'},{'b','e','q'},{'q','q','q'}};

		numberOfTests++;
		assertEquals(4,Homework2DArrays.longestRepeatSequence(foo4));
		testsPassed++;		
	} // testLongestRepeatSequenceN04
	
}
