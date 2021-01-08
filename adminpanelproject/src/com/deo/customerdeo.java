package com.deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.customerbean;
import com.connection.ConnectionManager;

public class customerdeo 
{
	static Connection currentCon = null;

	// ****************INSERT******************************
	
	public static int save(customerbean bean) {
		int status = 0;
		PreparedStatement ps = null;

		String custname = bean.getCustname();
		String custemail = bean.getCustemail();
		String custpassword = bean.getCustpassword();
		String custaddress = bean.getCustaddress();
		String custcity = bean.getCustcity();
		String custstate = bean.getCuststate();
		String custmobileno = bean.getCustmobileno();

		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("insert into custregistration(custname,custemail,custpassword,custaddress,custcity,custstate,custmobileno) values(?,?,?,?,?,?,?)");
			ps.setString(1, custname);
			ps.setString(2, custemail);
			ps.setString(3, custpassword);
			ps.setString(4, custaddress);
			ps.setString(5, custcity);
			ps.setString(6, custstate);
			ps.setString(7, custmobileno);

			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("Insertion failed : An exception has occured! " + e);
		} 
		finally 
		{
			if (ps != null) 
			{
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				ps = null;
			}
			if (currentCon != null) 
			{
				try {
					currentCon.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				currentCon = null;
			}
		}
		return status;
	}

	// ***********************UPDATE***************************
	
	
	public static int update(customerbean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;

		int custid = bean.getCustid();
		String custname = bean.getCustname();
		String custemail = bean.getCustemail();
		String custpassword = bean.getCustpassword();
		String custaddress = bean.getCustaddress();
		String custcity = bean.getCustcity();
		String custstate = bean.getCuststate();
		String custmobileno = bean.getCustmobileno();
		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("update custregistration set custname=?,custemail=?,custpassword=?,custaddress=?,custcity=?,custstate=?,custmobileno=? where custid=?");
			ps.setString(1, custname);
			ps.setString(2, custemail);
			ps.setString(3, custpassword);
			ps.setString(4, custaddress);
			ps.setString(5, custcity);
			ps.setString(6, custstate);
			ps.setString(7, custmobileno);
			ps.setInt(8, custid);

			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("Insertion failed : An exception has occured! " + e);
		} 
		finally 
		{
			if (ps != null) 
			{
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				ps = null;
			}
			if (currentCon != null) 
			{
				try {
					currentCon.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				currentCon = null;
			}
		}
		return status;
	}

	// *******************DELETE***********************
	
	
	public static int delete(customerbean bean) {
		int status = 0;
		PreparedStatement ps = null;
		int custid = bean.getCustid();
		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("delete from custregistration where custid=?");
			ps.setInt(1, custid);

			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("Insertion failed : An exception has occured! " + e);
		} 
		finally 
		{
			if (ps != null) 
			{
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				ps = null;
			}
			if (currentCon != null)
			{
				try {
					currentCon.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				currentCon = null;
			}
		}
		return status;
	}
	
	//**************GET ALL RECORD******************//
	public static List<customerbean> getAllRecords() {
		List<customerbean> list = new ArrayList<>();
		int status = 0;

		try 
		{
			currentCon = ConnectionManager.getConnection();
			PreparedStatement ps = currentCon.prepareStatement("SELECT * from customer");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				customerbean custbean = new customerbean();
				custbean.setCustid(rs.getInt("id"));
				custbean.setCustname(rs.getString("name"));
				custbean.setCustmobileno(rs.getString("mobile"));
				custbean.setCustemail(rs.getString("email"));
				custbean.setCustpassword(rs.getString("password"));
				custbean.setCustaddress(rs.getString("address"));
				custbean.setCustcity(rs.getString("city"));
				custbean.setCuststate(rs.getString("state"));
				
				
				list.add(custbean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	//********GET SINGLE RECORD***************//
	
	public static customerbean getRecordById(int custid) {
		customerbean custbean = null;
		try {
			currentCon = ConnectionManager.getConnection();
			PreparedStatement pstmt = currentCon.prepareStatement("SELECT * from custregistration where custid=?");
			pstmt.setInt(1, custid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				custbean = new customerbean();
				custbean.setCustid(rs.getInt("custid"));
				custbean.setCustname(rs.getString("custname"));
				custbean.setCustemail(rs.getString("custemail"));
				custbean.setCustpassword(rs.getString("custpassword"));
				custbean.setCustaddress(rs.getString("custaddress"));
				custbean.setCustcity(rs.getString("custcity"));
				custbean.setCuststate(rs.getString("custstate"));
				custbean.setCustmobileno(rs.getString("custmobileno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return custbean;
	}
}
