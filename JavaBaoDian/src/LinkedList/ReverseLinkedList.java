package LinkedList;

public class ReverseLinkedList {

	/**
	 * ��תһ���������ط�ת��������ͷ�ڵ�
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
			Node next = curNode.next; //�ݴ���һ�����
			
			curNode.next = preNode; //���������nextָ����һ�����
			
			preNode = curNode; //����ָ��һ������ƶ�
			curNode = next;
		}
		return preNode;
	}
}
