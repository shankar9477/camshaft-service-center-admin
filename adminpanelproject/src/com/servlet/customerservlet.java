package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.customerbean;
import com.deo.customerdeo;

@WebServlet("/customerservlet")
public class customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       customerbean customer=new customerbean();
       customerdeo custdao=new customerdeo();
       
       HttpSession session;
       String operation;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   operation=request.getParameter("action");
	   session=request.getSession();
	   
	   List<customerbean> custlist=custdao.getAllRecords();
	   session.setAttribute("list",custlist);
	   response.sendRedirect("customer.jsp");
		
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			customerbean custbean = new customerbean();
			custbean.setCustname(request.getParameter("custname"));
			custbean.setCustemail(request.getParameter("custemail"));
			custbean.setCustpassword(request.getParameter("custpassword"));
			custbean.setCustaddress(request.getParameter("custaddress"));
			custbean.setCustcity(request.getParameter("custcity"));
			custbean.setCuststate(request.getParameter("custstate"));
			custbean.setCustmobileno(request.getParameter("custmobileno"));
			
			int status = customerdeo.save(custbean);
			if (status > 0) 
			{
				response.sendRedirect("customer.jsp");
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
