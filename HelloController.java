
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloController() {
		System.out.println("it is a defulat ctr");
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init method is called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("this is doget method...");
		PrintWriter out = response.getWriter();
		out.print(LocalDateTime.now());
	}

	@Override
	public void destroy() {
		System.out.println("destroy method is called");
	}

}