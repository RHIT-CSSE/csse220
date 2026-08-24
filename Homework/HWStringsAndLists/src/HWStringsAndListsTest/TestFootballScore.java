package HWStringsAndListsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HWStringsAndLists.HWStringsAndLists;

public class TestFootballScore {

    @Test
    public void testFootballScoreN01() {
        assertEquals(9, HWStringsAndLists.footballScore("FFF"));
    } // testFootballScoreN0

    @Test
    public void testFootballScoreN02() {
        assertEquals(21, HWStringsAndLists.footballScore("TTT"));
    } // testFootballScoreN02

    @Test
    public void testFootballScoreN03() {
        assertEquals(17, HWStringsAndLists.footballScore("TFT"));
    } // testFootballScoreN03

    @Test
    public void testFootballScoreN04() {
        assertEquals(7, HWStringsAndLists.footballScore("T"));
    } // testFootballScoreN04

    @Test
    public void testFootballScoreN05() {
        assertEquals(3, HWStringsAndLists.footballScore("F"));
    } // testFootballScoreN05

    @Test
    public void testFootballScoreN06() {
        assertEquals(30, HWStringsAndLists.footballScore("FFFFFFFFFF"));
    } // testFootballScoreN06

    @Test
    public void testFootballScoreN07() {
        assertEquals(0, HWStringsAndLists.footballScore(""));
    } // testFootballScoreN07

}
