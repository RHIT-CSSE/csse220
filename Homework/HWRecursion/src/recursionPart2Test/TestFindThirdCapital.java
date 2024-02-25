package recursionPart2Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import recursionPart2.Part2Problems;

@RunWith(RunAllTestsTestRunnerPart2.class)

public class TestFindThirdCapital {
	
	@Test
	public void testFindThirdCapital01() {
		// Test 1
		String input = "QQQ";
		int res = 2;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital01

	@Test
	public void testFindThirdCapital02() {
		// Test 2
		String input = "abcDefGhiJklmN";
		int res = 9;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital02

	@Test
	public void testFindThirdCapital03() {
		// Test3
		String input = "abcdef";
		int res = -1;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital03

	@Test
	public void testFindThirdCapital04() {
		// Test 4
		String input = "abCdEf";
		int res = -1;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital04

	@Test
	public void testFindThirdCapital05() {
		// Test 5
		String input = "aaaaAaaaAaaaA";
		int res = 12;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital05

	@Test
	public void testFindThirdCapital06() {
		// Test 6
		String input = "AAAAAAAAAAAAAAAAAAAAAAA";
		int res = 2;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital06

	@Test
	public void testFindThirdCapital07() {
		// Test 7
		String input = "ABCdefghiJKL";
		int res = 2;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital07

	@Test
	public void testFindThirdCapital08() {
		// Test 8
		String input = "0123abcdefgHIJ";
		int res = 13;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
	} // testFindThirdCapital08

	@Test
	public void testFindThirdCapital09() {
		// Test 9
		String input = "0123456789";
		int res = -1;
		int actual = Part2Problems.findThirdCapital(input);
		assertEquals(res, actual);
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
		assertEquals(res, actual);
	} // testFindThirdCapital10
}
