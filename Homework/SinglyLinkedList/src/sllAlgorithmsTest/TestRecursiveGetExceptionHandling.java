package sllAlgorithmsTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;
import sllAlgorithms.RunAllTests;

public class TestRecursiveGetExceptionHandling {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestRecursiveGetExceptionHandling.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetExceptionHandlingN01() {
		ILinkedList list1 = new SinglyLinkedList();
		
		numberOfTests++;
		try {
			Algorithms.recursiveGet(0, list1.getFirst());
		} catch (IndexOutOfBoundsException e) {
			testsPassed++;
		} // end try-catch		
	} // testGetExceptionHandlingN01
	
	@Test
	public void testGetExceptionHandlingN02() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		numberOfTests++;
		try {
			Algorithms.recursiveGet(-1, list1.getFirst());
		} catch (IndexOutOfBoundsException e) {
			testsPassed++;
		} // end try-catch	
	} // testGetExceptionHandlingN02
	
	@Test
	public void testGetExceptionHandlingN03() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		numberOfTests++;
		try {
			Algorithms.recursiveGet(5, list1.getFirst());
		} catch (IndexOutOfBoundsException e) {
			testsPassed++;
		} // end try-catch	
	} // testGetExceptionHandlingN03
	
	@Test
	public void testGetExceptionHandlingN04() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		numberOfTests++;
		try {
			Algorithms.recursiveGet(1, list1.getLast());
		} catch (IndexOutOfBoundsException e) {
			testsPassed++;
		} // end try-catch	
	} // testGetExceptionHandlingN04

} // end class TestRecursiveGetExceptionHandling
