<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�������ݿ�</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
			<%
			request.setCharacterEncoding("GBK");
			String s_username = request.getParameter("username");
			String s_userpassword = request.getParameter("userpassword");
			String s_grade = request.getParameter("grade");
			String s_dep = request.getParameter("dep");
			String s_prof = request.getParameter("prof");
			String s_truename = request.getParameter("truename");
			String s_sex = request.getParameter("sex");
			String s_age = request.getParameter("age");
			String s_phone = request.getParameter("phone");
			String s_qqnum = request.getParameter("qqnum");
			 %>
			 
			 <%
				Connection conn=null;
				Statement stmt= null;
					//������������
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					//��������
				conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=car","sa","123456");
					//����sql���
				stmt = conn.createStatement();	
					//ִ��sql���
				stmt.executeUpdate("Insert Into PI(username,userpassword,grade,dep,prof,truename,sex,age,phone,qqnum) Values('"+s_username+"','"+s_userpassword+"','"+s_grade+"','"+s_dep+"','"+s_prof+"','"+s_truename+"','"+s_sex+"','"+s_age+"','"+s_phone+"','"+s_qqnum+"')");
			  %>

			  	<%
      		   	stmt.close();
     			 conn.close();
                %>
  </body>
</html>
