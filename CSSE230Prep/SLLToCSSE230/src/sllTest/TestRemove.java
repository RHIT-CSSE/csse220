package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestRemove {

	@Test
	public void testRemoveN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		assertEquals(false, list1.remove(17));
	} // testRemoveN01
	
	@Test
	public void testRemoveN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		assertEquals(false, list1.remove(107));
	} // testRemoveN02
	
	@Test
	public void testRemoveN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		assertEquals(true, list1.remove(89));
	} // testRemoveN03
	
	@Test
	public void testRemoveN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.remove(89);
		assertEquals((0), list1.size());
		assertEquals("[]", list1.toString());
	} // testRemoveN04
	
	@Test
	public void testRemoveN05() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(true, list1.remove(81));
		assertEquals((originalSize - 1), list1.size());
		assertEquals("[21, 71, 61, 91]", list1.toString());
	} // testRemoveN05
	
	@Test
	public void testRemoveN06() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(true, list1.remove(71));
		assertEquals((originalSize - 1), list1.size());
		assertEquals("[81, 21, 61, 91]", list1.toString());
	} // testRemoveN06
	
	@Test
	public void testRemoveN07() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(true, list1.remove(91));
		assertEquals((originalSize - 1), list1.size());
		assertEquals("[81, 21, 71, 61]", list1.toString());
	} // testRemoveN07
	
	@Test
	public void testRemoveN08() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(false, list1.remove(200));
		assertEquals(originalSize, list1.size());
		assertEquals("[81, 21, 71, 61, 91]", list1.toString());
	} // testRemoveN08
	
} // end class TestRemove
