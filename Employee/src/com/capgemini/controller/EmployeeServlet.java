package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.Init;


@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ArrayList<Employee> employee=new ArrayList<>();
	@Override
	public void init(ServletConfig config) {
		Employee e1=new Employee("spandhana",20000,"m",5);
		Employee e2=new Employee("sri",30000,"a",4);
		Employee e3=new Employee("neeraj",40000,"b",3);
		Employee e4=new Employee("teju",29000,"c",2);
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		
	}
    
    public EmployeeServlet() {
        super();
       
    }
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String employeeNumber= request.getParameter("employee_number");
		//out.println(employeeNumber);
		//out.println(Integer.parseInt(employeeNumber));
		int status=1;
		for(Employee temp: employee )
		{
			if(temp.getEmployeeNumber()==Integer.parseInt(employeeNumber)) {
				out.println("<table border=2><tr><th>Employee Id</th>");
				out.println("<th>Employee Name</th>");
				out.println("<th>Employee Salary</th>");
				out.println("<th>Employee Department</th></tr>");
				
				out.println("<tr><td>"+temp.getEmployeeNumber()+"</td>");
				out.println("<td>"+temp.getEmployeeName()+"</td>");
				out.println("<td>"+temp.getEmployeesalary()+"</td>");
				out.println("<td>"+temp.getEmployeeDepartment()+"</td></table>");
				//out.println(status);
				status=2 ;
				break;
				
			}
		}
		if(status!=2) {
			out.println("employee does not exit,<a href='employee.html'>Try again</a>") ;
		}
		
	
	}

	
	

}
