package com.deo;
import java.sql.*;



public class admindeo 
{

	public static boolean validate(String email,String password){  
		boolean status=false;  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/camshaft","root","root");  
		      
		PreparedStatement ps=con.prepareStatement("select * from admin where adminusername=? and adminpassword=?");  
		ps.setString(1,email);  
		ps.setString(2,password);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
	
}
