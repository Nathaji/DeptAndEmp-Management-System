<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'register.jsp' starting page</title>

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
    <form name="f1" method="post" action="EmpController.html?method=insert">
       <p> <p>Username:<input type="text"  name="username" /> <br><br>
       <p> <p>Password:<input type="password" name="password" /><br><br>
       <p> <p>Name:<input type="text" name="name" /><br><br>
       <p> <p>Contact:<input type="text" name="contact" /><br><br>  
       <p> <p>Department Number:<input type="text" name="dept" /><br><br>
       <p> <p>Position:<input type="text" name="position" /><br><br>   
       <input type="submit"  value="submit" name="submit"><br><br>
       <input type="reset" value="reset" name="reset" ><br><br>
    </form>
  </body>
</html>
