package com.vision.erp.service.domain;

import java.util.List;

public class OrderFromBranch {

	//field
	private String statementNo;
	private String orderFromBranchNo;
	private String orderFromBranchStatusCodeNo;
	private String orderFromBranchStatusCodeName;
	private String orderFromBranchTotalAmount;
	private String branchName;
	private String branchNo;
	private List<OrderFromBranchProduct> orderFromBranchProductList;
	
	//constructor
	public OrderFromBranch() {
		super();
		// TODO Auto-generated constructor stub
	}

	//method
	public String getStatementNo() {
		return statementNo;
	}

	public void setStatementNo(String statementNo) {
		this.statementNo = statementNo;
	}

	public String getOrderFromBranchNo() {
		return orderFromBranchNo;
	}

	public void setOrderFromBranchNo(String orderFromBranchNo) {
		this.orderFromBranchNo = orderFromBranchNo;
	}

	public String getOrderFromBranchStatusCodeNo() {
		return orderFromBranchStatusCodeNo;
	}

	public void setOrderFromBranchStatusCodeNo(String orderFromBranchStatusCodeNo) {
		this.orderFromBranchStatusCodeNo = orderFromBranchStatusCodeNo;
	}

	public String getOrderFromBranchStatusCodeName() {
		return orderFromBranchStatusCodeName;
	}

	public void setOrderFromBranchStatusCodeName(String orderFromBranchStatusCodeName) {
		this.orderFromBranchStatusCodeName = orderFromBranchStatusCodeName;
	}

	public String getOrderFromBranchTotalAmount() {
		return orderFromBranchTotalAmount;
	}

	public void setOrderFromBranchTotalAmount(String orderFromBranchTotalAmount) {
		this.orderFromBranchTotalAmount = orderFromBranchTotalAmount;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public List<OrderFromBranchProduct> getOrderFromBranchProductList() {
		return orderFromBranchProductList;
	}

	public void setOrderFromBranchProductList(List<OrderFromBranchProduct> orderFromBranchProductList) {
		this.orderFromBranchProductList = orderFromBranchProductList;
	}

	//toString
	@Override
	public String toString() {
		return "OrderFromBranch [statementNo=" + statementNo + ", orderFromBranchNo=" + orderFromBranchNo
				+ ", orderFromBranchStatusCodeNo=" + orderFromBranchStatusCodeNo + ", orderFromBranchStatusCodeName="
				+ orderFromBranchStatusCodeName + ", orderFromBranchTotalAmount=" + orderFromBranchTotalAmount
				+ ", branchName=" + branchName + ", branchNo=" + branchNo + ", orderFromBranchProductList="
				+ orderFromBranchProductList + "]";
	}

}
