<%@ page import="com.deo.inventorydeo"%>
<jsp:useBean id="invbean" class="com.bean.inventorybean"></jsp:useBean>
<jsp:setProperty property="*" name="invbean"/>
<%
int i = inventorydeo.update(invbean);
if(i>0)
{
	response.sendRedirect("inventory.jsp");
}
else 
{
	response.sendRedirect("adminloginerror.jsp");
}

%>