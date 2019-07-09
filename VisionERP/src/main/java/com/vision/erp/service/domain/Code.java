package com.vision.erp.service.domain;

public class Code {
	//field
	private String groupCode;
	private String groupCodeName;
	private String codeNo;
	private String codeName;
	private String codeUsageStatus;
	
	//constructor
	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getGroupCodeName() {
		return groupCodeName;
	}
	public void setGroupCodeName(String groupCodeName) {
		this.groupCodeName = groupCodeName;
	}
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getCodeUsageStatus() {
		return codeUsageStatus;
	}
	public void setCodeUsageStatus(String codeUsageStatus) {
		this.codeUsageStatus = codeUsageStatus;
	}

	//toString
	
	@Override
	public String toString() {
		return "Code [groupCode=" + groupCode + ", groupCodeName=" + groupCodeName + ", codeNo=" + codeNo
				+ ", codeName=" + codeName + ", codeUsageStatus=" + codeUsageStatus + "]";
	}
	
}
