package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;

public class TestDoubleList {	

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testDoubleListN01(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.doubleList(list1);
		assertEquals("[]", list1.toString());
	} // testDoubleListN01
	
	@Test
	public void testDoubleListN02(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(0);
		Algorithms.doubleList(list1);
		assertNotEquals("Tail node is not set", null, list1.getLast());
		assertEquals("Tail node is the wrong one", null, list1.getLast().getNext());
		assertEquals("[0, 0] first=[0] last=[0]", list1.toString());
	} // testDoubleListN02

	@Test
	public void testDoubleListN03(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(0);
		list1.add(1);
		Algorithms.doubleList(list1);
		assertEquals("[0, 0, 1, 1] first=[0] last=[1]", list1.toString());
	} // testDoubleListN03
	
	@Test
	public void testDoubleListN04(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(-5);
		list1.add(0);
		list1.add(1);
		Algorithms.doubleList(list1);
		assertEquals("[-5, -5, 0, 0, 1, 1] first=[-5] last=[1]", list1.toString());
	} // testDoubleListN04
	
} // end class TestDoubleList
