package DateLearn;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       addCalendar();
	}
	

	public static void getCal(){
		//获取日期对象
		Calendar cal = Calendar.getInstance();
		
		//public int void get(int field) //获取时间字段值
		int  year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);

		System.out.println(year+" "+month+" "+day);
	}
	
	public static void setCalendar(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH,9);
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
	}
	
	public static void addCalendar(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 280);
		
		int  year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);

		System.out.println(year+" "+month+" "+day);
	}
}
