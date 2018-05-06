<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
    
 <%
 	String num = request.getParameter("id");
 	
 	if(num == null||num.length()<=0){
 		//没有通过点击删除连接到这里，返回登录
 		Object obj = session.getAttribute("UserName");
 		if(obj != null){ 			
 			//非法删除
 %>			
 			<script type="text/javascript" language="javascript">
 				alert("操作有误");
 				window.location="success.jsp";
 			</script>
 <%
 		}else{
 %>
 			<script type="text/javascript" language="javascript">
 				alert("未登录！");
 				windows.location="login.jsp";
 			</script>
<% 
 		}
 		
 	}else{
 		int ids = Integer.parseInt(num);
 		
 		Class.forName("com.mysql.jdbc.Driver");
 		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hclogin","root","root");
 		String sql = "delete from members where id=?";
 		PreparedStatement ps = con.prepareStatement(sql);
 		ps.setInt(1,ids);
 		int rs = ps.executeUpdate();
 		
 		ps.close();
 		con.close();
 		
 		if(rs!=0){
 			//删除成功
 			%>
 			<script type="text/javascript" language="javascript">
 				alert("删除成功！");
 				window.location="success.jsp";
 			</script> 				
 			
 			<%
 		}else{
 			%>
 			<script type="text/javascript" language="javascript">
 				alert("删除失败！");
 				windows.location="success.jsp";
 			</script> 				
 			
 			<%			
 		}	
 	}

 %>
 