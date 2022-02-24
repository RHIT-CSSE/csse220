package sll;

public interface ILinkedList {
	IListNode getFirst();
	IListNode getLast();
	void setLast(IListNode last);
	void setFirst(IListNode first);
	void add(Integer element);
	Integer size();
	void insertAtIndex(int index, Integer element) throws IndexOutOfBoundsException;
	boolean contains(Integer element);
	boolean remove(Integer element);
	int indexOf(Integer element);
	Integer set(int index, Integer element) throws IndexOutOfBoundsException;	
}
