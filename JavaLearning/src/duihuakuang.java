/*��2.2���ӶԻ���������ֵ������Ƿ�Ϊ����*/

import javax.swing.JOptionPane;
public class duihuakuang {
	
	public static void main(String[] args){
		//���û�����
		String yearString = JOptionPane.showInputDialog(null,"Enter a year","Example 2.2 Input (int)",JOptionPane.QUESTION_MESSAGE);
		
		//���ַ���ת��Ϊ����
		int year = Integer.parseInt(yearString);
		
		//�ж�
		boolean isLeapYear = ((year % 4 == 0)&& (year % 100 != 0)||(year%400 == 0));
		
		//�����������
		JOptionPane.showMessageDialog(null,year+" is a leap year?  " + isLeapYear,"Example 2.2 Input (int)",JOptionPane.INFORMATION_MESSAGE);
		
		//�˳�
		System.exit(0);
		
	}
}
