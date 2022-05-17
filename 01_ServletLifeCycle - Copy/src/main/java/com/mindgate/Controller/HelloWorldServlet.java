package com.mindgate.Controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	//constructor 
    public HelloWorldServlet() { 
    	
        super();
      System.out.println("HelloWorldServlet object Created");
    }
  //init method
	public void init(ServletConfig config) throws ServletException { 

		System.out.println("init method called");
		
	}
	 //destroy method
	public void destroy() { 
		System.out.println(" destoy methd called");
	}
	 //para constructor
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service () called");
	}

}
