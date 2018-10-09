

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the BallWorld class.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class BallWorldTest {

	private BallWorld world;
	
	// ASCII art rendition of the test points:
	//
	// 0    1    2
	//    _____
	//    |   |
	// 3  | 4 |  5
	//    |___|
	//
	// 6    7    8
	//
	private List<Point2D> pointList;

	/**
	 * Sets up a BallWorld and some points to test.
	 */
	@Before
	public void setUp() {
		int SIZE = 10;
		this.world = new BallWorld(SIZE, SIZE, Color.BLACK);
		this.pointList = new ArrayList<Point2D>();
		for (int y = -SIZE / 2; y <= SIZE * 1.5; y += SIZE) {
			for (int x = -SIZE / 2; x <= SIZE * 1.5; x += SIZE) {
				this.pointList.add(new Point2D.Double(x, y));
			}
		}
	}

	/**
	 * Test method for
	 * {@link ballworlds.BallWorld#isInsideWorldX(java.awt.geom.Point2D)}.
	 */
	@Test
	public void testIsInsideWorldX() {
		boolean[] expected = {false, true, false, false, true, false, false, true, false };
		for (int i = 0; i < expected.length; i++) {
			boolean result = this.world.isInsideWorldX(this.pointList.get(i));
			assertTrue(result == expected[i]);
		}
	}

	/**
	 * Test method for
	 * {@link ballworlds.BallWorld#isInsideWorldY(java.awt.geom.Point2D)}.
	 */
	@Test
	public void testIsInsideWorldY() {
		boolean[] expected = {false, false, false, true, true, true, false, false, false };
		for (int i = 0; i < expected.length; i++) {
			boolean result = this.world.isInsideWorldY(this.pointList.get(i));
			assertTrue(result == expected[i]);
		}
	}

	/**
	 * Test method for
	 * {@link ballworlds.BallWorld#isInsideWorld(java.awt.geom.Point2D)}.
	 */
	@Test
	public void testIsInsideWorld() {
		boolean[] expected = {false, false, false, false, true, false, false, false, false };
		for (int i = 0; i < expected.length; i++) {
			boolean result = this.world.isInsideWorld(this.pointList.get(i));
			assertTrue(result == expected[i]);
		}
	}

}
