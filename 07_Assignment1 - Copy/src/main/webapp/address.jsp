<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("txtname");
session.setAttribute("name", name);
%>
<form action="display.jsp" method="post"> 
Address<input type="text"  name="txtadress">
<br>
<input type="Submit" value="Submit">
 </form>
</body>
</html>