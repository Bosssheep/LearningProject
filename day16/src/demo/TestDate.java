package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

	/*
	 * ������˶�����
	 * ���� ������
	 * ���ڱ�ɺ���ֵ��ͨ��  ���������-���� ������˶����졣
	 */
	public static void main(String[] args) throws Exception{
		
		function();

	}
	
	public static void function() throws Exception{
		
        System.out.println("�������������(��ʽ YYYY-MM-dd)��");
        
        //��������������� 
		String birthdayString = new Scanner(System.in).next();
		
        //����simpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//�ַ���ת�������ڶ���
		Date birthdayDate = sdf.parse(birthdayString);	
		
		//��ý������ڶ���
		Date todayDate = new Date();
		
		//ת���ɺ���ֵ
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		
		//����
		long second = todaySecond-birthdaySecond;
		
		if(second<0)
			System.out.println("��û������~");
		else
			//��ӡ
			System.out.println("�����"+second/1000/60/60/24+"��");
	}


}
