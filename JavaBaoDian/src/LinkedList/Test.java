package LinkedList;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@org.junit.Test
	public void test() {
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.addNode(19);
		linkedlist.addNode(88);
		linkedlist.addNode(22);
		linkedlist.addNode(1);
		linkedlist.addNode(58);
		linkedlist.addNode(58);
		linkedlist.addNode(19);
		linkedlist.printList();
		
		DeleteDuplecate.deleteDuplecate(linkedlist);
		linkedlist.printList();
	}

}
