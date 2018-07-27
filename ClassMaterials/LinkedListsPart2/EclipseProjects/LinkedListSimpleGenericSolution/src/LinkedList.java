

import java.util.Iterator;

public class LinkedList<ListDataType> implements Iterable<ListDataType>{
	
	private class Node<NodeDataType> {
		public NodeDataType value;
		public Node<NodeDataType> next;
		
		public Node(NodeDataType value, Node<NodeDataType> next) {
			this.value = value;
			this.next = next;
		}
	}
	
	private Node<ListDataType> head;
	
	public LinkedList() {
		head = null;
	}
	
	
	/**
	 * 
	 * Adds a value at the beginning of the list
	 * 
	 * @param value
	 */
	public void addAtBeginning(ListDataType value) {
		this.head = new Node(value,this.head);
	}
	
	/**
	 * Converts the list to a string like this:
	 * 1->2->3->null
	 */
	public String toString() {
		Node<ListDataType> current = this.head;
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
		LinkedList<Integer> list = new LinkedList();
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
		int count = 0;
		Node<ListDataType> current = this.head;
		while (current != null){
			count++;
			current = current.next;
		}
		return count;
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
	public void addAtEnd(ListDataType value) {
		if(this.head == null) {
			addAtBeginning(value);
			return;
		}
		Node<ListDataType> current = this.head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node<ListDataType>(value, null);
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
	public void addAfterValue(ListDataType valueToAdd, ListDataType valueToInsertAfter) {
		Node<ListDataType> current = this.head;
		while(!current.value.equals(valueToInsertAfter)) {
			current = current.next;
		}
		current.next = new Node<ListDataType>(valueToAdd,current.next);
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
	public void addBeforeValue(ListDataType valueToAdd, ListDataType valueToInsertBefore) {
		if(this.head.value.equals(valueToInsertBefore)) {
			addAtBeginning(valueToAdd);
			return;
		}
		Node<ListDataType> prev = this.head;
		Node<ListDataType> current = this.head.next;
		while(!current.value.equals(valueToInsertBefore)) {
			current = current.next;
			prev = prev.next;
		}
		prev.next = new Node<ListDataType>(valueToAdd,current);
	
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
	public LinkedList(ListDataType[] data) {
		this.head = new Node<ListDataType>(data[0],null);
		Node<ListDataType> current = this.head;
		for(int i = 1; i < data.length; i++) {
			current.next = new Node<ListDataType>(data[i],null);
			current = current.next;
		}
	}
	
	/**
	 * Removes the first element from the list
	 * 
	 * If the list is empty, throw an exception like this:
	 * throw new RuntimeException("Attempt to remove from an empty list");
	 */
	public void removeBeginning() {
		if(head == null)
			throw new RuntimeException("Attempt to remove from an empty list");
		this.head = this.head.next;
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
		if(head == null)
			throw new RuntimeException("Attempt to remove from an empty list");
		if(head.next == null) {
			head = null;
			return;
		}
		Node<ListDataType> current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
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
	public void removeAfter(ListDataType valueToRemoveAfter) {
		Node<ListDataType> current = this.head;
		while(!current.value.equals(valueToRemoveAfter)) {
			current = current.next;
		}
		current.next = current.next.next;
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
	public void removalAll(ListDataType nodesWithValue) {
		while(this.head != null && this.head.value == nodesWithValue) {
			removeBeginning();
		}
		if(this.head == null)
			return;
		Node<ListDataType> current = head;
		while(current.next != null) {
			if(current.next.value == nodesWithValue) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}


	@Override
	public Iterator<ListDataType> iterator() {
		return new LLIterator<ListDataType>(this.head);
	}	
	private class LLIterator<IteratorDataType> implements Iterator<IteratorDataType>{

		private Node<IteratorDataType> currentNode;
		
		public LLIterator(Node<IteratorDataType> node){
			this.currentNode = node;
		}
		
		@Override
		public boolean hasNext() {
			return this.currentNode!=null;
		}

		@Override
		public IteratorDataType next() {
			IteratorDataType result = this.currentNode.value;
			this.currentNode = this.currentNode.next;
			return result;
		}
		
		@Override
		public void remove(){
			
		}
		
	}

}
