import static org.junit.Assert.*;

import org.junit.Test;

public class SmallProblemsTest {

	@Test
	public void testIsPowerOfSeven() {
		assertTrue(SmallProblems.isPowerOfSeven(7));
		assertTrue(SmallProblems.isPowerOfSeven(49));
		assertTrue(SmallProblems.isPowerOfSeven(1));
		assertTrue(SmallProblems.isPowerOfSeven(117649));
		assertTrue(SmallProblems.isPowerOfSeven(343));
		assertFalse(SmallProblems.isPowerOfSeven(6));
		assertFalse(SmallProblems.isPowerOfSeven(0));
		assertFalse(SmallProblems.isPowerOfSeven(-7));
		assertFalse(SmallProblems.isPowerOfSeven(100));
		assertFalse(SmallProblems.isPowerOfSeven(21));
		assertFalse(SmallProblems.isPowerOfSeven(28));
	}
	
	@Test
	public void testIsEqualBrackets() {
		assertTrue(SmallProblems.equalBrackets("[]"));
		assertTrue(SmallProblems.equalBrackets("[][]"));
		assertTrue(SmallProblems.equalBrackets("]]]]][[[[["));
		assertTrue(SmallProblems.equalBrackets("]]]]qqqq][[[[["));
		assertTrue(SmallProblems.equalBrackets(""));
		assertTrue(SmallProblems.equalBrackets("hello"));
		assertFalse(SmallProblems.equalBrackets("][["));
		assertFalse(SmallProblems.equalBrackets("[qq"));
		assertFalse(SmallProblems.equalBrackets("]d]]d]]d][[[[["));
	}
	
	@Test
	public void testDoubleArray() {
		assertArrayEquals(new int[] {1, 2, 1, 2}, SmallProblems.repeatArray(new int[] {1,2}));
		assertArrayEquals(new int[] {1, 1}, SmallProblems.repeatArray(new int[] {1}));
		assertArrayEquals(new int[] {5,99,2,-3,5,99,2,-3}, SmallProblems.repeatArray(new int[] {5,99,2,-3}));
		assertArrayEquals(new int[] {}, SmallProblems.repeatArray(new int[] {}));
	}
}
