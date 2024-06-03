package sll;

import sll.SinglyLinkedList.BoolWrapper;
import sll.SinglyLinkedList.IntWrapper;

/**
 * This is a representation of a node for a singly linked list. A node has an
 * element and a pointer to the next node in the list. These nodes are like they
 * are in 230, where most of the work happens here and SinglyLinkedList doesn't
 * do much.
 * 
 * @author Ethan Harden on 5/29/24.
 * @param <T>
 */
public class Node {
	public Integer element;
	public Node next;

	static final Node NULL_NODE = new Node(); // uses the empty constructor

	/**
	 * Constructs a node with the given element and the next node to point to.
	 * 
	 * @param element Element to store in this node.
	 * @param n       The next node to point to.
	 */
	public Node(Integer element, Node next) {
		this.element = element;
		this.next = next;
	}

	/**
	 * Constructs a node with the given element. There is no next node to point to.
	 * (points to NULL_NODE)
	 * 
	 * @param element Element to store in this node.
	 */
	public Node(Integer element) {
		this(element, NULL_NODE);
	}

	/**
	 * Constructs NULL_NODE (an empty node).
	 * 
	 * Using NULL_NODE instead of just 'null' means a node doesen't have to check if
	 * it's 'next' is 'null' to avoid a NullPointerException. It can call whatever
	 * method on NULL_NODE and not have to worry.
	 * 
	 * Each method has to check if 'this' is NULL_NODE at the start. You could get
	 * around this if NULL_NODE is its own class that extends Node and overrides
	 * every method.
	 * 
	 */
	public Node() {
		// NULL_NODE's element can be anything. -17 isn't used anywhere else, so it is
		// helpful to know when debugging that if you see a -17 then you are reading the
		// element of NULL_NODE.

		// To check if something is NULL_NODE, you don't want to compare a node's value
		// to -17. You should use 'this == NULL_NODE' to check. See insert().
		this(-17, null);
	}

	/**
	 * Generates a string representation of the list that starts at this node.
	 * 
	 * This method uses a StringBuilder. They are more efficient than just
	 * concatenating strings. When strings are concatenated, a completely new place
	 * in memory is allocated for the result. When you use a StringBuilder, it
	 * extends the memory it is using (by doubling it) when it runs out, which won't
	 * be every time. A major theme of CSSE230 is efficiency.
	 * 
	 * This method doesn't do anything if 'this' is NULL_NODE. If 'this' isn't
	 * NULL_NODE, it adds its element and tells whatever is next to do the same.
	 * 
	 * @param sb The StringBuilder to append to.
	 * 
	 */
	public void buildString(StringBuilder sb) {
		if (this != NULL_NODE) {
			// if we aren't NULL_NODE, then put my element and a comma,
			sb.append(this.element);
			sb.append(", ");

			// and tell my 'next' to do the same.
			this.next.buildString(sb);
		}
	}

	/**
	 * Puts a new node at the specified index, shifting what was there and what
	 * follows down.
	 * 
	 * This method changes the list, so it uses the 'return this' pattern. When a
	 * node calls this method on it's next, it expects to be told what it's next
	 * should now be. To represent no changes, 'return this' is used. If there is a
	 * change, it will return something other that 'this', and the parent node will
	 * change its 'next' to be something different than before. For insert(), this
	 * will be a new Node.
	 * 
	 * @param newElement Element to store in the new node at the specified index.
	 * 
	 */
	public Node insert(int index, Integer newElement) throws IndexOutOfBoundsException {
		if (index == 0) {
			// splice in new node here. It is allowed to insert a node at NULL_NODE
			// (creating a node at the end of the list, like add() should do)
			return new Node(newElement, this);
		}

		if (index < 0 || this == NULL_NODE) {
			// given negative index or reached null without having index==0 (when the given
			// index is past the end of the list)
			throw new IndexOutOfBoundsException();
		}

		// replace 'this.next' with what it says it should be replaced with. Most times
		// it ends up not changing.
		this.next = this.next.insert(index - 1, newElement);

		// if we didn't return earlier, than there was no change here, so 'return this'.
		return this;
	}

// --------------------------------------------------------------------------------------------------
// From this point on is where you work
// --------------------------------------------------------------------------------------------------

	/**
	 * This should calculate the size of the list starting at this node.
	 * 
	 * This method doesn't change the list, so it doesn't need to use the 'return
	 * this' pattern.
	 * 
	 * Make sure to check for NULL_NODE. NULL_NODE represents a blank space, so the
	 * size of the list starting at NULL_NODE is zero.
	 */
	public int size() {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Adds a node with the given element to the end of the list.
	 * 
	 * This method changes the list, so it uses the 'return this' pattern. See
	 * insert() for more information.
	 * 
	 * You shouldn't call size() and insert(), because it is inefficient. It visits
	 * each node twice when it can do it by visiting each node once.
	 * 
	 * You need to check if 'this' is NULL_NODE, and if so, return a new Node. Else,
	 * tell 'this.next' to add and replace it with what it says it should be
	 * replaced with, and then use the 'return this' pattern.
	 * 
	 * @param newElement Element to store in the new node at the end.
	 */
	public Node add(Integer newElement) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Returns true if the given element is found in the list.
	 * 
	 * This method doesn't change the list, so it doesn't need to use the 'return
	 * this' pattern.
	 * 
	 * Less help for this one. As usual, you need to check for NULL_NODE.
	 */
	public boolean contains(Integer element) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Removes a node with the given element, shifting what comes after up.
	 * 
	 * This method changes the list, so it uses the 'return this' pattern. See
	 * insert() for more information.
	 * 
	 * If you find NULL_NODE before the element, don't change the list and set the
	 * BoolWrapper to false. When you go to remove a node, you can return its 'next'
	 * and set the BoolWrapper to true.
	 * 
	 * @param element Element to remove.
	 */
	public Node remove(Integer element, BoolWrapper wrap) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Returns the index if the given element is found in the list, otherwise -1.
	 * 
	 * This method doesn't change the list, so it doesn't need to use the 'return
	 * this' pattern.
	 * 
	 * This should be very similar to contains().
	 */
	public int indexOf(Integer element, int currentIndex) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Replaces the element at the given index with 'newElement' and returns the old
	 * value.
	 * 
	 * This method doesn't change the structure of the list, so it doesn't need to
	 * use the 'return this' pattern.
	 * 
	 * Make sure to throw an IndexOutOfBoundsException when applicable.
	 */
	public Integer set(int index, Integer newElement) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Returns the element at the given index.
	 * 
	 * This method doesn't change the list, so it doesn't need to use the 'return
	 * this' pattern.
	 * 
	 * Make sure to throw an IndexOutOfBoundsException when applicable.
	 */
	public Integer get(int index) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
	
	/**
	 * Removes all nodes with the given element, shifting what comes after up.
	 * 
	 * This method changes the list, so it uses the 'return this' pattern. See
	 * insert() for more information.
	 * 
	 * This should be similar to remove().
	 * Make sure to continue removing after you have found a node to remove.
	 * 
	 * @param element Element to remove.
	 */
	public Node removeAll(Integer element, IntWrapper wrap) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

// --------------------------------------------------------------------------------------------------
// This is from the algorithms part of HWSinglyLinkedList.
// These can also be implemented in a CSSE230 way.
// These are a bit harder than before.
// --------------------------------------------------------------------------------------------------

	/**
	 * After this method is called, the linked list should contain only the integers
	 * list that begin with the number 1.
	 * 
	 * The solution uses String.valueOf() and charAt() to know if it starts with 1.
	 * Beware of negative numbers.
	 * 
	 * So if it started with [123,456,-1,21], it should end with [123,-1].
	 * 
	 * Tip: You might want to replace a node's 'next' before you cut itself out of
	 * the list.
	 */
	public Node retainStartingWithOne() {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
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
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Assuming the list was already in (non-decreasing) order, it inserts the given
	 * number in the correct place.
	 * 
	 * So if it started with [1,5,9] and was told to add 6, it should end with
	 * [1,5,6,9].
	 */
	public Node insertIntoSorted(int newElement) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
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
	public Node retainShortNumbers(int maxLength) {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}

	/**
	 * Duplicates all the nodes of the list.
	 * 
	 * So if it started with [1, 2, 3], it should end with [1, 1, 2, 2, 3, 3].
	 */
	public Node doubleEachNode() {
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
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
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	}
}
