package SortMethod;
/*
 * 归并排序
 * time:2018-3-22
 */
public class MergeSort {

	public static void main(String[] args) {

		int[] A = new int[]{5,3,4,2};
		mergeSort(A,0,A.length-1);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	 public static int[] mergeSort(int[] A ,int left,int right){
	        if(left < right){
	            int mid = left + (right - left)/2;
	            
	            //分
	            mergeSort(A,left,mid);
	            mergeSort(A,mid+1,right);
	            
	            //合并
	            mergeGetArray(A,left,mid,right);
	        }
	        return A;
	    }
	    
	 public static void mergeGetArray(int[] A,int left,int mid,int right){
	        int[] TempRes = new int[right-left+1];
	        int i = left,j = mid +1;
	        int k = 0;
	        
	        while(i <= mid && j <= right){
	            if(A[i]<A[j]){
	                TempRes[k++] = A[i++];

	            }else{
	                TempRes[k++] = A[j++];
	            }
	        }    
	        
	        while(i <= mid){
	            TempRes[k++] = A[i++];
	        }
	        
	        while(j <= right){
	            TempRes[k++] = A[j++];
	        }
	        
	        for(i = 0;i < TempRes.length;i++){
	            A[left+i] = TempRes[i];
	        }
	 }

}
