package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.servicebean;
import com.deo.servicedeo;

@WebServlet("/serviceservlet")
public class serviceservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		try 
		{
			servicebean srv = new servicebean();
			srv.setServicename(request.getParameter("servicename"));
			srv.setServicerate(Double.parseDouble(request.getParameter("servicerate")));

			int status = servicedeo.save(srv);

			if (status > 0) 
			{
				response.sendRedirect("service.jsp");
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
