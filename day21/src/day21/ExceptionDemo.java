package day21;

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] arr = {34,12,67}; //��������
		//int num = getElement(null,2);
		int num2 = getElement(arr,5);
		System.out.println(num2);
	}

	public static int getElement(int[] arr,int index){
		
		if(arr==null){
			throw new NullPointerException("arrָ������鲻����");
		}
		if(index < 0 || index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("�±�Խ��:"+index);
		}
		int element = arr[index];
		return element;
	}
}
