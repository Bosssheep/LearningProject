package com.LCS;
/**
 * 求最长公共字串
 * @author HYChan
 *
 */
public class LCS2 {

	public static void main(String[] args) {
		String x = "MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCALLAAQANKESSSESFISRLLAIVAD";
		String y = "MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCTLLAAQANKENSNESFISRLLAIVAG";
		int max = longestCommonSubstring(x, y);
		System.out.println(max);
	}
	public static int longestCommonSubstring(String x,String y){
		int max = 0;
		int len1 = x.length();
		int len2 = y.length();
		int left=0,right=0;
		int a[][] = new int[len1][len2];
		for(int i = 0;i < len1;i++){
			for(int j = 0;j < len2;j++){
				if(x.charAt(i) == y.charAt(j)){
					if(i==0||j==0){
						a[i][j] = 1;
					}else{
						a[i][j] = a[i-1][j-1]+1;
					}
					if(a[i][j]>max){
						max = a[i][j];
						left = i;
						right = j;
					}
				}
				else a[i][j] = 0;
			}
		}
		return max;
	}
	
}
