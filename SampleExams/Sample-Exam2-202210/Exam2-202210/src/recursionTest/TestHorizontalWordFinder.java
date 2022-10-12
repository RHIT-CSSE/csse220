package recursionTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import recursion.RunAllTests;
import recursion.RecursionProblems;

public class TestHorizontalWordFinder {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestHorizontalWordFinder.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testHorizontalWordFinderN01() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};


		String word = "hello";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN01


	@Test
	public void testHorizontalWordFinderN02() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		
		String word = "abhello";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN02

	@Test
	public void testHorizontalWordFinderN03() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "abhellocth";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN03

	@Test
	public void testHorizontalWordFinderN04() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "abhellocthered";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN04

	@Test
	public void testHorizontalWordFinderN05() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "there";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN05

	@Test
	public void testHorizontalWordFinderN06() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "cthered";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN06

	@Test
	public void testHorizontalWordFinderN07() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "octhered";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN07

	@Test
	public void testHorizontalWordFinderN08() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "ctheredho";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN08

	@Test
	public void testHorizontalWordFinderN09() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "how";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN09

	@Test
	public void testHorizontalWordFinderN10() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "are";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN10
	
	
	@Test
	public void testHorizontalWordFinderN11() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "howeare";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN11
	
	
	@Test
	public void testHorizontalWordFinderN12() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "dhoweare";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN12
	
	@Test
	public void testHorizontalWordFinderN13() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "dhowearef";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN13
	
	
	@Test
	public void testHorizontalWordFinderN14() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "things";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN14
	
	
	@Test
	public void testHorizontalWordFinderN15() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "thingsjkto";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN15
	
	
	@Test
	public void testHorizontalWordFinderN16() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "today";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN16
	
	
	@Test
	public void testHorizontalWordFinderN17() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "todaylmno";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN17
	
	
	@Test
	public void testHorizontalWordFinderN18() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "red";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN18
	
	
	@Test
	public void testHorizontalWordFinderN19() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "mno";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN19
	
	
	@Test
	public void testHorizontalWordFinderN20() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "abhelloctheredhowearefghithingsjktodaylmno";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN20
	
	
	@Test
	public void testHorizontalWordFinderN21() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "mnop";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN21
	
	
	@Test
	public void testHorizontalWordFinderN22() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "abhellod";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN22
	
	
	@Test
	public void testHorizontalWordFinderN23() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "abhellp";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN23
	
	
	@Test
	public void testHorizontalWordFinderN24() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "therd";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN24
	
	
	@Test
	public void testHorizontalWordFinderN25() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "abhelloctheredhowearefghithingsjktodaylmnop";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN25
	
	
	@Test
	public void testHorizontalWordFinderN26() {
		numberOfTests++;
		char[][] puzzle = {{'a', 'b', 'h', 'e', 'l', 'l', 'o'},
				   {'c', 't', 'h', 'e', 'r', 'e', 'd'},
				   {'h', 'o', 'w', 'e', 'a', 'r', 'e'},
				   {'f', 'g', 'h', 'i', 't', 'h', 'i'},
				   {'n', 'g', 's', 'j', 'k', 't', 'o'},
				   {'d', 'a', 'y', 'l', 'm', 'n', 'o'}};
		String word = "abhelloctheredhowearefghithingsjktodaylmnp";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN26
	
	
	@Test
	public void testHorizontalWordFinderN27() {
		numberOfTests++;
		char[][] puzzle =  {{'1', '2', '3', '4', '5'},
		       {'6', '7', '8', '9', '0'},
		       {'0', '9', '8', '7', '6'},
		       {'5', '4', '3', '2', '1'},
		       {'a', 'b', 'c', 'd', 'e'}};
		String word = "123";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN27
	
	
	@Test
	public void testHorizontalWordFinderN28() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
		       {'6', '7', '8', '9', '0'},
		       {'0', '9', '8', '7', '6'},
		       {'5', '4', '3', '2', '1'},
		       {'a', 'b', 'c', 'd', 'e'}};
		String word = "12345";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN28
	
	
	@Test
	public void testHorizontalWordFinderN29() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "1234567";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN29
	
	
	@Test
	public void testHorizontalWordFinderN30() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "567890";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN30
	
	
	@Test
	public void testHorizontalWordFinderN31() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "678900";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN31
	
	
	@Test
	public void testHorizontalWordFinderN32() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "00987";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN32
	
	
	@Test
	public void testHorizontalWordFinderN33() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "54321";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN33
	
	
	@Test
	public void testHorizontalWordFinderN34() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "654321";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN34
	
	
	@Test
	public void testHorizontalWordFinderN35() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "654321ab";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN35
	
	
	@Test
	public void testHorizontalWordFinderN36() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "abcde";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN36
	
	
	@Test
	public void testHorizontalWordFinderN37() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "de";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN37
	
	
	@Test
	public void testHorizontalWordFinderN38() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "12345678900987654321abcde";
		assertTrue(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN38
	
	
	@Test
	public void testHorizontalWordFinderN39() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "12345678900987654321abcdef";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN39
	
	
	@Test
	public void testHorizontalWordFinderN40() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "123457";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN40
	
	
	@Test
	public void testHorizontalWordFinderN41() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "125";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN41
	
	
	@Test
	public void testHorizontalWordFinderN42() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "abcdef";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN42
	
	
	@Test
	public void testHorizontalWordFinderN43() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "1abcdef";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN43
	
	
	@Test
	public void testHorizontalWordFinderN44() {
		numberOfTests++;
		char[][] puzzle = {{'1', '2', '3', '4', '5'},
			       {'6', '7', '8', '9', '0'},
			       {'0', '9', '8', '7', '6'},
			       {'5', '4', '3', '2', '1'},
			       {'a', 'b', 'c', 'd', 'e'}};
		String word = "def";
		assertFalse(RecursionProblems.horizontalWordFinder(puzzle, word));
		testsPassed++;
	} // testHorizontalWordFinderN44
}
