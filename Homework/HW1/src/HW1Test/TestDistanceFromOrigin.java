package HW1Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import HW1.HW1;

// *** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestDistanceFromOrigin {

	@Test
	public void testDistanceFromOriginN01() {
		assertEquals(1, HW1.distanceFromOrigin(-1, 0), .001);
	}

	@Test
	public void testDistanceFromOriginN02() {
		assertEquals(108.894, HW1.distanceFromOrigin(77, 77), .001);

	}

	@Test
	public void testDistanceFromOriginN03() {
		assertEquals(5, HW1.distanceFromOrigin(-3, -4), .001);
	}

	@Test
	public void testDistanceFromOriginN04() {
		assertEquals(11.1803, HW1.distanceFromOrigin(5, -10), .001);
	}

}
