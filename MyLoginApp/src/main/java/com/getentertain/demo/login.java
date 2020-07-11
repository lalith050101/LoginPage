package com.getentertain.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login extends HttpServlet {
	@RequestMapping("login")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String  pass = request.getParameter("pass");
		
		if(uname.contentEquals("fresherpro") && pass.equals("fresherpro"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			
			response.sendRedirect("welcome.jsp");		
		}
		else
		{
						
			response.sendRedirect("home.jsp");
		}
		  
	}

}
