package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mindgate.Dao.EmployeeDao;
import com.mindgate.pojo.Employee;

@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {
private PrintWriter out;
private EmployeeDao dao= new EmployeeDao();
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		out=response.getWriter();
out.println("get all employee");	
Set<Employee> allemployee=dao.getAllEmployee();
HttpSession httpSession=request.getSession();
httpSession.setAttribute("data", allemployee);
response.sendRedirect("displayallemployees.jsp");
	
	
	
	}
	}

