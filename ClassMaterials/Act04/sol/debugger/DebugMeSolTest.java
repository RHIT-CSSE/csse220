package debugger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DebugMeSolTest {

	@Test
	public void testKPermutations() {
		assertEquals(5*4*3, DebugMeSol.kPermutations(5, 3));
		assertEquals(5, DebugMeSol.kPermutations(5, 1));
		assertEquals(24, DebugMeSol.kPermutations(4, 4));
		assertEquals(24, DebugMeSol.kPermutations(4, 3));
		assertEquals(720, DebugMeSol.kPermutations(10, 3));
		assertEquals(1716, DebugMeSol.kPermutations(13, 3));
	}

	@Test
	public void testUppercaseIfExclaimation() {
		assertEquals("foo", DebugMeSol.uppercaseIfExclaimation("foo"));
		assertEquals("foobar", DebugMeSol.uppercaseIfExclaimation("foobar"));
		assertEquals("FOOBAR!", DebugMeSol.uppercaseIfExclaimation("foobar!"));
		assertEquals("LONGER WORDS!", DebugMeSol.uppercaseIfExclaimation("longer words!"));
	}

	@Test
	public void testIsArrayDoubled() {
		int[] test1 = {1,2,3,4};
		assertFalse(DebugMeSol.isArrayDoubled(test1));
		int[] test2 = {1,2,2,1};
		assertFalse(DebugMeSol.isArrayDoubled(test2));
		int[] test3 = {1,2,3,1,2,3};
		assertTrue(DebugMeSol.isArrayDoubled(test3));
		int[] test4 = {3,2,3,3,2,3};
		assertTrue(DebugMeSol.isArrayDoubled(test4));
	}
	
	@Test
	public void testPracticeMakingExceptionBreakpoint() {
		DebugMeSol.praticeCreatingExceptionBreakpoint();
	}

}
