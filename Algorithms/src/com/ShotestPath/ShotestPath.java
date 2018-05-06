package com.ShotestPath;

import java.util.Scanner;

public class ShotestPath {

	static int max = Integer.MAX_VALUE;
	
	public static void Path(int[][] arr,int vertex){
		int i,j,k,b,e,min;  
	    int[] w = new int[vertex];  
	    int[] path = new int[vertex];  
	    int[] temp = new int[vertex];  
	    
	    System.out.println("input the beginning point.");
	    
	    Scanner sc = new Scanner(System.in);
	    int start = sc.nextInt();
	    
	    
	    for(i = 0;i < vertex;i++){
	    	w[i] = arr[start][i];
	    	if(w[i] < max && w[i] > 0){
	    		path[i] = start;
	    	}
	    	temp[i] = 0;
	    }
	    temp[start] = 1;
	    w[start] = 0;
	    k = start;
	    
	    for(i = 0;i < vertex;i++){
	    	min = max;
	    	for(j = 0;j < vertex;j++){
	    		if(temp[j] == 0 && w[k]+arr[k][j] < w[j]){
	    			w[j] = w[k] + arr[k][j];
	    			path[j] = k;
	    		}
	    	}
	    }
	    
	    System.out.println("Input the ending point.");
	    int end = sc.nextInt();
	    
	    print(start,end,path);
	    
	}
	
	public static void print(int start,int end,int[] path){
		if(start == end){
			System.out.println(end);
			return;
		}
		else{
			print(start,path[end],path);
			System.out.println("-->"+end);
		}
	}
}
