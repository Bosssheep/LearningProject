package day29;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

/*
 * 
1.  注册驱动.  
2.	获得连接.
3.	获得语句执行平台
4.	执行sql语句
5.	处理结果
6.	释放资源
 */
public class JDBCdemo {
     public static void main(String[] args)throws ClassNotFoundException,SQLException{
		//1'注册驱动  反射技术，将驱动类加入内存
    	//使用java.sql.DriverManager类静态方法registerDriver(Driver driver)
    	//Driver 是一个接口，参数传递，Mysql驱动程序中的实现类
    	//DriverManager.registerDriver(new Driver());
    	 Class.forName("com.mysql.jdbc.Driver");
    	 
    	 //2'获得连接
    	 //static Connection getConnection(String url,String user,String password)
    	 //返回一个Connection接口的实现类,在mysql驱动程序里
    	 //url：     jdbc:mysql://主机IP:端口号/mysql的数据库名
    	 String url = "jdbc:mysql://localhost:3306/day29_jdbc";
    	 String username = "root";
    	 String password = "1996";
    	 Connection con = DriverManager.getConnection(url, username, password);
    	 System.out.println(con);
    	 
    	 //3'获取语句执行平台,获得连接对象
    	 //con对象调用方法 Statement createStatement(),返回一个Statement对象
    	 Statement stat = con.createStatement();
    	 System.out.println(stat);
    	 
    	 //4'执行sql语句 
    	 int res = stat.executeUpdate("insert into sort(sname,sprice,sdesc) values('化妆品','3000','变美丽')");
    	 
    	 //5'处理结果
    	 System.out.println(res);
    	 
    	 //6'释放资源 close()
    	 stat.close();
    	 con.close();
    	 
    	 
	}
}
