<%@ page import="com.deo.customerdeo"%>
<jsp:useBean id="custbean" class="com.bean.customerbean"></jsp:useBean>
<jsp:setProperty property="*" name="custbean"/>
<%
int i = customerdeo.delete(custbean);
if(i>0)
{
	response.sendRedirect("customer.jsp");
}
else 
{
	response.sendRedirect("adminloginerror.jsp");
}

%>