
  package com.servlet;
  
  import java.io.IOException; 
  import java.io.PrintWriter;
  
  import javax.servlet.RequestDispatcher;
  import javax.servlet.ServletException; 
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse; 
  import javax.servlet.http.HttpSession;
	/* import javax.servlet.jsp.tagext.TryCatchFinally;*/
  import com.bean.*; import
  com.deo.admindeo;
  
  @WebServlet("/adminloginservlet")
  public class adminloginservlet1 extends HttpServlet 
  {
	  private static final long serialVersionUID = 1L;
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
	  

	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    userbean user=new userbean();
	    String email=request.getParameter("email");  
	    String password=request.getParameter("password");  
	          
	    System.out.println("hi");
	    if(admindeo.validate(email, password))
	    {  System.out.println("welcome");
	    HttpSession session = request.getSession(true);
		session.setAttribute("currentSessionUser", email);
	    
	    response.sendRedirect("index.jsp");
		/*
		 * RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		 * rd.forward(request,response);
		 */
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("customer.jsp");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	  
  }

  } 
   
 