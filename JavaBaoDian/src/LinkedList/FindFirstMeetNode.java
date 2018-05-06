package LinkedList;

public class FindFirstMeetNode {

	/**
	 * 判断两个链表是否相交
	 * @param list1
	 * @param list2 
	 * @return  如果相交则返回相交的第一个结点，不想交则返回null
	 */
	public static Node findFirstMeetNode(MyLinkedList list1,MyLinkedList list2){
		if(list1.head == null || list2.head == null){
			return null;
		}
		Node tail1 = list1.head;
		int len1 = 1;
		while(tail1 != null){
			tail1 = tail1.next;
			len1++;
		}
		Node tail2 = list2.head;
		int len2 = 1;
		while(tail2 != null){
			tail2 = tail2.next;
			len2++;
		}
		
		//此时tail1和tail2都到达各自的尾部，若相交，则两个应该相等
		if(tail1 != tail2){
			return null;
		}
		
		Node t1 = list1.head;
		Node t2 = list2.head;
		
		//找出比较长的那个链表，先走（长的差值）步
		if(len1>len2){
			int d = len1-len2;
			while(d!=0){
				t1 = t1.next;
				d--;
			}
		}
		else{
			int d = len2-len1;
			while(d!=0){
				t2 = t2.next;
				d--;
			}
		}
		//然后再一起走，直到两者相遇
		while(t1 != t2){
			t1 = t1.next;
			t2 = t2.next;
		}
		return t1;
	}
}
