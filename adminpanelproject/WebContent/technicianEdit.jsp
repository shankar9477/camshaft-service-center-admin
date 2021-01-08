<%@ page import="com.deo.techniciandeo"%>
<jsp:useBean id="techbean" class="com.bean.technicianbean"></jsp:useBean>
<jsp:setProperty property="*" name="techbean"/>
<%
int i = techniciandeo.update(techbean);
if(i>0)
{
	response.sendRedirect("technician.jsp");
}
else 
{
	response.sendRedirect("adminloginerror.jsp");
}

%>