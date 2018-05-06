package SortMethod;

public class ShellSort {

	public static void main(String[] args) {
		int[] A = new int[]{5,3,4,2,20,11};
		shellSort(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}

	}
	
	public static void shellSort(int[] arr){
		int j = 0;
		int temp = 0;
		
		for(int incre = arr.length/2 ; incre>0 ;incre /= 2){
			
			for(int i = incre; i < arr.length;i++){
				temp = arr[i];			
				for(j = i-incre; j >= 0 ; j -= incre){
					
					if(temp < arr[j]){
						arr[j + incre] = arr[j];
					}else{
						break;
					}
				}
				arr[j + incre] = temp;
			}
		}
	}

}
