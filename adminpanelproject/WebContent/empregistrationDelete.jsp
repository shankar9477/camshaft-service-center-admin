<%@ page import="com.deo.EmployeeDao"%>
<jsp:useBean id="empbean" class="com.bean.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="empbean"/>
<%
int i=EmployeeDao.delete(empbean);
if(i>0)
{
	response.sendRedirect("employee.jsp");
}
else 
{
	response.sendRedirect("adminloginerror.jsp");
}

%>