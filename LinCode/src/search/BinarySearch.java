package search;
/**
 * ’€∞Î≤È’“
 * 2018-3-24
 * @author HYChan
 *
 */
public class BinarySearch {

	public static int  BinarySearchMethod(int[] arr,int low,int high,int x){
		
		while(low < high){
			int mid = low + (high-low)/2;
			
			if(arr[mid] == x)
				return mid;
			if(arr[mid] < x ){
				
				low = mid + 1;
			}
			if(arr[mid] > x){
				high = mid -1;
			}
		}
		
		return -1;
	}
}
