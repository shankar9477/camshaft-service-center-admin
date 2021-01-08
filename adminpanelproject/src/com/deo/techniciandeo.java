package com.deo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.technicianbean;
import com.connection.ConnectionManager;
public class techniciandeo 
{
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	//****************INSERT******************************
	public static int save(technicianbean bean) 
	{
		int status = 0;
		PreparedStatement ps = null;
	
		String techname = bean.getTechname();
		String techemail = bean.getTechemail();
		String techaddress = bean.getTechaddress();
		String techmobileno = bean.getTechmobileno();
		String techgender = bean.getTechgender();
		try 
		{
			currentCon = ConnectionManager.getConnection();
			ps=currentCon.prepareStatement("insert into technician(techname,techemail,techaddress,techmobileno,techgender) values(?,?,?,?,?)");
			ps.setString(1, techname);
			ps.setString(2, techemail);
			ps.setString(3, techaddress);
			ps.setString(4, techmobileno);
			ps.setString(5, techgender);
			
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
		public static int update(technicianbean bean) 
		{
			int status = 0;
			PreparedStatement ps = null;
		
			int techid = bean.getTechid();
			String techname = bean.getTechname();
			String techemail = bean.getTechemail();
			String techaddress = bean.getTechaddress();
			String techmobileno = bean.getTechmobileno();
			String techgender = bean.getTechgender();
			try 
			{
				currentCon = ConnectionManager.getConnection();
				ps=currentCon.prepareStatement("update technician set techname=?,techemail=?,techaddress=?,techmobileno=?,techgender=? where techid=?");
				ps.setString(1, techname);
				ps.setString(2, techemail);
				ps.setString(3, techaddress);
				ps.setString(4, techmobileno);
				ps.setString(5, techgender);
				ps.setInt(6, techid);
				
	        	status=ps.executeUpdate();
			} 
			catch (Exception e) 
			{
				System.out.println("Updation failed : An exception has occured! "+e);
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
		public static int delete(technicianbean bean) 
		{
			int status = 0;
			PreparedStatement ps = null;
			int techid = bean.getTechid();
			try 
			{
				currentCon = ConnectionManager.getConnection();
				ps=currentCon.prepareStatement("delete from technician where techid=?");
				ps.setInt(1,techid);

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
	public static List<technicianbean> getAllRecords()
	{
		List<technicianbean>list=new ArrayList<>();
		
		try 
		{	
			currentCon=ConnectionManager.getConnection();
			PreparedStatement ps= currentCon.prepareStatement("SELECT * from technician");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
				{
					technicianbean techbean = new technicianbean();
					
					techbean.setTechid(rs.getInt("id"));
					techbean.setTechname(rs.getString("name"));
					techbean.setTechemail(rs.getString("email"));
					techbean.setTechaddress(rs.getString("address"));
					techbean.setTechmobileno(rs.getString("mobile"));
					techbean.setTechgender(rs.getString("gender"));
					
					list.add(techbean);
				}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	//********REcord by id******//
		public static technicianbean getRecordById(int techid)
		{
			technicianbean techbean = null;
			try 
			{
				currentCon=ConnectionManager.getConnection();
				PreparedStatement pstmt = currentCon.prepareStatement("SELECT * from technician where techid=?");
			    pstmt.setInt(1, techid);
			    ResultSet rs = pstmt.executeQuery();
				while(rs.next())
				{
					techbean = new technicianbean();
					
					techbean.setTechid(rs.getInt("techid"));
					techbean.setTechname(rs.getString("techname"));
					techbean.setTechemail(rs.getString("techemail"));
					techbean.setTechaddress(rs.getString("techaddress"));
					techbean.setTechmobileno(rs.getString("techmobileno"));
					techbean.setTechgender(rs.getString("techgender"));
				}	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			return techbean;
		}

}
