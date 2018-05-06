package day21;

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] arr = {34,12,67}; //创建数组
		//int num = getElement(null,2);
		int num2 = getElement(arr,5);
		System.out.println(num2);
	}

	public static int getElement(int[] arr,int index){
		
		if(arr==null){
			throw new NullPointerException("arr指向的数组不存在");
		}
		if(index < 0 || index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("下标越界:"+index);
		}
		int element = arr[index];
		return element;
	}
}
