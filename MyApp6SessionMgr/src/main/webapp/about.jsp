<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about us</title>
</head>
<body>
<%
 String myname1=(String)session.getAttribute("name_key");
%>
  <h3 style='color:green' >Welcome  :<%= myname1 %></h3><br><br>
  <h2>About Us Page----</h2>
  <div style="display:flex; justify-content:space-between; border:2px solid black;  ">
  <a style="margin:10px;text-decoration:none;" href="profile.jsp" >Home</a>
   <a style="margin:10px; text-decoration:none;" href="profile.jsp">Profile</a>
   <a style="margin:10px; text-decoration:none;" href="logoutServlet">Log out</a>
    </div>
  
</body>
</html>