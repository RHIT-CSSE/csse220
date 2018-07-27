
public class LinkedList {
	
	
	private class Node {
		public int value;
		public Node next;
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	
	/**
	 * 
	 * Adds a value at the beginning of the list
	 * 
	 * @param value
	 */
	public void addAtBeginning(int value) {
		Node newNode = new Node(value,this.head);
		this.head = newNode;
	}
	
	/**
	 * Converts the list to a string like this:
	 * 1->2->3->null
	 */
	public String toString() {
		Node current = this.head;
		String result = "";
		while(current != null) {
			result += current.value;
			result += "->";
			current = current.next;
		}
		result += "null";
		return result;
	}
	
	/**
	 * 
	 * Example of how the linked list is used
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtBeginning(1);
		list.addAtBeginning(2);
		list.addAtBeginning(3);
		System.out.println(list.toString());
	}
	
	/**
	 * Returns the number of elements in the linked list
	 * 
	 * The code for this will look a little bit like toString
	 * 
	 * @return
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * 
	 * Add value at the end of the linked list
	 * 
	 * To solve this problem you'll need a loop
	 * to find the last element of the list.
	 * 
	 * You'll also need a special case for the
	 * empty list.
	 * 
	 * @param value
	 */
	public void addAtEnd(int value) {

	}
	
	/**
	 * 
	 * Inserts a particular value after another value in the list
	 * 
	 * For example, in the list
	 * 
	 * 1->2->3->null
	 * 
	 * Adding the value 77 after the 2 would give
	 * 
	 * 1->2->77->3->null
	 * 
	 * You can assume the value will definitely be in the list
	 * 
	 * @param valueToAdd
	 * @param valueToInsertAfter
	 */
	public void addAfterValue(int valueToAdd, int valueToInsertAfter) {

	}
	
	/**
	 * 
	 * Inserts a particular value before another value in the list
	 * 
	 * For example, in the list
	 * 
	 * 1->2->3->null
	 * 
	 * Adding the value 77 before the 2 would give
	 * 
	 * 1->77->2->3->null
	 * 
	 * You can assume the value will definitely be in the list
	 * 
	 * To solve this, you'll need to keep track of both a current
	 * and previous node as you go through the list.
	 * 
	 * You'll also need a special case for the head of the list.
	 * 
	 * @param valueToAdd
	 * @param valueToInsertBefore
	 */
	public void addBeforeValue(int valueToAdd, int valueToInsertBefore) {

	}
	
	/**
	 * 
	 * This constructor takes and array and makes a linked list
	 * containing all the elements in the array.
	 * 
	 * You could do this by repeatedly calling add at end
	 * but be classy and construct the list by hand.
	 * 
	 * You can assume the array has at least one element.
	 * 
	 * @param data
	 */
	public LinkedList(int[] data) {

	}
	
	/**
	 * Removes the first element from the list
	 * 
	 * If the list is empty, throw an exception like this:
	 * throw new RuntimeException("Attempt to remove from an empty list");
	 */
	public void removeBeginning() {

	}
	
	/**
	 * Removes the last element from the list
	 * 
	 * You'll need a special case for the 1 element list
	 * 
	 * If the list is empty, throw an exception like this:
	 * throw new RuntimeException("Attempt to remove from an empty list");
	 */
	public void removeEnd() {

	}
	
	/**
	 * Removes the element after a particular value in the list
	 * 
	 * For example, given this this list:
	 * 1->2->3->null
	 * 
	 * Removing after the element 1 would result in:
	 * 1->3->null
	 * 
	 * 
	 * You can assume that both the element and the element after
	 * exist in the list.
	 * 
	 * @param valueToRemoveAfter
	 */
	public void removeAfter(int valueToRemoveAfter) {

	}
	
	/**
	 * 
	 * Removes all the nodes with a particular value from the list
	 * 
	 * For example, given the list
	 * 
	 * 1->2->3->2->null
	 * 
	 * Removing all the 2s would result in:
	 * 1->3->null
	 * 
	 * @param nodesWithValue
	 */
	public void removalAll(int nodesWithValue) {

	}	

}
