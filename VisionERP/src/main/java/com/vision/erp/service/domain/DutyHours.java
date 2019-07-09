package com.vision.erp.service.domain;

public class DutyHours {
	//field
	private String employeeNo;
	private String regularWorkTime;
	private String extendWorkTime;
	private String workDate;
	
	//constructor
	public DutyHours() {
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
	public String getRegularWorkTime() {
		return regularWorkTime;
	}
	public void setRegularWorkTime(String regularWorkTime) {
		this.regularWorkTime = regularWorkTime;
	}
	public String getExtendWorkTime() {
		return extendWorkTime;
	}
	public void setExtendWorkTime(String extendWorkTime) {
		this.extendWorkTime = extendWorkTime;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	
	//toString
	@Override
	public String toString() {
		return "DutyHours [employeeNo=" + employeeNo + ", regularWorkTime=" + regularWorkTime + ", extendWorkTime="
				+ extendWorkTime + ", workDate=" + workDate + "]";
	}
	
}
