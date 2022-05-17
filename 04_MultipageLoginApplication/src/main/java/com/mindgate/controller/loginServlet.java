package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
 private PrintWriter out;
 private String login;
 private String password;
 	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       out=response.getWriter();
       login=request.getParameter("loginid");
		password=request.getParameter("passwords");
		if(login.equals("chaitanya") && password.equals("chaitanya@567"))
		{
			response.sendRedirect("sucess.html");
		}
		else
		{
			response.sendRedirect("failure.html");
		}
		doGet(request, response);
	}

}
