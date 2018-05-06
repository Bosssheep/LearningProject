package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

	/*
	 * 计算活了多少天
	 * 输入 ：生日
	 * 日期变成毫秒值，通过  今天的日期-生日 计算活了多少天。
	 */
	public static void main(String[] args) throws Exception{
		
		function();

	}
	
	public static void function() throws Exception{
		
        System.out.println("请输入出生日期(格式 YYYY-MM-dd)：");
        
        //键盘输入出生日期 
		String birthdayString = new Scanner(System.in).next();
		
        //创建simpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//字符串转化成日期对象
		Date birthdayDate = sdf.parse(birthdayString);	
		
		//获得今天日期对象
		Date todayDate = new Date();
		
		//转化成毫秒值
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		
		//换算
		long second = todaySecond-birthdaySecond;
		
		if(second<0)
			System.out.println("还没出生呢~");
		else
			//打印
			System.out.println("你活了"+second/1000/60/60/24+"天");
	}


}
