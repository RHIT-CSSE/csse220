package recursionTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import recursion.RunAllTests;
import recursion.RecursionProblems;

public class TestEquals {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestEquals.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testEqualsN01() {
		numberOfTests++;
		String input1 = "Hello";
		assertTrue(RecursionProblems.equals(input1, input1));
		testsPassed++;
	} // testEqualsN01


	@Test
	public void testEqualsN02() {
		numberOfTests++;
		String input1 = "Hello";
		String input2 = "hello";
		assertFalse(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN02

	@Test
	public void testEqualsN03() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "12345";
		assertTrue(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN03

	@Test
	public void testEqualsN04() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "1234";
		assertFalse(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN04

	@Test
	public void testEqualsN05() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "123456";
		assertFalse(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN05

	@Test
	public void testEqualsN06() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4d";
		assertTrue(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN06

	@Test
	public void testEqualsN07() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4";
		assertFalse(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN07

	@Test
	public void testEqualsN08() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4d5";
		assertFalse(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN08

	@Test
	public void testEqualsN09() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		assertTrue(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN09

	@Test
	public void testEqualsN10() {
		numberOfTests++;
		String input1 = "";
		String input2 = "a";
		assertFalse(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN10
	
	
	@Test
	public void testEqualsN11() {
		numberOfTests++;
		String input1 = "1";
		String input2 = "";
		assertFalse(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN11
	
	
	@Test
	public void testEqualsN12() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertTrue(RecursionProblems.equals(input1, input2));
		testsPassed++;
	} // testEqualsN12
	
	@Test
	public void testEqualsN13() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertFalse(RecursionProblems.equals(input1, (input2+'a')));
		testsPassed++;
	} // testEqualsN13
	
	
	@Test
	public void testEqualsN14() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input3 = letter + input3;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertFalse(RecursionProblems.equals(input1, input3));
		testsPassed++;
	} // testEqualsN14


}
