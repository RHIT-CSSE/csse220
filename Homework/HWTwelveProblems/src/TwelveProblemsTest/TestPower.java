package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;
@RunWith(RunAllTestsTestRunner.class)

public class TestPower {
	@Test
	public void testPowerN01() {
		assertEquals(8, TwelveProblems.pow(2, 3), 0.000001);

	}
	
	@Test
	public void testPowerN02() {
		assertEquals(1, TwelveProblems.pow(1, 100), 0.000001);
	}
	
	@Test
	public void testPowerN03() {
		assertEquals(-27, TwelveProblems.pow(-3, 3), 0.000001);
	}
	
	@Test
	public void testPowerN04() {
		assertEquals(5 * 5 * 5 * 5, TwelveProblems.pow(5, 4), 0.000001);
	}
	
	@Test
	public void testPowerN05() {
		assertEquals(0.0016, TwelveProblems.pow(5, -4), 0.000001);
	}
	
	@Test
	public void testPowerN06() {
		assertEquals(1, TwelveProblems.pow(100, 0), 0.000001);
	}
	
	@Test
	public void testPowerN07() {
		assertEquals(1.0 / (9 * 9), TwelveProblems.pow(9, -2), 0.000001);
	}

}
