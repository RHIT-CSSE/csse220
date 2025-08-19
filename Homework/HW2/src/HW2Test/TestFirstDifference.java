package HW2Test;

import static org.junit.Assert.*;

import org.junit.Test;

import HW2.HW2;

public class TestFirstDifference {

    @Test
    public void testFirstDifferenceN01() {
        assertEquals(1, HW2.firstDifference("abc", "axy"));
    }

    @Test
    public void testFirstDifferenceN02() {
        assertEquals(2, HW2.firstDifference("abx", "aby"));
    }

    @Test
    public void testFirstDifferenceN03() {
        assertEquals(0, HW2.firstDifference("foo", "bar"));
    }

    @Test
    public void testFirstDifferenceN04() {
        assertEquals(-1, HW2.firstDifference("foo", "foo"));
    }

    @Test
    public void testFirstDifferenceN05() {
        assertEquals(-1, HW2.firstDifference("", ""));
    }

}
