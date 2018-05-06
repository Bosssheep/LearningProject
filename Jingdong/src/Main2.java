import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

       String s = sc.next();
       String res =  new StringBuilder(s).reverse().toString();
       System.out.println("s="+s+"res="+res);
       
       int result = 0;
       
       for(int j = 0;j<s.length();j++){
    	   for(int len = 1;len < s.length()-j+1;len++){
    		   if(s.contains(res.substring(j, j+len))){
    			   System.out.println("start="+j+" len="+len);
        		   result++;
        		   
        	   }
    	   } 	   
       } 
       System.out.println(result);
}
}
