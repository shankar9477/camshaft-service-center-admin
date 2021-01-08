package com.bean;

public class inventorybean 
{
	private int inventoryid;
	private String partname;
	private String brandname;
	private String inwarddate;
	private String outwarddate;
	private Double price;
	private Double quantity;
	public int getInventoryid() {
		return inventoryid;
	}
	public void setInventoryid(int inventoryid) {
		this.inventoryid = inventoryid;
	}
	public String getPartname() {
		return partname;
	}
	public void setPartname(String partname) {
		this.partname = partname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getInwarddate() {
		return inwarddate;
	}
	public void setInwarddate(String inwarddate) {
		this.inwarddate = inwarddate;
	}
	public String getOutwarddate() {
		return outwarddate;
	}
	public void setOutwarddate(String outwarddate) {
		this.outwarddate = outwarddate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
}
