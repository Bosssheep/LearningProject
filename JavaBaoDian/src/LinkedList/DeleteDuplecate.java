package LinkedList;

import java.util.Hashtable;

/**
 * ��������ɾ���ظ�����
 * @author HYChan
 *
 */
public class DeleteDuplecate {

	public static void  deleteDuplecate(MyLinkedList linkedlist){
		Hashtable<Integer,Integer> table = new Hashtable<>();
		Node tmp = linkedlist.head;
		//��һ�����϶������ظ�Ԫ��
		table.put(tmp.data,1);
		
		while(tmp.next!=null){
			if(table.containsKey(tmp.next.data)){
				tmp.next = tmp.next.next;
			}else{
				table.put(tmp.next.data, 1);
				tmp = tmp.next;
			}
		}	
	}
}
