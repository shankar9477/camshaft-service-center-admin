package com.logout;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.userbean;

/**
 * Servlet implementation class adminlogoutservlet
 */
//@WebServlet("/adminlogoutservlet")
public class adminlogoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlogoutservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException 
	{
		try 
		{
			userbean user = new userbean();
			user.removeAdminusername();
			user.getAdminpassword();
			HttpSession session = req.getSession(false);
			session.removeAttribute("currentSessionUser");
			session.invalidate();
			resp.sendRedirect("adminlogin.jsp");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
