package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;

@RunWith(RunAllTestsTestRunner.class)
public class TestRemoveLongNumbers {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testRemoveLongNumbersN01() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.removeLongNumbers(list1);
		assertEquals("[]", list1.toString());
	} // testRemoveLongNumbersN01
	
	@Test
	public void testRemoveLongNumbersN02() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(Integer.MIN_VALUE);
		String expectedResult = "[]";		
		Algorithms.removeLongNumbers(list1);

		assertEquals("First node should be null", null, list1.getFirst());
		assertEquals("Last node should be null", null, list1.getLast());
		assertEquals(expectedResult, list1.toString());
	} // testRemoveLongNumbersN02
	
	@Test
	public void testRemoveLongNumbersN03() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(Integer.MAX_VALUE);
		Algorithms.removeLongNumbers(list1);
		assertEquals("[]", list1.toString());
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
		assertEquals("[1, 3, 999] first=[1] last=[999]", list2.toString());
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
		assertEquals("[1, 3] first=[1] last=[3]", list2.toString());
	} // testRemoveLongNumbersN05
	
	@Test
	public void testRemoveLongNumbersN06() {
		ILinkedList list1 = new SinglyLinkedList();

		
		list1.add(-1);
		list1.add(Integer.MIN_VALUE);
		list1.add(-2);
		String expectedResult = "[-1, -2] first=[-1] last=[-2]";
				
		Algorithms.removeLongNumbers(list1);
		assertEquals(expectedResult, list1.toString());
	}
	
	@Test
	public void testRemoveLongNumbersN07() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(999);
		list1.add(1000);
		String expectedResult = "[999] first=[999] last=[999]";
				
		Algorithms.removeLongNumbers(list1);
		assertEquals(expectedResult, list1.toString());
	}
	
	@Test
	public void testRemoveLongNumbersN08() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(-1000);
		list1.add(-999);
		String expectedResult = "[-999] first=[-999] last=[-999]";
				
		Algorithms.removeLongNumbers(list1);
		assertEquals(expectedResult, list1.toString());
	}
	
} // end class TestRemoveLongNumbers







