package sll;

/**
 * This class provides a basic implementation of a singly linked list. It's
 * motivated by the implementation in Big Java, 5e, ch. 16.1.
 * 
 * @author TODO <YOUR_NAME> on <DATE>.
 */
public class SinglyLinkedList implements ILinkedList {

	/**
	 * Note that in addition to a head (first) pointer
	 * this list contains a last pointer.  Be sure to
	 * BOTH first and last up to date in all your code.
	 */
	private ListNode first;
	private ListNode last;

	/**
	 * These are needed for the test code.
	 */
	@Override
	public IListNode getFirst() {
		return first;
	}

	@Override
	public IListNode getLast() {
		return last;
	}
	
	@Override
	public void setFirst(IListNode first){
		this.first = (ListNode) first;
	}
	
	@Override
	public void setLast(IListNode last){
		this.last = (ListNode) last;
	}
	
	/**
	 * Constructs a new, empty linked list.
	 */
	public SinglyLinkedList() {
		this.first = null;
		this.last = null;
	}
	

	@Override
	public String toString() {
		if (this.first == null) {
			return "[]";
		}
		String result = "[";
		ListNode current = this.first;
		//while (current != this.last) {
		while (current.next != null) {
			result += (current.element + ", ");
			current = current.next;
		}
		result += current.element + "] first=["+this.first.getElement()+"] last=["+this.last.getElement()+"]";
		return result;
	}
	
	/**
	 *  WARNING: add(Integer element) must be completed before OTHER tests can pass!
	 *  
	 * 	Make sure to complete this method FIRST before trying the other ones.
	 *  
	 *  This method should add the given element to the end of this list.
	 */
	@Override
	public void add(Integer element) {
		// TODO 01 Implement the add(Integer element) method.
	}

	
	/**
	 * WARNING: add(Integer element) must be completed before this test can pass!
	 * 
	 *  This method should return the number of elements in the list.
	 */
	@Override
	public Integer size() {
		// TODO 02 Implement the size() method.
		return -1;
	}
	
	
	/**
	 *  This method should insert the given element at the given index in the list.
	 *  This DOES NOT replace the element at an index, but inserts an element. 
	 *   
	 *  If you are passed an invalid index you should throw an IndexOutOfBoundsException.
     *  
     *  Note that this inserts a value at the specific index NOT a value.
     *  Please also note that it is LEGAL to insert at the END of the list.
     *  
     *  Examples:
     *  [2, 6]          ->    insertAtIndex(1, 7)    ->   [2, 7, 6]
     *  [2, 7, 6]       ->    insertAtIndex(0, 8)    ->   [8, 2, 7, 6]
     *  [8, 2, 7, 6]    ->    insertAtIndex(4, 9)    ->   [8, 2, 7, 6, 9]
     *   ^  ^  ^  ^  ^
     *   |  |  |  |  |
     *   0  1  2  3  4 <- indices 
	 */
	@Override
	public void insertAtIndex(int index, Integer element) throws IndexOutOfBoundsException {
		// TODO 03 Implement the insertAtIndex(int index, int value) method.
	}
	
	
	/**
	 * 	This method should return true if the list contains the given element
	 *  and false if it does not.
	 * 
	 */
	@Override
	public boolean contains(Integer element) {
		// TODO 04 Implement the contains(int x) method.
		return false;
	}

	
	/**
	 *  This method should attempt to remove the FIRST occurrence of the
	 *  given element in the list.
	 *  
	 *  If the element is found and removed, return true
	 *  otherwise if the element is not found, then return false.
	 */
	@Override
	public boolean remove(Integer element) {
		// TODO 05 Implement the remove(Integer element) method
		return false;
	}
	
	
	/**
	 *  This method should return the index of the FIRST occurrence of the 
	 *  given element, OR -1 if the element is not found in the list.
	 * 
	 */
	@Override
	public int indexOf(Integer element) {
		// TODO 06 Implement the indexOf(int x) method.
		return -1;
	}

	
	/**
	 * Replaces the element at the given index with the new element.
	 * RETURNS the OLD element.
	 * 
	 * The method should throw an IndexOutOfBoundsException if an invalid index is 
	 * provided.
	 */
	@Override
	public Integer set(int index, Integer element) throws IndexOutOfBoundsException {
		// TODO 07 Implement the set(int index, int element) method.
		return -1;
	}
}
