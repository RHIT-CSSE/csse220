package edu.roseHulman.csse220.charges;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Vector class.
 * 
 * @author Curt Clifton. Created Oct 3, 2008.
 */
public class VectorTest {
	private static final double SQRT2 = Math.sqrt(2.0);
	/**
	 * Used for comparing doubles.
	 */
	private static final double EPSILON = 0.00001;
	/**
	 * Unit vectors counter-clockwise from the positive x-axis, every PI/4
	 * radians.
	 */
	private Vector[] ccwFrom3pm;

	/**
	 * Sets up some vectors for testing.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.ccwFrom3pm = new Vector[8];
		for (int i = 0; i < this.ccwFrom3pm.length; i++) {
			this.ccwFrom3pm[i] = new Vector(1.0, i * PI / 4);
		}
	}

	/**
	 * Tests {@link Vector#getXComponent()}.
	 */
	@Test
	public void testGetXComponent() {
		double[] expected = { 1, 1 / SQRT2, 0, -1 / SQRT2, -1, -1 / SQRT2, 0,
				1 / SQRT2 };
		for (int i = 0; i < expected.length; i++) {
			String msg = "At i==" + i;
			assertEquals(msg, expected[i], this.ccwFrom3pm[i].getXComponent(),
					EPSILON);
		}
	}

	/**
	 * Tests {@link Vector#getYComponent()}.
	 */
	@Test
	public void testGetYComponent() {
		double[] expected = { 0, 1 / SQRT2, 1, 1 / SQRT2, 0, -1 / SQRT2, -1,
				-1 / SQRT2 };
		for (int i = 0; i < expected.length; i++) {
			String msg = "At i==" + i;
			assertEquals(msg, expected[i], this.ccwFrom3pm[i].getYComponent(),
					EPSILON);
		}
	}

	/**
	 * Tests {@link Vector#add(Vector)}.
	 */
	@Test
	public void testAdd() {
		Vector unit = new Vector(1.0, 0.0);
		Vector[] unitPlus = new Vector[this.ccwFrom3pm.length];
		Vector[] plusUnit = new Vector[this.ccwFrom3pm.length];
		for (int i = 0; i < this.ccwFrom3pm.length; i++) {
			unitPlus[i] = unit.add(this.ccwFrom3pm[i]);
			plusUnit[i] = this.ccwFrom3pm[i].add(unit);
		}

		double[] expectedX = { 2, 1 + 1 / SQRT2, 1, 1 - 1 / SQRT2, 0,
				1 - 1 / SQRT2, 1, 1 + 1 / SQRT2 };
		double[] expectedY = { 0, 1 / SQRT2, 1, 1 / SQRT2, 0, -1 / SQRT2, -1,
				-1 / SQRT2 };

		for (int i = 0; i < unitPlus.length; i++) {
			String msg = "For i==" + i;
			assertEquals(msg, expectedX[i], unitPlus[i].getXComponent(),
					EPSILON);
			assertEquals(msg, expectedY[i], unitPlus[i].getYComponent(),
					EPSILON);
			assertEquals(msg, expectedX[i], plusUnit[i].getXComponent(),
					EPSILON);
			assertEquals(msg, expectedY[i], plusUnit[i].getYComponent(),
					EPSILON);
		}
	}

	/**
	 * Tests {@link Vector#add(Vector)}.
	 */
	@Test
	public void testAdd2() {
		Vector unit1 = new Vector(1.0, 0.0);
		Vector unit2 = unit1.add(Vector.ZERO);
		Vector unit3  = Vector.ZERO.add(unit1);
		assertEquals(unit1.getXComponent(), unit2.getXComponent(), EPSILON);
		assertEquals(unit1.getYComponent(), unit2.getYComponent(), EPSILON);
		assertEquals(unit1.getXComponent(), unit3.getXComponent(), EPSILON);
		assertEquals(unit1.getYComponent(), unit3.getYComponent(), EPSILON);
	}
}
