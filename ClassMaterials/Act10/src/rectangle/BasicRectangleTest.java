package rectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class containing JUnit tests for the BasicRectangle class. 
 * 
 * @author Ian Ludden (luddenig)
 */
public class BasicRectangleTest {

    @Test
    public void testCalculatePerimeter() {
        BasicRectangle rect1 = new BasicRectangle(2, 2);
        assertEquals(8, rect1.calculatePerimeter());

        BasicRectangle rect2 = new BasicRectangle(1, 3);
        assertEquals(8, rect2.calculatePerimeter());

        BasicRectangle rect3 = new BasicRectangle(13, 17);
        assertEquals(60, rect3.calculatePerimeter());
    }

    @Test
    public void testCalculateArea() {
        BasicRectangle rect1 = new BasicRectangle(2, 2);
        assertEquals(4, rect1.calculateArea());

        BasicRectangle rect2 = new BasicRectangle(1, 3);
        assertEquals(3, rect2.calculateArea());

        BasicRectangle rect3 = new BasicRectangle(12, 5);
        assertEquals(60, rect3.calculateArea());
    }

    @Test
    public void testCalculateDiagonalLength() {
        BasicRectangle rect1 = new BasicRectangle(2, 2);
        assertEquals(2.8284, rect1.calculateDiagonalLength(), 0.0001);

        BasicRectangle rect2 = new BasicRectangle(1, 3);
        assertEquals(Math.sqrt(10), rect2.calculateDiagonalLength(), .00001);

        BasicRectangle rect3 = new BasicRectangle(7, 14);
        assertEquals(15.0, rect3.calculateDiagonalLength(), .00001);
    }

    @Test
    public void testToString() {
        BasicRectangle rect1 = new BasicRectangle(2, 2);
        assertEquals("BasicRectangle[length=2, width=2]", rect1.toString());

        BasicRectangle rect2 = new BasicRectangle(1, 3);
        assertEquals("BasicRectangle[length=1, width=3]", rect2.toString());

        BasicRectangle rect3 = new BasicRectangle(7, 14);
        assertEquals("BasicRectangle[length=7, width=14]", rect3.toString());
    }

}
