package recursionTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursion.RunAllTests;
import recursion.HW12;

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
        assertTrue(HW12.isNearPalindrome(""));
        testsPassed++;
    } // testIsNearPalindrome01

    @Test
    public void testIsNearPalindrome02() {
        numberOfTests++;
        assertTrue(HW12.isNearPalindrome("racecar"));
        testsPassed++;
    } // testIsNearPalindrome02

    @Test
    public void testIsNearPalindrome03() {
        numberOfTests++;
        assertTrue(HW12.isNearPalindrome("facecar"));
        testsPassed++;
    } // testIsNearPalindrome03

    @Test
    public void testIsNearPalindrome04() {
        numberOfTests++;
        assertTrue(HW12.isNearPalindrome("abca"));
        testsPassed++;
    } // testIsNearPalindrome04

    @Test
    public void testIsNearPalindrome05() {
        numberOfTests++;
        assertFalse(HW12.isNearPalindrome("hello"));
        testsPassed++;
    } // testIsNearPalindrome05

    @Test
    public void testIsNearPalindrome06() {
        numberOfTests++;
        assertFalse(HW12.isNearPalindrome("liquid"));
        testsPassed++;
    } // testIsNearPalindrome06

    @Test
    public void testIsNearPalindrome07() {
        numberOfTests++;
        assertTrue(HW12.isNearPalindrome("flatcalf"));
        testsPassed++;
    } // testIsNearPalindrome07

    @Test
    public void testIsNearPalindrome08() {
        numberOfTests++;
        assertTrue(HW12.isNearPalindrome("civil"));
        testsPassed++;
    } // testIsNearPalindrome08

} // TestIsNearPalindrome
