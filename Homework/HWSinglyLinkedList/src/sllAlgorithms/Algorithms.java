package sllAlgorithms;
import sll.ILinkedList;
import sll.IListNode;
import sll.SinglyLinkedList;

/**
 *  This class has a collection of methods that use a completed implementation
 *  of a SinglyLinkedList to perform various computations.
 *  
 *  TODO: complete sll.SinglyLinkedList first, then use it to complete these problems.
 * 
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         Help from anyone other than a CSSE220 Instructor or CSSE220 TA must
 *         be cited. If you didn't get any outside help, then you can simply
 *         state below: "I did not receive any outside help"
 ***************************************************************************************
 *         Help Citation (for this or any other files in this assignment)
 * 
 *         TODO: cite your help here
 *************************************************************************************** 
 */
public class Algorithms {
	/**
	 * 
	 * Write a function that takes an incoming array of integers and returns a linked
	 * list. The linked list should contain only the integers in the original
	 * list that begin with the number 1.
	 * 
	 * So arraylistOf1s({123,456,1, 21}) yields [123, 1]
	 */
	public static SinglyLinkedList arraylistOf1s(int[] incomingA) {
        // TODO 01: delete this statement and implement this operation.
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // arraylistOf1s

    /**
     * Returns whether the given incoming linked list is sorted in increasing order.
     *
     * So checkSorted([1,2,3]) yields true.
     * checkSorted ([1,3,2]) yields false.
     * checkSorted ([]) yields true.
     */
    public static boolean checkSorted(ILinkedList incomingList) {
        // TODO 02: delete this statement and implement this operation.
        throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
    } // checkSorted

    /**
     * Duplicates all elements of the incoming linked list.
     *
     * So doubleList([1, 2, 3]) yields [1, 1, 2, 2, 3, 3].
     */
    public static void doubleList(ILinkedList incomingList) {
        // TODO 03: delete this statement and implement this operation.
        throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
    } // doubleList

	/**
	 * Takes a list of numbers in sorted (ascending) order and a number to add.
	 * 
	 * Adds the number in the correct place in the sorted list.
	 * 
	 * so insertIntoSorted([1,5,9],6) yields [1,5,6,9]
	 * 
	 */
	public static void insertIntoSorted(ILinkedList list, int numberToAdd) {
        // TODO 04: delete this statement and implement this operation.
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // insertIntoSorted

	/**
	 * Returns whether the incoming linked list stores the values of a valid Fibonacci sequence.
	 * 
	 * Recall: fib(i) = fib(i-1) + fib(i-2)
	 * 
	 * [0,1] is too short to be a fibonacci sequence. [1,2,3] is a fibonacci
	 * sequence because 3 = 2 + 1. [0,1,1] is a fibonacci sequence because 1 = 1
	 * + 0. [1,4,5,9,14] is a fibonacci sequence.
	 */
	public static boolean isFibSeq(ILinkedList incomingList) {
        // TODO 05: delete this statement and implement this operation.
		throw new UnsupportedOperationException("TODO: delete this statement and implement this operation.");
	} // isFibonacciSequence



//  This problem has been removed for 202610 (Fall 2025).
//	/**
//	 * Takes an incoming linked list and removes all numbers longer than 3 digits from the
//	 * list.
//	 *
//	 * So removeLongNumbers([1,1000,3,99999,999]) yields [1, 3, 999]
//	 */
//	public static void removeLongNumbers(ILinkedList incomingList) {
//		throw new UnsupportedOperationException("Not yet implemented.");
//	} // removeLongNumbers



//  This problem has been removed for 202610 (Fall 2025).
//	/**
//	 * Gets the value of the ith node, relative to the node passed in the parameters.
//	 *
//	 * If i==0, return the value of the given node.
//	 *
//	 * If you are passed an invalid index you should throw an IndexOutOfBoundsException.
//	 *
//	 */
//	public static Integer recursiveGet(int index, IListNode iListNode) {
//		// Use RECURSION to solve this problem.
//		// It is not necessary, but you may utilize a helper operation
//		throw new UnsupportedOperationException("Not yet implemented.");
//	} // recursiveGet

}
