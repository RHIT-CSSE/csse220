package badFrac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BadFracTest {

    private BadFrac tester1 = new BadFrac(1, 2);
    private BadFrac tester2 = new BadFrac(1, 4);
    private BadFrac tester3 = new BadFrac(2, 4);
    private BadFrac tester4 = new BadFrac(0, 1);
    private BadFrac tester5 = new BadFrac(0, 2); //this catches problem in isReduced

    @Test
    void testIsReduced() {
        assertTrue(tester1.isReduced());
        assertTrue(tester2.isReduced());
        assertFalse(tester3.isReduced());
        assertTrue(tester4.isReduced());
        assertFalse(tester5.isReduced());
    }

    @Test
    void testAdd() {
        BadFrac res = tester1.add(tester2);
        assertEquals(3, res.getNum());
        assertEquals(4, res.getDen());
    }

    @Test
    void testMultiply() {

    }
}