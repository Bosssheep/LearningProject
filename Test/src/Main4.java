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
        byte bt[] = src.getBytes(); // ��Stringת����byte�ֽ�����  
   
        if (len > byteNum) {  
            len = byteNum;  
        }  
   
        // �ж��Ƿ�����˽ذ룬�ذ�Ļ��ֽڶ��ڵ�ASC����С��0��ֵ  
        if (bt[len] < 0) {  
            String subStrx = new String(bt, 0, --len);  
            System.out.println(subStrx);  
        } else {  
            String subStrx = new String(bt, 0, len);  
            System.out.println(subStrx);  
        }
    }  
    
}
