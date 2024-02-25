package recursionPart1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;

@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestNoDoubledLetters {

	@Test
	public void testNoDoubleLetters01() {
		assertEquals(false, Part1Problems.noDoubledLetters("aaaaaaa"));
	} // testNoDoubleLetters01

	@Test
	public void testNoDoubleLetters02() {
		assertEquals(false, Part1Problems.noDoubledLetters("ababababbbaa"));
	} // testNoDoubleLetters02

	@Test
	public void testNoDoubleLetters03() {
		assertEquals(false, Part1Problems.noDoubledLetters("Abba babbles like a brook."));
	} // testNoDoubleLetters03

	@Test
	public void testNoDoubleLetters04() {
		assertEquals(false, Part1Problems.noDoubledLetters("Can you feel the love tonight?"));
	} // testNoDoubleLetters04

	@Test
	public void testNoDoubleLetters05() {
		assertEquals(false, Part1Problems.noDoubledLetters("Cans of baby food"));
	} // testNoDoubleLetters05

	@Test
	public void testNoDoubleLetters06() {
		assertEquals(true, Part1Problems.noDoubledLetters("is unmodified"));
	} // testNoDoubleLetters06

	@Test
	public void testNoDoubleLetters07() {
		assertEquals(true, Part1Problems.noDoubledLetters("works"));
	} // testNoDoubleLetters07

	@Test
	public void testNoDoubleLetters08() {
		assertEquals(true, Part1Problems.noDoubledLetters("nope"));
	} // testNoDoubleLetters08

	@Test
	public void testNoDoubleLetters09() {
		assertEquals(true, Part1Problems.noDoubledLetters("How many licks does it take?"));
	} // testNoDoubleLetters09

	@Test
	public void testNoDoubleLetters10() {
		assertEquals(false, Part1Problems.noDoubledLetters("One, two, three"));
	} // testNoDoubleLetter10

} // end TestNoDoubleLetters
