package AboutArrays;
/**
 * 在数组中找第k大的数字
 * @author HYChan
 *
 */
public class GetKMax {

	public static int partition(int[] arr,int low,int high){
		
		int temp = arr[low];
		int i = low;
		int j = high;
		
		while(i < j){
			while(arr[j]>=temp && i < j)
				j--;
			while(arr[i]<=temp && i < j)
				i++;
			if(i < j){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		arr[low] = arr[i];
		arr[i] = temp;
		return i;
	}
	
	public static int find_k_max(int[] arr,int k,int low,int high){
		
	
		int mid = partition(arr,low,high);
		System.out.println("k="+k+" mid="+mid+" arr[mid]="+arr[mid]);
		if(mid == arr.length-k){
			System.out.println("找到啦,mid="+mid);
			return arr[mid];
		}
		else if(mid > arr.length-k){
			return find_k_max(arr,k,low,mid-1);//找mid的左半边
		}else{
			return find_k_max(arr,k,mid+1,high);//找mid右半边
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[]{12,3,66,33,2,77,4};//2,3,4,12,33,66,77  length=7
		int res = find_k_max(arr,4,0,arr.length-1);
		System.out.println(res);
	}
}
