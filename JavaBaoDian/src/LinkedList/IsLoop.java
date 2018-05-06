package LinkedList;

public class IsLoop {

	/**
	 * 判断链表是否有环
	 * 使用fast指针和slow指针，两个指针同时向前移动，fast每次走两步，slow每次走一步，
	 * 如果有环一定会出现fast==slow的情况，如果无环则fast先到达尾部
	 * 注意：此方法不能返回环的入口结点
	 * @param linkedlist
	 * @return
	 */
	public static boolean isLoop(MyLinkedList linkedlist){
		Node fast = linkedlist.head;
		Node slow = linkedlist.head;
		
		if(fast == null){
			return false;
		}
		
		while(fast != null || fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				return true;
			}
		}
		return !(fast==null||fast.next==null);
	}
	
	/**
	 * 从上面的方法可以看出，当fast和slow相遇时，假设slow走了s步，fast走了2s步
	 * 此时，fast已经在环内比slow多走了n圈，设环长为r 
	 * 则 2s = s + nr ——> s = nr
	 * 假设链表长为L，入口环到相遇点距离为x，链表头到入口点距离为a，则:
	 * 		s = a + x = nr
	 * 		a + x = (n-1)r + r = (n-1)r + L-a
	 * 		a = (n-1)r + (L-a-x)
	 * (L-a-x)为相遇点到环入口点的距离（r-x）,即从链表头到环入口==（n-1）内循环+相遇点到环入口点
	 * 
	 * @param linkedlist
	 * @return   如果有环，则返回环入口结点；无则返回null
	 */
	public static Node FindLoopPort(MyLinkedList linkedlist){
		Node fast = linkedlist.head;
		Node slow = linkedlist.head;
		
		if(fast == null){
			return null;
		}
		
		while(fast != null || fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				//找到了相遇点
				break;
			}
		}
		if(fast==null||fast.next==null)
			return null;
		
		//两个指针，一个从链表头开始，一个从相遇点开始走，当两个指针相遇的时候，就是环入口结点
		slow = linkedlist.head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
		
	}
}
