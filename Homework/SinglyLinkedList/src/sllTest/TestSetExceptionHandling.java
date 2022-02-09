package sllTest;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;

public class TestSetExceptionHandling {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestSetExceptionHandling.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testSetExceptionN01() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		numberOfTests++;
		try {
			list1.set(1, 7);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
			testsPassed++;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testSetExceptionN01

	@Test
	public void testSetExceptionN02() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		numberOfTests++;	
		try {
			list1.set(-1, 46);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
			testsPassed++;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testSetExceptionN02

	@Test
	public void testSetExceptionN03() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		numberOfTests++;	
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(0, 7);
		list1.insertAtIndex(0, 8);
		try {
			list1.set(6, 10);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
			testsPassed++;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testSetExceptionN03

} // end class TestSetExceptionHandling
