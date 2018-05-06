package SortMethod;

public class QuickSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[]{5,3,4,2,1};
		QuickSort(A,0,A.length-1);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}

	}
	
	
	
	public static void QuickSort(int[] arr,int low,int high){
		
		while(low < high){
			int mid = Division(arr,low,high);
			QuickSort(arr,low,mid-1);
			QuickSort(arr,mid+1,high);
		}
		
	}



	private static int Division(int[] arr,int low,int high) {
		
		//选择一个基准数，一次循环将其放到属于它的位置
		int temp = arr[low];
		
		while(low <  high){
			while(low < high && arr[high] >= temp){
				high--;
			}
			arr[low] = arr[high];
			while(low <  high && arr[low] <= temp){
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		
		return low;
	}

}
