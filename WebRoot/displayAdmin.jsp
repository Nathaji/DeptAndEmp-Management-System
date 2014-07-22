<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'displayAdmin.jsp' starting page</title>

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
    <h2 align="center">Department Information</h2>
    <table border="1" align="center">
     
       <tr>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;ID</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;deptNum</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;deptName</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;deptInfo</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Operation</td>
        </tr>
        <c:forEach items="${list}" var="item" varStatus="row">
           <tr>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.id}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.deptNum}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.deptName}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.deptInfo}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="DeptController.html?method=findById&id=${item.id}">update</a>
             <a href="DeptController.html?method=delete&id=${item.id}">delete</a>
              <a href="DeptController.html?method=showEmp&id=${item.id}">employee</a></td>
            </tr>
        </c:forEach>
    </table>
    <p><p><a href="insertDept.jsp">insert new department</a><br><br>
    <p><p><a href="logout.jsp">logout</a><br><br>
  </body>
</html>
