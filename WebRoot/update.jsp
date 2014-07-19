<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'update.jsp' starting page</title>

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
    <form name="f2" method="post" action="EmpController.html?method=update&username=${emp.username}">
       <p><p>Your username: ${emp.username}<br><br>
       <p><p>Your old password: ${emp.password}<br><br>
       <p> <p>Update Password:<input type="password" name="password" /><br><br>
       <p> <p>Update Name:<input type="text" name="name" /><br><br>
       <p> <p>Update Sex:<input type="text" name="sex" /><br><br> 
       <p> <p>Update Contact:<input type="text" name="contact" /><br><br>
       <p> <p>Update Department Number:<input type="text" name="dept" /><br><br> 
       <p> <p>Update Position:<input type="text" name="position" /><br><br> 
       <input type="submit" value="update" name="submit"/><br><br>
       <input type="reset" value="reset" name="reset" /><br><br>
    </form>
  </body>
</html>
