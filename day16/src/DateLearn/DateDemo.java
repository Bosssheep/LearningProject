package DateLearn;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		//获取当前日期毫秒值
		//long times = System.currentTimeMillis();
		
		Demo();
	}

	public static void Demo(){
		
		//空参构造，获取到当前操作系统时间
		Date date = new Date();
		
		//带参构造，传递一个毫秒值，传成对应的日期对象
		Date date1 = new Date(0);

		//Date类的getTime()方法,将时间转化成一个毫秒值
		long time = date.getTime();
		
		//Date类的setTime（），传递一个毫秒值，将毫秒值转化成一个日期对象
		date.setTime(0);
		
		//test
		System.out.println(date);
	}
}
