import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	       
	    int input=sc.nextInt();
	 
	    int ressum = 0;
	    
	    for(int k=0;k < input;k++){
	    	//System.out.println("k="+k);
	    	int i=0;
	    	int sum = 0;
	    	int record = k;
	    	while(true){
		    	i = record%2;
		    	sum = sum*2+i;
		    	record /= 2;
		    	if(record==0) break;
		    }
	    	if(sum == k)
		    	{System.out.println(k+"是回文");ressum++;}
		    else
		    	System.out.println(k+"不是");
	    }
	    
	    
	    System.out.println("sum="+ressum);
	    	
	}
}
