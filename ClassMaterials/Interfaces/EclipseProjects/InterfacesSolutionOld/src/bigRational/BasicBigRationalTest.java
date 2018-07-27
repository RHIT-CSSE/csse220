package bigRational;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This class tests the BigRational implementation of the Rational interface.
 * 
 * @author Curt Clifton
 */
public class BasicBigRationalTest {
	private BigRational zero;

	private BigRational one;

	private BigRational negOne;

	private BigRational pi;

	/**
	 * Sets up some objects for testing.
	 */
	@Before
	public void setUp() {
		this.zero = new BigRational("0", "1");
		this.one = new BigRational("1", "1");
		this.negOne = new BigRational("-1", "1");
		this.pi = new BigRational("22", "7");
	}

	/**
	 * Should be able to initialize all those objects in the setUp()
	 */
	@Test
	public void testSetupWorks() {
		assertNotNull(this.zero);
		assertNotNull(this.one);
		assertNotNull(this.negOne);
		assertNotNull(this.pi);
	}

	/**
	 * From spec: "Design and implement a BigRational class that: Implements
	 * this Rational interface"
	 * 
	 */
	@Test
	public void testArithmeticObjectInterface() {
		Object o = this.pi;
		assertTrue(o instanceof ArithmeticObject);
	}

	/**
	 * From spec: "Design and implement a BigRational class that: Implements
	 * this Comparable interface that Rational extends."
	 * 
	 */
	@Test
	public void testComparableInterface() {
		Object o = this.pi;
		assertTrue(o instanceof Comparable);
	}

	/**
	 * Basic construction and toString
	 */
	@Test
	public void testBigRational() {
		BigRational rat = new BigRational("4", "6");
		assertEquals("2/3", rat.toString());

		rat = new BigRational("4", "1");
		assertEquals("4", rat.toString());

		rat = new BigRational("5", "-6");
		assertEquals("-5/6", rat.toString());

		rat = new BigRational("-1", "-2");
		assertEquals("1/2", rat.toString());

		rat = new BigRational("0", "3");
		assertEquals("0", rat.toString());
	}

	/**
	 * Equality testing: positives and negatives
	 */
	@Test
	public void testSignsA() {
		assertEquals(this.one, new BigRational("1", "1"));
	}

	/**
	 * Equality testing: positives and negatives
	 */
	@Test
	public void testSignsB() {
		assertEquals(this.one, new BigRational("-1", "-1"));
	}

	/**
	 * Equality testing: positives and negatives
	 */
	@Test
	public void testSignsC() {
		assertEquals(this.negOne, new BigRational("-1", "1"));
	}

	/**
	 * Equality testing: positives and negatives
	 */
	@Test
	public void testSignsD() {
		assertEquals(this.negOne, new BigRational("1", "-1"));
	}

	/**
	 * Equality testing: zero
	 */
	@Test
	public void testZeroA() {
		assertEquals(this.zero, new BigRational("0", "1"));
	}

	/**
	 * Equality testing: zero
	 */
	@Test
	public void testZeroB() {
		assertEquals(this.zero, new BigRational("0", "-11"));
	}

	/**
	 * Equality testing: zero
	 */
	@Test
	public void testZeroC() {
		assertEquals(this.zero, new BigRational("0", "2"));
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()}.
	 */
	@Test
	public void testAbsA() {
		assertEquals(this.one, new BigRational("1", "1").abs());
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()}.
	 */
	@Test
	public void testAbsB() {
		assertEquals(this.one, new BigRational("1", "-1").abs());
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()}.
	 */
	@Test
	public void testAbsC() {
		assertEquals(this.one, new BigRational("-1", "1").abs());
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()}.
	 */
	@Test
	public void testAbsD() {
		assertEquals(this.one, new BigRational("-1", "-1").abs());
	}


	/**
	 * Test method for {@link bigRational.BigRational#negate()}.
	 */
	@Test
	public void testNegateA() {
		assertEquals(this.negOne, new BigRational("1", "1").negate());
	}

	/**
	 * Test method for {@link bigRational.BigRational#negate()}.
	 */
	@Test
	public void testNegateB() {
		assertEquals(this.one, new BigRational("1", "-1").negate());
	}

	/**
	 * Test method for {@link bigRational.BigRational#negate()}.
	 */
	@Test
	public void testNegateC() {
		assertEquals(this.one, new BigRational("-1", "1").negate());
	}

	/**
	 * Test method for {@link bigRational.BigRational#negate()}.
	 */
	@Test
	public void testNegateD() {
		assertEquals(this.negOne, new BigRational("-1", "-1").negate());
	}
	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddA() {
		assertEquals(this.zero, new BigRational("0", "1").add(new BigRational(
				"0", "1")));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddB() {
		assertEquals(this.one, new BigRational("1", "1").add(this.zero));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddC() {
		assertEquals(this.one, this.zero.add(new BigRational("1", "1")));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddD() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(this.zero, rat1.add(rat2));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddE() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(this.zero, rat2.add(rat1));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddF() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(this.zero, rat3.add(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddG() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(this.zero, rat4.add(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddH() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(new BigRational("13", "6"), rat1.add(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddI() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("5", "6"), rat1.add(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddJ() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(new BigRational("-5", "6"), rat2.add(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#add(bigRational.BigRational)}.
	 */
	@Test
	public void testAddK() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("-13", "6"), rat2.add(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractA() {
		assertEquals(this.zero, new BigRational("0", "1")
				.subtract(new BigRational("0", "1")));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractB() {
		assertEquals(this.one, new BigRational("1", "1").subtract(this.zero));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractC() {
		assertEquals(this.negOne, this.zero.subtract(new BigRational("1", "1")));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractD() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(new BigRational("3", "1"), rat1.subtract(rat2));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractE() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(new BigRational("-3", "1"), rat2.subtract(rat1));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractF() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("4", "3"), rat3.subtract(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractG() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("-4", "3"), rat4.subtract(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractH() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(new BigRational("5", "6"), rat1.subtract(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractI() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("13", "6"), rat1.subtract(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractJ() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(new BigRational("-13", "6"), rat2.subtract(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#subtract(bigRational.BigRational)}.
	 */
	@Test
	public void testSubtractK() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("-5", "6"), rat2.subtract(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideA() {
		try {
			@SuppressWarnings("unused")
			BigRational zeroOverZero = new BigRational("0", "1")
					.divide(new BigRational("0", "1"));
			fail("Division by zero should result in an exception");
		} catch (Exception e) {
			// OK
		}
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideB() {
		try {
			@SuppressWarnings("unused")
			BigRational oneOverZero = new BigRational("1", "1")
					.divide(this.zero);
			fail("Division by zero should result in an exception");
		} catch (Exception e) {
			// OK
		}
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideC() {
		assertEquals(new BigRational("0", "1"), this.zero.divide(this.one));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideD() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(this.negOne, rat1.divide(rat2));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideE() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(this.negOne, rat2.divide(rat1));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideF() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(this.negOne, rat3.divide(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideG() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(this.negOne, rat4.divide(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideH() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(new BigRational("9", "4"), rat1.divide(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideI() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("-9", "4"), rat1.divide(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideJ() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(new BigRational("-9", "4"), rat2.divide(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideK() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("9", "4"), rat2.divide(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyA() {
		BigRational zeroOverZero = new BigRational("0", "1")
				.multiply(new BigRational("0", "1"));
		assertEquals(new BigRational("0", "1"), zeroOverZero);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyB() {
			BigRational oneTimesZero = new BigRational("1", "1")
					.multiply(this.zero);
			assertEquals(new BigRational("0", "1"), oneTimesZero);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyC() {
		assertEquals(new BigRational("0", "1"), this.zero.multiply(this.one));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyD() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(new BigRational("-9", "4"), rat1.multiply(rat2));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyE() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat2 = new BigRational("-3", "2");
		assertEquals(new BigRational("-9", "4"), rat2.multiply(rat1));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyF() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("-4", "9"), rat3.multiply(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyG() {
		BigRational rat3 = new BigRational("2", "3");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(new BigRational("-4", "9"), rat4.multiply(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyH() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(this.one, rat1.multiply(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyI() {
		BigRational rat1 = new BigRational("3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(this.negOne, rat1.multiply(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyJ() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat3 = new BigRational("2", "3");
		assertEquals(this.negOne, rat2.multiply(rat3));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#multiply(bigRational.BigRational)}.
	 */
	@Test
	public void testMultiplyK() {
		BigRational rat2 = new BigRational("-3", "2");
		BigRational rat4 = new BigRational("2", "-3");
		assertEquals(this.one, rat2.multiply(rat4));
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToA() {
		assertTrue(this.zero.compareTo(this.negOne) > 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToB() {
		assertTrue(this.zero.compareTo(this.zero) == 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToC() {
		assertTrue(this.zero.compareTo(this.one) < 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToD() {
		assertTrue(this.one.compareTo(this.negOne) > 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToE() {
		assertTrue(this.one.compareTo(this.zero) > 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToF() {
		assertTrue(this.one.compareTo(this.one) == 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToG() {
		assertTrue(this.negOne.compareTo(this.negOne) == 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToH() {
		assertTrue(this.negOne.compareTo(this.zero) < 0);
	}

	/**
	 * Test method for
	 * {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 */
	@Test
	public void testCompareToI() {
		assertTrue(this.negOne.compareTo(this.one) < 0);
	}
}
