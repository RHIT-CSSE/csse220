package recursionTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import recursion.RunAllTests;
import recursion.RecursionProblems;

public class TestAlmostEquals {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAlmostEquals.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testAlmostEqualsN01() {
		numberOfTests++;
		String input1 = "Hello";
		assertTrue(RecursionProblems.almostEquals(input1, input1, 0));
		testsPassed++;
	} // testAlmostEqualsN01


	@Test
	public void testAlmostEqualsN02() {
		numberOfTests++;
		String input1 = "Hello";
		String input2 = "hello";
		assertFalse(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN02

	@Test
	public void testAlmostEqualsN03() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "12345";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN03

	@Test
	public void testAlmostEqualsN04() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "1234";
		assertFalse(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN04

	@Test
	public void testAlmostEqualsN05() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "123456";
		assertFalse(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN05

	@Test
	public void testAlmostEqualsN06() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4d";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN06

	@Test
	public void testAlmostEqualsN07() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4";
		assertFalse(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN07

	@Test
	public void testAlmostEqualsN08() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4d5";
		assertFalse(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN08

	@Test
	public void testAlmostEqualsN09() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN09

	@Test
	public void testAlmostEqualsN10() {
		numberOfTests++;
		String input1 = "";
		String input2 = "a";
		assertFalse(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN10
	
	
	@Test
	public void testAlmostEqualsN11() {
		numberOfTests++;
		String input1 = "1";
		String input2 = "";
		assertFalse(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN11
	
	
	@Test
	public void testAlmostEqualsN12() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertTrue(RecursionProblems.almostEquals(input1, input2, 0));
		testsPassed++;
	} // testAlmostEqualsN12
	
	@Test
	public void testAlmostEqualsN13() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertFalse(RecursionProblems.almostEquals(input1, (input2+'a'), 0));
		testsPassed++;
	} // testAlmostEqualsN13
	
	
	@Test
	public void testAlmostEqualsN14() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input3 = letter + input3;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertFalse(RecursionProblems.almostEquals(input1, input3, 0));
		testsPassed++;
	} // testAlmostEqualsN14
	
	
	@Test
	public void testAlmostEqualsN15() {
		numberOfTests++;
		String input1 = "Hello";
		assertTrue(RecursionProblems.almostEquals(input1, input1, 1));
		testsPassed++;
	} // testAlmostEqualsN15
	
	
	@Test
	public void testAlmostEqualsN17() {
		numberOfTests++;
		String input1 = "Hello";
		String input2 = "hello";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN17
	
	
	@Test
	public void testAlmostEqualsN18() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "12345";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN18
	
	
	@Test
	public void testAlmostEqualsN19() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "1234";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN19
	
	
	@Test
	public void testAlmostEqualsN20() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "123456";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN20
	
	
	@Test
	public void testAlmostEqualsN21() {
		numberOfTests++;
		String input1 = "12345";
		String input2 = "12z45";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN21
	
	
	@Test
	public void testAlmostEqualsN22() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4d";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN22
	
	
	@Test
	public void testAlmostEqualsN23() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN23
	
	
	@Test
	public void testAlmostEqualsN24() {
		numberOfTests++;
		String input1 = "1a2b3c4d";
		String input2 = "1a2b3c4d5";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN24
	
	
	@Test
	public void testAlmostEqualsN25() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN25
	
	
	@Test
	public void testAlmostEqualsN26() {
		numberOfTests++;
		String input1 = "";
		String input2 = "a";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN26
	
	
	@Test
	public void testAlmostEqualsN27() {
		numberOfTests++;
		String input1 = "1";
		String input2 = "";
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN27
	
	
	@Test
	public void testAlmostEqualsN28() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertTrue(RecursionProblems.almostEquals(input1, input2, 1));
		testsPassed++;
	} // testAlmostEqualsN28
	
	
	@Test
	public void testAlmostEqualsN29() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertTrue(RecursionProblems.almostEquals(input1, (input2+'a'), 1));
		testsPassed++;
	} // testAlmostEqualsN29
	
	
	@Test
	public void testAlmostEqualsN30() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input3 = letter + input3;
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		assertFalse(RecursionProblems.almostEquals(input1, input3, 1));
		testsPassed++;
	} // testAlmostEqualsN30
	
	
	@Test
	public void testAlmostEqualsN31() {
		numberOfTests++;
		String input1 = "abcdefg";
		String input2 = "abzdxfg"; 
		int threshold = 2;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN31
	
	
	@Test
	public void testAlmostEqualsN32() {
		numberOfTests++;
		String input1 = "abzdxfg";
		String input2 = "abcdefg";
		int threshold = 2;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN32
	
	
	@Test
	public void testAlmostEqualsN33() {
		numberOfTests++;
		String input1 = "1234567"; 
		String input2 = "abc4567"; 
		int threshold = 4;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN33
	
	
	@Test
	public void testAlmostEqualsN34() {
		numberOfTests++;
		String input1 = "abc4567";
		String input2 = "1234567";
		int threshold = 4;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN34
	
	
	@Test
	public void testAlmostEqualsN35() {
		numberOfTests++;
		String input1 = "hello there"; 
		String input2 = "hello again"; 
		int threshold = 5;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN35
	
	
	@Test
	public void testAlmostEqualsN36() {
		numberOfTests++;
		String input2 = "hello there"; 
		String input1 = "hello again";
		int threshold = 5;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN36
	
	
	@Test
	public void testAlmostEqualsN37() {
		numberOfTests++;
		String input1 = "abcdef"; 
		String input2 = "abc"; 
		int threshold = 3;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN37
	
	
	@Test
	public void testAlmostEqualsN38() {
		numberOfTests++;
		String input2 = "abcdef"; 
		String input1 = "abc";
		int threshold = 3;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN38
	
	
	@Test
	public void testAlmostEqualsN39() {
		numberOfTests++;
		String input1 = "ab"; 
		String input2 = "abcdefgh"; 
		int threshold = 6;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN39
	
	
	@Test
	public void testAlmostEqualsN40() {
		numberOfTests++;
		String input2 = "ab"; 
		String input1 = "abcdefgh";
		int threshold = 6;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN40
	
	
	@Test
	public void testAlmostEqualsN41() {
		numberOfTests++;
		String input1 = ""; 
		String input2 = "abc";
		int threshold = 3;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN41
	
	
	@Test
	public void testAlmostEqualsN42() {
		numberOfTests++;
		String input2 = ""; 
		String input1 = "abc";
		int threshold = 3;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN42
	
	
	@Test
	public void testAlmostEqualsN43() {
		numberOfTests++;
		String input1 = "1234"; 
		String input2 = ""; 
		int threshold = 4; 
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN43
	
	
	@Test
	public void testAlmostEqualsN44() {
		numberOfTests++;
		String input2 = "1234"; 
		String input1 = "";
		int threshold = 4;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN44
	
	
	@Test
	public void testAlmostEqualsN45() {
		numberOfTests++;
		String input1 = "abcdef"; 
		String input2 = "zzcdef"; 
		int threshold = 1;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN45
	
	
	@Test
	public void testAlmostEqualsN46() {
		numberOfTests++;
		String input1 = "abcdef"; 
		String input2 = "zzcdef"; 
		int threshold = 2;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN46
	
	
	@Test
	public void testAlmostEqualsN47() {
		numberOfTests++;
		String input2 = "abcdef"; 
		String input1 = "zzcdef";
		int threshold = 1;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN47
	
	
	@Test
	public void testAlmostEqualsN48() {
		numberOfTests++;
		String input2 = "abcdef"; 
		String input1 = "zzcdef";
		int threshold = 2;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN48
	
	
	@Test
	public void testAlmostEqualsN49() {
		numberOfTests++;
		String input1 = "1234567"; 
		String input2 = "1234abc"; 
		int threshold = 2; 
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN49
	
	@Test
	public void testAlmostEqualsN50() {
		numberOfTests++;
		String input1 = "1234567"; 
		String input2 = "1234abc"; 
		int threshold = 3;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN50
	
	
	@Test
	public void testAlmostEqualsN51() {
		numberOfTests++;
		String input2 = "1234567"; 
		String input1 = "1234abc";
		int threshold = 2;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN51
	
	
	@Test
	public void testAlmostEqualsN52() {
		numberOfTests++;
		String input2 = "1234567"; 
		String input1 = "1234abc";
		int threshold = 3;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN52
	
	
	@Test
	public void testAlmostEqualsN53() {
		numberOfTests++;
		String input1 = "abc"; 
		String input2 = "abcdefg"; 
		int threshold = 3;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN53
	
	
	@Test
	public void testAlmostEqualsN54() {
		numberOfTests++;
		String input1 = "abc"; 
		String input2 = "abcdefg";
		int threshold = 4;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN54
	
	
	@Test
	public void testAlmostEqualsN55() {
		numberOfTests++;
		String input2 = "abc"; 
		String input1 = "abcdefg";
		int threshold = 3;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN55
	
	
	@Test
	public void testAlmostEqualsN56() {
		numberOfTests++;
		String input2 = "abc"; 
		String input1 = "abcdefg";
		int threshold = 4;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN56
	
	
	@Test
	public void testAlmostEqualsN57() {
		numberOfTests++;
		String input1 = "1234567"; 
		String input2 = "123"; 
		int threshold = 3;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN57
	
	
	@Test
	public void testAlmostEqualsN58() {
		numberOfTests++;
		String input1 = "1234567"; 
		String input2 = "123";
		int threshold = 4;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN58
	
	
	@Test
	public void testAlmostEqualsN59() {
		numberOfTests++;
		String input2 = "1234567"; 
		String input1 = "123";
		int threshold = 3;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN59
	
	
	@Test
	public void testAlmostEqualsN60() {
		numberOfTests++;
		String input2 = "1234567"; 
		String input1 = "123";
		int threshold = 4;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN60
	
	
	@Test
	public void testAlmostEqualsN61() {
		numberOfTests++;
		String input1 = "hello"; 
		String input2 = "there"; 
		int threshold = 4;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN61
	
	
	@Test
	public void testAlmostEqualsN62() {
		numberOfTests++;
		String input1 = "hello"; 
		String input2 = "there"; 
		int threshold = 5;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN62
	
	
	@Test
	public void testAlmostEqualsN63() {
		numberOfTests++;
		String input2 = "hello"; 
		String input1 = "there";
		int threshold = 4;
		assertFalse(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN63
	
	
	@Test
	public void testAlmostEqualsN64() {
		numberOfTests++;
		String input2 = "hello"; 
		String input1 = "there";
		int threshold = 5;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN64
	
	
	@Test
	public void testAlmostEqualsN65() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 0;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN65
	
	
	@Test
	public void testAlmostEqualsN66() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			if(i%2==0)
				input3 += letter;
			else
				input3 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 0;
		assertFalse(RecursionProblems.almostEquals(input1, input3, threshold));
		testsPassed++;
	} // testAlmostEqualsN66
	
	
	@Test
	public void testAlmostEqualsN67() {
		numberOfTests++;
		String input1 = "";
		String input2 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input2 += letter;
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 1;
		assertTrue(RecursionProblems.almostEquals(input1, input2, threshold));
		testsPassed++;
	} // testAlmostEqualsN67
	
	
	@Test
	public void testAlmostEqualsN68() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			if(i%2==0)
				input3 += letter;
			else
				input3 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 1;
		assertFalse(RecursionProblems.almostEquals(input1, input3, threshold));
		testsPassed++;
	} // testAlmostEqualsN68
	
	
	@Test
	public void testAlmostEqualsN69() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			if(i%2==0)
				input3 += letter;
			else
				input3 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 250;
		assertTrue(RecursionProblems.almostEquals(input1, input3, threshold));
		testsPassed++;
	} // testAlmostEqualsN69
	
	
	@Test
	public void testAlmostEqualsN70() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			if(i%2==0)
				input3 += letter;
			else
				input3 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 249;
		assertFalse(RecursionProblems.almostEquals(input1, input3, threshold));
		testsPassed++;
	} // testAlmostEqualsN70
	
	
	@Test
	public void testAlmostEqualsN71() {
		numberOfTests++;
		String input1 = "";
		String input3 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			if(i%2==0)
				input3 += letter;
			else
				input3 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 0;
		assertFalse(RecursionProblems.almostEquals(input1, input3, threshold));
		testsPassed++;
	} // testAlmostEqualsN71
	
	
	@Test
	public void testAlmostEqualsN72() {
		numberOfTests++;
		String input1 = "";
		String input4 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input4 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 500;
		assertTrue(RecursionProblems.almostEquals(input1, input4, threshold));
		testsPassed++;
	} // testAlmostEqualsN72
	
	
	@Test
	public void testAlmostEqualsN73() {
		numberOfTests++;
		String input1 = "";
		String input4 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input4 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 499;
		assertFalse(RecursionProblems.almostEquals(input1, input4, threshold));
		testsPassed++;
	} // testAlmostEqualsN73
	
	
	@Test
	public void testAlmostEqualsN74() {
		numberOfTests++;
		String input1 = "";
		String input4 = "";
		char letter = 'a';
		for(int i = 0; i < 500; i++) {
			input1 += letter;
			input4 += (letter<'z')?(char)(letter+1):'a';
			
			if(letter < 'z')
				letter++;
			else
				letter = 'a';
		}
		
		int threshold = 0;
		assertFalse(RecursionProblems.almostEquals(input1, input4, threshold));
		testsPassed++;
	} // testAlmostEqualsN74
}
