package LinkedList;

import java.util.Hashtable;

/**
 * 从链表中删除重复数据
 * @author HYChan
 *
 */
public class DeleteDuplecate {

	public static void  deleteDuplecate(MyLinkedList linkedlist){
		Hashtable<Integer,Integer> table = new Hashtable<>();
		Node tmp = linkedlist.head;
		//第一个结点肯定不是重复元素
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
