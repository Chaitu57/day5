package com.mindgate.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.apache.jasper.tagplugins.jstl.core.Url;

import com.mindgate.pojo.Employee;

import oracle.net.nt.ConnectDescription;

public class EmployeeDao {

	
	private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    
    
    private String driver="oracle.jdbc.driver.OracleDriver";
	private String user="system";
	private String password="mindgate123";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
    private String query="";
    private int resultCount=0;
    
    public Set<Employee> getAllEmployee(){
    	try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			query="select * from employee_details";
			preparedStatement=connection.prepareStatement(query);
			resultSet=preparedStatement.executeQuery();
			
			Set<Employee> employeeSet=new HashSet<Employee>();
			
			while(resultSet.next()) {
				
				int employeeId=resultSet.getInt("employee_id");
				String name=resultSet.getString("name");
				double salary=resultSet.getDouble("salary");
				
				
				Employee employee=new Employee(employeeId, name, salary);
				 employeeSet.add(employee);
			}
			return employeeSet;
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("exception");
            System.out.println(e.getMessage());
		}
    	finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("exception while closing!!");
	              System.out.println(e.getMessage());	
			
			}
		}
    	return null;
    	
    }
    
    public boolean addEmployee(Employee employee) {
    	try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
		query="insert into employee_details(name,salary) values(?,?)";
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setDouble(2, employee.getSalary());
			
			resultCount=preparedStatement.executeUpdate();
			if (resultCount>0) {
				return true;
			}
			else
				return false;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("exception");
              System.out.println(e.getMessage());		
		}
    	finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("exception while closing!!");
	              System.out.println(e.getMessage());	
				
			}
		}
    	
    	 return false;
    	 
    }
    
    
	
}
