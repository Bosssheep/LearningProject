package SortMethod;
/**
 * —°‘Ò≈≈–Ú
 * time£∫2018.2.24
 * @author HYChan
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		
		int[] A = new int[]{5,3,4,2};
		SelectSort(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}

	}
	
	public static void SelectSort(int[] arr){
		
		for(int i = 0;i<arr.length-1;i++){
			
			int Index = i;
			
			for(int j = i+1;j<arr.length;j++){
				
				if(arr[Index]>arr[j])
					Index = j;
			}
			//swap arr[i] with arr[Index]
			int temp = arr[i];
			arr[i] = arr[Index];
			arr[Index] = temp;
		}
		
	}

}
