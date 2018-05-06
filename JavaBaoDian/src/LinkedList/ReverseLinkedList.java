package LinkedList;

public class ReverseLinkedList {

	/**
	 * 反转一个链表，返回反转后的链表的头节点
	 * @param linkedlist
	 * @return
	 */
	public static Node reverseLinkedList(MyLinkedList linkedlist){
		if(linkedlist.head == null){
			return null;
		}
		Node preNode = null;
		Node curNode = linkedlist.head;
		
		while(curNode!=null){
			Node next = curNode.next; //暂存下一个结点
			
			curNode.next = preNode; //让这个结点的next指向上一个结点
			
			preNode = curNode; //两个指针一起向后移动
			curNode = next;
		}
		return preNode;
	}
}
