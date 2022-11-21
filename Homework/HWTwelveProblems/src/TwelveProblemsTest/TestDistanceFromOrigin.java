package TwelveProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

// *** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestDistanceFromOrigin {

	@Test
	public void testDistanceFromOriginN01() {
		assertEquals(1, TwelveProblems.distanceFromOrigin(-1, 0), .001);
	}

	@Test
	public void testDistanceFromOriginN02() {
		assertEquals(108.894, TwelveProblems.distanceFromOrigin(77, 77), .001);

	}

	@Test
	public void testDistanceFromOriginN03() {
		assertEquals(5, TwelveProblems.distanceFromOrigin(-3, -4), .001);
	}

	@Test
	public void testDistanceFromOriginN04() {
		assertEquals(11.1803, TwelveProblems.distanceFromOrigin(5, -10), .001);
	}

}
