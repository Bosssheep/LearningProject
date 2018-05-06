/*
 * 获取指定字符串中，大写字母、小写字母、数字的个数。
 */

package day15;

public class program1 {

	public static void main(String[] args) {
		String str = "chy 3891 happy";
		method(str);

	}

	public static void method(String str){
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			
			if(ch>='A'&&ch<='Z'){
				bigCount++;
			}else if(ch>='a'&&ch<='z'){
				smallCount++;
			}else if(ch>='0'&&ch<='9'){
				numberCount++;
			}
		}
		System.out.println("bigCount="+bigCount);
		System.out.println("smallCount="+smallCount);
		System.out.println("numberCount="+numberCount);
	}
}