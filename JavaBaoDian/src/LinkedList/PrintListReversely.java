package LinkedList;

public class PrintListReversely {

	/**
	 * 从尾到头输出单链表
	 * 使用递归
	 * @param listHead
	 */
	public static void printListReversely(Node listHead){
		
		if(listHead!=null){
			printListReversely(listHead.next);
			System.out.print(listHead.data+" ");
		}
	}
}
