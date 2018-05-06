import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newstr = str.replaceAll("\\d+","");
	    int n = sc.nextInt();
	    splitString(newstr,n);
	    
	}
	
    
    public static void splitString(String src, int len) {  
    	System.out.println(src);
        if (null == src) {  
            return;  
        }  
   
        int byteNum = src.length();  
        byte bt[] = src.getBytes(); // 将String转换成byte字节数组  
   
        if (len > byteNum) {  
            len = byteNum;  
        }  
   
        // 判断是否出现了截半，截半的话字节对于的ASC码是小于0的值  
        if (bt[len] < 0) {  
            String subStrx = new String(bt, 0, --len);  
            System.out.println(subStrx);  
        } else {  
            String subStrx = new String(bt, 0, len);  
            System.out.println(subStrx);  
        }
    }  
    
}
