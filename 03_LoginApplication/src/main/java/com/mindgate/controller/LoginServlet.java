package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
private String login;
private String password;
private PrintWriter out;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		 out=response.getWriter();
		 login=request.getParameter("loginid");
		 password=request.getParameter("password");
		 
		 if(login.equals("chaitanya")  && password.equals("chaitanya@567") )
		 {
			 out.println("wlocome to LoginPage!!");
		 }
		 else {
			 out.println("invalid login or password !!");
		 }
	
	}

}
