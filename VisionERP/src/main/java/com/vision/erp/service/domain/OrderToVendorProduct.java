package com.vision.erp.service.domain;

public class OrderToVendorProduct {
	//field
	private String orderToVendorNo;
	private String productNo;
	private String orderCount;
	private String orderAmount;
	private String orderToVendorProductStatusCodeNo;
	private String orderToVendorProductStatusCodeName;
	private String totalAmount;
	
	//constructor
	public OrderToVendorProduct() {
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
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderToVendorProductStatusCodeNo() {
		return orderToVendorProductStatusCodeNo;
	}
	public void setOrderToVendorProductStatusCodeNo(String orderToVendorProductStatusCodeNo) {
		this.orderToVendorProductStatusCodeNo = orderToVendorProductStatusCodeNo;
	}
	public String getOrderToVendorProductStatusCodeName() {
		return orderToVendorProductStatusCodeName;
	}
	public void setOrderToVendorProductStatusCodeName(String orderToVendorProductStatusCodeName) {
		this.orderToVendorProductStatusCodeName = orderToVendorProductStatusCodeName;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	//toString
	@Override
	public String toString() {
		return "OrderToVendorProduct [orderToVendorNo=" + orderToVendorNo + ", productNo=" + productNo + ", orderCount="
				+ orderCount + ", orderAmount=" + orderAmount + ", orderToVendorProductStatusCodeNo="
				+ orderToVendorProductStatusCodeNo + ", orderToVendorProductStatusCodeName="
				+ orderToVendorProductStatusCodeName + ", totalAmount=" + totalAmount + "]";
	}

}
