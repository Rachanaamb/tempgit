package com.scp.java.sorting;

public class Product {
	private int pId;
	private String pName;
	private  int price;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nProduct [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}
	public Product(int pId, String pName, int price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	
	
}
