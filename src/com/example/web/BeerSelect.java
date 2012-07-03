package com.example.web;

import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import com.example.model.BeerExpert;


public class BeerSelect extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");
	
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		//out.println("<br>Got beer color " + c);
		out.println("<br>Beer Selection advice " + c);

		Iterator it = result.iterator();
		while(it.hasNext()){
			out.print("<br/>try: " + it.next());
		}
	}
}
