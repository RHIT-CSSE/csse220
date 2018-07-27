import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the factorial method that computes n! for given n.
 * 
 * @author David Mutchler. Created Nov 27, 2009.
 */
public class FactorialTest {

	/**
	 * Test method for {@link Factorial#factorial(int)}.
	 * Tests factorial from 0 to 13 - beyond that, int's overflow.
	 */
	@Test
	public void testFactorial() {
		int[] factorials = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880,
				3628800, 39916800, 479001600, 1932053504 };

		for (int k = 0; k < factorials.length; ++k) {
			assertEquals(factorials[k], Factorial.factorial(k));
		}
	}
}
