<%@ page import="com.deo.EmployeeDao"%>
<jsp:useBean id="empbean" class="com.bean.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="empbean"/>
<%
/* empbean.setEmpid(empbean.getEmpid());
empbean.setEmpname(empbean.getEmpname());
empbean.setEmpemail(empbean.getEmpemail());
empbean.setEmppassword(empbean.getEmppassword());
empbean.setEmpaddress(empbean.getEmpaddress());
empbean.setEmpgender(empbean.getEmpgender());
empbean.setEmpprooffile(empbean.getEmpprooffile());  */
empbean.setEmpid(Integer.parseInt(request.getParameter("empid")));
empbean.setEmpname(request.getParameter("empname"));
empbean.setEmpemail(request.getParameter("empemail"));
empbean.setEmppassword(request.getParameter("emppassword"));
empbean.setEmpaddress(request.getParameter("empaddress"));
empbean.setEmpgender(request.getParameter("gender"));


int i=EmployeeDao.update(empbean);
if(i>0)
{
	response.sendRedirect("employee.jsp");
}
else 
{
	response.sendRedirect("adminloginerror.jsp");
}

%>