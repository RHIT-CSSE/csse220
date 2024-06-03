package sllTest;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestGetExceptionHandling {

	@Test
	public void testGetExceptionN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.get(1);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testGetExceptionN01

	@Test
	public void testGetExceptionN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.get(-1);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testGetExceptionN02

	@Test
	public void testGetExceptionN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		list1.insert(0, 6);
		list1.insert(0, 2);
		list1.insert(0, 7);
		list1.insert(0, 8);
		try {
			list1.get(6);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testGetExceptionN03

} // end class testGetExceptionHandling
