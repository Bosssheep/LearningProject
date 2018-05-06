package LinkedList;

public class Node {

	int data;
	Node next = null;
	
	public Node(int data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
}
