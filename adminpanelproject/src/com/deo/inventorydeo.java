package com.deo;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.inventorybean;
import com.connection.ConnectionManager;
public class inventorydeo 
{
static Connection currentCon = null;
	
	//****************INSERT******************************
	public static int save(inventorybean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		
		String partname = bean.getPartname();
		String brandname = bean.getBrandname();
		String inwarddate = bean.getInwarddate();
		String outwarddate = bean.getOutwarddate();
		Double price = bean.getPrice();
		Double quantity = bean.getQuantity();
	
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("insert into inventory(partname,brandname,inwarddate,outwarddate,price,quantity) values(?,?,?,?,?,?)");
			ps.setString(1, partname);
			ps.setString(2, brandname);
			ps.setString(3, inwarddate);
			ps.setString(4, outwarddate);
			ps.setDouble(5, price);
			ps.setDouble(6, quantity);
			
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
	public static int update(inventorybean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		
		int inventoryid = bean.getInventoryid();
		String partname = bean.getPartname();
		String brandname = bean.getBrandname();
		String inwarddate = bean.getInwarddate();
		String outwarddate = bean.getOutwarddate();
		Double price = bean.getPrice();
		Double quantity = bean.getQuantity();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("update inventory set partname=?,brandname=?,inwarddate=?,outwarddate=?,price=?,quantity=? where inventoryid=?");
			ps.setString(1, partname);
			ps.setString(2, brandname);
			ps.setString(3, inwarddate);
			ps.setString(4, outwarddate);
			ps.setDouble(5, price);
			ps.setDouble(6, quantity);
			ps.setInt(7,inventoryid);

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
	public static int delete(inventorybean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
		int inventoryid = bean.getInventoryid();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("delete from inventory where inventoryid=?");
			ps.setInt(1,inventoryid);

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

	public static List<inventorybean> getAllRecords()
	{
		List<inventorybean>list=new ArrayList<>();
		int status=0;
		
		try 
		{	
			currentCon=ConnectionManager.getConnection();
			PreparedStatement ps= currentCon.prepareStatement("SELECT * from inventory");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
				{
				inventorybean invbean = new inventorybean();
					invbean.setInventoryid(rs.getInt("id"));
					invbean.setPartname(rs.getString("partname"));
					invbean.setBrandname(rs.getString("brandname"));
					invbean.setInwarddate(rs.getString("inwarddate"));
					invbean.setOutwarddate(rs.getString("outwarddate"));
					invbean.setPrice(rs.getDouble("price"));
					invbean.setQuantity(rs.getDouble("quantity"));
					list.add(invbean);
				}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public static inventorybean getRecordById(int inventoryid)
	{
		inventorybean invbean = null;
		try 
		{
			currentCon=ConnectionManager.getConnection();
			PreparedStatement pstmt = currentCon.prepareStatement("SELECT * from inventory where inventoryid=?");
		    pstmt.setInt(1, inventoryid);
		    ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				invbean = new inventorybean();
				invbean.setInventoryid(rs.getInt("inventoryid"));
				invbean.setPartname(rs.getString("partname"));
				invbean.setBrandname(rs.getString("brandname"));
				invbean.setInwarddate(rs.getString("inwarddate"));
				invbean.setOutwarddate(rs.getString("outwarddate"));
				invbean.setPrice(rs.getDouble("price"));
				invbean.setQuantity(rs.getDouble("quantity"));
			}	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return invbean;
	}
}
