package debugger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DebugMeTest {

	@Test
	public void testKPermutations() {
		assertEquals(5*4*3, DebugMe.kPermutations(5, 3));
		assertEquals(5, DebugMe.kPermutations(5, 1));
		assertEquals(24, DebugMe.kPermutations(4, 4));
		assertEquals(24, DebugMe.kPermutations(4, 3));
		assertEquals(720, DebugMe.kPermutations(10, 3));
		assertEquals(1716, DebugMe.kPermutations(13, 3));
	}

	@Test
	public void testUppercaseIfExclaimation() {
		assertEquals("foo", DebugMe.uppercaseIfExclaimation("foo"));
		assertEquals("foobar", DebugMe.uppercaseIfExclaimation("foobar"));
		assertEquals("FOOBAR!", DebugMe.uppercaseIfExclaimation("foobar!"));
		assertEquals("LONGER WORDS!", DebugMe.uppercaseIfExclaimation("longer words!"));
	}

	@Test
	public void testIsArrayDoubled() {
		int[] test1 = {1,2,3,4};
		assertFalse(DebugMe.isArrayDoubled(test1));
		int[] test2 = {1,2,2,1};
		assertFalse(DebugMe.isArrayDoubled(test2));
		int[] test3 = {1,2,3,1,2,3};
		assertTrue(DebugMe.isArrayDoubled(test3));
		int[] test4 = {3,2,3,3,2,3};
		assertTrue(DebugMe.isArrayDoubled(test4));
	}
	
	@Test
	public void testPracticeMakingExceptionBreakpoint() {
		DebugMe.praticeCreatingExceptionBreakpoint();
	}

}
