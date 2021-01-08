<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="com.connection.ConnectionManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="com.deo.EmployeeDao"%>
<jsp:useBean id="empbean" class="com.bean.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="empbean"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View File</title>
</head>
<body>
	<%
		//String id = (request.getParameter("id"));
		Blob file = null;
		byte[] fileData = null;
		PrintWriter out1;
		String type=null;
		int id = empbean.getEmpid();
		try {
			Connection currentCon = ConnectionManager.getConnection();
			String sqlString = "SELECT emp prooffile FROM empregistration WHERE empid = " + id;
			Statement myStatement = currentCon.createStatement();
			ResultSet rs = myStatement.executeQuery(sqlString);
			if (rs.next()) {
				file = rs.getBlob("empprooffile");
				fileData = file.getBytes(1, (int) file.length());
			} else {
				out.println("file not found!");
				return;
			}
			Blob filename = file;
			//out1 = response.getWriter();
			//out1.println("view = "+filename.toString());
			//******Change******
			//InputStream in = filename.getBinaryStream();
			//OutputStream out11 = new FileOutputStream("OutputFile");
			//byte[] buff = new byte[4096]; 
			//int length = 0;
			//String name = in.toString();
			//out.println("name");
			//while ((length = in.read(buff)) != -1)
			//{
			 //   out11.write(buff, 0, length );
			//}
			//out11.close();
			//in.close();
			if(filename.toString().indexOf("pdf")>0)
			{
				//response.setContentType("application/pdf");
				type="application/pdf";
			}
			else if(filename.toString().indexOf("png")>0)
			{
				//response.setContentType("image/png");
				type="image/png";
			}
			else if(filename.toString().indexOf("jpeg")>0)
			{
				//response.setContentType("image/jpeg");
				type="image/jpeg";
			}
			else if(filename.toString().indexOf("jpg")>0)
			{
				//response.setContentType("image/jpg");
				type="image/jpg";
			}
			response.setContentType(type);
			response.setHeader("Content-Disposition", "inline");
			response.setContentLength(fileData.length);
			OutputStream output = response.getOutputStream();
			output.write(fileData);
			output.flush();
			//sresponse.getOutputStream().close();
		} catch (SQLException ex) {
			Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
		}
	%>

	<br>
	<br>
	<a href="index.jsp">Go to Main Page...</a>

	<div style="position: relative">
		<div
			style="position: fixed; bottom: 0; width: 100%; text-align: center">
			<p>
				<a
					href="https://www.youtube.com/user/TechWorld3g?sub_confirmation=1">CLICK
					HERE TO SUBSCRIBE</a>
			</p>
		</div>
	</div>

</body>
</html>