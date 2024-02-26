package Homework2DArraysTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework2DArrays.Homework2DArrays;


//*** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestStringFromColumns {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testStringFromColumnsN01() {
		char[][] foo = { { 'h', 'l', 'o' }, { 'e', 'l', '!' } };

		assertEquals("hello!", Homework2DArrays.stringFromColumns(foo));
	} // testStringFromColumnsN01

	@Test
	public void testStringFromColumnsN02() {
		char[][] foo2 = { { 'a', 'b', 'c' }, { 'd', 'd', 'e' } };

		assertEquals("adbdce", Homework2DArrays.stringFromColumns(foo2));
	} // testStringFromColumnsN02

	@Test
	public void testStringFromColumnsN03() {
		char[][] foo3 = { { 'w', ' ', 'h' }, { 'h', 'i', 'e' }, { 'a', 's', 'r' }, { 't', ' ', 'e' } };

		assertEquals("what is here", Homework2DArrays.stringFromColumns(foo3));
	} // testStringFromColumnsN03

}
