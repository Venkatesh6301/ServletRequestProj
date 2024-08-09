package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class RegisterServlet extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//get PrintWriter
	   PrintWriter pw = res.getWriter();
	   //set res type
	   res.setContentType("text/html");
	   //read the form data
	   String name=req.getParameter("name");
	   String dob=req.getParameter("dob");
	   //gender
	   String gender=req.getParameter("gender");
	   //qlfy
	   String qlfy=req.getParameter("qlfy");
	   //hobbies
	   String[] hobbies = req.getParameterValues("hb");
	   List al=Arrays.asList(hobbies);
	   
	   //add bootstrap
	   pw.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\r\n"
	   		+ "\r\n"
	   		+ "<!-- jQuery library -->\r\n"
	   		+ "<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js\"></script>\r\n"
	   		+ "\r\n"
	   		+ "<!-- Popper JS -->\r\n"
	   		+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n"
	   		+ "\r\n"
	   		+ "<!-- Latest compiled JavaScript -->\r\n"
	   		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>");
	   //print data
	   pw.println("div style='width:600px;margin:auto;margin-top:50px;'>");
	   pw.println("<table class='table table-hover table-striped'>");
	   pw.println("<tr>");
	   pw.println("<td>Name</td>");
	   pw.println("<td>"+name+"</td>");
	   pw.println("</tr>");
	   pw.println("<tr>");
	   pw.println("<td>DOB</td>");
	   pw.println("<td>"+name+"</td>");
	   pw.println("</tr>");
	   pw.println("<tr>");
	   pw.println("<td>Name</td>");
	   pw.println("<td>"+dob+"</td>");
	   pw.println("</tr>");
	   pw.println("<tr>");
	   pw.println("<td>Gender</td>");
	   pw.println("<td>"+gender+"</td>");
	   pw.println("</tr>");
	   pw.println("<tr>");
	   pw.println("<td>Qualification</td>");
	   pw.println("<td>"+qlfy+"</td>");
	   pw.println("</tr>");
	   pw.println("<tr>");
	   pw.println("<td>Hobbies</td>");
	   pw.println("<td>"+hobbies+"</td>");
	   pw.println("</tr>");
	   pw.println("</table>");
	   pw.println("/div");
	   //close the stream
	   pw.close();
	   
}
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	   
	}
}
