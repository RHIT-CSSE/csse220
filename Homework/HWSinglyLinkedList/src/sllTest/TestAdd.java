package sllTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)
public class TestAdd {

	@Test
	public void testAddN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		assertEquals("[]", list1.toString());
	} // testAddN01
	
	@Test
	public void testAddN02() {
		ILinkedList list2 = new SinglyLinkedList();
		
		list2.add(5);
		assertEquals("[5] first=[5] last=[5]", list2.toString());
	} // testAddN02
	
	@Test
	public void testAddN03() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(2);
		list1.add(6);
		assertEquals("[2, 6] first=[2] last=[6]", list1.toString());
	} // testAddN03
	
	@Test
	public void testAddN04() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(2);
		list1.add(6);
		list1.add(7);
		assertEquals("[2, 6, 7] first=[2] last=[7]", list1.toString());
	} // testAddN04
	
} // end class TestAdd
