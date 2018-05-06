package com.LCS;
/**
 * 求公共最长子序列
 * @author HYChan
 *
 */
public class LCS {

	static String x = "abcbdab",y="bdcaba";
	static int len1 = x.length();
	static int len2 = y.length();
	
	static char[][] b = new char[len1+1][len2+1]; //b[1...len1][1...len2]
	static int[][] c = new int[len1+1][len2+1]; //c[0...len1][0...len2]
	
	public static void main(String[] args) {
		LCS_Length(x, y);
		for(int i = 0;i <= len1;i++){
			for(int j = 0;j <= len2;j++)
			{	System.out.print(c[i][j]);}
			System.out.println(" ");
		}
		for(int i = 0;i <= len1;i++){
			for(int j = 0;j <= len2;j++)
			{	System.out.print(b[i][j]);}
			System.out.println(" ");
		}
		PrintLCS(b,x,len1,len2);
		
	}
	
	//计算LCS长度
	public static void LCS_Length(String x,String y){
		
		
		for(int i = 1;i <= len1;i++)
			c[i][0] = 0;
		for(int j = 0;j <= len2;j++)
			c[0][j] = 0;
		
		for(int i = 1;i <= len1;i++){
			for(int j = 1;j <= len2;j++){
				if(x.charAt(i-1)==y.charAt(j-1)){
					c[i][j] = c[i-1][j-1]+1;
					b[i][j] = '↖';
				}
				else if(c[i][j-1] <= c[i-1][j]){
					c[i][j] = c[i-1][j];
					b[i][j] = '↑';
					
				}
				else{
					c[i][j] = c[i][j-1];
					b[i][j] = '←';
					
				}
			}
		}
	}
	
	//构造LCS
	public static void PrintLCS(char[][] b,String x,int i,int j){
		if(i == 0||j == 0){
			return;
		}
		if(b[i][j] == '↖'){
			PrintLCS(b,x,i-1,j-1);
			System.out.print(x.charAt(i-1));
		}
		else if(b[i][j] == '↑'){
			PrintLCS(b, x, i-1, j);
		}
		else{
			PrintLCS(b, x, i, j-1);
		}
	}
	
}
