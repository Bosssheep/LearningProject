package SortMethod;
/**
 * √∞≈›≈≈–Ú
 * time£∫2018-3-22
 * @author HYChan
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		//Test
		int[] test = new int[]{3,1,2,4,6,5};
		BubbleSort.bubbleSort(test);
		
		for(Integer i:test){
			System.out.print(i+" ");
		}
	}
	
	public static void bubbleSort(int[] A){
		boolean flag = false;
		for(int i=0;i<A.length;i++){
			flag = false;
			for(int j = 0;j<A.length-i-1;j++){
				if(A[j]>A[j+1]){
					flag = true;
					//swap
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
			if(flag == false)
				break;
		}
	}

}
