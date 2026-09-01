package examples;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the factorial calculations.
 *
 * @author Curt Clifton.
 */
public class FactorialCalculatorTest {

	private FactorialCalculator factCalc;

	/**
	 * Constructs a test object.
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.factCalc = new FactorialCalculator();
	}

	/**
	 * Test method for {@link examples.FactorialCalculator#factorialIteratively(int)}.
	 */
	@Test
	public void testFactorialIteratively() {
		assertEquals(1, this.factCalc.factorialIteratively(1));
		assertEquals(2, this.factCalc.factorialIteratively(2));
		assertEquals(6, this.factCalc.factorialIteratively(3));
		assertEquals(24, this.factCalc.factorialIteratively(4));
		assertEquals(120, this.factCalc.factorialIteratively(5));
		assertEquals(720, this.factCalc.factorialIteratively(6));
	}

	/**
	 * Test method for {@link examples.FactorialCalculator#factorialRecursively(int)}.
	 */
	@Test
	public void testFactorialRecursively() {
		assertEquals(1, this.factCalc.factorialRecursively(1));
		assertEquals(2, this.factCalc.factorialRecursively(2));
		assertEquals(6, this.factCalc.factorialRecursively(3));
		assertEquals(24, this.factCalc.factorialRecursively(4));
		assertEquals(120, this.factCalc.factorialRecursively(5));
		assertEquals(720, this.factCalc.factorialRecursively(6));
	}

}
