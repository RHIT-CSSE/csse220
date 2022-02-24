package sll;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

	SinglyLinkedList emptyList, list, list2, list3;

	@Before
	public void setUp() {
		this.emptyList = new SinglyLinkedList();
		this.list = new SinglyLinkedList();
		// populateList(this.list, new String[] { "A", "B", "C", "D", "E" });

		this.list2 = new SinglyLinkedList();
		// populateList(this.list2, new String[] { "w", "x", "v", "q" });

		this.list3 = new SinglyLinkedList();
		// populateList(this.list3, new String[] { "1" });

	}

	/*
	 * Populates the list with the items in the given array, in the order
	 * they're given in the array.
	 */
	private void populateList(SinglyLinkedList list, Integer[] items) {
		for (int i = items.length - 1; i >= 0; i--) {
			list.addFirst(items[i]);
		}
	}

	@After
	public void tearDown() throws Exception {
		this.emptyList = null;
		this.list = null;
		this.list2 = null;
		this.list3 = null;
	}


	@Test
	public void testCountOccurrencesOfValue() {
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {15, 10, 20, 20, 40, 10, 20, 3, 15, 10});
		assertEquals(3, this.list.countOccurrencesOfValue(10));
		assertEquals(2, this.list.countOccurrencesOfValue(15));
		assertEquals(1, this.list.countOccurrencesOfValue(3));
		assertEquals(1, this.list.countOccurrencesOfValue(40));
		assertEquals(0, this.list.countOccurrencesOfValue(100));
	}
	
	@Test
	public void testDoubleDozen() {
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {12, 30});
		this.list.doubleDozen();
		assertEquals("[12->12->30] first=[12]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {50, 12});
		this.list.doubleDozen();
		assertEquals("[50->12->12] first=[50]", list.toString());

		 this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {15, 12, 20, 12, 10});
		this.list.doubleDozen();
		assertEquals("[15->12->12->20->12->12->10] first=[15]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {15, 12, 12, 12, 10});
		this.list.doubleDozen();
		assertEquals("[15->12->12->12->12->12->12->10] first=[15]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {15, 30, 20, 40, 10});
		this.list.doubleDozen();
		assertEquals("[15->30->20->40->10] first=[15]", list.toString());
	}
	
	@Test
	public void testRemoveValuesLessThanRemoveSingle() {
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {12, 15, 9, 10, 4, -3, 7, 20});
		this.list.removeValuesLessThan(0);
		assertEquals("[12->15->9->10->4->7->20] first=[12]", list.toString());
	}
	
	@Test
	public void testRemoveValuesLessThanFromEmpty() {
		this.list = new SinglyLinkedList();
		this.list.removeValuesLessThan(20);
		assertEquals("[]", list.toString());
	}
	
	@Test
	public void testRemoveValuesLessThanRemoveMany() {
		// Removes 2 in a row
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {12, 15, 9, 10, 4, -3, 7, 20});
		this.list.removeValuesLessThan(5);
		assertEquals("[12->15->9->10->7->20] first=[12]", list.toString());

		// Removes more.
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {12, 15, 9, 10, 4, -3, 7, 20});
		this.list.removeValuesLessThan(10);
		assertEquals("[12->15->10->20] first=[12]", list.toString());

		// Removes even more
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {12, 15, 9, 10, 4, -3, 7, 20});
		this.list.removeValuesLessThan(11);
		assertEquals("[12->15->20] first=[12]", list.toString());
	}

	
	@Test
	public void testRemoveValuesLessThanRemoveManyIncludingFirst() {
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {12, 15, 9, 10, 4, -3, 7, 20});
		this.list.removeValuesLessThan(20);
		assertEquals("[20] first=[20]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {12, 15, 9, 10, 4, -3, 7, 20});
		this.list.removeValuesLessThan(30);
		assertEquals("[]", list.toString());
	}
	
	@Test
	public void testRemoveValuesLessThanWithSmallAtStart() {
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {3, 6, 9, 50, 10, 60, 20});
		this.list.removeValuesLessThan(10);
		assertEquals("[50->10->60->20] first=[50]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {3, 6, 9, 50, 10, 60, 20});
		this.list.removeValuesLessThan(5);
		assertEquals("[6->9->50->10->60->20] first=[6]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {3, 6, 9, 50, 10, 60, 20});
		this.list.removeValuesLessThan(9);
		assertEquals("[9->50->10->60->20] first=[9]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {3, 6, 9, 50, 10, 60, 20});
		this.list.removeValuesLessThan(15);
		assertEquals("[50->60->20] first=[50]", list.toString());
		
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] {3, 6, 9, 50, 10, 60, 20});
		this.list.removeValuesLessThan(30);
		assertEquals("[50->60] first=[50]", list.toString());
	}
}
