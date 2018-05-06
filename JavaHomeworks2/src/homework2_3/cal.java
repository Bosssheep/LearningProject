package homework2_3;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Calendar generating program
 * input:month(int) year(int)
 * output:Calendar of the month in the year
 * @author HYChan  2018-4-3
 *
 */

public class cal {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		try {
		    int month,year;
		   /* month = Integer.parseInt(args[0]);
		    year = Integer.parseInt(args[1]);*/

		   Scanner sc = new Scanner(System.in);
		   System.out.println("请输入你想获得的日历的月份和年份(●'◡'●)：");
		   month = sc.nextInt();
		   year = sc.nextInt();
		    cal.set(Calendar.MONTH,month-1);
		    cal.set(Calendar.YEAR,year);
		    cal.set(Calendar.DAY_OF_MONTH,1);
		   
		} catch( Exception e) {
		    e.printStackTrace();
		} 
		createCal(cal);
		
	}
	
	public static void createCal(Calendar cal){
		String[] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int year = cal.get(Calendar.YEAR);//年份
		String month = Month[cal.get(Calendar.MONTH)];//月份，通过月份数组Month将数值映射为字符串
		int date = cal.get(Calendar.DATE);//默认从1号开始
		int daysofmonth = getDaysByYearMonth(year,cal.get(Calendar.MONTH));//当月的天数
		
	    int start = cal.get(Calendar.DAY_OF_WEEK)-1;//这个月第一天在日历上的起始位置，也就是周几减去1
		/*表头*/
		System.out.println(month+"   "+year);
		System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
		
		for(int i = 0;i < start;i++){
			System.out.print("    ");
		}
		
		while(date <= daysofmonth){
			if(date < 10)
				System.out.print(date+"   ");
			else{
				System.out.print(date+"  ");
			}
			date++;
			start++;
			if(start == 7){
				System.out.println("");
				start = 0;
			}
		}
	    
	}
	
    /** 
     * 根据年 月 获取对应的月份 天数 
     * */  
    public static int getDaysByYearMonth(int year, int month) {  
          
        Calendar a = Calendar.getInstance();  
        a.set(Calendar.YEAR, year);  
        a.set(Calendar.MONTH, month);  
        a.set(Calendar.DATE, 1);  
        a.roll(Calendar.DATE, -1);  
        int maxDate = a.get(Calendar.DATE);  
        return maxDate;  
    }  

}
