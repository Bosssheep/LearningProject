<%@page import="java.sql.*"%> 
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
	 String users = request.getParameter("adname");
	 String pwds = request.getParameter("password");
	 
	 if(users!=null &&  pwds !=null){
	 	//数据库交互
	 	//1.加载驱动程序
	 	Class.forName("com.mysql.jdbc.Driver");
	 	//2.创建数据库连接对象
	 	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HCLogin","root","root");
	 	//3.创建预编译sql的对象
	 	String sql = "select * from login where username=?";
	 	PreparedStatement ps = con.prepareStatement(sql);
	 	//4.设置参数
	 	ps.setString(1,users);
	 	//5.执行
	 	ResultSet rs = ps.executeQuery();
	 	if(rs.next()){
	 		//根据帐号查找到匹配的信息
	 		String password = rs.getString("password");
	 		if(password.equals(pwds)){
	 			//登陆成功
	 			session.setAttribute("username",users);
	 			response.sendRedirect("success.jsp");
	 		}else{
	 			//登陆失败 
		 		session.setAttribute("message","密码错误！");
		 		rs.close();
		 		ps.close();
		 		con.close();
		 		response.sendRedirect("SignIn.html");
	 		}
	 	}else{
	 		//没有找到帐号匹配的信息
	 		session.setAttribute("message","该帐号不存在！");
	 		rs.close();
	 		ps.close();
	 		con.close();
	 		response.sendRedirect("SignIn.html");
	 	}
	 }else{ 
		 		session.setAttribute("message","帐号或密码不能为空"); 
		 		response.sendRedirect("SignIn.html");
	 }
%>