package Homework2DArraysTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework2DArrays.Homework2DArrays;


//*** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestLongestRepeatSequence {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testLongestRepeatSequenceN01() {
		char[][] foo = {{'a','b','c'},{'d','d','e'}};
		assertEquals(2,Homework2DArrays.longestRepeatSequence(foo));
	} // testLongestRepeatSequenceN01
	
	@Test
	public void testLongestRepeatSequenceN02() {
		char[][] foo2 = {{'a','b','b'},{'b','e','f'}};

		assertEquals(3,Homework2DArrays.longestRepeatSequence(foo2));
	} // testLongestRepeatSequenceN02
	
	@Test
	public void testLongestRepeatSequenceN03() {
		char[][] foo3 = {{'a','b','b'},{'b','e','f'},{'b','e','f'},{'b','e','f'}};

		assertEquals(3,Homework2DArrays.longestRepeatSequence(foo3));
	} // testLongestRepeatSequenceN03
	
	@Test
	public void testLongestRepeatSequenceN04() {
		char[][] foo4 = {{'a','b','b'},{'b','e','f'},{'b','e','q'},{'q','q','q'}};

		assertEquals(4,Homework2DArrays.longestRepeatSequence(foo4));
	} // testLongestRepeatSequenceN04
	
}
