package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestInsert {

	@Test
	public void testinsertN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insert(0, 6);
		assertEquals("[6]", list1.toString());
	} // testinsertN01
	
	@Test
	public void testinsertN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insert(0, 6);
		list1.insert(0, 2);
		assertEquals("[2, 6]", list1.toString());
	} // testinsertN02
	
	@Test
	public void testinsertN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insert(0, 6);
		list1.insert(0, 2);
		list1.insert(1, 7);
		assertEquals("[2, 7, 6]", list1.toString());
	} // testinsertN03
	
	@Test
	public void testinsertN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insert(0, 6);
		list1.insert(0, 2);
		list1.insert(1, 7);
		list1.insert(0, 8);
		assertEquals("[8, 2, 7, 6]", list1.toString());
	} // testinsertN04
	
	@Test
	public void testinsertN05() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insert(0, 6);
		list1.insert(0, 2);
		list1.insert(1, 7);
		list1.insert(0, 8);
		list1.insert(4, 9);
		assertEquals("[8, 2, 7, 6, 9]", list1.toString());
	} // testinsertN05
	
	@Test
	public void testinsertN06() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insert(0, 6);
		list1.insert(0, 2);
		list1.insert(1, 7);
		list1.insert(0, 8);
		list1.insert(4, 9);
		list1.insert(2, 31);
		assertEquals("[8, 2, 31, 7, 6, 9]", list1.toString());
	} // testinsertN06
	
} // end class TestInsert
