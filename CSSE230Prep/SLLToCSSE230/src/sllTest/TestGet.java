package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestGet {

	@Test
	public void testGetN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		int originalSize = list1.size();
		
		assertEquals((Integer)89, list1.get(0));
		assertEquals(originalSize, list1.size());
		assertEquals("[89]", list1.toString());
	} // testGetN01
	
	@Test
	public void testGetN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.add(99);
		list1.add(109);
		list1.add(119);
		list1.add(129);
		int originalSize = list1.size();
		
		assertEquals((Integer)89, list1.get(0));
		assertEquals(originalSize, list1.size());
		assertEquals("[89, 99, 109, 119, 129]", list1.toString());
	} // testGetN02
	
	@Test
	public void testGetN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.add(99);
		list1.add(109);
		list1.add(119);
		list1.add(129);
		int originalSize = list1.size();
		
		assertEquals((Integer)109, list1.get(2));
		assertEquals(originalSize, list1.size());
		assertEquals("[89, 99, 109, 119, 129]", list1.toString());
	} // testGetN03
	
	@Test
	public void testGetN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.add(99);
		list1.add(109);
		list1.add(119);
		list1.add(129);
		int originalSize = list1.size();
		
		assertEquals((Integer)129, list1.get(4));
		assertEquals(originalSize, list1.size());
		assertEquals("[89, 99, 109, 119, 129]", list1.toString());
	} // testGetN04
	
} // end class testGet
