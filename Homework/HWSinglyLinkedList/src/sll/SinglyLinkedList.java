package sll;

/**
 * This class provides a basic implementation of a singly linked list.
 * <br>
 * It's motivated by the implementation in Big Java, 5e, ch. 16.1.
 * <br>
 * @author TODO <YOUR_NAME> on <DATE>.
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         TODO: cite your help here or say "only used CSSE220 materials"
 *************************************************************************************** 
 */
public class SinglyLinkedList implements ILinkedList {

	/**
	 * Make sure BOTH first and last are kept up to date in all your operations
	 */

	private ListNode first; // first holds the reference to the first node in the linked list
	private ListNode last;  // last holds the reference to the last node in the linked list
	

	/**
	 * These getters are needed for the test code.
	 */
	@Override
	public IListNode getFirst() {
		return first;
	} // getFirst

	@Override
	public IListNode getLast() {
		return last;
	} // getLast
	
	@Override
	public void setFirst(IListNode first){
		this.first = (ListNode) first;
	} // setFirst
	
	@Override
	public void setLast(IListNode last){
		this.last = (ListNode) last;
	} // setLast
	
	/**
	 * Constructs a new, empty linked list.
	 * When the list is empty, the following must be true: first = null and last = null
	 */
	public SinglyLinkedList() {
		this.first = null;
		this.last = null;
	} // SinglyLinkedList
	
	@Override
	public String toString() {
		if (this.first == null) {
			return "[]";
		}
		String result = "[";
		ListNode current = this.first;
		while (current.next != null) {
			result += (current.element + ", ");
			current = current.next;
		} // end while
		result += current.element + "] first=[" + this.first.getElement() + "] last=[" + this.last.getElement() + "]";
		return result;
	} // toString

	/**
	 *  (This method is provided to you as a starting point.)
     *  <br>
	 *  Add the given element to the end of this list.
     *  @param element the element to add
	 */
	@Override
	public void add(Integer element) {
        if (this.first == null) {
            this.first = new ListNode(element);
            this.last = this.first;
        } else {
            this.last.next = new ListNode(element);
            this.last = this.last.next;
        }
	}

    /**
     *  (This method is also provided to you as a starting point.)
     *  <br>
     *  Returns the index of the FIRST occurrence of the
     *  given element, OR -1 if the element is not found in the list.
     *  @param element the element to search for
     */
    @Override
    public int indexOf(Integer element) {
        // Set up a call to the recursive helper method
        return indexOf(element, this.first, 0);
    }

    /**
     * Recursive helper method for {@link #indexOf(Integer)}.
     * @param x the element to search for
     * @param current the current node being examined
     * @param nodeCount the index of the current node
     * @return the index of the first occurrence of x, or -1 if not found
     */
    private int indexOf(Integer x, ListNode current, int nodeCount) {
        if (current == null) {
            return -1;
        } else if (current.getElement().equals(x)) {
            return nodeCount;
        } else {
            return indexOf(x, current.next, nodeCount + 1);
        }
    }

    // --------------------------------------------------------------------------------------------------
    // From this point on is where you work
    // --------------------------------------------------------------------------------------------------

    /**
	 * 	WARNING: Make sure to complete this method before trying the other ones.
	 *  <br>
	 *  This method should return the number of elements in the list.
	 */
	@Override
	public Integer size() {
		// TODO 01
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
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
		// TODO 02
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
	
	
	/**
	 * 	This method should return true if the list contains the given element
	 *  and false if it does not.
	 * 
	 */
	@Override
	public boolean contains(Integer element) {
		// TODO 03
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
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
		// TODO 04
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
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
		// TODO 05
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
}
