//package examples;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class SimplePalindromeTest {
//
//    @Test
//    public void testIsPalindromeString() {
//        assertTrue(SimplePalindrome.isPalindrome("aba"));
//        assertTrue(SimplePalindrome.isPalindrome("xyyx"));
//        assertTrue(SimplePalindrome.isPalindrome(""));
//        assertTrue(SimplePalindrome.isPalindrome("a"));
//        assertFalse(SimplePalindrome.isPalindrome("ab"));
//        assertFalse(SimplePalindrome.isPalindrome("abbbbz"));
//        assertFalse(SimplePalindrome.isPalindrome("abbQbbz"));
//    }
//
//    @Test
//    public void testIsPalindromeIntList() {
//        ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(1,2,1));
//        ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> test3 = new ArrayList<>(Arrays.asList(1,2,2,1));
//        ArrayList<Integer> test4 = new ArrayList<>(Arrays.asList(1,2,1,2));
//        assertTrue(SimplePalindrome.isPalindromeIntList(test1));
//        assertFalse(SimplePalindrome.isPalindromeIntList(test2));
//        assertTrue(SimplePalindrome.isPalindromeIntList(test3));
//        assertFalse(SimplePalindrome.isPalindromeIntList(test4));
//    }
//
//}
