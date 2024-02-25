package recursionPart1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;

@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestNumbersGame {

	@Test
	public void testNumbersGame01() {
		assertEquals(true, Part1Problems.numbersGame(1));
	} // testNumbersGame01

	@Test
	public void testNumbersGame02() {
		assertEquals(true, Part1Problems.numbersGame(8));
	} // testNumbersGame02

	@Test
	public void testNumbersGame03() {
		assertEquals(true, Part1Problems.numbersGame(9));
	} // testNumbersGame03

	@Test
	public void testNumbersGame04() {
		assertEquals(true, Part1Problems.numbersGame(15));
	} // testNumbersGame04

	@Test
	public void testNumbersGame05() {
		assertEquals(false, Part1Problems.numbersGame(18));
	} // testNumbersGame05

	@Test
	public void testNumbersGame06() {
		assertEquals(false, Part1Problems.numbersGame(21));
	} // testNumbersGame06

} // end TestNumbersGame
