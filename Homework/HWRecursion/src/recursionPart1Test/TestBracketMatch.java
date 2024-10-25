package recursionPart1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;
@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestBracketMatch {

	@Test
	public void testBracketMatch01() {
		assertEquals(true, Part1Problems.bracketMatch(""));
	} // testBracketMatch01

	@Test
	public void testBracketMatch02() {
		assertEquals(true, Part1Problems.bracketMatch("()"));
	} // testBracketMatch02

	@Test
	public void testBracketMatch03() {
		assertEquals(true, Part1Problems.bracketMatch("({[<>]})"));
	} // testBracketMatch03

	@Test
	public void testBracketMatch04() {
		assertEquals(false, Part1Problems.bracketMatch("<(>)"));
	} // testBracketMatch04

	@Test
	public void testBracketMatch05() {
		assertEquals(false, Part1Problems.bracketMatch("({[<"));
	} // testBracketMatch05

	@Test
	public void testBracketMatch06() {
		assertEquals(false, Part1Problems.bracketMatch(">})]"));
	} // testBracketMatch06

	@Test
	public void testBracketMatch07() {
		assertEquals(false, Part1Problems.bracketMatch("(((()))"));
	} // testBracketMatch07

	@Test
	public void testBracketMatch08() {
		assertEquals(false, Part1Problems.bracketMatch("(((<>))"));
	} // testBracketMatch08
	
	@Test
	public void testBracketMatch09() {
		assertEquals(false, Part1Problems.bracketMatch("(<<)"));
	} // testBracketMatch09
	
	@Test
	public void testBracketMatch10() {
		assertEquals(false, Part1Problems.bracketMatch("[}}]"));
	} // testBracketMatch09

} // end TestBracketMatch
