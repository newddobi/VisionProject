package com.vision.erp.service.domain;

public class Branch {
	//field
	private String branchNo;
	private String branchName;
	private String zipCode;
	private String address;
	private String detailAdress;
	private String businessLicenseNo;
	private String branchTel;
	private String branchManagerPhone;
	private String branchManagerName;
	private String localCodeNo;
	private String localCodeName;
	private String branchStatusCodeNo;
	
	//constructor
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter, setter
	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailAdress() {
		return detailAdress;
	}

	public void setDetailAdress(String detailAdress) {
		this.detailAdress = detailAdress;
	}

	public String getBusinessLicenseNo() {
		return businessLicenseNo;
	}

	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getBranchTel() {
		return branchTel;
	}

	public void setBranchTel(String branchTel) {
		this.branchTel = branchTel;
	}

	public String getBranchManagerPhone() {
		return branchManagerPhone;
	}

	public void setBranchManagerPhone(String branchManagerPhone) {
		this.branchManagerPhone = branchManagerPhone;
	}

	public String getBranchManagerName() {
		return branchManagerName;
	}

	public void setBranchManagerName(String branchManagerName) {
		this.branchManagerName = branchManagerName;
	}

	public String getLocalCodeNo() {
		return localCodeNo;
	}

	public void setLocalCodeNo(String localCodeNo) {
		this.localCodeNo = localCodeNo;
	}

	public String getLocalCodeName() {
		return localCodeName;
	}

	public void setLocalCodeName(String localCodeName) {
		this.localCodeName = localCodeName;
	}

	public String getBranchStatusCodeNo() {
		return branchStatusCodeNo;
	}

	public void setBranchStatusCodeNo(String branchStatusCodeNo) {
		this.branchStatusCodeNo = branchStatusCodeNo;
	}

	//toString
	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + ", zipCode=" + zipCode + ", address="
				+ address + ", detailAdress=" + detailAdress + ", businessLicenseNo=" + businessLicenseNo
				+ ", branchTel=" + branchTel + ", branchManagerPhone=" + branchManagerPhone + ", branchManagerName="
				+ branchManagerName + ", localCodeNo=" + localCodeNo + ", localCodeName=" + localCodeName
				+ ", branchStatusCodeNo=" + branchStatusCodeNo + "]";
	}
	
	
	
}
