package TwelveProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestPowersOfTwo {

	@Test
	public void testPowersOfTwoN01() {
		int[] a = { 1, 2, 4, 8 };
		assertArrayEquals(a, TwelveProblems.powersOfTwo(3));
	}

	@Test
	public void testPowersOfTwoN02() {
		int[] b = { 1, 2, 4, 8, 16, 32, 64, 128 };
		assertArrayEquals(b, TwelveProblems.powersOfTwo(7));
	}

	@Test
	public void testPowersOfTwoN03() {
		int[] c = { 1 };
		assertArrayEquals(c, TwelveProblems.powersOfTwo(0));
	}

	@Test
	public void testPowersOfTwoN04() {
		int[] d = {};
		assertArrayEquals(d, TwelveProblems.powersOfTwo(-200));
	}
}
