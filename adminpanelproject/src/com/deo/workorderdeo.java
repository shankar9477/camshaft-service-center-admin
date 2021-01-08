package com.deo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.workorderbean;
import com.connection.ConnectionManager;
public class workorderdeo 
{
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	//****************INSERT******************************
	public static int save(workorderbean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
	
		//int custworkorderid = bean.getCustworkorderid();
		int custid = bean.getCustid();
		System.out.println(custid);
		String custvehicleno = bean.getCustvehicleno();
		String custbrand = bean.getCustbrand();
		String custmodel = bean.getCustmodel();
		String custservices = bean.getCustservices();
		String custorderdate = bean.getCustorderdate();
		String custexpectedtime = bean.getCustexpectedtime();
		String custotherdetails = bean.getCustotherdetails();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("insert into custworkorder(custid,custvehicleno,custbrand,custmodel,custservices,custorderdate,custexpectedtime,custotherdetails) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, custid);
			ps.setString(2, custvehicleno);
			ps.setString(3, custbrand);
			ps.setString(4, custmodel);
			ps.setString(5, custservices);
			ps.setString(6, custorderdate);
			ps.setString(7, custexpectedtime);
			ps.setString(8, custotherdetails);
	
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
	//****************UPDATE******************************
		public static int update(workorderbean bean) 
		{
			int status = 0;
			PreparedStatement ps = null;
		
			int custworkorderid = bean.getCustworkorderid();
			int custid = bean.getCustid();
			String custvehicleno = bean.getCustvehicleno();
			String custbrand = bean.getCustbrand();
			String custmodel = bean.getCustmodel();
			String custservices = bean.getCustservices();
			String custorderdate = bean.getCustorderdate();
			String custexpectedtime = bean.getCustexpectedtime();
			String custotherdetails = bean.getCustotherdetails();
			try 
			{
				currentCon = ConnectionManager.getConnection();
				ps=currentCon.prepareStatement("update custworkorder set custid=?,custvehicleno=?,custbrand=?,custmodel=?,custservices=?,custorderdate=?,custexpectedtime=?,custotherdetails=? where custworkorderid=?");
				ps.setInt(1, custid);
				ps.setString(2, custvehicleno);
				ps.setString(3, custbrand);
				ps.setString(4, custmodel);
				ps.setString(5, custservices);
				ps.setString(6, custorderdate);
				ps.setString(7, custexpectedtime);
				ps.setString(8, custotherdetails);
				ps.setInt(9, custworkorderid);
				
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
		public static int delete(workorderbean bean) 
		{
			int status = 0;
			PreparedStatement ps = null;
			int custworkorderid = bean.getCustworkorderid();
			try 
			{
				currentCon = ConnectionManager.getConnection();
				ps=currentCon.prepareStatement("delete from custworkorder where custworkorderid=?");
				ps.setInt(1,custworkorderid);

	        	status=ps.executeUpdate();
			} 
			catch (Exception e) 
			{
				System.out.println("Deletion failed : An exception has occured! "+e);
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
		
		//******************getAllRecords*******************//
	public static List<workorderbean> getAllRecords()
	{
		List<workorderbean>list=new ArrayList<>();
		
		try 
		{	
			currentCon=ConnectionManager.getConnection();
			PreparedStatement ps= currentCon.prepareStatement("SELECT * from workorder");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
				{
					workorderbean orderbean = new workorderbean();
					orderbean.setCustworkorderid(rs.getInt("workorderid"));
					orderbean.setCustid(rs.getInt("custid"));
					orderbean.setCustvehicleno(rs.getString("custvehicleno"));
					orderbean.setCustbrand(rs.getString("custbrand"));
					orderbean.setCustmodel(rs.getString("custmodel"));
					orderbean.setCustservices(rs.getString("custservice"));
					orderbean.setCustorderdate(rs.getString("custorderdate"));
					orderbean.setCustexpectedtime(rs.getString("custexpectedtime"));
					orderbean.setCustotherdetails(rs.getString("custotherdetails"));
					
					list.add(orderbean);
				}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	//********Record by id******//
	
		public static workorderbean getRecordById(int custworkorderid)
		{
			workorderbean orderbean = null;
			try 
			{
				currentCon=ConnectionManager.getConnection();
				PreparedStatement pstmt = currentCon.prepareStatement("SELECT * from workorder where workorderid=?");
			    pstmt.setInt(1, custworkorderid);
			    ResultSet rs = pstmt.executeQuery();
				while(rs.next())
				{
					orderbean = new workorderbean();
					//orderbean.setCustworkorderid(rs.getInt("custworkorderid"));
					//orderbean.setCustid(rs.getInt("custid"));
					System.out.println(rs.getString("custvehicleno"));
					orderbean.setCustvehicleno(rs.getString("custvehicleno"));
					orderbean.setCustbrand(rs.getString("custbrand"));
					orderbean.setCustmodel(rs.getString("custmodel"));
					orderbean.setCustservices(rs.getString("custservices"));
					orderbean.setCustorderdate(rs.getString("custorderdate"));
					orderbean.setCustexpectedtime(rs.getString("custexpectedtime"));
					orderbean.setCustotherdetails(rs.getString("custotherdetails"));
				}	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			return orderbean;
		}
}
