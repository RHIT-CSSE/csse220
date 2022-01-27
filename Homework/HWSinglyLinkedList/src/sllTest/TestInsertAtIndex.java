package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;

public class TestInsertAtIndex {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestInsertAtIndex.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testInsertAtIndexN01() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		numberOfTests++;
		assertEquals("[6] first=[6] last=[6]", list1.toString());
		testsPassed++;
	} // testInsertAtIndexN01
	
	@Test
	public void testInsertAtIndexN02() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		numberOfTests++;
		assertEquals("[2, 6] first=[2] last=[6]", list1.toString());
		testsPassed++;
	} // testInsertAtIndexN02
	
	@Test
	public void testInsertAtIndexN03() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		numberOfTests++;
		assertEquals("[2, 7, 6] first=[2] last=[6]", list1.toString());
		testsPassed++;
	} // testInsertAtIndexN03
	
	@Test
	public void testInsertAtIndexN04() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		list1.insertAtIndex(0, 8);
		numberOfTests++;
		assertEquals("[8, 2, 7, 6] first=[8] last=[6]", list1.toString());
		testsPassed++;
	} // testInsertAtIndexN04
	
	@Test
	public void testInsertAtIndexN05() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		list1.insertAtIndex(0, 8);
		list1.insertAtIndex(4, 9);
		numberOfTests++;
		assertEquals("[8, 2, 7, 6, 9] first=[8] last=[9]", list1.toString());
		testsPassed++;
	} // testInsertAtIndexN05
	
	@Test
	public void testInsertAtIndexN06() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		list1.insertAtIndex(0, 8);
		list1.insertAtIndex(4, 9);
		list1.insertAtIndex(2, 31);
		numberOfTests++;
		assertEquals("[8, 2, 31, 7, 6, 9] first=[8] last=[9]", list1.toString());
		testsPassed++;
	} // testInsertAtIndexN06
	
} // end class TestInsertAtIndex
