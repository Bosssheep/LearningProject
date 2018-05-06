
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       
	     int a=sc.nextInt();
	    
	     boolean flag = false;
 
	     int count = 0;
	     //¼ÇÂ¼1~aµÄËØÊı
         ArrayList<Integer> arr = new  ArrayList<Integer>();
         
         if(a == 1){
        	 System.out.println(0);
        	 return;
         }
         
         for (int i = 2; i <= a; i++)
         {
             flag = IsPrime(i);
             if (flag)
             {
            	 //System.out.println(i);
                 arr.add(i);
                 
             }
             
             for(Integer data:arr){
            	 int k = data;
            	 while(k <= i){
            		 if(k == i){
            			 count++;
            			 //System.out.println("k="+k);
            			 break;
            		 }else{
            			 k = k*data;
            		 }
            	 }
             }
             
         }
         //System.out.println(arr);
         System.out.println(count);	
	}
	
	 public static boolean IsPrime(int n)
     {
         boolean flag = true;
         
         for (int i = 2; i <= n - 1; i++)
         {
             if (n % i == 0)
             {
                 flag = false;
                 break;
             }
         }
         return flag;
     }
}
