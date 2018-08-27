package sll;

/*
 * A linked list class for storing Integers
 */
public class SinglyLinkedList {

	private class Node {
		public Node(Integer data, Node next) {
			this.data = data;
			this.next = next;
		}
		public Integer data;
		public Node next;
	}
	
	private Node first;
	
	public SinglyLinkedList() {
		first = null;
	}

	/**
	 * Count those values that have a specific value. 
	 * If the list is empty or doesn't have that value, just return 0.
	 * You must step through the list instead of using the toString().

	 * For example, on the list, 
	 * [15->10->20->20->40->10->20->3->15->10],
	 * 
	 * countValue(20) returns 3.
	 * countValue(10) returns 3.
	 * countValue(15) returns 2.
	 * countValue(3) returns 1.
	 * countValue(4) returns 1.
	 * countValue(100) returns 0. 
	 * 
	 */
	public int countOccurrencesOfValue(int value) {
		// TODO: Write this method.
		
		return -17;
	}
	
	/**
	 * DoubleDozen
	 * 
	 * Every node with the value 12 is doubled in the list, with the new 12 added 
	 * directly after the original one.
	 * 
	 * For example,
	 * [12->30] becomes [12->12->30] 
	 * [50->12] becomes [50->12->12]
	 * [15->12->20->12->10] becomes [15->12->12->20->12->12->10] 
	 * [15->12->12->12->10] becomes [15->12->12->12->12->12->12->10] 
	 * [15->30->20->40->10] stays the same.
	 * 
	 * An empty list stays the same
	 */
	public void doubleDozen() {
		// TODO: Write this method.

	}
	
	/**
	 * Remove all nodes with values less than val.
	 * 
	 * Removes all nodes with integer values less than the given parameter.
	 * You must actually remove those nodes from the list, not just manipulate toString.
	 * 
	 * For example:
	 * With the value 10, [12->15->9->10->4->-3->7->20] becomes [12->15->10->20]
     * With the value 20, it becomes [20].
     * With the value 30, it becomes empty
     * 
     * With any value, the empty list stays empty.
   	 * 
	 * 
	 */
	public void removeValuesLessThan(Integer val) {
		// TODO: Write this method.

	}
	
	@Override
	public String toString() {
		// Don't change this! It is used by the unit tests.
		if (this.first == null) {
			return "[]";
		}
		String result = "[";
		Node current = this.first;
		while (current.next != null) {
			result += (current.data + "->");
			current = current.next;
		}
		result += current.data+ "] first=["+this.first.data +"]";
		return result;
	}

	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Don't change this! It is used by the unit tests.
	 * 
	 */
	public void addFirst(Integer newData) {
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}
	
	/**
	 * Removes the last element of this list
	 * Returns the data of the element that is removed
	 * 
	 * If the list is empty, returns null
	 * 
	 * 		// Don't change this! It is used by the unit tests.
	 * 
	 */
	public Integer removeLast() {
		// empty list
		if(first == null) return null;
		
		// one element list
		if(first.next == null) {
			Integer data = first.data;
			first = null;
			return data;
		}
		
		// the rest
		Node current = first;
		while(current.next.next != null) {
			current = current.next;
		}
		Integer data = current.next.data;
		current.next = null;
		return data;
	}

}

