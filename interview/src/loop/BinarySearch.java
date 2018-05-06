package loop;
/**
 * Searches element k in a sorted array.
 * @author HYChan
 * @param arr a sorted array
 * @param k the element to search
 * @return index in arr where k is.-1 is not found.
 *
 */
public class BinarySearch {

	public int binarySearch(int[] arr,int k){
		int a = 0;
		int b = arr.length;
		//Loop invariant:[a,b) is a valid range(a<=b).k may only be within [a,b)
		//�뿪��յĺô���[a,b)+[b,c) = [a,c) ,b-a = length([a,b)) , [a,a) = empty range
		while(a < b){
			
			int m = a + (b-a)/2;
			
			if(k < arr[m]){
				//k is within [a,m-1]
				b = m;
			}else if(k > arr[m]){
				//k is within [m+1,b)
				a = m+1;
			}else{
				return m;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(new int[]{1,2,10,15,100}, 15));
		System.out.println(bs.binarySearch(new int[]{1,2,10,15,100}, -2));
		System.out.println(bs.binarySearch(new int[]{1,2,10,15,100}, 20));
		
		System.out.println("===========");
		System.out.println(bs.binarySearch(new int[]{12}, 15));
		
		System.out.println("===========");
		System.out.println(bs.binarySearch(new int[]{12,13}, 13));
		System.out.println(bs.binarySearch(new int[]{12,13}, 12));
	}
}
