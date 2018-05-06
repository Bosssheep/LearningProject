package DateLearn;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormateDemo {

	public static void main(String[] args)throws Exception{
		
		formatdemo();

    }
	
	public static void formatdemo(){
		//1������SimpleDateFormat����д���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm����ss��");
		//2��SimpleDateFormat����÷���format()�����ڽ��и�ʽ��
		String date = sdf.format(new Date());
		System.out.println(date);		
	}
	
	public static void stringToDate()throws Exception{
		/*Date parse(String s)*/
		//1������SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//2��������󣬵��÷���parse ����String,����Date
		Date date = sdf.parse("1996-5-6");
		System.out.println(date);
	}
}
