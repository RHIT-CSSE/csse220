package sll.algorithms;

import sll.ILinkedList;
import sll.IListNode;
import sll.ListNode;
import sll.SinglyLinkedList;

// TODO: complete sll.SinglyLinkedList first, then use it to complete these problems.
public class Algorithms {
	/**
	 * 
	 * Write a function that takes an array of integers and returns a linked
	 * list. The linked list should contain only the integers in the original
	 * list that begin with the number 1.
	 * 
	 * So arraylistOf1s({123,456,1, 21}) yields [123, 1]
	 */
	public static SinglyLinkedList arraylistOf1s(int[] integers) {
		// TODO: Solve me
		return null;
	}

	/**
	 * Takes a list of numbers in sorted (ascending) order and a number to add.
	 * 
	 * Adds the number in the correct place in the sorted list.
	 * 
	 * so insertIntoSorted([1,5,9],6) yields [1,5,6,9]
	 * 
	 */
	public static void insertIntoSorted(ILinkedList list, int number) {
		// TODO: Solve me
	}

	/**
	 * Takes a linked list and removes all numbers longer than 3 digits from the
	 * list.
	 * 
	 * So removeLongNumbers([1,1000,3,99999,999]) yields [1, 3, 999]
	 */
	public static void removeLongNumbers(ILinkedList list) {
		// TODO: Solve me
	}

	/**
	 * Returns whether the given linked list is sorted in increasing order.
	 * 
	 * So checkSorted([1,2,3]) yields true.
	 * checkSorted ([1,3,2]) yields false.
	 * checkSorted ([]) yields true.
	 */
	public static boolean checkSorted(ILinkedList list) {
		// TODO: Solve me
		return false;
	}

	/**
	 * Duplicates all elements of the list.
	 * 
	 * So doubleList([1, 2, 3]) yields [1, 1, 2, 2, 3, 3].
	 */
	public static void doubleList(ILinkedList list) {
		// TODO: Solve me
	}

	/**
	 * Returns whether the list represents a Fibonacci sequence.
	 * 
	 * Recall: fib(i) = fib(i-1) + fib(i-2)
	 * 
	 * [0,1] is too short to be a fibonacci sequence. [1,2,3] is a fibonacci
	 * sequence because 3 = 2 + 1. [0,1,1] is a fibonacci sequence because 1 = 1
	 * + 0. [1,4,5,9,14] is a fibonacci sequence.
	 */
	public static boolean isFibonacciSequence(ILinkedList list) {
		// TODO: Solve me
		return false;
	}

	/**
	 * Gets the value of the ith node.
	 * 
	 * If i==0, return the value of the given node.
	 * 
	 * If you are passed an invalid index you should throw an IndexOutOfBoundsException.
	 * 
	 */
	public static Integer recursiveGet(int index, IListNode iListNode) {
		// TODO: Use RECURSION to solve this problem.
		return -1;

	}

}
