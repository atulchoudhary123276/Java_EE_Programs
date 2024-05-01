<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My profile</title>
</head>
<body>
<%
 String myname1=(String)request.getAttribute("name_key");
%>
  <h3 style='color:green' >Welcome  :<%= myname1 %></h3>
</body>
</html>