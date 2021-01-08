package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.bean.Employee;
import com.bean.Jobcard;
import com.deo.EmployeeDao;
import com.deo.JobcardDao;

@WebServlet(name="EmployeeServlet",urlPatterns ="/EmployeeServlet")
@MultipartConfig(maxFileSize = 169999999)
public class EmployeeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	Jobcard jobcard =new Jobcard();
	JobcardDao jobcarddao=new JobcardDao();

	HttpSession session;
	String operation;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//================ List ===================//
		operation=request.getParameter("action");
	    session=request.getSession();
		
        List<Jobcard> emplist =jobcarddao.getAllRecords();
        session.setAttribute("list", emplist);
		
	    response.sendRedirect("jobcard.jsp");
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		// ============= INSERT ================//
		
		response.setContentType("save");
		
		try
		{
			Employee emp = new Employee();
			emp.setEmpname(request.getParameter("name"));
			emp.setEmpemail(request.getParameter("email"));
			emp.setEmppassword(request.getParameter("password"));
			emp.setMobile(request.getParameter("mobile"));
			emp.setEmpaddress(request.getParameter("address"));
	        emp.setCity(request.getParameter("city"));
	        emp.setState(request.getParameter("state"));
			emp.setEmpgender(request.getParameter("gender"));
		
			int status = EmployeeDao.save(emp);
			
			if(status > 0)
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
