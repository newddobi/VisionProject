package com.vision.erp.service.domain;

public class SalesProduct {
	//field
	private String branchSalesNo;
	private SalesMenu salesMenu;
	private String salesAmount;
	private String salesQuantity;
	
	//constructor
	public SalesProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getBranchSalesNo() {
		return branchSalesNo;
	}
	public void setBranchSalesNo(String branchSalesNo) {
		this.branchSalesNo = branchSalesNo;
	}
	public SalesMenu getSalesMenu() {
		return salesMenu;
	}
	public void setSalesMenu(SalesMenu salesMenu) {
		this.salesMenu = salesMenu;
	}
	public String getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}
	public String getSalesQuantity() {
		return salesQuantity;
	}
	public void setSalesQuantity(String salesQuantity) {
		this.salesQuantity = salesQuantity;
	}
	
	//toString
	@Override
	public String toString() {
		return "SalesProduct [branchSalesNo=" + branchSalesNo + ", salesMenu=" + salesMenu + ", salesAmount="
				+ salesAmount + ", salesQuantity=" + salesQuantity + "]";
	}
	
}
