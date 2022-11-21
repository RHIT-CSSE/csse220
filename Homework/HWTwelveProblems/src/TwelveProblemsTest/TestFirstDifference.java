package TwelveProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestFirstDifference {

	@Test
	public void testFirstDifferenceN01() {
		assertEquals(1, TwelveProblems.firstDifference("abc", "axy"));
	}

	@Test
	public void testFirstDifferenceN02() {
		assertEquals(2, TwelveProblems.firstDifference("abx", "aby"));
	}

	@Test
	public void testFirstDifferenceN03() {
		assertEquals(0, TwelveProblems.firstDifference("foo", "bar"));
	}

	@Test
	public void testFirstDifferenceN04() {
		assertEquals(-1, TwelveProblems.firstDifference("foo", "foo"));
	}

	@Test
	public void testFirstDifferenceN05() {
		assertEquals(-1, TwelveProblems.firstDifference("", ""));
	}

}
