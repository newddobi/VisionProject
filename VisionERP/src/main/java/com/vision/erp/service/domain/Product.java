package com.vision.erp.service.domain;

public class Product {
	//field
	private String productNo;
	private String productName;
	private String purchasePrice;
	private String salesPrice;
	private String quantity;
	private String vendorNo;
	private String productUsageStatusCodeNo;
	private String productUsageStatusCodeName;
	
	//constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(String salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getVendorNo() {
		return vendorNo;
	}
	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}
	public String getProductUsageStatusCodeNo() {
		return productUsageStatusCodeNo;
	}
	public void setProductUsageStatusCodeNo(String productUsageStatusCodeNo) {
		this.productUsageStatusCodeNo = productUsageStatusCodeNo;
	}
	public String getProductUsageStatusCodeName() {
		return productUsageStatusCodeName;
	}
	public void setProductUsageStatusCodeName(String productUsageStatusCodeName) {
		this.productUsageStatusCodeName = productUsageStatusCodeName;
	}
	
	//toString
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", purchasePrice=" + purchasePrice
				+ ", salesPrice=" + salesPrice + ", quantity=" + quantity + ", vendorNo=" + vendorNo
				+ ", productUsageStatusCodeNo=" + productUsageStatusCodeNo + ", productUsageStatusCodeName="
				+ productUsageStatusCodeName + "]";
	}


}
