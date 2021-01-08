package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bean.Employee;
import com.deo.EmployeeDao;

//@WebServlet("/empregistrationEdit")
@WebServlet(name = "empregistrationEdit", urlPatterns = "/empregistrationEdit")
@MultipartConfig(maxFileSize = 169999999)
public class empregistrationEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			Employee emp = new Employee();
			
			emp.setEmpname(request.getParameter("empname"));
			emp.setEmpemail(request.getParameter("empemail"));
			emp.setEmppassword(request.getParameter("emppassword"));
			emp.setEmpaddress(request.getParameter("empaddress"));
			emp.setEmpgender(request.getParameter("gender"));
		

			// System.out.println("***"+file.toString());
			int status = EmployeeDao.update(emp);

			if (status > 0) 
			{
				response.sendRedirect("employee.jsp");
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
