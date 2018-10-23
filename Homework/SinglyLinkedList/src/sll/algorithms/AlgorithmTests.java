package sll.algorithms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sll.ILinkedList;
import sll.SinglyLinkedList;

public class AlgorithmTests {
	
	protected ILinkedList list1, list2, list3, list4;

	/**
	 * Sets up a few {@link SinglyLinkedList} instances to test the {@link SinglyLinkedList}
	 * class.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.list1 = new SinglyLinkedList();
		this.list2 = new SinglyLinkedList();
		this.list3 = new SinglyLinkedList();
		this.list4 = new SinglyLinkedList();
	}
	
	@Test
	public void testArraylistOf1s() {
		int[] t0 = {};
		assertEquals("[]", Algorithms.arraylistOf1s(t0).toString());
		int[] t1 = {1,2,3};
		assertEquals("[1] first=[1] last=[1]", Algorithms.arraylistOf1s(t1).toString());
		int[] t2 = {1,1000, 21111};
		assertEquals("[1, 1000] first=[1] last=[1000]", Algorithms.arraylistOf1s(t2).toString());
		int[] t3 = {21, 311, 4111};
		assertEquals("[]", Algorithms.arraylistOf1s(t3).toString());
	}

	@Test
	public void testInsertIntoSorted() {
		Algorithms.insertIntoSorted(this.list1, 1);
		assertEquals("[1] first=[1] last=[1]", this.list1.toString());
		Algorithms.insertIntoSorted(this.list1, -1);
		assertEquals("[-1, 1] first=[-1] last=[1]", this.list1.toString());
		Algorithms.insertIntoSorted(this.list1, 6);
		assertEquals("[-1, 1, 6] first=[-1] last=[6]", this.list1.toString());
		Algorithms.insertIntoSorted(this.list1, 4);
		assertEquals("[-1, 1, 4, 6] first=[-1] last=[6]", this.list1.toString());
	}

	@Test
	public void testRemoveLongNumbers() {
		Algorithms.removeLongNumbers(this.list1);
		assertEquals("[]", this.list1.toString());
		
		this.list2.add(1);
		this.list2.add(1000);
		this.list2.add(3);
		this.list2.add(99999);
		this.list2.add(999);
		Algorithms.removeLongNumbers(this.list2);
		assertEquals("[1, 3, 999] first=[1] last=[999]", this.list2.toString());

		this.list3.add(9);
		this.list3.add(999);
		this.list3.add(1000);
		this.list3.add(1001);
		this.list3.add(1);
		Algorithms.removeLongNumbers(this.list3);
		assertEquals("[9, 999, 1] first=[9] last=[1]", this.list3.toString());
	}
	
	@Test
	public void testCheckSorted(){
		assertEquals(true, Algorithms.checkSorted(this.list1));
		
		this.list2.add(0);
		assertEquals(true, Algorithms.checkSorted(this.list2));
		
		this.list3.add(0);
		this.list3.add(1);
		assertEquals(true, Algorithms.checkSorted(this.list3));
		
		this.list4 = new SinglyLinkedList();
		this.list4.add(0);
		this.list4.add(-1);
		assertEquals(false, Algorithms.checkSorted(this.list4));
	}
	
	@Test
	public void testDoubleList(){
		Algorithms.doubleList(this.list1);
		assertEquals("[]", this.list1.toString());
		
		this.list2.add(0);
		Algorithms.doubleList(this.list2);
		assertEquals("[0, 0] first=[0] last=[0]", this.list2.toString());
		
		this.list3.add(0);
		this.list3.add(1);
		Algorithms.doubleList(this.list3);
		assertEquals("[0, 0, 1, 1] first=[0] last=[1]", this.list3.toString());
	}
	
	@Test
	public void testFibSequence(){
		assertFalse(Algorithms.isFibonacciSequence(this.list1));
		
		this.list2.add(0);
		this.list2.add(1);
		assertFalse(Algorithms.isFibonacciSequence(this.list2));
		
		this.list3.add(1);
		this.list3.add(1);
		this.list3.add(2);
		assertTrue(Algorithms.isFibonacciSequence(this.list3));
		this.list3.add(3);
		this.list3.add(5);
		this.list3.add(9);
		assertFalse(Algorithms.isFibonacciSequence(this.list3));
		
		this.list4.add(1);
		this.list4.add(4);
		this.list4.add(5);
		this.list4.add(9);
		this.list4.add(14);
		assertTrue(Algorithms.isFibonacciSequence(this.list4));
	}
	
	/**
	 * Tests the {@link SinglyLinkedList#get(int)} method. This method assumes that
	 * {@link SinglyLinkedList#add(Object)} and {@link SinglyLinkedList#add(int, Object)}
	 * work.
	 */
	@Test
	public void testGet() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		this.list1.add(7);
		assertEquals(new Integer(2), Algorithms.recursiveGet(1, this.list1.getFirst()));
		assertEquals(new Integer(7), Algorithms.recursiveGet(2, this.list1.getFirst()));
	}

	/**
	 * Tests the {@link SinglyLinkedList#get(int)} method for a bad case. This method
	 * assumes that {@link SinglyLinkedList#add(Object)} and
	 * {@link SinglyLinkedList#add(int, Object)} work.
	 * 
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetBad1() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		this.list1.add(7);
		Algorithms.recursiveGet(-3, list1.getFirst()); // throws IndexOutOfBoundsException
	}

	/**
	 * Tests the {@link SinglyLinkedList#get(int)} method for another bad case. This
	 * method assumes that {@link SinglyLinkedList#add(Object)} and
	 * {@link SinglyLinkedList#add(int, Object)} work.
	 * 
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetBad2() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		this.list1.add(7);
		Algorithms.recursiveGet(-8, list1.getFirst()); // throws IndexOutOfBoundsException
	}

	/**
	 * Tests the {@link SinglyLinkedList#get(int)} method for yet another bad case.
	 * This method assumes that {@link SinglyLinkedList#add(Object)} and
	 * {@link SinglyLinkedList#add(int, Object)} work.
	 * 
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetBad3() {
		Algorithms.recursiveGet(0, list1.getFirst()); // throws IndexOutOfBoundsException
	}

}
