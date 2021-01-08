package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.technicianbean;
import com.deo.techniciandeo;

@WebServlet("/technicianservlet")
public class technicianservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		technicianbean techbean=new technicianbean();
		techniciandeo techdao=new techniciandeo();
		HttpSession session;
		String operation;
		
		operation=request.getParameter("action");
		session=request.getSession();
		
		List<technicianbean> techlist=techdao.getAllRecords();
		session.setAttribute("list", techlist);
		response.sendRedirect("technician.jsp");
		
	
	}
		
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			technicianbean techbean = new technicianbean();
			System.out.println(request.getParameter("techname"));
			techbean.setTechname(request.getParameter("techname"));
			techbean.setTechemail(request.getParameter("techemail"));
			techbean.setTechaddress(request.getParameter("techaddress"));
			techbean.setTechmobileno(request.getParameter("techmobileno"));
			techbean.setTechgender(request.getParameter("techgender"));
			
			int status = techniciandeo.save(techbean);
			if (status > 0) 
			{
				response.sendRedirect("technician.jsp");
				System.out.println("Inserted");
			}
			else
				response.sendRedirect("adminloginerror.jsp");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
