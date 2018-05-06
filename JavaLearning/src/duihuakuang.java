/*例2.2、从对话框输入数值，检查是否为闰年*/

import javax.swing.JOptionPane;
public class duihuakuang {
	
	public static void main(String[] args){
		//请用户输入
		String yearString = JOptionPane.showInputDialog(null,"Enter a year","Example 2.2 Input (int)",JOptionPane.QUESTION_MESSAGE);
		
		//将字符串转化为整形
		int year = Integer.parseInt(yearString);
		
		//判断
		boolean isLeapYear = ((year % 4 == 0)&& (year % 100 != 0)||(year%400 == 0));
		
		//输入框输出结果
		JOptionPane.showMessageDialog(null,year+" is a leap year?  " + isLeapYear,"Example 2.2 Input (int)",JOptionPane.INFORMATION_MESSAGE);
		
		//退出
		System.exit(0);
		
	}
}
