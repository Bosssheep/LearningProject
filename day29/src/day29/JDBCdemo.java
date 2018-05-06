package day29;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

/*
 * 
1.  ע������.  
2.	�������.
3.	������ִ��ƽ̨
4.	ִ��sql���
5.	������
6.	�ͷ���Դ
 */
public class JDBCdemo {
     public static void main(String[] args)throws ClassNotFoundException,SQLException{
		//1'ע������  ���似����������������ڴ�
    	//ʹ��java.sql.DriverManager�ྲ̬����registerDriver(Driver driver)
    	//Driver ��һ���ӿڣ��������ݣ�Mysql���������е�ʵ����
    	//DriverManager.registerDriver(new Driver());
    	 Class.forName("com.mysql.jdbc.Driver");
    	 
    	 //2'�������
    	 //static Connection getConnection(String url,String user,String password)
    	 //����һ��Connection�ӿڵ�ʵ����,��mysql����������
    	 //url��     jdbc:mysql://����IP:�˿ں�/mysql�����ݿ���
    	 String url = "jdbc:mysql://localhost:3306/day29_jdbc";
    	 String username = "root";
    	 String password = "1996";
    	 Connection con = DriverManager.getConnection(url, username, password);
    	 System.out.println(con);
    	 
    	 //3'��ȡ���ִ��ƽ̨,������Ӷ���
    	 //con������÷��� Statement createStatement(),����һ��Statement����
    	 Statement stat = con.createStatement();
    	 System.out.println(stat);
    	 
    	 //4'ִ��sql��� 
    	 int res = stat.executeUpdate("insert into sort(sname,sprice,sdesc) values('��ױƷ','3000','������')");
    	 
    	 //5'������
    	 System.out.println(res);
    	 
    	 //6'�ͷ���Դ close()
    	 stat.close();
    	 con.close();
    	 
    	 
	}
}
