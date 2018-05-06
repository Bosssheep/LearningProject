import java.util.Scanner;
import java.util.Stack;

public class Main {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        for(int i = 0; i < t; i++){
	           String str = sc.next();
	           Stack<String> left=new Stack<String>();
	           int flag = 0;
	           while(!str.isEmpty()){
	        	   String c = str.substring(0, 1);
	        	   str = str.substring(1);
	        	   if(c.equals("(")){
	        		   left.push(c);
	        	   }else if(c.equals(")")){
	        		   if(left.isEmpty()){
	        			    System.out.println("No");
	        			    flag = 1;
	        			    break;
	        		    }
	        		    String l = left.pop();
	        		    if(!l.equals("(")){
	        		    	System.out.println("No");
	        		    	flag = 1;
	        		    	break;
	        		    }
	        	    }
	        	  
	           }
	           if(flag==0){
	        	   if(left.isEmpty())
		        	   System.out.println("Yes");
		           else
		        	   System.out.println("No");
	           }
	           
	        } 
	 }
}
