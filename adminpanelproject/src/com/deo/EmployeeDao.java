package com.deo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.*;
import java.util.*;
import javax.servlet.http.Part;

import com.bean.Employee;

import com.connection.ConnectionManager;
public class EmployeeDao
{
	static Connection currentCon = null;
	
	//****************INSERT******************************
	
	public static int save(Employee bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		
		String empname = bean.getEmpname();
		String empemail = bean.getEmpemail();
		String emppassword = bean.getEmppassword();
		String mobile=bean.getMobile();
		String empaddress = bean.getEmpaddress();
		String city=bean.getCity();
		String state=bean.getState();
		String empgender = bean.getEmpgender();
		
		try 
		{
			
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("insert into employee(name,email,password,mobile,address,city,state,gender) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, empname);
			ps.setString(2, empemail);
			ps.setString(3, emppassword);
			ps.setString(4, mobile);
			ps.setString(5, empaddress);
			ps.setString(6, city);
			ps.setString(7, state);
			ps.setString(8, empgender);
			
	
        	status=ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("Insertion failed : An exception has occured! "+e);
		}
		finally 
		{
			if(ps!=null)
			{
				try 
				{
					ps.close();
				} 
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				ps = null;
			}
			if(currentCon != null)
			{
				try 
				{
					currentCon.close();
				} 
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				currentCon = null;
			}
		}
		return status;
	}
	
	
	//***********************UPDATE***************************
	
	
	public static int update(Employee bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		
		String empname = bean.getEmpname();
		String empemail = bean.getEmpemail();
		String emppassword = bean.getEmppassword();
		String mobile=bean.getMobile();
		String empaddress = bean.getEmpaddress();
		String city=bean.getCity();
		String state=bean.getState();
		String empgender = bean.getEmpgender();
    	int empid = bean.getEmpid();
    	
		
		try 
		{
			
	
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("update employee set name=?,email=?,password=?,mobile=?,address=?,city=?,state=?,gender=? where id=?");
			ps.setString(1, empname);
			ps.setString(2, empemail);
			ps.setString(3, emppassword);
			ps.setString(4,mobile);
			ps.setString(5, empaddress);
			ps.setString(6,city);
			ps.setString(7,state);
			ps.setString(8,empgender);
		    ps.setInt(7, empid);

        	status=ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("Insertion failed : An exception has occured! "+e);
		}
		finally 
		{
			if(ps!=null)
			{
				try 
				{
					ps.close();
				} 
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				ps = null;
			}
			if(currentCon != null)
			{
				try 
				{
					currentCon.close();
				} 
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				currentCon = null;
			}
		}
		return status;
	}
	
	//*******************DELETE***********************
	
	public static int delete(Employee bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		int empid = bean.getEmpid();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("delete from employee where id=?");
			ps.setInt(1,empid);

        	status=ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("Insertion failed : An exception has occured! "+e);
		}
		finally 
		{
			if(ps!=null)
			{
				try 
				{
					ps.close();
				} 
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				ps = null;
			}
			if(currentCon != null)
			{
				try 
				{
					currentCon.close();
				} 
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				currentCon = null;
			}
		}
		return status;
	}
	
	
//================ RECORDS VIEW ====================//

	public static List<Employee> getAllRecords()
	{
		List<Employee>list=new ArrayList<>();
		int status=0;
		
		try 
		{	
			currentCon=ConnectionManager.getConnection();
			PreparedStatement ps= currentCon.prepareStatement("SELECT * from employee");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
				{
					Employee empbean = new Employee();
					empbean.setEmpid(rs.getInt("id"));
					empbean.setEmpname(rs.getString("name"));
					empbean.setEmpemail(rs.getString("email"));
					empbean.setEmppassword(rs.getString("password"));
					empbean.setMobile(rs.getString("mobile"));
					empbean.setEmpaddress(rs.getString("address"));
					empbean.setCity(rs.getString("city"));
					empbean.setState(rs.getString("state"));
					empbean.setEmpgender(rs.getString("gender"));
					
					list.add(empbean);
				}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	//======================= RECORDES GET BY ID ===================//
	
	
	public static Employee getRecordById(int empid)
	{
		Employee empbean = null;
		try 
		{
			currentCon=ConnectionManager.getConnection();
			PreparedStatement pstmt = currentCon.prepareStatement("SELECT * from employee where id=?");
		    pstmt.setInt(1, empid);
		    ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				empbean = new Employee();
				
				empbean.setEmpid(rs.getInt("id"));
				empbean.setEmpname(rs.getString("name"));
				empbean.setEmpemail(rs.getString("email"));
				empbean.setEmppassword(rs.getString("password"));
			    empbean.setMobile(rs.getString("mobile"));
				empbean.setEmpaddress(rs.getString("address"));
				empbean.setCity(rs.getString("city"));
				empbean.setState(rs.getString("state"));
				empbean.setEmpgender(rs.getString("gender"));
				
			}	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return empbean;
	}
	
}
