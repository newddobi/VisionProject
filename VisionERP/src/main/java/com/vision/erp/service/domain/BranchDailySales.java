package com.vision.erp.service.domain;

import java.util.List;

public class BranchDailySales {

	//field
	private String branchSalesNo;
	private String branchNo;
	private String salesDate;
	private List<SalesProduct> salesProductList;
	private String dailyTotalAmount;
	
	//constructor
	public BranchDailySales() {
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

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public String getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}

	public List<SalesProduct> getSalesProductList() {
		return salesProductList;
	}

	public void setSalesProductList(List<SalesProduct> salesProductList) {
		this.salesProductList = salesProductList;
	}

	public String getDailyTotalAmount() {
		return dailyTotalAmount;
	}

	public void setDailyTotalAmount(String dailyTotalAmount) {
		this.dailyTotalAmount = dailyTotalAmount;
	}

	//toString
	@Override
	public String toString() {
		return "BranchDailySales [branchSalesNo=" + branchSalesNo + ", branchNo=" + branchNo + ", salesDate="
				+ salesDate + ", salesProductList=" + salesProductList + ", dailyTotalAmount=" + dailyTotalAmount + "]";
	}
	

}
