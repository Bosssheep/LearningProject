package com.MaxSum;
/**
 * �������ִ�
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
		int[] End = new int[n];//End[k]��ʾ��arr[0]...arr[k]����arr[k]������һ������� End[k] = max(End[k-1],arr[k])
		int[] All = new int[n];//All[k]��ʾ��arr[0]....arr[k]����һ������� All[k] = max(All[k],End[k])
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