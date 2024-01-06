package com.formProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String course=request.getParameter("course");
		String condition=request.getParameter("condition");
		if(condition!=null)
		{
		if(condition.equals("checked"))
		{
//			
//			out.println("<h1 style='color:purple'>Welcome to Servlet</h1>");
//			out.println("<h2>Name :"+name+ "</h2>");
//			out.println("<h2>Password :"+pass+ "</h2>");
//			out.println("<h2>Email :"+email+ "</h2>");
//			out.println("<h2>Gender:"+gender+ "</h2>");
//			out.println("<h2>Course :"+course+ "</h2>");
			
			
			//saving 
			//means using RequestDispatcher(forward)method to printing deatails of form in next page ie. servlet 2(deatils_form.java)
			RequestDispatcher rd = request.getRequestDispatcher("details");//url pattern
			//forward to secondservlet i.e. details_form
			rd.forward(request, response);
		}
		else
		{
			out.println("<h1 style='color:red'>You have not accepted terms and condition</h1>");
		}
		}
		else
		{
			out.println("<h1 style='color:red'>You have not accepted terms and condition</h1>");
			
			
			//here i am using Request_Dispatcher(we use to forward or include response in another servlet)
			//means we are including form.html into servlet i.e form.java
			//get the obj. of requestDispatcher
			RequestDispatcher rd = request.getRequestDispatcher("form.html");
			//include
			rd.include(request, response);
			
		}
		
		
	
	}

}
