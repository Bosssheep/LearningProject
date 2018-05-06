package demo;
/*
 * 实现匹配联系
 */
public class RegexDemo {

	public static void main(String[] args){
		String string = "15260646769";
		boolean b = string.matches("1[34578][0-9]{9}");
		System.out.println(b);
	}
}
