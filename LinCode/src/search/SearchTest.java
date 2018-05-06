package search;
/**
 * 用于搜索算法的测试
 * @author HYChan
 *
 */
public class SearchTest {

	public static void main(String[] args) {
		int[] arr = new int[]{1,3,4,2,56,9,100};
		System.out.println(BinarySearch.BinarySearchMethod(arr,0,arr.length-1,9));

	}

}
