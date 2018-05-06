package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oop.Node;

public class LinkedListCreator {

	/**
	 * create a linked list
	 * @param list the data to create the list
	 * @return head of the linked list.The returned linked list ends with last node with getNext() == null
	 */
	public Node createLinkedList(List<Integer> list){
		if(list.isEmpty())
			return null;
		
		Node firstNode = new Node(list.get(0));
		Node headOfSublist = createLinkedList(list.subList(1,list.size()));
		firstNode.setNext(headOfSublist);
		return firstNode;
	}
	
	public static void main(String[] args){
		LinkedListCreator creator = new LinkedListCreator();
		
		Node.printLinkedList(
				creator.createLinkedList(new ArrayList<>()));
		
		Node.printLinkedList(
		creator.createLinkedList(Arrays.asList(1)));
		
		Node.printLinkedList(
		creator.createLinkedList(Arrays.asList(1,2,3,4,5)));
	}
	
}
