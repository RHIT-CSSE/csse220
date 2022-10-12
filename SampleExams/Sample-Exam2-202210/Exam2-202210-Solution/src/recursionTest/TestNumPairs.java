package recursionTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import recursion.RunAllTests;
import recursion.RecursionProblems;

public class TestNumPairs {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestNumPairs.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testNumPairsN01() {
		numberOfTests++;
		String input = "123456654321";
		assertEquals(6, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN01


	@Test
	public void testNumPairsN02() {
		numberOfTests++;
		String input = "123456674829";
		assertEquals(3, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN02

	@Test
	public void testNumPairsN03() {
		numberOfTests++;
		String input = "abc123w21bbb";
		assertEquals(3, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN03

	@Test
	public void testNumPairsN04() {
		numberOfTests++;
		String input = "11111111";
		assertEquals(4, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN04

	@Test
	public void testNumPairsN05() {
		numberOfTests++;
		String input = "1234567890";
		assertEquals(0, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN05

	@Test
	public void testNumPairsN06() {
		numberOfTests++;
		String input = "1234567890123456789009876543210987654321";
		assertEquals(20, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN06

	@Test
	public void testNumPairsN07() {
		numberOfTests++;
		String input = "abcdefghijklmnopqrstuvwxyz12345678900987654321zyxwvutsrqponmlkjihgfedcba";
		assertEquals(36, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN07

	@Test
	public void testNumPairsN08() {
		numberOfTests++;
		String input = "abcdefghijklmnopqrstuvwxyz1234567890";
		assertEquals(0, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN08

	@Test
	public void testNumPairsN09() {
		numberOfTests++;
		String input = "";
		int digit = 0;
		for(int i = 0; i < 500; i++) {
			input += "" + digit;
			digit = (digit < 9) ? digit+1 : 0;
		}
		
		assertEquals(0, RecursionProblems.numPairs(input));
		testsPassed++;
	} // testNumPairsN09

	@Test
	public void testNumPairsN10() {
		numberOfTests++;
		String input = "";
		String reverse = "";
		int digit = 0;
		for(int i = 0; i < 500; i++) {
			input += "" + digit;
			reverse = "" + digit + reverse;
			digit = (digit < 9) ? digit+1 : 0;
		}
		
		assertEquals(500, RecursionProblems.numPairs(input+reverse));
		testsPassed++;
	} // testNumPairsN10
	
	
	@Test
	public void testNumPairsN11() {
		numberOfTests++;
		String input = "";
		String reverse2 = "";
		int digit = 0;
		for(int i = 0; i < 500; i++) {
			input += "" + digit;
			if(digit%2==0) {
				reverse2 = "" + digit + reverse2;
			}
			else {
				reverse2 = "" + ((digit<9)?digit+1:0) + reverse2;
			}
			digit = (digit < 9) ? digit+1 : 0;
		}
		
		assertEquals(250, RecursionProblems.numPairs(input+reverse2));
		testsPassed++;
	} // testNumPairsN11
	
	
	@Test
	public void testNumPairsN12() {
		numberOfTests++;
		String input = "";
		String reverse3 = "";
		int digit = 0;
		for(int i = 0; i < 500; i++) {
			input += "" + digit;
			if(digit%2==0) {
				reverse3 = "" + ((digit<9)?digit+1:0) + reverse3;
			}
			else {
				reverse3 = "" + digit + reverse3;
			}
			digit = (digit < 9) ? digit+1 : 0;
		}
		
		assertEquals(250, RecursionProblems.numPairs(input+reverse3));
		testsPassed++;
	} // testNumPairsN12


}
