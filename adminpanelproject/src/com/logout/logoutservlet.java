package com.logout;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.userbean;

/**
 * Servlet implementation class logoutservlet
 */
//@WebServlet("/logoutservlet")

public class logoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			/*userbean user = new userbean();
			user.removeEmpusername();
			user.getEmppassword();
			HttpSession session = req.getSession(false);
			session.removeAttribute("currentSessionUser");
			session.invalidate();
			resp.sendRedirect("emplogin.jsp");*/
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
