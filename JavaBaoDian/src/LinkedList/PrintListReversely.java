package LinkedList;

public class PrintListReversely {

	/**
	 * ��β��ͷ���������
	 * ʹ�õݹ�
	 * @param listHead
	 */
	public static void printListReversely(Node listHead){
		
		if(listHead!=null){
			printListReversely(listHead.next);
			System.out.print(listHead.data+" ");
		}
	}
}
