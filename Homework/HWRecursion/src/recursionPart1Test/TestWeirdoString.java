package recursionPart1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;

@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestWeirdoString {

	@Test
	public void testWeirdo01() {
		assertEquals("", Part1Problems.weirdoString(""));
	} // testWeirdo01

	@Test
	public void testWeirdo02() {
		assertEquals("", Part1Problems.weirdoString("aaaaaaa"));
	} // testWeirdo02

	@Test
	public void testWeirdo03() {
		assertEquals("", Part1Problems.weirdoString("ababababbbaa"));
	} // testWeirdo03

	@Test
	public void testWeirdo04() {
		assertEquals("A les like  rook.", Part1Problems.weirdoString("Abba babbles like a brook."));
	} // testWeirdo01

	@Test
	public void testWeirdo05() {
		assertEquals("QQQn you feel the love tonight?", Part1Problems.weirdoString("Can you feel the love tonight?"));
	} // testWeirdo05

	@Test
	public void testWeirdo06() {
		assertEquals("QQQns of y food", Part1Problems.weirdoString("Cans of baby food"));
	} // testWeirdo06

	@Test
	public void testWeirdo07() {
		assertEquals("is unmodified", Part1Problems.weirdoString("is unmodified"));
	} // testWeirdo07

} // end TestWeirdo
