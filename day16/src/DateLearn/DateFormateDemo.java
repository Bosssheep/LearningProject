package DateLearn;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormateDemo {

	public static void main(String[] args)throws Exception{
		
		formatdemo();

    }
	
	public static void formatdemo(){
		//1、创建SimpleDateFormat对象，写入格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分钟ss秒");
		//2、SimpleDateFormat类调用方法format()对日期进行格式化
		String date = sdf.format(new Date());
		System.out.println(date);		
	}
	
	public static void stringToDate()throws Exception{
		/*Date parse(String s)*/
		//1、创建SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//2、子类对象，调用方法parse 传递String,返回Date
		Date date = sdf.parse("1996-5-6");
		System.out.println(date);
	}
}
