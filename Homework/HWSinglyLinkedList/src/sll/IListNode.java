package sll;

public interface IListNode {
	Integer getElement();
	IListNode getNext();
	void setNext(IListNode next);
	IListNode clone();
}
