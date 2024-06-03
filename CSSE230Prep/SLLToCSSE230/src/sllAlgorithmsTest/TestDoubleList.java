package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)
public class TestDoubleList {	

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testDoubleListN01(){
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.doubleEachNode();
		assertEquals("[]", list1.toString());
	} // testDoubleListN01
	
	@Test
	public void testDoubleListN02(){
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(0);
		list1.doubleEachNode();
		assertEquals("[0, 0]", list1.toString());
	} // testDoubleListN02

	@Test
	public void testDoubleListN03(){
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(0);
		list1.add(1);
		list1.doubleEachNode();
		assertEquals("[0, 0, 1, 1]", list1.toString());
	} // testDoubleListN03
	
	@Test
	public void testDoubleListN04(){
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(-5);
		list1.add(0);
		list1.add(1);
		list1.doubleEachNode();
		assertEquals("[-5, -5, 0, 0, 1, 1]", list1.toString());
	} // testDoubleListN04
	
} // end class TestDoubleList
