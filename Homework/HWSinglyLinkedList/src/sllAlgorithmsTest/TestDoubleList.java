package sllAlgorithmsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;
import sllAlgorithms.RunAllTests;

public class TestDoubleList {	

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestDoubleList.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testDoubleListN01(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.doubleList(list1);
		numberOfTests++;
		assertEquals("[]", list1.toString());
		testsPassed++;
	} // testDoubleListN01
	
	@Test
	public void testDoubleListN02(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(0);
		Algorithms.doubleList(list1);
		numberOfTests++;
		assertNotEquals("Tail node is not set", null, list1.getLast());
		assertEquals("Tail node is the wrong one", null, list1.getLast().getNext());
		assertEquals("[0, 0] first=[0] last=[0]", list1.toString());
		testsPassed++;
	} // testDoubleListN02

	@Test
	public void testDoubleListN03(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(0);
		list1.add(1);
		Algorithms.doubleList(list1);
		numberOfTests++;
		assertEquals("[0, 0, 1, 1] first=[0] last=[1]", list1.toString());
		testsPassed++;
	} // testDoubleListN03
	
	@Test
	public void testDoubleListN04(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(-1);
		list1.add(0);
		list1.add(1);
		Algorithms.doubleList(list1);
		numberOfTests++;
		assertEquals("[-1, -1, 0, 0, 1, 1] first=[-1] last=[1]", list1.toString());
		testsPassed++;
	} // testDoubleListN04
	
} // end class TestDoubleList
