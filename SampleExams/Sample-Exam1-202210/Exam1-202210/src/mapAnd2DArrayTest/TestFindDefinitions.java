package mapAnd2DArrayTest;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import mapAnd2DArray.RunAllTests;
import mapAnd2DArray.MapAnd2DArrayProblems;

public class TestFindDefinitions {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFindDefinitions.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testFindDefinitionsN01() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "hot";
		String[] expectedArray = {"fire", "coffee"};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		
		testsPassed++;
	} // testFindDefinitionsN01
	
	@Test
	public void testFindDefinitionsN02() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "energy";
		String[] expectedArray = new String[] {"fire", "electricity"};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testFindDefinitionsN02
	
	@Test
	public void testFindDefinitionsN03() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "liquid";
		String[] expectedArray = new String[] {"coffee", "water"};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testFindDefinitionsN03
	
	@Test
	public void testFindDefinitionsN04() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "clear";
		String[] expectedArray = new String[] {"water", "glass"};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testFindDefinitionsN04
	
	@Test
	public void testFindDefinitionsN05() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "rubber";
		String[] expectedArray = new String[] {"tire"};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testFindDefinitionsN05
	
	@Test
	public void testFindDefinitionsN06() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "electrons";
		String[] expectedArray = new String[] {"electricity"};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testFindDefinitionsN06
	
	@Test
	public void testFindDefinitionsN07() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "flame";
		String[] expectedArray = new String[] {};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testFindDefinitionsN07
	
	@Test
	public void testFindDefinitionsN08() {
		numberOfTests++;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("fire", "a hot source of energy");
		dictionary.put("coffee", "a hot liquid made from beans");
		dictionary.put("water", "a clear liquid made from H2O");
		dictionary.put("glass", "a clear solid substance");
		dictionary.put("tire", "a wheel made of rubber");
		dictionary.put("electricity", "electrons moving to transfer energy");
		
		String wordToFind = "fire";
		String[] expectedArray = new String[] {};
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedArray));
		Collections.sort(expected);
		ArrayList<String> actual = MapAnd2DArrayProblems.findDefinitions(dictionary, wordToFind);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testFindDefinitionsN08
	
}
