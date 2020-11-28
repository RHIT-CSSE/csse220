package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;
import sllAlgorithms.RunAllTests;

public class TestRemoveLongNumbers {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestRemoveLongNumbers.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testRemoveLongNumbersN01() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.removeLongNumbers(list1);
		numberOfTests++;
		assertEquals("[]", list1.toString());
		testsPassed++;
	} // testRemoveLongNumbersN01
	
	@Test
	public void testRemoveLongNumbersN02() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(Integer.MIN_VALUE);
		String expectedResult = "[" + Integer.MIN_VALUE + "] first=[" + Integer.MIN_VALUE + "] last=[" + Integer.MIN_VALUE + "]";
		Algorithms.removeLongNumbers(list1);
		numberOfTests++;
		assertEquals(expectedResult, list1.toString());
		testsPassed++;
	} // testRemoveLongNumbersN02
	
	@Test
	public void testRemoveLongNumbersN03() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(Integer.MAX_VALUE);
		Algorithms.removeLongNumbers(list1);
		numberOfTests++;
		assertEquals("[]", list1.toString());
		testsPassed++;
	} // testRemoveLongNumbersN03
	
	@Test
	public void testRemoveLongNumbersN04() {
		ILinkedList list2 = new SinglyLinkedList();
		
		list2.add(1);
		list2.add(1000);
		list2.add(3);
		list2.add(99999);
		list2.add(999);
		Algorithms.removeLongNumbers(list2);
		numberOfTests++;
		assertEquals("[1, 3, 999] first=[1] last=[999]", list2.toString());
		testsPassed++;
	} // testRemoveLongNumbersN04
	
	@Test
	public void testRemoveLongNumbersN05() {
		ILinkedList list2 = new SinglyLinkedList();
		
		list2.add(1000);
		list2.add(1);
		list2.add(99999);
		list2.add(3);
		list2.add(Integer.MAX_VALUE);
		Algorithms.removeLongNumbers(list2);
		numberOfTests++;
		assertEquals("[1, 3] first=[1] last=[3]", list2.toString());
		testsPassed++;
	} // testRemoveLongNumbersN05
	
} // end class TestRemoveLongNumbers







