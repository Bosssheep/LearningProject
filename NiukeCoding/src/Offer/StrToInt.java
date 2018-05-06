package Offer;
/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数
 * 数值为0或者字符串不是一个合法的数值则返回0
 * from:剑指Offer
 * @author HYChan
 *
 */
public class StrToInt {

	public static int StrToInteger(String str){
		
		if(str == null || str.length()==0){
			return 0;
		}
		
		int symbol = 0;
		int start = 0;
		
		char[] chars = str.toCharArray();
		if(chars[0] == '+'){
			start = 1;
		}else if(chars[0] == '-'){
			start = 1;
			symbol = 1;
		}
	  
		int result = 0;
		
		for(int i = start;i < chars.length;i++){
			if(chars[i] > '9' || chars[i] < '0'){
				return 0;
			}
			//int sum = result*10 + (int)(chars[i]-'0');
			
			result = result * 10 + (int)(chars[i]-'0');
		}
		if(symbol == 1)
			result = (-1)*result;
		
		return result;

	}
	
	public static void main(String[] args) {
		System.out.println(StrToInteger("3456"));
	}
}
