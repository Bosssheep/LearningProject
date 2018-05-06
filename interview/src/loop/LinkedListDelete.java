package loop;
//É¾³ýÁ´±í½áµã
public class LinkedListDelete {

	public Node deleteEquals(Node head,int value){
		
		while(head!=null && head.getValue() == value){
			head = head.getNext();
		}
		if(head == null)
			return null;
		
		Node prev = head;
		while(prev.getNext() != null){
			if(prev.getNext().getValue()==value){
				prev.setNext(prev.getNext().getNext());
			}else{
				prev = prev.getNext();
			}
		}
		
		return head;
	}
}
