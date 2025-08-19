package HW2Test;

import static org.junit.Assert.*;

import org.junit.Test;

import HW2.HW2;

public class TestFootballScore {

    @Test
    public void testFootballScoreN01() {
        assertEquals(9, HW2.footballScore("FFF"));
    } // testFootballScoreN0

    @Test
    public void testFootballScoreN02() {
        assertEquals(21, HW2.footballScore("TTT"));
    } // testFootballScoreN02

    @Test
    public void testFootballScoreN03() {
        assertEquals(17, HW2.footballScore("TFT"));
    } // testFootballScoreN03

    @Test
    public void testFootballScoreN04() {
        assertEquals(7, HW2.footballScore("T"));
    } // testFootballScoreN04

    @Test
    public void testFootballScoreN05() {
        assertEquals(3, HW2.footballScore("F"));
    } // testFootballScoreN05

    @Test
    public void testFootballScoreN06() {
        assertEquals(30, HW2.footballScore("FFFFFFFFFF"));
    } // testFootballScoreN06

    @Test
    public void testFootballScoreN07() {
        assertEquals(0, HW2.footballScore(""));
    } // testFootballScoreN07

}
