<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>华为纳新管理平台</title>
</head>
  
  <body>
  
   <% 
   /*
		Object obj= session.getAttribute("adname");
	    if(obj!=null){
	    	out.println("欢迎  ,登录成功！");
	    }else{
	    	session.setAttribute("message","请先登录");
			response.sendRedirect("login.html");
	    }
	 */

%>
		<center>
		<h1>华为纳新管理平台</h1>
		</center>
		
		<table border="1" width ="80%" cellpadding="0" cellspacing="0" align="center">
			<tr align="center">
				<td>序号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>学院</td>
				<td>希望加入的部门</td>
				<td>是否接受调剂</td>
				<td>联系电话</td>
				<td>详情</td>
			</tr>
			<tr>
			<%
				Class.forName("com.mysql.jdbc.Driver");
	  	  		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hclogin","root","root");
				String sql = "select * from members";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
			%>	
					<tr align="center" height="40px">
						<td><% out.print(rs.getInt(1)); %></td>
						<td><% out.print(rs.getString(2)); %></td>
						<td><% out.print(rs.getString(3)); %></td>
						<td><% out.print(rs.getString(4)); %></td>
						<td><% out.print(rs.getString(6)); %></td>
						<td><% out.print(rs.getString(7)); %></td>
						<td><% out.print(rs.getString(8)); %></td>
						<td>
							<a href="detail.jsp?id=<%=rs.getString(1) %>">详细</a>
							<a href="#" onclick="deleteAction(<%=rs.getInt(1) %>)">删除</a>
						</td>
					</tr>
			<%
				}
			%>
			</tr>
		</table>
		
		<script type="text/javascript" language="javascript">
		 		function deleteAction(id){
		 					
		 				var bo = confirm("是否确认删除该信息");
		 				if(bo){
		 				window.location="delete_do.jsp?id="+id;
		 				}
		 		}
		 </script>
  </body>
</html>