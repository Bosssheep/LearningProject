<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细资料</title>
</head>
<body>
<%
	String num = request.getParameter("id");
   
	if(num!=null){
		int ID = Integer.parseInt(num);
		Class.forName("com.mysql.jdbc.Driver");
	  	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hclogin","root","root");
		String sql = "select * from members where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,ID);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()){
		%>
			<table border="1" align="center" cellpadding="0"  cellspacing="0"  width="600px" height="600px">
				<caption>详细资料</caption>
				<tr >
					<td width="150px">ID</td>
					<td><%=ID%></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><% out.print(rs.getString(2)); %></td>
				</tr>
				<tr>
					<td>性别</td>
					<td><% out.print(rs.getString(3)); %></td>
				</tr>
				<tr>
					<td>学院</td>
					<td><% out.print(rs.getString(4)); %></td>
				</tr>
				<tr>
					<td height="500px">自我介绍</td>
					<td><% out.print(rs.getString(5)); %></td>
				</tr>
				<tr>
					<td>希望加入的部门</td>
					<td><% out.print(rs.getString(6)); %></td>
				</tr>
				<tr>
					<td>调剂意愿</td>
					<td><% out.print(rs.getInt(7)); %></td>
				</tr>
				<tr>
					<td>手机号</td>
					<td><% out.print(rs.getString(8)); %></td>
				</tr>
				<tr>
					<td>QQ号</td>
					<td><% out.print(rs.getString(9)); %></td>
				</tr>
			</table>
			
		<%
			
		}
	}else{
		%>
			<script>
				alert("未选择");
				windows.location="success.jsp";
			</script>
			
		<%
	}
%>
</body>
</html>