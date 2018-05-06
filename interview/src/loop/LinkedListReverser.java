package loop;

public class LinkedListReverser {

	/**
	 * ��תһ������
	 * @param head
	 * @return
	 */
	public Node reverseLinkedList(Node head){
		
		if(head==null)
			return null;
		
		Node newHead = null;
		Node curHead = head;
		
		//loop invariant
		while(curHead != null){
			Node next = curHead.getNext();
			curHead.setNext(newHead);
			newHead = curHead;
			curHead = next;
		}
		
		return newHead;
	}
}
