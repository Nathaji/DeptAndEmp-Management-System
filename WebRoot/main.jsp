<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'main.jsp' starting page</title>

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
    <h1>Main Page</h1>
    <p><p><a href="EmpController.html?method=showInfo&username=${sessionScope.emp.username}">See Personal Information</a><br><br>
    <p><p>Show activities<br><br>
    <p><p>Show dept contacts<br><br>
    <c:if test="{sessionScope.emp.isAdmin}">
       <a href="deptInfo.jsp">Manage Department</a>
    </c:if>
  </body>
</html>
