package TenProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TenProblems.TenProblems;

// *** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestDistanceFromOrigin {

	@Test
	public void testDistanceFromOriginN01() {
		assertEquals(1, TenProblems.distanceFromOrigin(-1, 0), .001);
	}

	@Test
	public void testDistanceFromOriginN02() {
		assertEquals(108.894, TenProblems.distanceFromOrigin(77, 77), .001);

	}

	@Test
	public void testDistanceFromOriginN03() {
		assertEquals(5, TenProblems.distanceFromOrigin(-3, -4), .001);
	}

	@Test
	public void testDistanceFromOriginN04() {
		assertEquals(11.1803, TenProblems.distanceFromOrigin(5, -10), .001);
	}

}
