package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Credit")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		
	
	
       
    
    public CreditCardServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String creditcard_name=request.getParameter("creditcard_name");
		int number=Integer.parseInt(request.getParameter("creditcard_number"));
		int cvv=Integer.parseInt(request.getParameter("cvv"));
		int month=Integer.parseInt(request.getParameter("month"));
		int year=Integer.parseInt(request.getParameter("year"));
		
		//out.println("<table border=2><tr><th>credit card details</th>");
		out.println("<table border=2><tr><th>creditcard_name</th>");
		out.println("<th>creditcard_number</th>");
		out.println("<th>cvv</th>");
		out.println("<th>Date</th></tr>");
		
		out.println("<tr><td>"+creditcard_name+"</td>");
		out.println("<td>"+number+"</td>");
		out.println("<td>"+cvv+"</td>");
		out.println("<td>"+month+"/"+year+"</td></tr>");
	}

	
	

}
