package demo;

public class SelectSort {

	public static void main(String[] args){
		int[] arr={3,22,5,2,55,442,68};
		selectsort(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		
	}
	
	
	//Ñ¡ÔñÅÅÐò
	public static void selectsort(int[] arr){
		
		for(int i = 0 ; i<arr.length-1 ; i++){
			
			for(int j = i+1 ; j < arr.length ; j++){
				
				if( arr[i] > arr[j] ){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
}
