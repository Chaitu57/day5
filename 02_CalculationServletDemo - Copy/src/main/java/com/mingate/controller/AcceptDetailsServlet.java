package com.mingate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
   private  double number1;
     private double number2;
    private PrintWriter out;
    private  double result;
	
    public AcceptDetailsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		out=response.getWriter();
		number1=Double.valueOf(request.getParameter("textnumber1"));
		number2=Double.parseDouble(request.getParameter("textnumber2"));

		result=number1+number2;
		
		out=response.getWriter();
		out.println("Addition of: " + number1 + " + "
				+ number2);
		out.println(result);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
