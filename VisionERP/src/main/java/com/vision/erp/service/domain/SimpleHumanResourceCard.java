package com.vision.erp.service.domain;

public class SimpleHumanResourceCard {
	//field
	private String employeeNo;
	private String employeeName;
	private String departCodeNo;
	private String departCodeName;
	private String rankCodeNo;
	private String rankCodeName;
	private String employeePhone;
	private String profileImage;
	private String signatureImage;
	private String wage;
	
	//constructor
	public SimpleHumanResourceCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartCodeNo() {
		return departCodeNo;
	}
	public void setDepartCodeNo(String departCodeNo) {
		this.departCodeNo = departCodeNo;
	}
	public String getDepartCodeName() {
		return departCodeName;
	}
	public void setDepartCodeName(String departCodeName) {
		this.departCodeName = departCodeName;
	}
	public String getRankCodeNo() {
		return rankCodeNo;
	}
	public void setRankCodeNo(String rankCodeNo) {
		this.rankCodeNo = rankCodeNo;
	}
	public String getRankCodeName() {
		return rankCodeName;
	}
	public void setRankCodeName(String rankCodeName) {
		this.rankCodeName = rankCodeName;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public String getSignatureImage() {
		return signatureImage;
	}
	public void setSignatureImage(String signatureImage) {
		this.signatureImage = signatureImage;
	}
	public String getWage() {
		return wage;
	}
	public void setWage(String wage) {
		this.wage = wage;
	}
	
	//toString
	@Override
	public String toString() {
		return "SimpleHumanResourceCard [employeeNo=" + employeeNo + ", employeeName=" + employeeName
				+ ", departCodeNo=" + departCodeNo + ", departCodeName=" + departCodeName + ", rankCodeNo=" + rankCodeNo
				+ ", rankCodeName=" + rankCodeName + ", employeePhone=" + employeePhone + ", profileImage="
				+ profileImage + ", signatureImage=" + signatureImage + ", wage=" + wage + "]";
	}

}
