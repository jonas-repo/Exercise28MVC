package com.exercise28mvcbasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNumbersServlet
 */
@WebServlet("/PrimeNumbersServlet")
public class PrimeNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numero =Integer.parseInt(request.getParameter("txtNumber"));
		boolean isPrime = true;
		
		for (int i = 2; i < numero-1; i++) 
		{
			if(numero % i == 0)
			{
				isPrime=false;
			}
		}
		
		response.getWriter().append("The number is prime: " + isPrime);
	}

}
