package LinkedList;

public class IsLoop {

	/**
	 * �ж������Ƿ��л�
	 * ʹ��fastָ���slowָ�룬����ָ��ͬʱ��ǰ�ƶ���fastÿ����������slowÿ����һ����
	 * ����л�һ�������fast==slow�����������޻���fast�ȵ���β��
	 * ע�⣺�˷������ܷ��ػ�����ڽ��
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
	 * ������ķ������Կ�������fast��slow����ʱ������slow����s����fast����2s��
	 * ��ʱ��fast�Ѿ��ڻ��ڱ�slow������nȦ���軷��Ϊr 
	 * �� 2s = s + nr ����> s = nr
	 * ��������ΪL����ڻ������������Ϊx������ͷ����ڵ����Ϊa����:
	 * 		s = a + x = nr
	 * 		a + x = (n-1)r + r = (n-1)r + L-a
	 * 		a = (n-1)r + (L-a-x)
	 * (L-a-x)Ϊ�����㵽����ڵ�ľ��루r-x��,��������ͷ�������==��n-1����ѭ��+�����㵽����ڵ�
	 * 
	 * @param linkedlist
	 * @return   ����л����򷵻ػ���ڽ�㣻���򷵻�null
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
				//�ҵ���������
				break;
			}
		}
		if(fast==null||fast.next==null)
			return null;
		
		//����ָ�룬һ��������ͷ��ʼ��һ���������㿪ʼ�ߣ�������ָ��������ʱ�򣬾��ǻ���ڽ��
		slow = linkedlist.head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
		
	}
}
