import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the seriesSum method that computes the sum from 1 to n for given n.
 * 
 * @author David Mutchler. Created November 27, 2009.
 */
public class SeriesSumTest {
	/**
	 * The maximum n for which to compute 1 + 2 + 3 + ... + n.
	 */
	public static final int MAX = 65535;

	// The sum exhibits integer overflow at MAX == 65536

	/**
	 * Test method for {@link SeriesSum#seriesSum(int)}. Tests the seriesSum
	 * method for n from 1 to SeriesSumTest.MAX; beyond that, int's overflow.
	 * Uses the closed-form formula for the series sum as an oracle.
	 */
	@Test
	public void testSeriesSum() {
		for (long k = 1; k <= SeriesSumTest.MAX; ++k) {
			assertEquals(k * (k + 1) / 2, SeriesSum.seriesSum((int) k));
		}
	}
}
