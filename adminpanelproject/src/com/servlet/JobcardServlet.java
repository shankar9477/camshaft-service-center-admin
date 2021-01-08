package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Jobcard;
import com.bean.customerbean;
import com.deo.JobcardDao;


@WebServlet("/JobcardServlet")
public class JobcardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    Jobcard jobcard = new Jobcard();
    JobcardDao jobdao=new JobcardDao();
    String operation;
    HttpSession session;
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		operation=request.getParameter("action");
		   session=request.getSession();
		   
		   List<Jobcard> custlist=jobdao.getAllRecords();
		   session.setAttribute("list",custlist);
		   response.sendRedirect("customer.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    
	}

}
