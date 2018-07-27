package edu.roseHulman.csse220.charges;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests PointCharge implementation of Charge.
 * 
 * @author Curt Clifton. Created Oct 3, 2008.
 */
public class PointChargeTest {
	/**
	 * Accuracy of comparisons for double results.
	 */
	private static final double EPSILON = 0.00001;
	private PointCharge unitAtOrigin;
	private PointCharge negativeUnitAtOrigin;
	private PointCharge unitAtOneOne;
	private PointCharge tenAtOrigin;

	/**
	 * Sets up some PointCharges for testing.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.unitAtOrigin = new PointCharge(0, 0, 1.0);
		this.negativeUnitAtOrigin = new PointCharge(0, 0, -1.0);
		this.unitAtOneOne = new PointCharge(1, 1, 1.0);
		this.tenAtOrigin = new PointCharge(0, 0, 10.0);
	}

	/**
	 * Test method for {@link PointCharge#forceAt(int, int)}.
	 */
	@Test
	public void testForceAtOrigin() {
		Vector v;

		v = this.unitAtOrigin.forceAt(0, 0);
		assertTrue(v.magnitude() == Double.POSITIVE_INFINITY);

		v = this.negativeUnitAtOrigin.forceAt(0, 0);
		assertTrue(v.magnitude() == Double.POSITIVE_INFINITY);

		v = this.unitAtOneOne.forceAt(0, 0);
		assertEquals(0.5, v.magnitude(), EPSILON);
		assertEquals(-3 * PI / 4, v.direction(), EPSILON);

		v = this.tenAtOrigin.forceAt(0, 0);
		assertTrue(v.magnitude() == Double.POSITIVE_INFINITY);
	}

	/**
	 * Test method for {@link PointCharge#forceAt(int, int)}.
	 */
	@Test
	public void testForceAtPlusX() {
		Vector v;

		v = this.unitAtOrigin.forceAt(1, 0);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(0.0, v.direction(), EPSILON);

		v = this.negativeUnitAtOrigin.forceAt(1, 0);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(PI, Math.abs(v.direction()), EPSILON);

		v = this.unitAtOneOne.forceAt(1, 0);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(-PI / 2, v.direction(), EPSILON);

		v = this.tenAtOrigin.forceAt(1, 0);
		assertEquals(10.0, v.magnitude(), EPSILON);
		assertEquals(0.0, v.direction(), EPSILON);
	}

	/**
	 * Test method for {@link PointCharge#forceAt(int, int)}.
	 */
	@Test
	public void testForceAtMinusX() {
		Vector v;

		v = this.unitAtOrigin.forceAt(-1, 0);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(PI, v.direction(), EPSILON);

		v = this.negativeUnitAtOrigin.forceAt(-1, 0);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(0.0, v.direction(), EPSILON);

		v = this.unitAtOneOne.forceAt(-1, 0);
		assertEquals(0.2, v.magnitude(), EPSILON);
		assertEquals(-2.67794504459, v.direction(), EPSILON);

		v = this.tenAtOrigin.forceAt(-1, 0);
		assertEquals(10.0, v.magnitude(), EPSILON);
		assertEquals(PI, v.direction(), EPSILON);
	}

	/**
	 * Test method for {@link PointCharge#forceAt(int, int)}.
	 */
	@Test
	public void testForceAtPlusY() {
		Vector v;

		v = this.unitAtOrigin.forceAt(0, 1);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(PI / 2, v.direction(), EPSILON);

		v = this.negativeUnitAtOrigin.forceAt(0, 1);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(-PI / 2, v.direction(), EPSILON);

		v = this.unitAtOneOne.forceAt(0, 1);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(PI, v.direction(), EPSILON);

		v = this.tenAtOrigin.forceAt(0, 1);
		assertEquals(10.0, v.magnitude(), EPSILON);
		assertEquals(PI / 2, v.direction(), EPSILON);
	}

	/**
	 * Test method for {@link PointCharge#forceAt(int, int)}.
	 */
	@Test
	public void testForceAtMinusY() {
		Vector v;

		v = this.unitAtOrigin.forceAt(0, -1);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(-PI / 2, v.direction(), EPSILON);

		v = this.negativeUnitAtOrigin.forceAt(0, -1);
		assertEquals(1.0, v.magnitude(), EPSILON);
		assertEquals(PI / 2, v.direction(), EPSILON);

		v = this.unitAtOneOne.forceAt(0, -1);
		assertEquals(0.2, v.magnitude(), EPSILON);
		assertEquals(-2.0344439358, v.direction(), EPSILON);

		v = this.tenAtOrigin.forceAt(0, -1);
		assertEquals(10.0, v.magnitude(), EPSILON);
		assertEquals(-PI / 2, v.direction(), EPSILON);
	}

	/**
	 * Test method for {@link PointCharge#forceAt(int, int)}.
	 */
	@Test
	public void testForceAtQuadrant1() {
		Vector v;

		v = this.unitAtOrigin.forceAt(1,1);
		assertEquals(0.5, v.magnitude(), EPSILON);
		assertEquals(PI/4, v.direction(), EPSILON);

		v = this.negativeUnitAtOrigin.forceAt(1,1);
		assertEquals(0.5, v.magnitude(), EPSILON);
		assertEquals(-3*PI / 4, v.direction(), EPSILON);

		v = this.unitAtOneOne.forceAt(1,1);
		assertTrue(v.magnitude() == Double.POSITIVE_INFINITY);

		v = this.tenAtOrigin.forceAt(1,1);
		assertEquals(5.0, v.magnitude(), EPSILON);
		assertEquals(PI/4, v.direction(), EPSILON);
	}
}
