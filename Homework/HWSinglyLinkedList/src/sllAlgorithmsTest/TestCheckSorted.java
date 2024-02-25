package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;

@RunWith(RunAllTestsTestRunner.class)
public class TestCheckSorted {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testCheckSortedN01(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		assertEquals(true, Algorithms.checkSorted(list1));
	} // testCheckSortedN01
	
	@Test
	public void testCheckSortedN02(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(Integer.MAX_VALUE);
		assertEquals(true, Algorithms.checkSorted(list1));
	} // testCheckSortedN02
	
	@Test
	public void testCheckSortedN03(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(Integer.MIN_VALUE);
		list1.add(Integer.MAX_VALUE);
		assertEquals(true, Algorithms.checkSorted(list1));
	} // testCheckSortedN03
	
	@Test
	public void testCheckSortedN04(){
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(Integer.MAX_VALUE);
		list1.add(Integer.MIN_VALUE);
		assertEquals(false, Algorithms.checkSorted(list1));
	} // testCheckSortedN04
	
	@Test
	public void testCheckSortedN05() {
		final int maxSize = 101;
		ILinkedList list1 = new SinglyLinkedList();

		for (int k = 5, z = maxSize; k < z; k += 5) {
			list1.add(k);
		} // end for

		assertEquals(true, Algorithms.checkSorted(list1));
	} // testCheckSortedN05
	
	@Test
	public void testCheckSortedN06() {
		final int maxSize = 101;
		ILinkedList list1 = new SinglyLinkedList();

		for (int k = 5, z = maxSize; k < z; k += 5) {
			list1.add(k);
		} // end for
		list1.add(Integer.MIN_VALUE);

		assertEquals(false, Algorithms.checkSorted(list1));
	} // testCheckSortedN06	

} // end class TestCheckSorted
