package TenProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TenProblems.TenProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestFirstDivisibleBy77 {

	@Test
	public void testFirstDivisibleBy77N01() {
		int[] a = { 88, 24, 154, 77 };
		assertEquals(154, TenProblems.firstDivisibleBy77(a));
	}

	@Test
	public void testFirstDivisibleBy77N02() {
		int[] b = { 5929, 280 };
		assertEquals(5929, TenProblems.firstDivisibleBy77(b));
	}

	@Test
	public void testFirstDivisibleBy77N03() {
		int[] c = { 1, 2, 3, 4 };
		assertEquals(-1, TenProblems.firstDivisibleBy77(c));
	}

	@Test
	public void testFirstDivisibleBy77N04() {
		int[] d = {};
		assertEquals(-1, TenProblems.firstDivisibleBy77(d));
	}

}
