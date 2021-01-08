package com.deo;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Part;

import com.bean.servicebean;
import com.connection.ConnectionManager;
public class servicedeo 
{
static Connection currentCon = null;
	
	//****************INSERT******************************
	public static int save(servicebean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		
		String servicename = bean.getServicename();
		Double servicerate = bean.getServicerate();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("insert into service(servicename,rate) values(?,?)");
			ps.setString(1, servicename);
			ps.setDouble(2, servicerate);
	
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
	
	public static int update(servicebean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		
		int serviceid = bean.getServiceid();
		String servicename = bean.getServicename();
		Double servicerate = bean.getServicerate();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("update service set servicename=?,servicerate=? where serviceid=?");
			ps.setString(1, servicename);
			ps.setDouble(2, servicerate);
			ps.setInt(3, serviceid);

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
	public static int delete(servicebean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		int serviceid = bean.getServiceid();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("delete from service where serviceid=?");
			ps.setInt(1,serviceid);

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

	
	// ============= Show All Records =================//
	
	public static List<servicebean> getAllRecords()
	{
		List<servicebean>list=new ArrayList<>();
		int status=0;
		
		try 
		{	
			currentCon=ConnectionManager.getConnection();
			PreparedStatement ps= currentCon.prepareStatement("SELECT * from service");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
				{
					servicebean srvbean = new servicebean();
					srvbean.setServiceid(rs.getInt("id"));
					srvbean.setServicename(rs.getString("servicename"));
					srvbean.setServicerate(rs.getDouble("rate"));

					list.add(srvbean);
				}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	//===================== Records get by id ===================//
	
	public static servicebean getRecordById(int serviceid)
	{
		servicebean srvbean = null;
		try 
		{
			currentCon=ConnectionManager.getConnection();
			PreparedStatement pstmt = currentCon.prepareStatement("SELECT * from service where serviceid=?");
		    pstmt.setInt(1, serviceid);
		    ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				srvbean = new servicebean();
				srvbean.setServiceid(rs.getInt("serviceid"));
				srvbean.setServicename(rs.getString("servicename"));
				srvbean.setServicerate(rs.getDouble("servicerate"));
			}	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return srvbean;
	}
}
