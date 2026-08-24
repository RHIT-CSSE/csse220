package HWStringsAndListsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HWStringsAndLists.HWStringsAndLists;

public class TestFirstDifference {

    @Test
    public void testFirstDifferenceN01() {
        assertEquals(1, HWStringsAndLists.firstDifference("abc", "axy"));
    }

    @Test
    public void testFirstDifferenceN02() {
        assertEquals(2, HWStringsAndLists.firstDifference("abx", "aby"));
    }

    @Test
    public void testFirstDifferenceN03() {
        assertEquals(0, HWStringsAndLists.firstDifference("foo", "bar"));
    }

    @Test
    public void testFirstDifferenceN04() {
        assertEquals(-1, HWStringsAndLists.firstDifference("foo", "foo"));
    }

    @Test
    public void testFirstDifferenceN05() {
        assertEquals(-1, HWStringsAndLists.firstDifference("", ""));
    }

}
