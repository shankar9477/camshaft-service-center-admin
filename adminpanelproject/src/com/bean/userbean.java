package com.bean;

public class userbean 
{
	private String adminusername;
	private String adminpassword;
	private String firstName;
	private boolean valid;
	public String getAdminusername() 
	{
		return adminusername;
	}
	public void setAdminusername(String adminusername) 
	{
		this.adminusername = adminusername;
	}
	public void removeAdminusername()
	{
		adminusername = null;
	}
	public String getAdminpassword() 
	{
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword)
	{
		this.adminpassword = adminpassword;
	}
	public void removeAdminpassword()
	{
		adminpassword = null;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public void removeFirstName()
	{
		firstName = null;
	}
	
	public boolean isValid()
	{
		return valid;
	}
	public void setValid(boolean newValid)
	{
		valid = newValid;
	}
}
