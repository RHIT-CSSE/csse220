import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Tests Investment class.
 *
 * @author Curt Clifton.
 *         Created Sep 21, 2008.
 */
public class InvestmentTest {

	/**
	 * Test method for {@link Investment#Investment(double, double)}.
	 */
	@Test
	public void testInvestment() {
		double epsilon = 0.001;
		Investment i = new Investment(0.0, 5.0);
		assertEquals(0.0, i.getBalance(), epsilon);
		assertEquals(0, i.getYears());
		
		i = new Investment(10000.0, 5.0);
		assertEquals(10000.0, i.getBalance(), epsilon);
		assertEquals(0, i.getYears());
	}

	/**
	 * Test method for {@link Investment#waitForBalance(double)}.
	 */
	@Test
	public void testWaitForBalance() {
		Investment i = new Investment(1.0, 5.0);
		i.waitForBalance(10000.0);
		assertTrue(i.getBalance() >= 10000.0);
		assertEquals(189, i.getYears());
		
		i = new Investment(5000.0, 5.0);
		i.waitForBalance(10000.0);
		assertTrue(i.getBalance() >= 10000.0);
		assertEquals(15, i.getYears());
		
		i = new Investment(10000.0, 5.0);
		i.waitForBalance(10000.0);
		assertTrue(i.getBalance() >= 10000.0);
		assertEquals(0, i.getYears());
	}

}
