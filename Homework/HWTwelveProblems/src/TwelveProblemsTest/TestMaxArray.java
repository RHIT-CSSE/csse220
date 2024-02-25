package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;
@RunWith(RunAllTestsTestRunner.class)

public class TestMaxArray {
	@Test
	public void testMaxArrayN01() {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		assertArrayEquals(b, TwelveProblems.maxArray(a, b));
	}
	
	@Test
	public void testMaxArrayN02() {
		int[] b = { 4, 5, 6 };
		int[] c = { 7, 1, 6 };
		int[] d = { 7, 5, 6 };
		assertArrayEquals(d, TwelveProblems.maxArray(b, c));
	}

}
