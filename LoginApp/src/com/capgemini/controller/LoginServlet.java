package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ServletContext context; 
  
    public LoginServlet() {
        super();
        
    }
    @Override
    public void init(ServletConfig config)throws ServletException{
    	context=config.getServletContext();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String username= request.getParameter("username");
			String password= request.getParameter("password");
			HashMap<String,String> users=(HashMap<String,String>)context.getAttribute("usersData");
			if(users.containsKey(username)) {
				if(users.get(username).equals(password)) {
					out.println("<h1>welcome:" +username +" </h1>");
				}
				else {
					out.println("<h3>Invalid credentials</h3>");
					out.println("<br><br><a href ='Login.html'Try again</a>");
				}
			}
			else {
				out.println("<h3>user does not exit</h3>");
				out.println("<br><br><a href ='Login.html'Try again</a>");
				
				
			}
			
		}
	}


