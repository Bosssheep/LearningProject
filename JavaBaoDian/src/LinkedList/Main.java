package LinkedList;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.addNode(19);
		linkedlist.addNode(88);
		linkedlist.addNode(22);
		linkedlist.addNode(1);
		linkedlist.addNode(58);
		linkedlist.addNode(58);
		linkedlist.addNode(19);
		
		linkedlist.printList();
		System.out.println();
		
		/*
		//找到倒数第k个结点
		Node node = FindElem.findElem(linkedlist, 5);
		System.out.println(node.data);
		System.out.println();
		
		//反转链表
		Node node2 = ReverseLinkedList.reverseLinkedList(linkedlist);
		System.out.println(node2);
		
		//从尾到头打印单链表
		PrintListReversely.printListReversely(linkedlist.head);*/
		
		Node node = SearchMid.searchMid(linkedlist);
		System.out.println(node);
	}

}
