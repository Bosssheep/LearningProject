<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>MY Blog</title>
		
		<style>
			*{padding:0px;margin:0px;}
			.container{width:1024px; 
					   height:600px; 
					   background:#ccc; 
					   margin:0 auto;
					   }
			.blogheader{width:100%; 
						height:200px; 
						background:#333397;}
			.blogimg{display:block;
			         width:150px;
			         height:150px;
					 margin-left:30px;
					 margin-top:30px;
					 float:left}
			.blogtitle{color:#fff;
					   margin-left:20px;
					   margin-top:80px;
					   font-size:30px;
					   float:left;
					   }
			.showTime{color:#fff;
					  font-size:20px;
					  margin-left:300px;
					  float：left;
					  }
			.blogcontent{width:100%;
						 height:600px;
						 background:#333397;}
			.content_left{width:200px;
						  height:600px;
						  background:#3366cc;
						  float:left;}	
						  
			.content_right{width:1024px;
						  height:600px;
						  background:#ccc;
						  }
			.barTitle{text-align:center;}
			.caption{font-size:30px;
			         font-weight:10px}
			.content_title{text-align:center;}   
		</style>
		
		<script type="text/javascript" language="javascript">
			window.onload = function(){
				var obj = document.querySelector(".showtime");
				
				var fun = function(){
					//获取当前客户端的系统时间
					var time = new Date();
					var result = "";
					result = time.getFullYear()+"年";
					result += (time.getMonth()+1)+"月";
					result += (time.getDate())+"日";
					result += "&nbsp;&nbsp;"+time.getHours()+":";
					result += time.getMinutes()+":";
					result += time.getSeconds();
					 
				}
				setInterval(fun,100000);

			}
		</script>
		
	</head>
	
	<body style="background:#cccfff">
		<div class="container">
		
		    <!-- header -->
			<header class="blogheader">
				<img class="blogimg" src="imgs/header.jpg"/>
				<h1 class="blogtitle">CHY no no no no Blog</h1>
				<lable class="showTime">2017年7月20日</lable>
			</header>
			<!-- header end -->
			
			<!-- content -->
			<div class="blogcontent">
				<aside class="content_left">
					<table border="0" width=100% cellpadding="0" cellspacing="0" style="margin-top:30px;font-size:15px;font-weiht:4px">
					 <tr>
					 	<td><h3>Hello，HTML！</h3></td>
					 </tr>
					 <tr>
					 	<td><h3>第二课</h3></td>
					 </tr>
					 <tr>
					 	<td><h3>第三课</h3></td>
					 </tr>
					 <tr>
					 	<td><h3>第四课</h3></td>
					 </tr>
					 <tr>
					 	<td><h3>第五课</h3></td>
					 </tr>
					</table> 
				</aside>
				
				<section class="content_right">
					<header>
						<h1 class="content_title">Hello,HTMl!</h1>
						
					</header>					
				</section>
				
			</div>
			<!-- content end -->
			
		</div>
		
  
	</body>
	
</html>