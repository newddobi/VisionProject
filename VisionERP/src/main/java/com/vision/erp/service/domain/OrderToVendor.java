package com.vision.erp.service.domain;

public class OrderToVendor {
	//field
	private String orderToVendorNo;
	private String statementNo;
	private String totalAmount;
	private String orderToVendorDate;
	private String orderToVendorStatusCodeNo;
	private String orderToVendorStatusCodeName;
	
	//constructor
	public OrderToVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getOrderToVendorNo() {
		return orderToVendorNo;
	}
	public void setOrderToVendorNo(String orderToVendorNo) {
		this.orderToVendorNo = orderToVendorNo;
	}
	public String getStatementNo() {
		return statementNo;
	}
	public void setStatementNo(String statementNo) {
		this.statementNo = statementNo;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOrderToVendorDate() {
		return orderToVendorDate;
	}
	public void setOrderToVendorDate(String orderToVendorDate) {
		this.orderToVendorDate = orderToVendorDate;
	}
	public String getOrderToVendorStatusCodeNo() {
		return orderToVendorStatusCodeNo;
	}
	public void setOrderToVendorStatusCodeNo(String orderToVendorStatusCodeNo) {
		this.orderToVendorStatusCodeNo = orderToVendorStatusCodeNo;
	}
	public String getOrderToVendorStatusCodeName() {
		return orderToVendorStatusCodeName;
	}
	public void setOrderToVendorStatusCodeName(String orderToVendorStatusCodeName) {
		this.orderToVendorStatusCodeName = orderToVendorStatusCodeName;
	}
	
	//toString
	@Override
	public String toString() {
		return "OrderToVendor [orderToVendorNo=" + orderToVendorNo + ", statementNo=" + statementNo + ", totalAmount="
				+ totalAmount + ", orderToVendorDate=" + orderToVendorDate + ", orderToVendorStatusCodeNo="
				+ orderToVendorStatusCodeNo + ", orderToVendorStatusCodeName=" + orderToVendorStatusCodeName + "]";
	}


}
