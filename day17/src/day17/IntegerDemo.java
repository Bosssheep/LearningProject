package day17;
/*
 * Integer��
 * 1��string ת��Ϊ int 
 */
public class IntegerDemo {

	public static void main(String[] args) {
		function();
	}

	public static void function(){
		
		/*
		 * string ת��Ϊ int 
		 */
		int number = Integer.parseInt("123");
		int number2 = Integer.parseInt("110",2);//ʶ��Ϊ����������������Ϊʮ����
		
		/*
		 * int ת��Ϊ string
		 */
		int i = 3;
		//(1) 
		String s1 = i+"";
		//(2)
		String s2 = Integer.toString(i);
		
		
		System.out.println(number2);
	}
}
