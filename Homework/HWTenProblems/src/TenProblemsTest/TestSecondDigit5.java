package TenProblemsTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import TenProblems.TenProblems;

@RunWith(RunAllTestsTestRunner.class)

public class TestSecondDigit5 {

	@Test
	public void testSecondDigit5N01() {
		assertTrue(TenProblems.secondDigit5(50));
	}

	@Test
	public void testSecondDigit5N02() {
		assertTrue(TenProblems.secondDigit5(55));
	}

	@Test
	public void testSecondDigit5N03() {
		assertTrue(TenProblems.secondDigit5(450));
	}

	@Test
	public void testSecondDigit5N04() {
		assertTrue(TenProblems.secondDigit5(11251));
	}

	@Test
	public void testSecondDigit5N05() {
		assertTrue(TenProblems.secondDigit5(555555));
	}

	@Test
	public void testSecondDigit5N06() {
		assertFalse(TenProblems.secondDigit5(555505));
	}

	@Test
	public void testSecondDigit5N07() {
		assertFalse(TenProblems.secondDigit5(5));
	}

	@Test
	public void testSecondDigit5N08() {
		assertFalse(TenProblems.secondDigit5(230));
	}
}
