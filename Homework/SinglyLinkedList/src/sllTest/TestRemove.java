package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;

public class TestRemove {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestRemove.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testRemoveN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		numberOfTests++;
		assertEquals(false, list1.remove(17));
		testsPassed++;
	} // testRemoveN01
	
	@Test
	public void testRemoveN02() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		numberOfTests++;
		assertEquals(false, list1.remove(107));
		testsPassed++;
	} // testRemoveN02
	
	@Test
	public void testRemoveN03() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		numberOfTests++;
		assertEquals(true, list1.remove(89));
		testsPassed++;
	} // testRemoveN03
	
	@Test
	public void testRemoveN04() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.remove(89);
		numberOfTests++;
		assertEquals(null, list1.getFirst());
		testsPassed++;
	} // testRemoveN04
	
	@Test
	public void testRemoveN05() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.remove(89);
		numberOfTests++;
		assertEquals(null, list1.getLast());
		testsPassed++;
	} // testRemoveN05
	
	@Test
	public void testRemoveN06() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		numberOfTests++;
		assertEquals(true, list1.remove(81));
		assertEquals((Integer)(originalSize - 1), list1.size());
		assertEquals("[21, 71, 61, 91] first=[21] last=[91]", list1.toString());
		testsPassed++;
	} // testRemoveN06
	
	@Test
	public void testRemoveN07() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		numberOfTests++;
		assertEquals(true, list1.remove(71));
		assertEquals((Integer)(originalSize - 1), list1.size());
		assertEquals("[81, 21, 61, 91] first=[81] last=[91]", list1.toString());
		testsPassed++;
	} // testRemoveN07
	
	@Test
	public void testRemoveN08() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		numberOfTests++;
		assertEquals(true, list1.remove(91));
		assertEquals((Integer)(originalSize - 1), list1.size());
		assertEquals("[81, 21, 71, 61] first=[81] last=[61]", list1.toString());
		testsPassed++;
	} // testRemoveN08
	
	@Test
	public void testRemoveN09() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		numberOfTests++;
		assertEquals(false, list1.remove(200));
		assertEquals((Integer)originalSize, list1.size());
		assertEquals("[81, 21, 71, 61, 91] first=[81] last=[91]", list1.toString());
		testsPassed++;
	} // testRemoveN09
	
} // end class TestRemove
