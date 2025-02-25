package TenProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TenProblems.TenProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestPowersOfTwo {

	@Test
	public void testPowersOfTwoN01() {
		int[] a = { 1, 2, 4, 8 };
		assertArrayEquals(a, TenProblems.powersOfTwo(3));
	}

	@Test
	public void testPowersOfTwoN02() {
		int[] b = { 1, 2, 4, 8, 16, 32, 64, 128 };
		assertArrayEquals(b, TenProblems.powersOfTwo(7));
	}

	@Test
	public void testPowersOfTwoN03() {
		int[] c = { 1 };
		assertArrayEquals(c, TenProblems.powersOfTwo(0));
	}

	@Test
	public void testPowersOfTwoN04() {
		int[] d = {};
		assertArrayEquals(d, TenProblems.powersOfTwo(-200));
	}
}
