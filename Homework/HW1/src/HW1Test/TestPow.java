package HW1Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import HW1.HW1;
@RunWith(RunAllTestsTestRunner.class)

public class TestPow {
	@Test
	public void testPowerN01() {
		assertEquals(8, HW1.pow(2, 3), 0.000001);

	}
	
	@Test
	public void testPowerN02() {
		assertEquals(1, HW1.pow(1, 100), 0.000001);
	}
	
	@Test
	public void testPowerN03() {
		assertEquals(-27, HW1.pow(-3, 3), 0.000001);
	}
	
	@Test
	public void testPowerN04() {
		assertEquals(5 * 5 * 5 * 5, HW1.pow(5, 4), 0.000001);
	}
	
	@Test
	public void testPowerN05() {
		assertEquals(0.0016, HW1.pow(5, -4), 0.000001);
	}
	
	@Test
	public void testPowerN06() {
		assertEquals(1, HW1.pow(100, 0), 0.000001);
	}
	
	@Test
	public void testPowerN07() {
		assertEquals(1.0 / (9 * 9), HW1.pow(9, -2), 0.000001);
	}

}
