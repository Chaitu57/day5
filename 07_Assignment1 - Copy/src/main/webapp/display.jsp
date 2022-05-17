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
String name=session.getAttribute("name").toString();
String adress=request.getParameter("txtadress");
%>
<h3>Hi <%=name %></h3>
<h3> location : <%= adress %></h3>
</body>
</html>