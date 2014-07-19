<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'deptUpdate.jsp' starting page</title>

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
    <form name="f2" method="post" action="DeptController.html?method=update&deptNum=${dept.deptNum}">
       <p><p>Department Number: ${dept.deptNum}<br><br>
       <p><p>Department Name: ${dept.deptName}<br><br>
       <p><p>Department Info: ${dept.deptInfo}<br><br>
       <p> <p>Update deptNum:<input type="text" name="deptNum" /><br><br>
       <p> <p>Update deptName:<input type="text" name="deptName" /><br><br>
       <p> <p>Update deptInfo:<input type="text" name="deptInfo" /><br><br> 
       <input type="submit" value="update" name="submit"/><br><br>
       <input type="reset" value="reset" name="reset" /><br><br>
    </form>
  </body>
</html>
