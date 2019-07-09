package com.vision.erp.service.domain;

public class Vendor {

	//constructor
	public Vendor() {
		// TODO Auto-generated constructor stub
		super();
	}

	//field
	private String vendorNo;
	private String vendorName;
	private String vendorCategoryCodeNo;
	private String vendorCategoryCodeName;
	private String vendorUsageStatusCodeNo;
	private String vendorUsageStatusCodeName;
	private String vendorPhone;
	private String vendorTel;
	private String representativeName;
	private String address;
	private String zipCode;
	private String detailAddress;
	private String vendorAccountNo;
	
	//getter, setter
	public String getVendorNo() {
		return vendorNo;
	}
	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorCategoryCodeNo() {
		return vendorCategoryCodeNo;
	}
	public void setVendorCategoryCodeNo(String vendorCategoryCodeNo) {
		this.vendorCategoryCodeNo = vendorCategoryCodeNo;
	}
	public String getVendorCategoryCodeName() {
		return vendorCategoryCodeName;
	}
	public void setVendorCategoryCodeName(String vendorCategoryCodeName) {
		this.vendorCategoryCodeName = vendorCategoryCodeName;
	}
	public String getVendorUsageStatusCodeNo() {
		return vendorUsageStatusCodeNo;
	}
	public void setVendorUsageStatusCodeNo(String vendorUsageStatusCodeNo) {
		this.vendorUsageStatusCodeNo = vendorUsageStatusCodeNo;
	}
	public String getVendorUsageStatusCodeName() {
		return vendorUsageStatusCodeName;
	}
	public void setVendorUsageStatusCodeName(String vendorUsageStatusCodeName) {
		this.vendorUsageStatusCodeName = vendorUsageStatusCodeName;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	public String getVendorTel() {
		return vendorTel;
	}
	public void setVendorTel(String vendorTel) {
		this.vendorTel = vendorTel;
	}
	public String getRepresentativeName() {
		return representativeName;
	}
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getVendorAccountNo() {
		return vendorAccountNo;
	}
	public void setVendorAccountNo(String vendorAccountNo) {
		this.vendorAccountNo = vendorAccountNo;
	}
	
	//toString
	@Override
	public String toString() {
		return "Vendor [vendorNo=" + vendorNo + ", vendorName=" + vendorName + ", vendorCategoryCodeNo="
				+ vendorCategoryCodeNo + ", vendorCategoryCodeName=" + vendorCategoryCodeName
				+ ", vendorUsageStatusCodeNo=" + vendorUsageStatusCodeNo + ", vendorUsageStatusCodeName="
				+ vendorUsageStatusCodeName + ", vendorPhone=" + vendorPhone + ", vendorTel=" + vendorTel
				+ ", representativeName=" + representativeName + ", address=" + address + ", zipCode=" + zipCode
				+ ", detailAddress=" + detailAddress + ", vendorAccountNo=" + vendorAccountNo + "]";
	}
	
}
