package com.bean;

public class servicebean 
{
	private int serviceid;
	private String servicename;
	private Double servicerate;
	private boolean valid;
	
	public int getServiceid() 
	{
		return serviceid;
	}
	public void setServiceid(int serviceid) 
	{
		this.serviceid = serviceid;
	}
	public String getServicename()
	{
		return servicename;
	}
	public void setServicename(String servicename) 
	{
		this.servicename = servicename;
	}
	public Double getServicerate()
	{
		return servicerate;
	}
	public void setServicerate(Double servicerate) 
	{
		this.servicerate = servicerate;
	}
	public boolean isValid()
	{
		return valid;
	}
	public void setValid(boolean valid) 
	{
		this.valid = valid;
	}
}
