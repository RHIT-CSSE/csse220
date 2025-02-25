package StringsAndListsTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import StringsAndLists.StringsAndLists;

@RunWith(RunAllTestsTestRunner.class)
public class TestTruncateStringsAtX {
	
	@Test
	public void testTruncateStringsAtXN01() {
		String[] input = {"abcXdef", "XXX"};
		String[] exp = {"abcX", "X"};
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input)); 
		
		StringsAndLists.truncateStringsAtX(inputList);
		
		assertEquals(Arrays.asList(exp), inputList);
	}
	
	@Test
	public void testTruncateStringsAtXN02() {
		String[] input = {"HelloXHowXAreXYouX", "HelloThere", "abcd", "xxxxx"};
		String[] exp = {"HelloX", "HelloThere", "abcd", "xxxxx"};
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input)); 
		
		StringsAndLists.truncateStringsAtX(inputList);
		
		assertEquals(Arrays.asList(exp), inputList);
	}
	
	@Test
	public void testTruncateStringsAtXN03() {
		String[] input = {"aXbXcX", "aXbcd", "abcXd", "StringWithAnX", "XInAString"};
		String[] exp = {"aX", "aX", "abcX", "StringWithAnX", "X"};
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input)); 
		
		StringsAndLists.truncateStringsAtX(inputList);
		
		assertEquals(Arrays.asList(exp), inputList);
	}
	
	@Test
	public void testTruncateStringsAtXAllStartWithX() {
		String[] input = {"X", "XX", "Xabc", "XXXX", "XXabc", "XHelloX"};
		String[] exp = {"X", "X", "X", "X", "X", "X"};
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input)); 
		
		StringsAndLists.truncateStringsAtX(inputList);
		
		assertEquals(Arrays.asList(exp), inputList);
	}
	
	@Test
	public void testTruncateStringsAtXAllEndWithX() {
		String[] input = {"X", "aX", "abcX", "HelloXXXX", "CLEVERXX", "HelloX"};
		String[] exp = {"X", "aX", "abcX", "HelloX", "CLEVERX", "HelloX"};
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input)); 
		
		StringsAndLists.truncateStringsAtX(inputList);
		
		assertEquals(Arrays.asList(exp), inputList);
	}
	
	@Test
	public void testTruncateStringsNoneWithX() {
		String[] input = {"abc", "abcd", "Hello", "axbxcxdx", "xxxxx", ""};
		String[] exp = {"abc", "abcd", "Hello", "axbxcxdx", "xxxxx", ""};
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input)); 
		
		StringsAndLists.truncateStringsAtX(inputList);
		
		assertEquals(Arrays.asList(exp), inputList);
		
		
		
		String[] input2 = {"abcXdef", "XXX"};
		String[] exp2 = {"abcX", "X"};
		ArrayList<String> inputList2 = new ArrayList<String>(Arrays.asList(input2)); 
		StringsAndLists.truncateStringsAtX(inputList2);
		assertEquals(Arrays.asList(exp2), inputList2);
		
	}
	
}
