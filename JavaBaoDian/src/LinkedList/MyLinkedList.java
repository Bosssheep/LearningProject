package LinkedList;

public class MyLinkedList {

	Node head = null;
	
	/**
	 * 向链表最后插入数据
	 * @param data
	 */
	public void addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node tmp = head;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	
	/**
	 * @param index 删除第index个
	 * @return 删除成功返回true
	 */
	public boolean deleteNode(int index){
		
		if(index < 1 || index > length()){
			return false;
		}
		
		if(index == 1){
			head = head.next;
			return true;
		}
		
		int i=1;
		Node tmp = head;
		while(tmp.next != null){
			if(i == index){
				tmp.next = tmp.next.next;
				return true;
			}
			tmp = tmp.next;
			i++;
		}
		return false;
	}
	
	/**
	 * @return 返回链表长度
	 */
	public int  length(){
		int length = 0;
		Node tmp = head;
		while(tmp.next != null){
			length++;
		}
		return length;
	}
	
	/**
	 * 对链表进行排序（冒泡排序）
	 * @return  返回排序后的链表头结点
	 */
	public Node orderList(){
		Node nextNode = null;
		int tmp = 0;
		Node curNode = head;
		while(curNode.next != null){
			nextNode = curNode.next;
			while(nextNode != null){
				if(curNode.data > nextNode.data){
					tmp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = tmp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		
		return head;
	}
	
	public void printList(){
		Node tmp = head;
		while(tmp != null){
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	
}
