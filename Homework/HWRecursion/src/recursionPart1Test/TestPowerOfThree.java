package recursionPart1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;

@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestPowerOfThree {

	@Test
	public void testPowerOfThree01() {
		assertEquals(true, Part1Problems.evenPowerOfThree(1));
	} // testPowerOfThree01

	@Test
	public void testPowerOfThree02() {
		assertEquals(false, Part1Problems.evenPowerOfThree(3));
	} // testPowerOfThree02

	@Test
	public void testPowerOfThree03() {
		assertEquals(true, Part1Problems.evenPowerOfThree(9));
	} // testPowerOfThree03

	@Test
	public void testPowerOfThree04() {
		assertEquals(false, Part1Problems.evenPowerOfThree(14348907));
	} // testPowerOfThree04

	@Test
	public void testPowerOfThree05() {
		assertEquals(true, Part1Problems.evenPowerOfThree(4782969));
	} // testPowerOfThree05

	@Test
	public void testPowerOfThree06() {
		assertEquals(true, Part1Problems.evenPowerOfThree(729));
	} // testPowerOfThree06

	@Test
	public void testPowerOfThree07() {
		assertEquals(false, Part1Problems.evenPowerOfThree(2187));
	} // testPowerOfThree07

} // end TestPowerOfThree
