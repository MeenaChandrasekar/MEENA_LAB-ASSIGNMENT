

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private int counter=0;
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.print(counter++);
		
	}

}