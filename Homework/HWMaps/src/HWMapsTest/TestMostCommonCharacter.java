package HWMapsTest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import HWMaps.HWMaps;
import HWMaps.RunAllTests;


public class TestMostCommonCharacter {
    private static int testsPassed;
    private static int numberOfTests;

    @BeforeClass
    public static void oneTimeSetUp() {
        testsPassed = 0;
        numberOfTests = 0;
    } // oneTimeSetUp

    @AfterClass
    public static void oneTimeTearDown() {
        String className = TestMostCommonCharacter.class.getSimpleName();
        RunAllTests.outputResults(testsPassed, numberOfTests, className);
    } // oneTimeTearDown

    // --------------------------------------------
    // JUnit Tests
    // --------------------------------------------


    @Test
    public void testMostCommonCharacterN01() {
        numberOfTests++;
        assertEquals('a', HWMaps.mostCommonCharacter("aaab"));
        testsPassed++;
    } // testMostCommonCharacterN01

    @Test
    public void testMostCommonCharacterN02() {
        numberOfTests++;
        assertEquals('a', HWMaps.mostCommonCharacter("bbaaa"));
        testsPassed++;
    } // testMostCommonCharacterN02

    @Test
    public void testMostCommonCharacterN03() {
        numberOfTests++;
        assertEquals('c', HWMaps.mostCommonCharacter("abcbcdc"));
        testsPassed++;
    } // testMostCommonCharacterN03

    @Test
    public void testMostCommonCharacterN04() {
        numberOfTests++;
        assertEquals('a', HWMaps.mostCommonCharacter("a"));
        testsPassed++;
    } // testMostCommonCharacterN04

    @Test
    public void testMostCommonCharacterN05() {
        numberOfTests++;
        assertEquals('l', HWMaps.mostCommonCharacter("hello"));
        testsPassed++;
    } // testMostCommonCharacterN05

    @Test
    public void testMostCommonCharacterN06() {
        numberOfTests++;
        assertEquals('a', HWMaps.mostCommonCharacter("aaaabbbccd"));
        testsPassed++;
    } // testMostCommonCharacterN06

    @Test
    public void testMostCommonCharacterN07() {
        numberOfTests++;
        assertEquals('b', HWMaps.mostCommonCharacter("aaaabbbbbccd"));
        testsPassed++;
    } // testMostCommonCharacterN07

}
