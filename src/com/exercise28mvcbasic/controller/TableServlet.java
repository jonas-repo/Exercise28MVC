package com.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charse='utf-8'");
		
		//configurar el output
		
		PrintWriter output = response.getWriter();
		
		//obtener parametros
		
		int table = Integer.parseInt(request.getParameter("txtNumber"));
		int tableRange = Integer.parseInt(request.getParameter("txtRange"));
		
		output.append("<table>");
		output.append("<thead>");
		output.append("<tr>");
		output.append("<th>Number</th>");
		output.append("<th>Mutiplied by</th>");
		output.append("<th>Equals</th>");
		output.append("</tr>");
		output.append("</thead>");
		output.append("<tbody>");
		
		for (int i = 1; i <= tableRange; i++) {
			output.append("<tr>");
			output.append("<td>");
			output.append(""+table);
			output.append("</td>");
			output.append("<td>");
			output.append(""+i);
			output.append("</td>");
			output.append("<td>");
			output.append(""+(table*i));
			output.append("</td>");
			output.append("</tr>");
			
		}
		
		output.append("</tbody>");
		output.append("</table>");
		
		
		output.close();		
		
	}

}
