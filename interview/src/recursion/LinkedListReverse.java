package recursion;

import oop.Node;

public class LinkedListReverse {

	/**
	 * Reverse a linked list.
	 * @param  head the lined list to reverse
	 * @return  head of the reversed linked list
	 */
	public Node reverseLinedList(Node head){
		if(head == null)
			 return null;
		if(head.getNext() == null)
			return head;
		Node newHead = reverseLinedList(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return newHead;
	}
	public static void main(String[] args){
		
	}
}
