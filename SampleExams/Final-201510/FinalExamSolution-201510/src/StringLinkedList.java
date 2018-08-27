
/*
 * A linked list class for storing Strings
 */
public class StringLinkedList {

	private class Node {
		
		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		public String data;
		public Node next;
		
	}
	
	private Node first;
	
	public StringLinkedList()
	{
		first = null;
	}
	
	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public void addFirst(String newData)
	{
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}
	
	/**
	 * Removes the last element of this list
	 * Returns the data of the element that is removed
	 * 
	 * If the list is empty, returns null
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public String removeLast()
	{
		//zero element list
		if(first == null) return null;
		
		//one element list
		if(first.next == null) {
			String data = first.data;
			first = null;
			return data;
		}
		
		//the rest
		Node current = first;
		while(current.next.next != null) {
			current = current.next;
		}
		String data = current.next.data;
		current.next = null;
		return data;
	}
	
	/**
	 * Replaces one string for another, everywhere in the list.
	 * 
	 * So if the list is "a"->"b"->"a"->"aa"->"c"
	 * 
	 * and you replace "a" with "X" the list should become
	 * 
	 * So if the list is "X"->"b"->"X"->"aa"->"c"
	 * 
	 * hint: You can do this by just modifying the data elements - you don't
	 * need to change the structure of the list
	 * 
	 * @param oldString the string to search for
	 * @param newString the string to replace with
	 * 
	 */
	public void replaceString(String oldString, String newString) {
		Node current = first;
		while(current != null) {
			if(current.data.equals(oldString)) {
				current.data = newString;
			}
			current = current.next;
		}
	}
	

	/**
	 * Appends together every pair of elements in the list,
	 * changing the list so it has half the size.
	 * 
	 * For example "a"->"b"->"c"->"d" becomes "ab"->"cd"
	 * 
	 * If the list has an odd number of elements, the last element is
	 * unchanged.
	 * 
	 * For example "One"->"Two"->"Three" becomes "OneTwo"->"Three"
	 * 
	 */
	public void joinPairs() {
		Node current = first;
		

		while(current != null && current.next != null) {
			current.data = current.data + current.next.data;
			current.next = current.next.next;
			current = current.next;
		}
	}
	
	/**
	 * Produces a complete copy of this list.  Modifications to the first
	 * list should not affect the copy, or vice versa.
	 * 
	 * For example "a"->"b"->"c" produces a new list with the data "a"->"b"->"c";
	 *  
	 */
	public StringLinkedList copyList() {
		StringLinkedList newList = new StringLinkedList();
		if(this.first == null) return newList;
		Node newFirst = new Node(this.first.data, null);
		Node newCurrent = newFirst;
		Node oldCurrent = this.first;
		while(oldCurrent.next != null) {
			oldCurrent = oldCurrent.next;
			newCurrent.next = new Node(oldCurrent.data, null);
			newCurrent = newCurrent.next;
		}
		newList.first = newFirst;
		return newList;
	}
}
