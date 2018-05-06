package Offer;
/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1]
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 题目要求不能使用除法
 * @author HYChan
 *
 */
public class multiplyArray {

	public static int[] Solution(int[] A){
		 int length = A.length;
	     if(length == 0||length==1)
	            return A;
	     
	     int[] B = new int[length];
	     
	     B[0] = 1;
	     for(int i=1;i<length;i++){
	          B[i] = B[i-1]*A[i-1];
	     }
	     int temp = 1;
	     for(int j = length-2;j>=0;j--){
	    	 temp *= A[j+1];
	    	 B[j] *= temp;
	     }
	     return B;
	}
	
	public static void main(String[] args) {
		int[] A	= new int[]{1,2,3,4,5};
		int[] B = Solution(A);
		for(int i = 0;i<B.length;i++){
			System.out.println(B[i]);
		}
	}
}