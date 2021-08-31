package recursionPart2Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart2.Part2Problems;
import recursionPart2.RunAllTestsPart2;

public class TestFindThirdCapital {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFindThirdCapital.class.getSimpleName();
		RunAllTestsPart2.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// **************************************************************
	// Test: findThirdCapital
	// **************************************************************

	@Test
	public void testFindThirdCapital01() {
		// Test 1
		String input = "QQQ";
		int res = 2;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital01

	@Test
	public void testFindThirdCapital02() {
		// Test 2
		String input = "abcDefGhiJklmN";
		int res = 9;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital02

	@Test
	public void testFindThirdCapital03() {
		// Test3
		String input = "abcdef";
		int res = -1;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital03

	@Test
	public void testFindThirdCapital04() {
		// Test 4
		String input = "abCdEf";
		int res = -1;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital04

	@Test
	public void testFindThirdCapital05() {
		// Test 5
		String input = "aaaaAaaaAaaaA";
		int res = 12;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital05

	@Test
	public void testFindThirdCapital06() {
		// Test 6
		String input = "AAAAAAAAAAAAAAAAAAAAAAA";
		int res = 2;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital06

	@Test
	public void testFindThirdCapital07() {
		// Test 7
		String input = "ABCdefghiJKL";
		int res = 2;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital07

	@Test
	public void testFindThirdCapital08() {
		// Test 8
		String input = "0123abcdefgHIJ";
		int res = 13;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital08

	@Test
	public void testFindThirdCapital09() {
		// Test 9
		String input = "0123456789";
		int res = -1;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital09

	@Test
	public void testFindThirdCapital10() {
		// Big Test
		String input = "";
		for (int i = 0; i < 100; i++) {
			if (i % 12 == 0)
				input += "Q";
			else
				input += "q";
		}
		int res = 24;
		int actual = Part2Problems.findThirdCapital(input);
		numberOfTests++;
		assertEquals(res, actual);
		testsPassed++;
	} // testFindThirdCapital10
}
