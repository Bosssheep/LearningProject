/*
 * 将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串。
 */
package day15;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test = "i Have no friEnds";
        String result = convert(test);
        System.out.println(result);
	}
	
	public static String convert(String str){
		String start = str.substring(0,1);
		String end = str.substring(1);
		
		String big = start.toUpperCase();
		String small = end.toLowerCase();
		
		return big+small;
	}

}
