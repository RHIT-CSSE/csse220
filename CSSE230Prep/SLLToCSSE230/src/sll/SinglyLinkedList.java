package sll;

/**
 * This class provides a CSSE230-based implementation of a singly linked list,
 * where the nodes do most of the work using recursion.
 * 
 * In 230, there are trees, which are like linked lists but instead of each node
 * pointing to one after it, each node has two after it, so the tree branches
 * out.
 * 
 * 
 * 
 * @author Ethan Harden on 5/29/24.
 */
public class SinglyLinkedList {

	private Node first; // first holds the reference to the first node in the linked list

	/**
	 * Constructs a new, empty linked list.
	 * 
	 * When the list is empty, 'first' is NULL_NODE
	 */
	public SinglyLinkedList() {
		this.first = Node.NULL_NODE;
	}

	// These two tiny helper classes allow something created here in the List to be
	// passed to the Nodes as a parameter, and any change they make can be seen here
	// in the List. Useful for when the return value is used for something else,
	// like the 'return this' pattern.
	class IntWrapper {
		int theInt = 0;
	}

	class BoolWrapper {
		boolean theBool = false;
	}

	/**
	 * Generates a string representation of the list.
	 * 
	 * This method uses a StringBuilder. They are more efficient than just
	 * concatenating strings. When strings are concatenated, a completely new place
	 * in memory is allocated for the result. When you use a StringBuilder, it
	 * extends the memory it is using (by doubling it) when it runs out, which won't
	 * be every time. A major theme of CSSE230 is efficiency. *
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append('[');

		// tell the first node to fill the string
		first.buildString(sb);

		// fix the string
		if (sb.length() != 1) {
			// string is not just "["
			sb.delete(sb.length() - 2, sb.length()); // remove the last ", "
			sb.append("]");
			return sb.toString();
		} else {
			// list was empty, so the StringBuilder is just "["
			return "[]";
		}
	}

	/**
	 * This method inserts the given element at the given index in the list,
	 * shifting what was there and what follows down.
	 * 
	 * This doesn't replace the element at an index.
	 * 
	 * If it is given an invalid index it throws an IndexOutOfBoundsException.
	 * 
	 * Please note that it is allowed to insert at the end of the list.
	 * 
	 */
	public void insert(int index, Integer newElement) throws IndexOutOfBoundsException {
		// Most of the methods in List are really short like this. The Nodes do most of
		// the work and List just sets them up.
		this.first = this.first.insert(index, newElement);
	}

// --------------------------------------------------------------------------------------------------
// From this point on is where you work. Note that you shouldn't have to change any code here, just in Node.java.
// --------------------------------------------------------------------------------------------------

	/**
	 * Adds a node with the given element to the end of the list.
	 * 
	 * @param newElement Element to store in the new node at the end.
	 */
	public void add(Integer newElement) {
		// TODO: Implement this method in Node.
		this.first = this.first.add(newElement);
	}

	public int size() {
		// TODO: Implement this method in Node.
		return this.first.size();
	}

	/**
	 * This method should return true if the list contains the given element and
	 * false if it does not.
	 */
	public boolean contains(Integer element) {
		// TODO: Implement this method in Node.
		return this.first.contains(element);
	}

	/**
	 * This method should attempt to remove the first occurrence of the given
	 * element in the list.
	 * 
	 * If the element is found and removed, return true otherwise if the element is
	 * not found, then return false.
	 * 
	 * Because this method modifies the structure of the list, Nodes should use the
	 * 'return this' pattern, which means there needs to be some other way for the
	 * Nodes to communicate back to List if the element was found and removed. This
	 * is where a BoolWrapper is used.
	 */
	public boolean remove(Integer element) {
		// Creates a BoolWrapper to give to the Nodes.
		BoolWrapper wrap = new BoolWrapper();

		// TODO: Implement this method in Node.
		this.first = this.first.remove(element, wrap);

		// Gets the value out of the BoolWrapper that was hopefully changed by the
		// Nodes.
		return wrap.theBool;
	}

	/**
	 * Returns the index if the given element is found in the list, otherwise -1.
	 */
	public int indexOf(Integer element) {
		return this.first.indexOf(element, 0);
	}

	/**
	 * Replaces the element at the given index with 'newElement' and returns the old
	 * value.
	 * 
	 * Make sure to throw an IndexOutOfBoundsException when applicable.
	 */
	public Integer set(int index, Integer newElement) {
		// TODO: Implement this method in Node.
		return this.first.set(index, newElement);
	}

	/**
	 * Returns the element at the given index.
	 * 
	 * Make sure to throw an IndexOutOfBoundsException when applicable.
	 */
	public Integer get(int index) {
		// TODO: Implement this method in Node.
		return this.first.get(index);
	}

	/**
	 * This method should attempt to remove the ALL occurrences of the given element
	 * in the list.
	 * 
	 * It returns the number of nodes removed.
	 * 
	 * Because this method modifies the structure of the list, Nodes should use the
	 * 'return this' pattern, which means there needs to be some other way for the
	 * Nodes to communicate back to List if the element was found and removed. This
	 * is where a IntWrapper is used.
	 */
	public int removeAll(Integer element) {
		// Creates a IntWrapper to give to the Nodes.
		IntWrapper wrap = new IntWrapper();

		// TODO: Implement this method in Node.
		this.first = this.first.removeAll(element, wrap);

		// Gets the value out of the IntWrapper that was hopefully changed by the
		// Nodes.
		return wrap.theInt;
	}

// --------------------------------------------------------------------------------------------------
// This is from the algorithms part of HWSinglyLinkedList.
// These can also be implemented in a CSSE230 way.
// --------------------------------------------------------------------------------------------------

	/**
	 * After this method is called, the linked list should contain only the integers
	 * list that begin with the number 1.
	 * 
	 * So if it started with [123,456,-1,21], it should end with [123,-1].
	 */
	public void retainStartingWithOne() {
		// TODO: Implement this method in Node.
		this.first = this.first.retainStartingWithOne();
	}

	/**
	 * Returns true if the list is sorted (non-decreasing).
	 * 
	 * [1,2,3] and [1,1,1] would both be true. [1,3,2] and [3,2,1] would both be
	 * false.
	 * 
	 * An empty list or one with one item would be true.
	 */
	public boolean checkIfSorted() {
		// TODO: Implement this method in Node.
		return this.first.checkIfSorted();
	}

	/**
	 * Assuming the list was already in order, it inserts the given number in the
	 * correct place.
	 * 
	 * So if it started with [1,5,9] and was told to add 6, it should end with
	 * [1,5,6,9].
	 */
	public void insertIntoSorted(int numberToAdd) {
		// TODO: Implement this method in Node.
		this.first = this.first.insertIntoSorted(numberToAdd);
	}

	/**
	 * Removes all numbers in the list longer than the given number of digits from
	 * the list.
	 * 
	 * Note that '111' and '-111' would both be considered 3 digits long.
	 * 
	 * So if it started with [1,1000,3,99999,999,-123] and a length of 3, it should
	 * end with [1, 3, 999, -123].
	 */
	public void retainShortNumbers(int maxLength) {
		// TODO: Implement this method in Node.
		this.first = this.first.retainShortNumbers(maxLength);
	}

	/**
	 * Duplicates all the nodes of the list.
	 * 
	 * So if it started with [1, 2, 3], it should end with [1, 1, 2, 2, 3, 3].
	 */
	public void doubleEachNode() {
		// TODO: Implement this method in Node.
		this.first = this.first.doubleEachNode();
	}

	/**
	 * Returns whether the incoming linked list stores the values of *a* valid
	 * Fibonacci sequence. Doesn't have to be *the* Fibonacci sequence.
	 * 
	 * Recall: fib(i) = fib(i-1) + fib(i-2)
	 * 
	 * [0,1] is too short to be a Fibonacci sequence. [1,2,3] is a Fibonacci
	 * sequence because 3 = 2 + 1. [0,1,1] is a Fibonacci sequence because 1 = 1 +
	 * 0. [1,4,5,9,14] is a Fibonacci sequence.
	 */
	public boolean isFibSeq() {
		if (this.size() < 3)
			return false;

		// TODO: Implement this method in Node.
		return this.first.isFibSeq();
	}
}
