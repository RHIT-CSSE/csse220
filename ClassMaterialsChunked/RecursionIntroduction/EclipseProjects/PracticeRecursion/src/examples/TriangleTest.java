package examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the triangle class.
 *
 * @author Curt Clifton.
 */
public class TriangleTest {

	/**
	 * Test method for {@link examples.Triangle#getArea()}.
	 */
	@Test
	public void testGetArea() {
		Triangle t;
		
		t = new Triangle(0);
		assertEquals(0, t.getArea());
		
		t = new Triangle(1);
		assertEquals(1, t.getArea());
		
		t = new Triangle(3);
		assertEquals(6, t.getArea());

		// For better output when debugging
		t = new Triangle(4);
		int area = t.getArea();
		assertEquals(10, area);
		
		t = new Triangle(10);
		assertEquals(55, t.getArea());
	}

}
