package recursionTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursion.RunAllTests;
import recursion.HWRecursionPart2;

public class TestIsNearPalindrome {
    private static int testsPassed;
    private static int numberOfTests;

    @BeforeClass
    public static void oneTimeSetUp() {
        testsPassed = 0;
        numberOfTests = 0;
    } // oneTimeSetUp

    @AfterClass
    public static void oneTimeTearDown() {
        String className = TestIsNearPalindrome.class.getSimpleName();
        RunAllTests.outputResults(testsPassed, numberOfTests, className);
    } // oneTimeTearDown

    // **************************************************************
    // JUnit tests: isNearPalindrome
    // **************************************************************

    @Test
    public void testIsNearPalindrome01() {
        numberOfTests++;
        assertTrue(HWRecursionPart2.isNearPalindrome(""));
        testsPassed++;
    } // testIsNearPalindrome01

    @Test
    public void testIsNearPalindrome02() {
        numberOfTests++;
        assertTrue(HWRecursionPart2.isNearPalindrome("racecar"));
        testsPassed++;
    } // testIsNearPalindrome02

    @Test
    public void testIsNearPalindrome03() {
        numberOfTests++;
        assertTrue(HWRecursionPart2.isNearPalindrome("facecar"));
        testsPassed++;
    } // testIsNearPalindrome03

    @Test
    public void testIsNearPalindrome04() {
        numberOfTests++;
        assertTrue(HWRecursionPart2.isNearPalindrome("abca"));
        testsPassed++;
    } // testIsNearPalindrome04

    @Test
    public void testIsNearPalindrome05() {
        numberOfTests++;
        assertFalse(HWRecursionPart2.isNearPalindrome("hello"));
        testsPassed++;
    } // testIsNearPalindrome05

    @Test
    public void testIsNearPalindrome06() {
        numberOfTests++;
        assertFalse(HWRecursionPart2.isNearPalindrome("liquid"));
        testsPassed++;
    } // testIsNearPalindrome06

    @Test
    public void testIsNearPalindrome07() {
        numberOfTests++;
        assertTrue(HWRecursionPart2.isNearPalindrome("flatcalf"));
        testsPassed++;
    } // testIsNearPalindrome07

    @Test
    public void testIsNearPalindrome08() {
        numberOfTests++;
        assertTrue(HWRecursionPart2.isNearPalindrome("civil"));
        testsPassed++;
    } // testIsNearPalindrome08

} // TestIsNearPalindrome
