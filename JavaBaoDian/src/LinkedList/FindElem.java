package LinkedList;

public class FindElem {

	/**
	 * 找到链表倒数第k个结点，并将这个结点返回
	 * 设置两个指针，先让其中一个指针p1走k-1步，然后两个指针一起走，直到p1.next为空，此时p2结点走到倒数第k个
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
