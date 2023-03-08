package com.jsp.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
		
		Cookie cookies[]= req.getCookies();
		String cookieName="";
		String cookieValue="";
		
		for (Cookie cookie : cookies) {
			cookieName=cookie.getName();
			cookieValue= cookie.getValue();
		}
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>Welcome back to the app " + cookieValue + "</h1></body></html>");
	}
}
