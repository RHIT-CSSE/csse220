package sll;

/*
 * A linked list class for storing Strings
 */
public class SinglyLinkedList {

	private class Node {
		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
		public String data;
		public Node next;
	}
	
	private Node first;
	
	public SinglyLinkedList() {
		first = null;
	}
	
	public class SimpleLLIterator {
		private Node current;
		
		private SimpleLLIterator() {
			current = first;
		}
		
		public boolean hasNext() {
			return current != null;
		}
		
		public String next() {
			String curVal = current.data;
			current = current.next;
			return curVal;
		}
	}
	
	/**
	 * Deletes elements in the linked list between
	 * a range of indexes.  The first index is
	 * inclusive, the second index is exclusive.
	 * 
	 * For example, consider the list:
	 * "A" -> "B" -> "C" -> "D" -> "E"
	 * 
	 * delRange(1,2) produces "A"-> "C" -> "D" -> "E"
	 * delRange(1,3) produces "A"-> "D" -> "E"
	 * delRange(1,4) produces "A"
	 * delRange(1,1) produces "A"-> "B" -> "C" -> "D" -> "E"
	 * 
	 * You can assume the second range <= length of the list
	 * 
	 * You can assume the first index is <= the second index
     *
	 * You can assume that the range will NOT begin with 0
	 * (i.e. the first element will always remain in the list)
     *
	 */
	public void delRange(int firstIndex, int secondIndex) {
		// TODO: Write this
	}
	
	/**
	 * Returns the value of the duplicated value in 
	 * the linked list.
	 * 
	 * You can assume at most one element is duplicated.
	 * If no elements are duplicated, the function should
	 * return null.
	 * 
	 * For example:
	 * 
	 * "A" -> "B" -> "C" -> "A" returns "A"
	 * "A" -> "B" -> "B" -> "D" returns "B"
	 * "A" -> "B" -> "C" returns null
	 * 
	 * Your function can use another structure
	 * (e.g. ArrayList) in your solution if you 
	 * like.
	 * 
	 * @return value of duplicated element
	 */
	public String getDuplicate() {
		// TODO: Write this
		
		return null;
	}
	
	/**
	 * Given 2 linked lists, returns the first index where the
	 * lists differ.  
	 * 
	 * If the lists have the same values, return -1
	 * 
	 * For example, consider list one to be this
	 * "A" -> "B" -> "C"
	 * 
	 * Here's the results for various values of two
	 * "A"->"D" returns 1
	 * "A"->"B" returns 2
	 * "A"->"B"->"Q" returns 2
	 * "A"->"B"->"C"->"D" returns 3
	 * "Q"->"B"->"C" returns 0
	 * "A"->"B"->"C" returns -1
	 */
	public static int indexOfFirstDifference(SinglyLinkedList one, SinglyLinkedList two) {
		// hint: you can access the private fields of one and
		// two in this function like this:
		//
		// Node myNode = one.first;
		// TODO: Write this
		
		return -1;
	}
	
	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public void addFirst(String newData) {
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}
	
	/**
	 * Removes the last element of this list
	 * Returns the data of the element that is removed
	 * 
	 * If the list is empty, returns null
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public String removeLast() {
		// empty list
		if(first == null) return null;
		
		// one element list
		if(first.next == null) {
			String data = first.data;
			first = null;
			return data;
		}
		
		// the rest
		Node current = first;
		while(current.next.next != null) {
			current = current.next;
		}
		String data = current.next.data;
		current.next = null;
		return data;
	}

}

