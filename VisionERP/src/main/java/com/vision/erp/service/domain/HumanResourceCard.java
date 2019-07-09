package com.vision.erp.service.domain;

public class HumanResourceCard {
	//field
	private String employeeNo;
	private String employeeName;
	private String departCodeNo;
	private String departCodeName;
	private String ssn;
	private String rankCodeNo;
	private String rankCodeName;
	private String joinDate;
	private String employeePhone;
	private String employeeTel;
	private String employeeEmail;
	private String resignation;
	private String resignDate;
    private String resignReason;
    private Account account;
    private String zipCode;
    private String address;
    private String detailAddress;
    private String profileImage;
    private String signatureImage;
    private String contractFile;
    private String wage;
    
    //constructor
	public HumanResourceCard() {
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
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
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeTel() {
		return employeeTel;
	}
	public void setEmployeeTel(String employeeTel) {
		this.employeeTel = employeeTel;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getResignation() {
		return resignation;
	}
	public void setResignation(String resignation) {
		this.resignation = resignation;
	}
	public String getResignDate() {
		return resignDate;
	}
	public void setResignDate(String resignDate) {
		this.resignDate = resignDate;
	}
	public String getResignReason() {
		return resignReason;
	}
	public void setResignReason(String resignReason) {
		this.resignReason = resignReason;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
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
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
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
	public String getContractFile() {
		return contractFile;
	}
	public void setContractFile(String contractFile) {
		this.contractFile = contractFile;
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
		return "HumanResourceCard [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", departCodeNo="
				+ departCodeNo + ", departCodeName=" + departCodeName + ", ssn=" + ssn + ", rankCodeNo=" + rankCodeNo
				+ ", rankCodeName=" + rankCodeName + ", joinDate=" + joinDate + ", employeePhone=" + employeePhone
				+ ", employeeTel=" + employeeTel + ", employeeEmail=" + employeeEmail + ", resignation=" + resignation
				+ ", resignDate=" + resignDate + ", resignReason=" + resignReason + ", account=" + account
				+ ", zipCode=" + zipCode + ", address=" + address + ", detailAddress=" + detailAddress
				+ ", profileImage=" + profileImage + ", signatureImage=" + signatureImage + ", contractFile="
				+ contractFile + ", wage=" + wage + "]";
	}
    
    
}