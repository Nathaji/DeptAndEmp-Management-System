<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'insert.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="background-color: rgba(153,204,0,0.4)">
    <script language="javascript" src="checkInfo.js"></script>
    <form name="f1" method="post" action="UserController.html?method=insert">
       <p> <p>Userename:<input type="text"  name="username" /> <br><br>
       <p> <p>Password:<input type="password" name="password" /><br><br>
       <p> <p>City:<input type="text" name="city" /><br><br>
       <p> <p>Phone:<input type="text" name="phone" /><br><br>
       <p> <p>deptNum:<input type="text" name="deptNum" /><br><br>
       <p> <p>isAdmin:<input type="text" name="isAdmin" /><br><br>   
       <input name="Button" type="button"  value="submit" onClick="checkEmp(f1)"><br><br>
       <input type="reset" value="reset" name="reset" ><br><br>
    </form>
  </body>
</html>
