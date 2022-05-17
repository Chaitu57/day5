package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.Dao.EmployeeDao;
import com.mindgate.pojo.Employee;
@WebServlet("/AddEmployeeSevlet")
public class AddEmployeeSevlet extends HttpServlet {
 private  String name;
 private double salary;
 private PrintWriter out;
 private EmployeeDao dao=new EmployeeDao();
private boolean result;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	out=response.getWriter();
	name=request.getParameter("txtname");
	salary=Double.parseDouble(request.getParameter("txtSalary"));
	
	out.println(name);
	out.println(salary);
	
	Employee employee=new Employee(0, name, salary);
	
    dao.addEmployee(employee);
    response.setContentType("text/html");
    
    if(result) {
    	response.sendRedirect("GetAllEmployeeServlet");
    }
    else {
    	out.println("fail to ada records");
    	out.print("<a href = employeehome.html> HOME PAGE </a>");
    }
	
	}

}
