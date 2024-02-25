package TwelveProblemsTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestSecondDigit5 {

	@Test
	public void testSecondDigit5N01() {
		assertTrue(TwelveProblems.secondDigit5(50));
	}

	@Test
	public void testSecondDigit5N02() {
		assertTrue(TwelveProblems.secondDigit5(55));
	}

	@Test
	public void testSecondDigit5N03() {
		assertTrue(TwelveProblems.secondDigit5(450));
	}

	@Test
	public void testSecondDigit5N04() {
		assertTrue(TwelveProblems.secondDigit5(11251));
	}

	@Test
	public void testSecondDigit5N05() {
		assertTrue(TwelveProblems.secondDigit5(555555));
	}

	@Test
	public void testSecondDigit5N06() {
		assertFalse(TwelveProblems.secondDigit5(555505));
	}

	@Test
	public void testSecondDigit5N07() {
		assertFalse(TwelveProblems.secondDigit5(5));
	}

	@Test
	public void testSecondDigit5N08() {
		assertFalse(TwelveProblems.secondDigit5(230));
	}
}
