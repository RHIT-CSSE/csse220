package sll;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This is a collection of test cases for the {@link LinkedListAlgorithms} class
 * 
 * @author defoe. Created Nov 12, 2013.
 */
public class LinkedListAlgorithmsTest {

	private LinkedListAlgorithms alg;
	private LinkedList<Integer> list1;
	private LinkedList<Integer> list2;

	/**
	 * Creates a {@link LinkedListAlgorithms} object and a few
	 * {@link LinkedList} objects.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.alg = new LinkedListAlgorithms();
		this.list1 = new LinkedList<Integer>();
		this.list2 = new LinkedList<Integer>();
	}

	/**
	 * Tests the
	 * {@link LinkedListAlgorithms#findLastIndexOf(Integer, LinkedList)} method.
	 * 
	 */
	@Test
	public void testfindLastIndexOf() {
		assertEquals(-1, this.alg.findLastIndexOf(5, this.list1));
		this.list1.add(5);
		assertEquals(0, this.alg.findLastIndexOf(5, this.list1));
		this.list1.add(2);
		this.list1.add(5);
		assertEquals(2, this.alg.findLastIndexOf(5, this.list1));
	}

	/**
	 * Tests the
	 * {@link LinkedListAlgorithms#insertInSortedList(Integer, LinkedList)}
	 * method.
	 * 
	 */
	@Test
	public void testinsertInSortedList() {

		this.alg.insertInSortedList(5, this.list1);
		assertEquals("[5]", this.list1.toString());
		this.alg.insertInSortedList(2, this.list1);
		assertEquals("[2, 5]", this.list1.toString());
		this.alg.insertInSortedList(6, this.list1);
		assertEquals("[2, 5, 6]", this.list1.toString());
		this.alg.insertInSortedList(4, this.list1);
		assertEquals("[2, 4, 5, 6]", this.list1.toString());
		this.alg.insertInSortedList(4, this.list1);
		assertEquals("[2, 4, 4, 5, 6]", this.list1.toString());
	}

	/**
	 * Tests the {@link LinkedListAlgorithms#copyList(LinkedList)} method.
	 * 
	 */
	@Test
	public void testcopyList() {

		LinkedList<Integer> newList = this.alg.copyList(this.list1);
		assertTrue(this.list1.toString().equals(newList.toString()));
		for (int i = 0; i < 5; i++) {
			this.list1.add((int) (Math.random() * 10));
			newList = this.alg.copyList(this.list1);
			assertTrue(this.list1.toString().equals(newList.toString()));
		}
	}

	/**
	 * Tests the {@link LinkedListAlgorithms#append(LinkedList, LinkedList)} method.
	 *
	 */
	@Test
	public void testAppend() {
		this.alg.append(this.list1, this.list2);
		assertEquals("[]", this.list1.toString());
		this.list2.add(7);
		this.list1 = this.alg.append(this.list1, this.list2);
		assertEquals("[7]", this.list1.toString());
		this.list1.add(3);
		this.list2.add(4);
		this.list1 = this.alg.append(this.list1, this.list2);
		assertEquals("[7, 3, 7, 4]", this.list1.toString());
	}
	
	/**
	 * Tests the {@link LinkedListAlgorithms#reverseList(LinkedList)} method.
	 *
	 */
	@Test
	public void testreverseList(){
		this.alg.reverseList(this.list1);
		assertEquals("[]", this.list1.toString());
		
		this.alg.insertInSortedList(3, this.list1);
		assertEquals("[3]", this.list1.toString());
		
		this.alg.insertInSortedList(10, this.list1);
		this.alg.reverseList(this.list1);
		assertEquals("[10, 3]", this.list1.toString());

		this.alg.reverseList(this.list1);
		this.alg.insertInSortedList(7, this.list1);
		this.alg.reverseList(this.list1);
		assertEquals("[10, 7, 3]", this.list1.toString());

		this.alg.reverseList(this.list1);
		this.alg.insertInSortedList(1, this.list1);
		this.alg.reverseList(this.list1);
		assertEquals("[10, 7, 3, 1]", this.list1.toString());
	}
}
