package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;


public class TestIndexOf {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestIndexOf.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testIndexOfN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		numberOfTests++;
		assertEquals(-1, list1.indexOf(17));
		testsPassed++;
	} // testIndexOfN01
	
	@Test
	public void testIndexOfN02() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add(89);		
		numberOfTests++;
		assertEquals(-1, list1.indexOf(107));
		testsPassed++;
	} // testIndexOfN02
	
	@Test
	public void testIndexOfN03() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add(89);		
		numberOfTests++;
		assertEquals(0, list1.indexOf(89));
		testsPassed++;
	} // testIndexOfN03
	
	@Test
	public void testIndexOfN04() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(0, list1.indexOf(8));
		testsPassed++;
	} // testIndexOfN04
	
	@Test
	public void testIndexOfN05() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(1, list1.indexOf(2));
		testsPassed++;
	} // testIndexOfN05
	
	@Test
	public void testIndexOfN06() {
		ILinkedList list1 = new SinglyLinkedList();	
			
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(3, list1.indexOf(64));
		testsPassed++;
	} // testIndexOfN06
	
	@Test
	public void testIndexOfN07() {
		ILinkedList list1 = new SinglyLinkedList();	
			
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(4, list1.indexOf(9));
		testsPassed++;
	} // testIndexOfN07
	
	@Test
	public void testIndexOfN08() {
		ILinkedList list1 = new SinglyLinkedList();	
			
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		numberOfTests++;
		assertEquals(-1, list1.indexOf(200));
		testsPassed++;
	} // testIndexOfN08
	
} // end class TestIndexOf
