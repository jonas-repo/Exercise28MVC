package com.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get parameters
		String username = request.getParameter("txtUser");
		String password = request.getParameter("txtPass");
		
		//mime type
		response.setContentType("application/json");
		PrintWriter output = response.getWriter();
		
		
		output.append("<html>");
		output.append("<head>");
		output.append("<title>");
		output.append("data input by the user");
		output.append("</title>");
		output.append("</head>");
		output.append("<body>");
		output.append("<h2>");
		output.append("Credentials of user");
		output.append("</h2>");
		output.append("<p>");
		output.append("User name: " +username);
		output.append("</p>");
		output.append("<p>");
		output.append("Password: " +password);
		output.append("</p>");
		output.append("</body>");
		output.append("</html>");
		output.close();
		
		
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("txtUser");
		String password = request.getParameter("txtPass");
		
		//mime type
				response.setContentType("application/json");
				PrintWriter output = response.getWriter();
				
		
		output.append("{");
		output.append("\" username\":\""+username+"\",");
		output.append("\" password\":\""+password+"\"");
		output.append("}");
		
		output.close();
	}



}
