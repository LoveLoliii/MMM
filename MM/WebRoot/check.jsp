<%@ page language="java" import="java.util.*,java.sql.*"  pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">   
    <title>check</title>
    
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <style type="text/css">
    body{color:red;
    text-align:center;}
    div {padding:25px;} 
    </style>
  </head>
  
  <body >
  
  <%request.setCharacterEncoding("utf-8");
   String username = request.getParameter("username");
   String userpassword = request.getParameter("userpassword");
   %>
 <% //加载驱动程序
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
    
        //建立连接
     String url = "jdbc:sqlserver://localhost:1433;DatabaseName=car";
     String user = "sa";
     String password = "123456";
    Connection conn = DriverManager.getConnection(url,user,password);
    
        //发送sql语句
   Statement stmt = conn.createStatement();
   
   ResultSet rs = stmt.executeQuery( " select * from PI where username='"+username+"'");
 
   if(rs.next()){
      if(rs.getString("userpassword").equals(userpassword)){%>
   <div> 登陆成功 </div><% 
   String content=2+";URL="+"main.jsp";
   response.setHeader("REFRESH",content);
    }
              //response.sendRedirect("main.jsp");}
      else    {
     %> <div>密码错误 </div>
       <% String content=2+";URL="+"index.html";
   response.setHeader("REFRESH",content);
     // response.sendRedirect("index.html");
     }
  }
  else{%>
   <div>用户名不存在 </div>
  <%
  String content=2+";URL="+"index.html";
   response.setHeader("REFRESH",content);
  //response.sendRedirect("index.html");
  }
	
	

    rs.close ( );
    stmt.close ( );
    conn.close ( );
%>
  </body>
</html>
