package TwelveProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestFirstDivisibleBy77 {

	@Test
	public void testFirstDivisibleBy77N01() {
		int[] a = { 88, 24, 154, 77 };
		assertEquals(154, TwelveProblems.firstDivisibleBy77(a));
	}

	@Test
	public void testFirstDivisibleBy77N02() {
		int[] b = { 5929, 280 };
		assertEquals(5929, TwelveProblems.firstDivisibleBy77(b));
	}

	@Test
	public void testFirstDivisibleBy77N03() {
		int[] c = { 1, 2, 3, 4 };
		assertEquals(-1, TwelveProblems.firstDivisibleBy77(c));
	}

	@Test
	public void testFirstDivisibleBy77N04() {
		int[] d = {};
		assertEquals(-1, TwelveProblems.firstDivisibleBy77(d));
	}

}
