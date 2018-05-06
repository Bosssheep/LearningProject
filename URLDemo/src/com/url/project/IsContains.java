package com.url.project;

public class IsContains {

	//arr:��������N�У�M�У�keyΪҪ���ҵ�Ԫ��
	public static boolean isContains(int[][] arr,int N,int M,int key){
		
		int left = 0;
		int right = M;
		int top = 0;
		int buttom = N;
		
		while(left<right&&top<buttom){
			int LineMid = top + (buttom-top)/2;
			int RowMid = left + (right-left)/2;
			if(key < arr[LineMid][RowMid]){
				top = LineMid;
				right = RowMid;
			}else if(key > arr[LineMid][RowMid]){
				buttom = LineMid;
				left = RowMid;
			}else{
				return true;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
		boolean res = isContains(arr,3,5,3);
		System.out.println(res);
		int[][] arr2 = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
		boolean res2 = isContains(arr,3,5,8);
		System.out.println(res2);
	}
}
