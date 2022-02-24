package banking;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Tests the SafeDepositBox class.
 *
 * @author Curt Clifton.
 *         Created Oct 12, 2008.
 */
public class SafeDepositBoxTest {
	/**
	 * Tests {@link SafeDepositBox#equals(Object)}.
	 */
	@Test
	public void testEquals() {
		SafeDepositBox box1a = new SafeDepositBox(1);
		SafeDepositBox box1b = new SafeDepositBox(1);
		SafeDepositBox box1c = new SafeDepositBox(1);
		SafeDepositBox box2 = new SafeDepositBox(2);

		// Reflexive
		assertTrue(box1a.equals(box1a));
		assertTrue(box2.equals(box2));
		
		// Symmetric
		assertTrue(box1a.equals(box1b));
		assertTrue(box1b.equals(box1a));
		assertFalse(box1a.equals(box2));
		assertFalse(box2.equals(box1a));
		
		// Transitive
		assertTrue(box1a.equals(box1b));
		assertTrue(box1b.equals(box1c));
		assertTrue(box1a.equals(box1c));
	}
}
