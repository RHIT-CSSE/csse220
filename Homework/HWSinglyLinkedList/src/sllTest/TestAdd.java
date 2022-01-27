package sllTest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.RunAllTests;
import sll.ILinkedList;
import sll.SinglyLinkedList;

public class TestAdd {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAdd.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testAddN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		numberOfTests++;
		assertEquals("[]", list1.toString());
		testsPassed++;
	} // testAddN01
	
	@Test
	public void testAddN02() {
		ILinkedList list2 = new SinglyLinkedList();
		
		numberOfTests++;
		list2.add(5);
		assertEquals("[5] first=[5] last=[5]", list2.toString());
		testsPassed++;
	} // testAddN02
	
	@Test
	public void testAddN03() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(2);
		list1.add(6);
		numberOfTests++;
		assertEquals("[2, 6] first=[2] last=[6]", list1.toString());
		testsPassed++;
	} // testAddN03
	
	@Test
	public void testAddN04() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(2);
		list1.add(6);
		list1.add(7);
		numberOfTests++;
		assertEquals("[2, 6, 7] first=[2] last=[7]", list1.toString());
		testsPassed++;
	} // testAddN04
	
} // end class TestAdd
