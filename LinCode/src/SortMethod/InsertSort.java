package SortMethod;
/*
 * ≤Â»Î≈≈–Ú Insert Sort
 * time:2018-3-22
 */
public class InsertSort {

	public static void main(String[] args) {
		// Test
		int[] arr = new int[]{2,4,1,5,3};
		insertSort(arr);
		
		for(Integer i:arr){
			System.out.print(i+" ");
		}

	}
	
	public static void insertSort(int[] A){
		
		for(int right = 1;right < A.length;right++){
			int temp = A[right];
			int left = right-1;
			while(left >= 0 && A[left]>temp){
				A[left+1] = A[left]; 
				left--;
			}
			A[left+1] = temp;
		}
	}

}
