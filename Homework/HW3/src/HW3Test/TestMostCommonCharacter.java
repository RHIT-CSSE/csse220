package HW3Test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import HW3.HW3;
import HW3.RunAllTests;


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
        assertEquals('a', HW3.mostCommonCharacter("aaab"));
        testsPassed++;
    } // testMostCommonCharacterN01

    @Test
    public void testMostCommonCharacterN02() {
        numberOfTests++;
        assertEquals('a', HW3.mostCommonCharacter("bbaaa"));
        testsPassed++;
    } // testMostCommonCharacterN02

    @Test
    public void testMostCommonCharacterN03() {
        numberOfTests++;
        assertEquals('c', HW3.mostCommonCharacter("abcbcdc"));
        testsPassed++;
    } // testMostCommonCharacterN03

    @Test
    public void testMostCommonCharacterN04() {
        numberOfTests++;
        assertEquals('a', HW3.mostCommonCharacter("a"));
        testsPassed++;
    } // testMostCommonCharacterN04

    @Test
    public void testMostCommonCharacterN05() {
        numberOfTests++;
        assertEquals('l', HW3.mostCommonCharacter("hello"));
        testsPassed++;
    } // testMostCommonCharacterN05

    @Test
    public void testMostCommonCharacterN06() {
        numberOfTests++;
        assertEquals('a', HW3.mostCommonCharacter("aaaabbbccd"));
        testsPassed++;
    } // testMostCommonCharacterN06

    @Test
    public void testMostCommonCharacterN07() {
        numberOfTests++;
        assertEquals('b', HW3.mostCommonCharacter("aaaabbbbbccd"));
        testsPassed++;
    } // testMostCommonCharacterN07

}
