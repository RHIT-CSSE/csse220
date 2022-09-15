package smallProblemsTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import smallProblems.RunAllTests;
import smallProblems.SmallProblems;

public class TestFirstDiff {
	
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFirstDiff.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testFirstDiffN01() {
		numberOfTests++;
		String first = "abcd";
		String second = "abcf";
		assertEquals('d', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN01
	

	
	@Test
	public void testFirstDiffN02() {
		numberOfTests++;
		String first = "dcba";
		String second = "abcf";
		assertEquals('d', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN02
	
	@Test
	public void testFirstDiffN03() {
		numberOfTests++;
		String first = "abcd";
		String second = "fcba";
		assertEquals('d', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN03
	
	@Test
	public void testFirstDiffN04() {
		numberOfTests++;
		String first = "dcba";
		String second = "fcba";
		assertEquals('d', SmallProblems.firstDiff(first, second));
		
		testsPassed++;
	} // testFirstDiffN04
	
	@Test
	public void testFirstDiffN05() {
		numberOfTests++;
		String first = "hello";
		String second = "help";
		assertEquals('o', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN05
	
	@Test
	public void testFirstDiffN06() {
		numberOfTests++;
		String first = "bcd";
		String second = "abcd";
		assertEquals('0', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN06
	
	@Test
	public void testFirstDiffN07() {
		numberOfTests++;
		String first = "abcd";
		String second = "bcd";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN07
	
	@Test
	public void testFirstDiffN08() {
		numberOfTests++;
		String first = "bacd";
		String second = "bcd";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN08
	
	@Test
	public void testFirstDiffN09() {
		numberOfTests++;		
		String first = "bcad";
		String second = "bcd";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN1
	
	@Test
	public void testFirstDiffN10() {
		numberOfTests++;		
		String first = "bcda";
		String second = "bcd";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN1
	
	@Test
	public void testFirstDiffN11() {
		numberOfTests++;
		String first = "abcd";
		String second = "efgh";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN11
	
	@Test
	public void testFirstDiffN12() {
		numberOfTests++;
		String first = "abc";
		String second = "efgh";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN12
	
	@Test
	public void testFirstDiffN13() {
		numberOfTests++;
		String first = "ab";
		String second = "efgh";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN13
	
	@Test
	public void testFirstDiffN14() {
		numberOfTests++;
		String first = "a";
		String second = "efgh";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN14
	
	@Test
	public void testFirstDiffN15() {
		numberOfTests++;
		String first = "abcd";
		String second = "dcba";
		assertEquals('0', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN15
	
	@Test
	public void testFirstDiffN16() {
		numberOfTests++;
		String first = "abcdef";
		String second = "abc";
		assertEquals('d', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN16
	
	@Test
	public void testFirstDiffN17() {
		numberOfTests++;
		String first = "abcdefghijklmnopqrstuvwxyz";
		String second = "abcdefghijklmnopqrstuvwxy";
		assertEquals('z', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN7
	
	@Test
	public void testFirstDiffN18() {
		numberOfTests++;
		String first = "abcdefghijklmnopqrstuvwxyz";
		String second = "bcdefghijklmnopqrstuvwxyz";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN18
	
	@Test
	public void testFirstDiffN19() {
		numberOfTests++;
		String first = "abcdefghijklmnopqrstuvwxyz";
		String second = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < first.length(); i++) {
			String current = first.substring(0, i) + "1" + first.substring(i);
			assertEquals('1', SmallProblems.firstDiff(current, second));
		} // end for
		testsPassed++;
	} // testFirstDiffN19
	
	@Test
	public void testFirstDiffN20() {
		numberOfTests++;
		String first = "a";
		String second = "abcdefghijklmnopqrstuvwxyz";
		assertEquals('0', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN20
	
	@Test
	public void testFirstDiffN21() {
		numberOfTests++;
		String first = "a";
		String second = "bcdefghijklmnopqrstuvwxyza";
		assertEquals('0', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN21
	
	@Test
	public void testFirstDiffN22() {
		numberOfTests++;
		String first = "a";
		String second = "bcdefghijklmanopqrstuvwxyz";
		assertEquals('0', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN22
	
	@Test
	public void testFirstDiffN23() {
		numberOfTests++;
		String first = "a";
		String second = "bcdefghijklmnopqrstuvwxyz";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN23
	@Test
	public void testFirstDiffN24() {
		numberOfTests++;
		String first = "abcdefghijklmnopqrstuvwxyz";
		String second = "a";
		assertEquals('b', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN24
	@Test
	public void testFirstDiffN25() {
		numberOfTests++;
		String first = "abcdefghijklmnopqrstuvwxyz";
		String second = "b";
		assertEquals('a', SmallProblems.firstDiff(first, second));
		testsPassed++;
	} // testFirstDiffN25
	
}

