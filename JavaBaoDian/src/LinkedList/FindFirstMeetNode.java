package LinkedList;

public class FindFirstMeetNode {

	/**
	 * �ж����������Ƿ��ཻ
	 * @param list1
	 * @param list2 
	 * @return  ����ཻ�򷵻��ཻ�ĵ�һ����㣬���뽻�򷵻�null
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
		
		//��ʱtail1��tail2��������Ե�β�������ཻ��������Ӧ�����
		if(tail1 != tail2){
			return null;
		}
		
		Node t1 = list1.head;
		Node t2 = list2.head;
		
		//�ҳ��Ƚϳ����Ǹ��������ߣ����Ĳ�ֵ����
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
		//Ȼ����һ���ߣ�ֱ����������
		while(t1 != t2){
			t1 = t1.next;
			t2 = t2.next;
		}
		return t1;
	}
}
