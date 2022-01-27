package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;


public class TestContains {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestContains.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testContainsN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		numberOfTests++;
		assertEquals(false, list1.contains(17));
		testsPassed++;
	} // testContainsN01
	
	@Test
	public void testContainsN02() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add(89);		
		numberOfTests++;
		assertEquals(false, list1.contains(107));
		testsPassed++;
	} // testContainsN02
	
	@Test
	public void testContainsN03() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add(89);		
		numberOfTests++;
		assertEquals(true, list1.contains(89));
		testsPassed++;
	} // testContainsN03
	
	@Test
	public void testContainsN04() {
		ILinkedList list1 = new SinglyLinkedList();	
			
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(8));
		testsPassed++;
	} // testContainsN04
	
	@Test
	public void testContainsN05() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(2));
		testsPassed++;
	} // testContainsN05
	
	@Test
	public void testContainsN06() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(64));
		testsPassed++;
	} // testContainsN06
	
	@Test
	public void testContainsN07() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(9));
		testsPassed++;
	} // testContainsN07
	
	@Test
	public void testContainsN08() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(false, list1.contains(200));
		testsPassed++;
	} // testContainsN08
	
}
