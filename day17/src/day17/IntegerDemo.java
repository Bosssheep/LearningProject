package day17;
/*
 * Integer类
 * 1、string 转化为 int 
 */
public class IntegerDemo {

	public static void main(String[] args) {
		function();
	}

	public static void function(){
		
		/*
		 * string 转化为 int 
		 */
		int number = Integer.parseInt("123");
		int number2 = Integer.parseInt("110",2);//识别为二进制数，输出结果为十进制
		
		/*
		 * int 转化为 string
		 */
		int i = 3;
		//(1) 
		String s1 = i+"";
		//(2)
		String s2 = Integer.toString(i);
		
		
		System.out.println(number2);
	}
}
