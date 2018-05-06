import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = (int) Math.pow((float)6, n); 
        
        System.out.println("total="+total);
        System.out.print("[");
        for(int i=n;i<=6*n;++i){
        	float ratio = (float)getNSumCount(n,i)/total; 
        	if(i==n)
        		System.out.print("["+i+", "+ String.format("%.5f", ratio)+"]");
        	else 
        		System.out.print(" ["+i+", "+ String.format("%.5f", ratio)+"]");
        	if(i != 6*n)
        	   System.out.print(",");
        	else
        		System.out.print("]");
        }
            
        
        
        
	}
	
	public static int getNSumCount(int n, int sum){
	    if(n<1||sum<n||sum>6*n){
	        return 0;
	    }
	    if(n==1){
	        return  1;
	    }
	    int resCount=0;
	    resCount=getNSumCount(n-1,sum-1)+getNSumCount(n-1,sum-2)+
	             getNSumCount(n-1,sum-3)+getNSumCount(n-1,sum-4)+
	             getNSumCount(n-1,sum-5)+getNSumCount(n-1,sum-6);
	    return resCount;
	}

}
