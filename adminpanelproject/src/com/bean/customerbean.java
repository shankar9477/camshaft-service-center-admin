package com.bean;

public class customerbean 
{
	private int custid;
	private String custname;
	private String custemail;
	private String custpassword;
	private String custaddress;
	private String custcity;
	private String custstate;
	private String custmobileno;
	private String custemailormobile;
	private boolean valid;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	public String getCustpassword() {
		return custpassword;
	}
	public void setCustpassword(String custpassword) {
		this.custpassword = custpassword;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public String getCustcity() {
		return custcity;
	}
	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}
	public String getCuststate() {
		return custstate;
	}
	public void setCuststate(String custstate) {
		this.custstate = custstate;
	}
	public String getCustmobileno() {
		return custmobileno;
	}
	public void setCustmobileno(String custmobileno) {
		this.custmobileno = custmobileno;
	}
	public String getCustemailormobile() {
		return custemailormobile;
	}
	public void setCustemailormobile(String custemailormobile) {
		this.custemailormobile = custemailormobile;
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
