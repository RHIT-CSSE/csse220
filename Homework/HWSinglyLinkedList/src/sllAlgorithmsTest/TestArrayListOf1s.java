package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sllAlgorithms.Algorithms;

@RunWith(RunAllTestsTestRunner.class)
public class TestArrayListOf1s {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testArraylistOf1sN01() {
		int[] t0 = {};

		assertEquals("[]", Algorithms.arraylistOf1s(t0).toString());
	} // testArraylistOf1sN01

	@Test
	public void testArraylistOf1sN02() {
		int[] t1 = { 1, 2, 3 };

		assertEquals("[1] first=[1] last=[1]", Algorithms.arraylistOf1s(t1).toString());
	} // testArraylistOf1sN02

	@Test
	public void testArraylistOf1sN03() {
		int[] t2 = { 1, 1000, 51111 };

		assertEquals("[1, 1000] first=[1] last=[1000]", Algorithms.arraylistOf1s(t2).toString());
	} // testArraylistOf1sN03

	@Test
	public void testArraylistOf1sN04() {
		int[] t3 = { 21, 311, 4111 };

		assertEquals("[]", Algorithms.arraylistOf1s(t3).toString());
	} // testArraylistOf1sN04
	
	@Test
	public void testArraylistOf1sN05() {
		int[] t3 = { 21, 311, 14111 };

		assertEquals("[14111] first=[14111] last=[14111]", Algorithms.arraylistOf1s(t3).toString());
	} // testArraylistOf1sN05

} // end class TestArrayListOf1s
