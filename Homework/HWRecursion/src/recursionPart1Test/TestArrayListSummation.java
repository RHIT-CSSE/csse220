package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;

import recursionPart1.Part1Problems;
@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestArrayListSummation {

	@Test
	public void testArrayListSummation01() {
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		assertEquals(6, Part1Problems.arrayListSummation(values));
	} // testArrayListSummation01

	@Test
	public void testArrayListSummation02() {
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40));
		assertEquals(46, Part1Problems.arrayListSummation(values));
	} // testArrayListSummation02

	@Test
	public void testArrayListSummation03() {
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40, 25));
		assertEquals(71, Part1Problems.arrayListSummation(values));
	} // testArrayListSummation03

	@Test
	public void testArrayListSummation04() {
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40, 25, 20000));
		assertEquals(20071, Part1Problems.arrayListSummation(values));
	} // testArrayListSummation04

	@Test
	public void testArrayListSummation05() {
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40, 25, 20000, -71));
		assertEquals(20000, Part1Problems.arrayListSummation(values));
	} // testArrayListSummation05

} // end TestArrayListSummation
