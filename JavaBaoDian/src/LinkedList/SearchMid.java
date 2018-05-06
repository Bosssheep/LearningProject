package LinkedList;

public class SearchMid {

	/**
	 * �ҵ������м�Ԫ��
	 * ʹ��˫ָ�룬����һ��ָ����������һ����һ�������ߵñȽϿ���Ǹ�ָ�뵽����������Ǹ��պ��ߵ��м�
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
