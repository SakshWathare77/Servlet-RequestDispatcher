package com.formProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Details_form
 */
@WebServlet("/Details_form")
public class Details_form extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
         out.println("<h1 style='color:green'>Successfully Submitted Form<h1>");
         //out.println("<h1 style='color:purple'>Welcome to Servlet</h1>");
         String name=request.getParameter("username");
 		String pass=request.getParameter("password");
 		String email=request.getParameter("email");
 		String gender=request.getParameter("gender");
 		String course=request.getParameter("course");
 		String condition=request.getParameter("condition");	
         out.println("<h2>Name :"+name+ "</h2>");
			out.println("<h2>Password :"+pass+ "</h2>");
			out.println("<h2>Email :"+email+ "</h2>");
			out.println("<h2>Gender:"+gender+ "</h2>");
			out.println("<h2>Course :"+course+ "</h2>");
		
	}

}
