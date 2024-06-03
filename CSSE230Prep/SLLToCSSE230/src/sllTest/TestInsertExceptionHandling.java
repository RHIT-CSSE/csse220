package sllTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestInsertExceptionHandling {


	@Test
	public void testInsertAtExceptionN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.insert(1, 7);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN01

	@Test
	public void testInsertAtExceptionN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.insert(-1, 46);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN02

	@Test
	public void testInsertAtExceptionN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		list1.insert(0, 6);
		list1.insert(0, 2);
		list1.insert(0, 7);
		list1.insert(0, 8);
		try {
			list1.insert(6, 10);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN03

} // end class TestInsertAtExceptionHandling
