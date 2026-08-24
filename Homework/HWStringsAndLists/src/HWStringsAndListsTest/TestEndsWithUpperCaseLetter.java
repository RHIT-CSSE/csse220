package HWStringsAndListsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HWStringsAndLists.HWStringsAndLists;

public class TestEndsWithUpperCaseLetter {
    @Test
    public void testEndsWithUpperCaseLetterN01() {
        assertTrue(HWStringsAndLists.endsWithUpperCaseLetter("doG"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN02() {
        assertFalse(HWStringsAndLists.endsWithUpperCaseLetter("dog"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN03() {
        assertTrue(HWStringsAndLists.endsWithUpperCaseLetter("HELLO"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN04() {
        assertFalse(HWStringsAndLists.endsWithUpperCaseLetter("hello"));
    }

    @Test
    public void testEndsWithUpperCaseLetterN05() {
        assertFalse(HWStringsAndLists.endsWithUpperCaseLetter(""));
    }

}
