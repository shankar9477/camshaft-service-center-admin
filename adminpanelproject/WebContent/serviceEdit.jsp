<%@ page import="com.deo.servicedeo"%>
<jsp:useBean id="srvbean" class="com.bean.servicebean"></jsp:useBean>
<jsp:setProperty property="*" name="srvbean"/>
<%
int i = servicedeo.update(srvbean);
if(i>0)
{
	response.sendRedirect("service.jsp");
}
else 
{
	response.sendRedirect("adminloginerror.jsp");
}

%>