<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'emp.jsp' starting page</title>

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
    <h1><a href="main.jsp">Go to Main Page</a></h1>
    <h1>Personal Information</h1>
    <p><p><c:if test="${!empty message}">${message}</c:if><br><br>
    <table>
       <tr>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Username</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Password</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Name</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Sex</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Contact</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Department</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Position</td>
        </tr>
        <tr>
           
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.emp.username}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.emp.password}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.emp.name}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.emp.sex}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.emp.contact}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.dept.deptName}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.emp.position}</td>
        </tr>
     </table>
     
     <h1>Department Information</h1>
     <table>
     <tr>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Department Number</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Department Name</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Department Info</td>
     </tr>
     <tr>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.dept.deptNum}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.dept.deptName}</td>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;${map.dept.deptInfo}</td>
     </tr>
     </table>
     
     <p><p><a href="EmpController.html?method=findByUsername&username=${map.emp.username}">update</a><br><br>
     <p><p><a href="EmpController.html?method=delete&username=${map.emp.username}">delete</a><br><br>
       
  </body>
</html>
