package com.MyApp5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myemail=request.getParameter("email");
		String mypass=request.getParameter("pass1");
		PrintWriter out=response.getWriter();
		if(myemail.equals("atul@gmail.com")&& mypass.equals("123")) {
			request.setAttribute("name_key","Atul Chaudhary");
			RequestDispatcher rd= request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		 }
		else {
			response.setContentType("text/html");
			out.print("<h3 style='color:red'> Email id and Password did't matched! </h3>");
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
//			rd.forward(request, response);
			rd.include(request, response);

		}
	}

}
