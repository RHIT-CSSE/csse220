package sll;

import java.util.Stack;

/**
 * This class explores a list of algorithms that can be applied to linked lists.
 * 
 * @author defoe. Created Nov 11, 2013.
 * @param <T> The type of the elements in this Collection.
 */
public class LinkedListAlgorithms{


	/**
	 * 
	 * @param x
	 *            The object to look for.
	 * @param list
	 *            The list in which to search for x.
	 * @return Returns the index of the last occurrence of x in this list, or -1
	 *         if this list does not contain x.
	 */
	public int findLastIndexOf(Integer x, LinkedList<Integer> list) {
		int size = list.size();
		int lastPos = -1;
		if (size < 1) {
			return lastPos;
		}
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(x)) {
				lastPos = i;
			}
		}
		return lastPos;

	}


	/**
	 * Inserts the object x in the sorted list.
	 * 
	 * @param x
	 *            The object to insert in list.
	 * @param list
	 *            The sorted list in which to insert x.
	 */
	public void insertInSortedList(Integer x, LinkedList<Integer> list) {
		int size = list.size();
		boolean inserted = false;
		if (size == 0) {
			list.add(x);
			inserted = true;
		} else {
			for (int i = 0; i < size; i++) {
				if (x.compareTo(list.get(i)) < 0) {
					list.add(i, x);
					inserted = true;
					break;
				}
			}
			if (!inserted) {
				list.add(x);
			}

		}
	}
	


	/**
	 * Copies the given list into a new list so that the elements in the new list
	 * are in the same order as in the given list.
	 * 
	 * @param list
	 *            This list to copy
	 * @return A copy of the given list.
	 */
	public LinkedList<Integer> copyList(LinkedList<Integer> list) {
		LinkedList<Integer> newList = new LinkedList<Integer>();
		if (list == null){
			return null;
		}
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
			newList.add(iter.next());
		}
		return newList;
	}
	
	
	/**
	 * Appends the elements of list2 to the end of list1 while preserving list2.
	 *
	 * @param list1
	 * @param list2
	 * @return the appended list.
	 */
	public LinkedList<Integer> append(LinkedList<Integer> list1, LinkedList<Integer> list2){
		LinkedList<Integer> results= new LinkedList<Integer>();
		Iterator<Integer> first = list1.iterator();
		while(first.hasNext()){
			results.add(first.next());
		}
		
		Iterator<Integer> second = list2.iterator();
		while(second.hasNext()){
			results.add(second.next());
		}
		
		return results;
	}
	
	
	/**
	 * Reverses the order of the elements in the list.
	 *
	 * @param list
	 */
	public void reverseList(LinkedList<Integer> list){
		Stack<Integer> stack = new Stack<Integer>();
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
			stack.push(iter.next());
			iter.remove();
		}
		while(!stack.empty()){
			list.add(stack.pop());
		}
	}

}
