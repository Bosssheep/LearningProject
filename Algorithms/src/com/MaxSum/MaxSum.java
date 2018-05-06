package com.MaxSum;
/**
 * 求最大和字串
 * @author HYChan
 *
 */
public class MaxSum {

	public static void main(String[] args) {
		int[] arr = new int[]{-2,11,-4,13,-5,-2};
		System.out.println(MaxSubArray(arr));
	}
	
	
	public static int MaxSubArray(int[] arr){
		int n = arr.length;
		int[] End = new int[n];//End[k]表示从arr[0]...arr[k]包含arr[k]的最大的一段数组和 End[k] = max(End[k-1],arr[k])
		int[] All = new int[n];//All[k]表示从arr[0]....arr[k]最大的一段数组和 All[k] = max(All[k],End[k])
		End[n-1] = arr[n-1];
		All[n-1] = arr[n-1];
		End[0] = All[0] = arr[0];
		
		for(int i = 1;i < n;i++){
			End[i] = Math.max(End[i-1], arr[i]);
			All[i] = Math.max(End[i], All[i-1]);
		}
		return All[n-1];
	}
}
