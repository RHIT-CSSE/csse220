package HW1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import HW1.HW1;

@RunWith(RunAllTestsTestRunner.class)

public class TestSecondDigit5 {

	@Test
	public void testSecondDigit5N01() {
		assertTrue(HW1.secondDigit5(50));
	}

	@Test
	public void testSecondDigit5N02() {
		assertTrue(HW1.secondDigit5(55));
	}

	@Test
	public void testSecondDigit5N03() {
		assertTrue(HW1.secondDigit5(450));
	}

	@Test
	public void testSecondDigit5N04() {
		assertTrue(HW1.secondDigit5(11251));
	}

	@Test
	public void testSecondDigit5N05() {
		assertTrue(HW1.secondDigit5(555555));
	}

	@Test
	public void testSecondDigit5N06() {
		assertFalse(HW1.secondDigit5(555505));
	}

	@Test
	public void testSecondDigit5N07() {
		assertFalse(HW1.secondDigit5(5));
	}

	@Test
	public void testSecondDigit5N08() {
		assertFalse(HW1.secondDigit5(230));
	}
}
