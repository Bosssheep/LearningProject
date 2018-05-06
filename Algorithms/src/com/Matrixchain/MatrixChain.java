package com.Matrixchain;
/*
 * 矩阵链乘法问题
 * Ai矩阵的行列分别是p[i-1]和p[i]
 */
public class MatrixChain {

	static int[] p = new int[]{30,35,15,5,10,20,25};
	static int n = p.length;
	static int[][] m = new int[n+1][n+1];
	static int[][] s = new int[n+1][n+1];
	
	public static void main(String[] args) {
		Matrix_Chain();
		
		Print_Parens(1, n-1);
	}
	
	public static void Matrix_Chain(){
		int n = p.length - 1;

		//m数组初始化
		for(int i = 1; i <= n;i++){
			m[i][i] = 0;
		}
		
		int len = 0 ;//the chain length
		int i = 0,j = 0;
		int tmp = 0;
		
		for( len = 2; len <= n;len++){
			
			for(i = 1;i <= n-len+1;i++){
				j = i+len-1;//因为j-i+1 = l
				m[i][j] = Integer.MAX_VALUE;
			
			//System.out.println("j="+j);
			
			for(int k = i;k <= j-1;k++){
				tmp = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
				//System.out.println("temp="+tmp);
				if(tmp < m[i][j]){
					m[i][j] = tmp;
					s[i][j] = k;
				}
			}
			
			System.out.print("m["+i+"]["+j+"]="+m[i][j]+" ");
			System.out.println("s["+i+"]["+j+"]="+s[i][j]);
			}
		}
	}
	
	public static void Print_Parens(int i,int j){
		if(i == j){
			System.out.print("A"+i);
		}
		else{
			System.out.print("(");
			Print_Parens(i, s[i][j]);
			Print_Parens(s[i][j]+1,j);
			System.out.print(")");
		}
	}
}
