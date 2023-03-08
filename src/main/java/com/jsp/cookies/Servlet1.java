package com.jsp.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
//		step no 1
//		add a cookie
		Cookie cookie= new Cookie("username", name);
		resp.addCookie(cookie);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>Welcome to the app " + name + "</h1></body></html>");
		printWriter.write("<h1><a href='servlet2'>Go to Servlet2 </h1>");
	}
}
