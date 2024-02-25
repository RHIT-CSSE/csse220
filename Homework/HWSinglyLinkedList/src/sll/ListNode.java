package sll;

/**
 * This is a representation of a node for a singly linked list. A node has an
 * element and a pointer to the next node in the list.
 * 
 * @author defoe. Created Nov 7, 2013.
 * @param <T>
 */
public class ListNode implements IListNode{
	public Integer element;
	public ListNode next;

	/**
	 * Constructs a node with the given element and the next node to point to.
	 * 
	 * @param e
	 *            Element to store in this node.
	 * @param n
	 *            The next node to point to.
	 */
	public ListNode(Integer e, ListNode n) {
		this.element = e;
		this.next = n;
	}
	

	public IListNode clone(){
		return new ListNode(this.element, this.next);
	}

	/**
	 * Constructs a node with the given element. There is no next node to point
	 * to.
	 * 
	 * @param e
	 */
	public ListNode(Integer e) {
		this(e, null);
	}

	/**
	 * Constructs an empty node.
	 * 
	 */
	public ListNode() {
		this(null, null);
	}

	@Override
	public Integer getElement() {
		return element;
	}

	@Override
	public IListNode getNext() {
		return next;
	}
	
	@Override
	public void setNext(IListNode next){
		this.next = (ListNode)next;
	}
}
