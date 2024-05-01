<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% 
 String clr=request.getParameter("color");
 %>
<body bgcolor='<%=clr %>'>
 <h2>Hello , Welcome to my JSP Page with: <%=clr %> color</h2>
</body>
</html>