package TwelveProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestTimesOccur {

	@Test
	public void testTimesOccurN01() {
		int[] f = { 4, 7, 2 };
		int[] h = { 4, 7, 2, 1, 8 };
		assertEquals(1, TwelveProblems.timesOccur(f, h));
	}

	@Test
	public void testTimesOccurN02() {
		int[] a = { 7, 1, 1, 7, 7, 1, 1 };
		int[] b = { 1, 1 };
		assertEquals(2, TwelveProblems.timesOccur(b, a));
	}

	@Test
	public void testTimesOccurN03() {
		int[] b = { 1, 1 };
		int[] c = { 1, 1, 1, 3 };
		assertEquals(2, TwelveProblems.timesOccur(b, c));
	}

	@Test
	public void testTimesOccurN04() {
		int[] b = { 1, 1 };
		int[] d = { 1, 3, 4, 1, 2, 1 };
		assertEquals(0, TwelveProblems.timesOccur(b, d));
	}

	@Test
	public void testTimesOccurN05() {
		int[] c = { 1, 1, 1, 3 };
		int[] d = { 1, 3, 4, 1, 2, 1 };
		assertEquals(0, TwelveProblems.timesOccur(c, d));
	}

	@Test
	public void testTimesOccurN06() {
		int[] e = { 4, 7, 2, 1, 8, 4, 7, 2, 0, 8, 4, 7, 2, 1, 8 };
		int[] f = { 4, 7, 2 };
		assertEquals(3, TwelveProblems.timesOccur(f, e));
	}

	@Test
	public void testTimesOccurN07() {
		int[] e = { 4, 7, 2, 1, 8, 4, 7, 2, 0, 8, 4, 7, 2, 1, 8 };
		int[] g = { 4, 7, 2, 1 };
		assertEquals(2, TwelveProblems.timesOccur(g, e));
	}

	@Test
	public void testTimesOccurN08() {
		int[] e = { 4, 7, 2, 1, 8, 4, 7, 2, 0, 8, 4, 7, 2, 1, 8 };
		int[] h = { 4, 7, 2, 1, 8 };
		assertEquals(2, TwelveProblems.timesOccur(h, e));
	}

	@Test
	public void testTimesOccurN09() {
		int[] a = { 7, 1, 1, 7, 7, 1, 1 };
		int[] h = { 4, 7, 2, 1, 8 };
		assertEquals(0, TwelveProblems.timesOccur(h, a));
	}
}
