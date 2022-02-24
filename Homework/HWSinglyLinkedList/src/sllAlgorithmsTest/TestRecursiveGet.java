package sllAlgorithmsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;
import sllAlgorithms.RunAllTests;

public class TestRecursiveGet {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestRecursiveGet.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetN01() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		numberOfTests++;
		assertEquals((Integer)13, Algorithms.recursiveGet(0, list1.getFirst()));
		testsPassed++;
	} // testGetN01
	
	@Test
	public void testGetN02() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		numberOfTests++;
		assertEquals((Integer)13, Algorithms.recursiveGet(0, list1.getLast()));
		testsPassed++;
	} // testGetN02
	
	@Test
	public void testGetN03() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		numberOfTests++;
		assertEquals((Integer)13, Algorithms.recursiveGet(0, list1.getFirst()));
		testsPassed++;
	} // testGetN03
	
	@Test
	public void testGetN04() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		numberOfTests++;
		assertEquals((Integer)21, Algorithms.recursiveGet(1, list1.getFirst()));
		testsPassed++;
	} // testGetN04
	
	@Test
	public void testGetN05() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		numberOfTests++;
		assertEquals((Integer)89, Algorithms.recursiveGet(4, list1.getFirst()));
		testsPassed++;
	} // testGetN05
	
	@Test
	public void testGetN06() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		numberOfTests++;
		assertEquals((Integer)89, Algorithms.recursiveGet(0, list1.getLast()));
		testsPassed++;
	} // testGetN06

} // end class TestRecursiveGet
