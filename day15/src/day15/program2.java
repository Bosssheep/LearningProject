/*
 * ���ַ����У���һ����ĸת���ɴ�д��������ĸת����Сд������ӡ�ı����ַ�����
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
