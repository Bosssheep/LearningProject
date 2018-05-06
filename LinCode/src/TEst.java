import java.util.Scanner;
public class TEst {
public static void main(String[] args) {
	 Scanner reader=new Scanner(System.in);
     String S=reader.nextLine();
     String T=reader.nextLine();
     int sum = 0;
     System.out.println(S+" "+T);
     
     for( int i=0; i < S.length()-T.length()+1 ;i++ ){
    	 System.out.println("i="+i);
    	 
         for( int j=0; i < T.length(); j++){
        	 if(j==T.length())
        		 break;
        	 System.out.println("j="+j);
             if(T.charAt(j) != S.charAt(j+i)){
            	 System.out.println(T.charAt(j));
                 sum++;
                 System.out.println("sum="+sum);
             }
         }
     }
     System.out.print(sum);
}
}
