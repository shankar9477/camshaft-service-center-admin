package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.inventorybean;
import com.deo.inventorydeo;

@WebServlet("/inventoryservlet")
public class inventoryservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			inventorybean invbean = new inventorybean();
			invbean.setPartname(request.getParameter("partname"));
			invbean.setBrandname(request.getParameter("brandname"));
			invbean.setInwarddate(request.getParameter("inwarddate"));
			invbean.setOutwarddate(request.getParameter("outwarddate"));
			invbean.setPrice(Double.parseDouble(request.getParameter("price")));
			invbean.setQuantity(Double.parseDouble(request.getParameter("quantity")));
			int status = inventorydeo.save(invbean);
			
			System.out.println((Double.parseDouble(request.getParameter("price"))));

			if (status > 0) 
			{
				response.sendRedirect("inventory.jsp");
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
