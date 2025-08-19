package HW2Test;

import static org.junit.Assert.*;

import org.junit.Test;

import HW2.HW2;

public class TestEndsWithUpperCaseLetter {
    @Test
    public void testEndsWithUpperCaseLetterN01() {
        assertTrue(HW2.endsWithUpperCaseLetter("doG"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN02() {
        assertFalse(HW2.endsWithUpperCaseLetter("dog"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN03() {
        assertTrue(HW2.endsWithUpperCaseLetter("HELLO"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN04() {
        assertFalse(HW2.endsWithUpperCaseLetter("hello"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN05() {
        assertFalse(HW2.endsWithUpperCaseLetter(""));
    }

}
