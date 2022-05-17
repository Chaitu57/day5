package com.mindgate.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private PrintWriter printwriter;
     private String name;       
   
    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         printwriter=response.getWriter();
         printwriter.println("hello from doget()");
         name=request.getParameter("txtUserName");
         printwriter.println("Hello :: "+ name);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		  printwriter=response.getWriter();
	         printwriter.println("hello from dopost()");
		
	}

}
