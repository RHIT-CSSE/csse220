package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTestsPart1;

public class TestBracketMatch {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBracketMatch.class.getSimpleName();
		RunAllTestsPart1.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBracketMatch01() {
		numberOfTests++;
		assertEquals(true, Part1Problems.bracketMatch(""));
		testsPassed++;
	} // testBracketMatch01

	@Test
	public void testBracketMatch02() {
		numberOfTests++;
		assertEquals(true, Part1Problems.bracketMatch("()"));
		testsPassed++;
	} // testBracketMatch02

	@Test
	public void testBracketMatch03() {
		numberOfTests++;
		assertEquals(true, Part1Problems.bracketMatch("({[<>]})"));
		testsPassed++;
	} // testBracketMatch03

	@Test
	public void testBracketMatch04() {
		numberOfTests++;
		assertEquals(false, Part1Problems.bracketMatch("<(>)"));
		testsPassed++;
	} // testBracketMatch04

	@Test
	public void testBracketMatch05() {
		numberOfTests++;
		assertEquals(false, Part1Problems.bracketMatch("({[<"));
		testsPassed++;
	} // testBracketMatch05

	@Test
	public void testBracketMatch06() {
		numberOfTests++;
		assertEquals(false, Part1Problems.bracketMatch(">})]"));
		testsPassed++;
	} // testBracketMatch06

	@Test
	public void testBracketMatch07() {
		numberOfTests++;
		assertEquals(false, Part1Problems.bracketMatch("(((()))"));
		testsPassed++;
	} // testBracketMatch07

	@Test
	public void testBracketMatch08() {
		numberOfTests++;
		assertEquals(false, Part1Problems.bracketMatch("(((<>))"));
		testsPassed++;
	} // testBracketMatch08

} // end TestBracketMatch
