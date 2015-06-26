<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>	
<head>
<title>User Login Flat Responsive widget Template :: w3layouts</title>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<style type="text/css">
	<!--
	body{
  background-image: url(images/bg.jpg);
  background-size: 100% 135%;}
  

  .id{
  text-align:right;
  color:fff;
  font-size:30;
  }
  .name{
color:fff;
font-size:20;
float:left;
  }
  .num{
folat:left;
  
  }
  .table{
  }
  a{
  text-decoration: none;
  color:fff;
  }

-->
</style>
</head>
<body>
	<div class="id">
		<h2>高校校友录</h2>
	</div>
	<div><hr></div>
	<div class="name">
	<ul>
	<li><a href="">个人信息管理&nbsp;</a></li><br>
	<li><a href='<c:url value="/UserServlet?method=findAll"/>'>查询与浏览</a></li><br>
	<li><a href="">信息发布</a></li><br>
	<li><a href="">通讯录</a></li>
		</ul>
	</div>
	<span class="num">
		<table cellspacing=0 cellpadding=0 height=529 style=border-color:fff;border-left-style:solid;border-width:2px><tr><td valign=top></table>
	</span>
</body>
</html>