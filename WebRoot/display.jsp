<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'shows.jsp' starting page</title>

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
    <h2 align="center">Personal Information</h2>
    <table>
       <tr>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;ID</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Username</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Password</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;City</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Phone</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;DeptNum</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;isAdmin</td>
        </tr>
        <c:forEach items="${list}" var="item" varStatus="row">
           <tr>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${row.index + 1}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.username}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.password}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.city}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.phone}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.deptNum}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;${item.isAdmin}</td>
              <%-- <td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="UserController.html?method=findById&id=${item.id}">update</a></td>
                <td>&nbsp;&nbsp;<a href="UserController.html?method=delete&id=${item.id}">delete</a></td> --%>
                
              <c:if test ="${sessionScope.user.id == item.id}">
                <td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="UserController.html?method=findById&id=${item.id}">update</a></td>
                <td>&nbsp;&nbsp;<a href="UserController.html?method=delete&id=${item.id}">delete</a></td>
              </c:if>
            </tr>
        </c:forEach>
    </table>
    
    <h2 align="center">Department Information</h2>
    <table>
       <tr>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Department Number</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Department Name</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;Department Information</td>
       </tr>
       <tr>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;${dept.deptNum}</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;${dept.deptName}</td>
          <td>&nbsp;&nbsp;&nbsp;&nbsp;${dept.deptInfo}</td>
       </tr>
    </table>
    <p><p><a href="UserController.html?method=findByAll">see all employee</a><br>
    <p><p><a href="UserController.html?method=findByDept&deptNum=${sessionScope.user.deptNum}">return to your department</a><br>
    <p><p><a href=logout.jsp>logout</a><br>
  </body>
</html>
