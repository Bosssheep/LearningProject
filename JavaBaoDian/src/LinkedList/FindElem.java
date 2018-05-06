package LinkedList;

public class FindElem {

	/**
	 * �ҵ���������k����㣬���������㷵��
	 * ��������ָ�룬��������һ��ָ��p1��k-1����Ȼ������ָ��һ���ߣ�ֱ��p1.nextΪ�գ���ʱp2����ߵ�������k��
	 * @param linkedlist
	 * @param k  
	 * @return
	 */
	public static Node findElem(MyLinkedList linkedlist,int k){
		if(k < 1 ){
			return null;
		}
		Node p1 = linkedlist.head;
		Node p2 = linkedlist.head;
		
		for(int i=0;i < k-1;i++){
			p1 = p1.next;
		}
		while(p1.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
}
