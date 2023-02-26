package recursionPart1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;

@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestSummation {
	
	@Test
	public void testSummation01() {
		assertEquals(1, Part1Problems.summation(1));
	} // testSummation01

	@Test
	public void testSummation02() {
		assertEquals(3, Part1Problems.summation(2));
	} // testSummation02

	@Test
	public void testSummation03() {
		assertEquals(55, Part1Problems.summation(10));
	} // testSummation03

	@Test
	public void testSummation04() {
		assertEquals(5050, Part1Problems.summation(100));
	} // testSummation04

	@Test
	public void testSummation05() {
		assertEquals(1275, Part1Problems.summation(50));
	} // testSummation05

} // end SummationTest
