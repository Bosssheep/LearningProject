package LinkedList;

public class SearchMid {

	/**
	 * 找到链表中间元素
	 * 使用双指针，其中一个指针走两步，一个走一步，当走得比较快的那个指针到了最后，慢的那个刚好走到中间
	 * @param linkedlist
	 * @return
	 */
	public static Node searchMid(MyLinkedList linkedlist){
		if(linkedlist.head == null){
			return null;
		}
		if(linkedlist.head.next==null){
			return linkedlist.head;
		}
		
		Node p = linkedlist.head;
		Node q = linkedlist.head;
		
		while(p!=null && p.next!=null && p.next.next!=null){
			p = p.next.next;
			q = q.next;
		}
		return  q;
	}
}
