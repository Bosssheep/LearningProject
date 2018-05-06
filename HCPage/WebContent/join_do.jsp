<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("Name");
	String sex = request.getParameter("Sex");
	String academy = request.getParameter("Academy");
	String phone = request.getParameter("Phone");
	String qq = request.getParameter("QQ");
	String introduce = request.getParameter("Introduce");
	String a[] = request.getParameterValues("Department");
	String department = "";
	for(int i=0;i<a.length;i++){
		department += a[i]+" ";
	}
	String adjust = request.getParameter("Adjust");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hclogin","root","root");
	String sql = "insert into members(name,sex,academy,introduce,department,adjust,phone_number,QQ_number) value(?,?,?,?,?,?,?,?);";
	PreparedStatement ps = con.prepareStatement(sql);
	
	ps.setString(1,name);
	ps.setString(2, sex);
	ps.setString(3,academy);
	ps.setString(4,introduce);
	ps.setString(5,department);
	ps.setInt(6,Integer.parseInt(adjust));
	ps.setInt(7,Integer.parseInt(phone));
	ps.setInt(8,Integer.parseInt(qq));
	
	int num = ps.executeUpdate();
	
	ps.close();
	con.close();
	
	if(num!=0){
		%>
			<script type="text/javascript">
				alert("提交成功");
				
			</script>
		<%
		   out.print("为了能够及时获取动态以及和学姐学长们交流，建议加入2017华创纳新QQ群:XXXXXXX");
	}else{
		%>
			<script>
				alert("提交失败，请重试");
				window.location = "join.html";
			</script>
		<%
	}
	
%>



</body>
</html>